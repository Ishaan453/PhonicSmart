package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrickyWord extends AppCompatActivity {

    MediaPlayer tricky_sound;
    ImageView backBtn;

    //Tricky grp 1
    TextView tricky_i, tricky_the, tricky_he, tricky_she, tricky_we, tricky_me, tricky_be, tricky_was, tricky_to, tricky_do, tricky_are, tricky_all;

    //Tricky grp 2
    TextView tricky_who, tricky_where, tricky_why, tricky_which, tricky_many, tricky_any, tricky_more, tricky_before, tricky_other, tricky_were, tricky_because, tricky_want;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricky_word);

        backBtn = findViewById(R.id.backBtn);

        //Tricky grp 1

        tricky_i = findViewById(R.id.tricky_i);
        tricky_the = findViewById(R.id.tricky_the);
        tricky_he = findViewById(R.id.tricky_he);
        tricky_she = findViewById(R.id.tricky_she);
        tricky_me = findViewById(R.id.tricky_me);
        tricky_we = findViewById(R.id.tricky_we);
        tricky_be = findViewById(R.id.tricky_be);
        tricky_was = findViewById(R.id.tricky_was);
        tricky_to = findViewById(R.id.tricky_to);
        tricky_do = findViewById(R.id.tricky_do);
        tricky_are = findViewById(R.id.tricky_are);
        tricky_all = findViewById(R.id.tricky_all);

        //Tricky grp 2

        tricky_who = findViewById(R.id.tricky_who);
        tricky_where = findViewById(R.id.tricky_where);
        tricky_why = findViewById(R.id.tricky_why);
        tricky_which = findViewById(R.id.tricky_which);
        tricky_many = findViewById(R.id.tricky_many);
        tricky_any = findViewById(R.id.tricky_any);
        tricky_more = findViewById(R.id.tricky_more);
        tricky_before = findViewById(R.id.tricky_before);
        tricky_other = findViewById(R.id.tricky_other);
        tricky_were = findViewById(R.id.tricky_were);
        tricky_because = findViewById(R.id.tricky_because);
        tricky_want = findViewById(R.id.tricky_want);







        //Back Button
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //On click listeners

        tricky_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_i);
                tricky_sound.start();
            }
        });

        tricky_the.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_the);
                tricky_sound.start();
            }
        });

        tricky_he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_he);
                tricky_sound.start();
            }
        });

        tricky_she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_she);
                tricky_sound.start();
            }
        });

        tricky_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_me);
                tricky_sound.start();
            }
        });

        tricky_we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_we);
                tricky_sound.start();
            }
        });

        tricky_be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_be);
                tricky_sound.start();
            }
        });

        tricky_was.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_was);
                tricky_sound.start();
            }
        });

        tricky_to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_to);
                tricky_sound.start();
            }
        });

        tricky_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_do);
                tricky_sound.start();
            }
        });

        tricky_are.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_are);
                tricky_sound.start();
            }
        });

        tricky_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_all);
                tricky_sound.start();
            }
        });

        tricky_why.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_why);
                tricky_sound.start();
            }
        });

        tricky_where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_where);
                tricky_sound.start();
            }
        });

        tricky_who.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_who);
                tricky_sound.start();
            }
        });

        tricky_which.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_which);
                tricky_sound.start();
            }
        });

        tricky_any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_any);
                tricky_sound.start();
            }
        });

        tricky_many.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_many);
                tricky_sound.start();
            }
        });

        tricky_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_more);
                tricky_sound.start();
            }
        });

        tricky_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_before);
                tricky_sound.start();
            }
        });

        tricky_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_other);
                tricky_sound.start();
            }
        });

        tricky_were.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_were);
                tricky_sound.start();
            }
        });

        tricky_because.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_because);
                tricky_sound.start();
            }
        });

        tricky_want.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_want);
                tricky_sound.start();
            }
        });
    }
}