package com.ishaan.ishaanphonicsmartapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mediaPlay extends AppCompatActivity {
    MediaPlayer play;


    public void letterSound(Context context, String letter){
        if(play != null){
            play = null;
        }

        String fileName = "sound_" + letter;
        int resourceId = context.getResources().getIdentifier(fileName, "raw", context.getPackageName());
        if(resourceId != 0) {
            play = MediaPlayer.create(context, resourceId);
            play.start();
            play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    play.release();
                }
            });
        }
        else{
            Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void word(Context context, String letter){
        if(play != null){
            play = null;
        }

        String fileName = "word_" + letter;
        int resourceId = context.getResources().getIdentifier(fileName, "raw", context.getPackageName());
        play = MediaPlayer.create(context, resourceId);
        play.start();
        play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                play.release();
            }
        });
    }

    public void tricky(Context context, String letter){
        if(play != null){
            play = null;
        }

        String fileName = "tricky_" + letter;
        int resourceId = context.getResources().getIdentifier(fileName, "raw", context.getPackageName());
        play = MediaPlayer.create(context, resourceId);
        play.start();
        play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                play.release();
            }
        });
    }

    public void song(Context context, String letter){
        if(play != null){
            play = null;
        }

        String fileName = "song_" + letter;
        int resourceId = context.getResources().getIdentifier(fileName, "raw", context.getPackageName());
        play = MediaPlayer.create(context, resourceId);
        play.start();
        play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                play.release();
            }
        });
    }


}
