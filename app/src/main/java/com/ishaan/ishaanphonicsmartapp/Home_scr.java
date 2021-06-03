package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home_scr extends AppCompatActivity {
    LinearLayout ll1,ll2,ll3,ll4,ll5;
    TextView top, bottom;
    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_scr);
        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);
        ll3 = findViewById(R.id.ll3);
        ll4 = findViewById(R.id.ll4);
        ll5 = findViewById(R.id.ll5);
        top = findViewById(R.id.LogOutBtnTop);
        bottom = findViewById(R.id.LogOutBtnBottom);
        auth = FirebaseAuth.getInstance();
        user = FirebaseAuth.getInstance().getCurrentUser();





        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_scr.this, LetterSoundGrps.class));
            }
        });

        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_scr.this, TrickyWord.class));
            }
        });

        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_scr.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });

        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user != null) {
                    Toast.makeText(Home_scr.this, "Coming soon", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Home_scr.this, "You don't have access, please contact 7798340077", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user != null) {
                    startActivity(new Intent(Home_scr.this, DrawHomeScreen.class));
                }
                else{
                    Toast.makeText(Home_scr.this, "You don't have access, please contact 7798340077", Toast.LENGTH_SHORT).show();
                }
            }
        });

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                startActivity(new Intent(Home_scr.this, LogInActivity.class));
                finish();
            }
        });

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                startActivity(new Intent(Home_scr.this, LogInActivity.class));
                finish();
            }
        });
    }
}