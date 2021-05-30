package com.ishaan.ishaanphonicsmartapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {
    private EditText email,pass;
    private TextView button, button2;
    TextView resetPass;
    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        resetPass = findViewById(R.id.resetPass);
        auth = FirebaseAuth.getInstance();
        user  = FirebaseAuth.getInstance().getCurrentUser();


        if(user != null){
            startActivity(new Intent(LogInActivity.this, Home_scr.class));
            finish();
        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString().trim();
                String Pass = pass.getText().toString().trim();
                if(Email.isEmpty() || Pass.isEmpty()){
                    Toast.makeText(LogInActivity.this, "Please enter valid data", Toast.LENGTH_SHORT).show();
                }

                else {
                    auth.signInWithEmailAndPassword(Email, Pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                startActivity(new Intent(LogInActivity.this, Home_scr.class));
                                finish();
                            } else {
                                Toast.makeText(LogInActivity.this, "Username and password does not match", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, Home_scr.class));
                finish();
            }
        });

        resetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, ResetPass.class));
            }
        });
    }
}