package com.ishaan.ishaanphonicsmartapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetPass extends AppCompatActivity {
    private EditText ResetMail;
    private TextView ResetBtn, goBack;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);
        ResetMail = findViewById(R.id.emailResetPass);
        ResetBtn = findViewById(R.id.ResetPasswordBtn);
        goBack = findViewById(R.id.goBack);
        auth = FirebaseAuth.getInstance();


        ResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = ResetMail.getText().toString().trim();
                if(email.isEmpty()){
                    Toast.makeText(ResetPass.this, "Please enter valid data", Toast.LENGTH_SHORT).show();
                }

                else{
                    auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(ResetPass.this, "Reset email sent to given email.", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                            else{
                                Toast.makeText(ResetPass.this, "Task failed, please try again.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });




        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}