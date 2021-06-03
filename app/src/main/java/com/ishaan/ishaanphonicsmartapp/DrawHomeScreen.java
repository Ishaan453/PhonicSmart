package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawHomeScreen extends AppCompatActivity {
    TextView a_draw,b_draw,c_draw,d_draw,e_draw,f_draw,g_draw,h_draw,i_draw,j_draw,k_draw,l_draw,m_draw,n_draw,o_draw,p_draw,q_draw,r_draw,s_draw,t_draw,u_draw,v_draw,w_draw,x_draw,y_draw,z_draw;
    ImageView backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_home_screen);
        a_draw = findViewById(R.id.a_draw);
        b_draw = findViewById(R.id.b_draw);
        c_draw = findViewById(R.id.c_draw);
        d_draw = findViewById(R.id.d_draw);
        e_draw = findViewById(R.id.e_draw);
        f_draw = findViewById(R.id.f_draw);
        g_draw = findViewById(R.id.g_draw);
        h_draw = findViewById(R.id.h_draw);
        i_draw = findViewById(R.id.i_draw);
        j_draw = findViewById(R.id.j_draw);
        k_draw = findViewById(R.id.k_draw);
        l_draw = findViewById(R.id.l_draw);
        m_draw = findViewById(R.id.m_draw);
        n_draw = findViewById(R.id.n_draw);
        o_draw = findViewById(R.id.o_draw);
        p_draw = findViewById(R.id.p_draw);
        q_draw = findViewById(R.id.q_draw);
        r_draw = findViewById(R.id.r_draw);
        s_draw = findViewById(R.id.s_draw);
        t_draw = findViewById(R.id.t_draw);
        u_draw = findViewById(R.id.u_draw);
        v_draw = findViewById(R.id.v_draw);
        w_draw = findViewById(R.id.w_draw);
        x_draw = findViewById(R.id.x_draw);
        y_draw = findViewById(R.id.y_draw);
        z_draw = findViewById(R.id.z_draw);
        backbtn = findViewById(R.id.backBtn);



        a_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "a_draw");
                startActivity(intent);
            }
        });

        b_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "b_draw");
                startActivity(intent);
            }
        });

        c_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "c_draw");
                startActivity(intent);
            }
        });

        d_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "d_draw");
                startActivity(intent);
            }
        });

        e_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "e_draw");
                startActivity(intent);
            }
        });

        f_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "f_draw");
                startActivity(intent);
            }
        });

        g_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "g_draw");
                startActivity(intent);
            }
        });

        h_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "h_draw");
                startActivity(intent);
            }
        });

        i_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "i_draw");
                startActivity(intent);
            }
        });

        j_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "j_draw");
                startActivity(intent);
            }
        });

        k_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "k_draw");
                startActivity(intent);
            }
        });

        l_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "l_draw");
                startActivity(intent);
            }
        });

        m_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "m_draw");
                startActivity(intent);
            }
        });

        n_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "n_draw");
                startActivity(intent);
            }
        });

        o_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "o_draw");
                startActivity(intent);
            }
        });

        p_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "p_draw");
                startActivity(intent);
            }
        });

        q_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "q_draw");
                startActivity(intent);
            }
        });

        r_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "r_draw");
                startActivity(intent);
            }
        });

        s_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "s_draw");
                startActivity(intent);
            }
        });

        t_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "t_draw");
                startActivity(intent);
            }
        });

        u_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "u_draw");
                startActivity(intent);
            }
        });

        v_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "v_draw");
                startActivity(intent);
            }
        });

        w_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "w_draw");
                startActivity(intent);
            }
        });

        x_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "x_draw");
                startActivity(intent);
            }
        });

        y_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "y_draw");
                startActivity(intent);
            }
        });

        z_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawHomeScreen.this, drawGIF.class);
                intent.putExtra("Layout??", "z_draw");
                startActivity(intent);
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}