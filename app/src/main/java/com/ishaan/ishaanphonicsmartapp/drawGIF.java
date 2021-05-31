package com.ishaan.ishaanphonicsmartapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import androidx.appcompat.app.AppCompatActivity;

public class drawGIF extends AppCompatActivity {
    Intent i;
    ImageView gif;
    TextView clickHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_gif);
        gif = findViewById(R.id.gif);
        // clickHere = findViewById(R.id.clickHere);
        i = getIntent();
        String layout = i.getStringExtra("Layout??");


        switch (layout){

            case "a_draw":{
                Glide.with(this).load(R.drawable.a_gif).into(gif);
                break;
            }

            case "b_draw":{
                Glide.with(this).load(R.drawable.b_gif).into(gif);
                break;
            }

            case "c_draw":{
                Glide.with(this).load(R.drawable.c_gif).into(gif);
                break;
            }

            case "d_draw":{
                Glide.with(this).load(R.drawable.d_gif).into(gif);
                break;
            }

            case "e_draw":{
                Glide.with(this).load(R.drawable.e_gif).into(gif);
                break;
            }

            case "f_draw":{
                Glide.with(this).load(R.drawable.f_gif).into(gif);
                break;
            }

            case "g_draw":{
                Glide.with(this).load(R.drawable.g_gif).into(gif);
                break;
            }

            case "h_draw":{
                Glide.with(this).load(R.drawable.h_gif).into(gif);
                break;
            }

            case "i_draw":{
                Glide.with(this).load(R.drawable.i_gif).into(gif);
                break;
            }

            case "j_draw":{
                Glide.with(this).load(R.drawable.j_gif).into(gif);
                break;
            }

            case "k_draw":{
                Glide.with(this).load(R.drawable.k_gif).into(gif);
                break;
            }

            case "l_draw":{
                Glide.with(this).load(R.drawable.l_gif).into(gif);
                break;
            }

            case "m_draw":{
                Glide.with(this).load(R.drawable.m_gif).into(gif);
                break;
            }

            case "n_draw":{
                Glide.with(this).load(R.drawable.n_gif).into(gif);
                break;
            }

            case "o_draw":{
                Glide.with(this).load(R.drawable.o_gif).into(gif);
                break;
            }

            case "p_draw":{
                Glide.with(this).load(R.drawable.p_gif).into(gif);
                break;
            }

            case "q_draw":{
                Glide.with(this).load(R.drawable.q_gif).into(gif);
                break;
            }

            case "r_draw":{
                Glide.with(this).load(R.drawable.r_gif).into(gif);
                break;
            }

            case "s_draw":{
                Glide.with(this).load(R.drawable.s_gif).into(gif);
                break;
            }

            case "t_draw":{
                Glide.with(this).load(R.drawable.t_gif).into(gif);
                break;
            }

            case "u_draw":{
                Glide.with(this).load(R.drawable.u_gif).into(gif);
                break;
            }

            case "v_draw":{
                Glide.with(this).load(R.drawable.v_gif).into(gif);
                break;
            }

            case "w_draw":{
                Glide.with(this).load(R.drawable.w_gif).into(gif);
                break;
            }

            case "x_draw":{
                Glide.with(this).load(R.drawable.x_gif).into(gif);
                break;
            }

            case "y_draw":{
                Glide.with(this).load(R.drawable.y_gif).into(gif);
                break;
            }

            case "z_draw":{
                Glide.with(this).load(R.drawable.z_gif).into(gif);
                break;
            }
        }

//        clickHere.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(drawGIF.this, DrawMain.class));
//            }
//        });
    }
}