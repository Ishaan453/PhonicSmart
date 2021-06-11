package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class LetterSounds extends AppCompatActivity {
    TextView heading, soundBtn, word1, word2, word3, word4, word5, word6, song;
    LinearLayout SongPlay;
    LinearLayout soundBtnLinearLayout;
    ImageView pic, backBtn;
    MediaPlayer sound;
    MediaPlayer songPlay;
    MediaPlayer words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_sounds);
        heading = findViewById(R.id.Heading);
        soundBtn = findViewById(R.id.SoundBtn);
        SongPlay = findViewById(R.id.SongPlay);
        word1 = findViewById(R.id.word1);
        word2 = findViewById(R.id.word2);
        word3 = findViewById(R.id.word3);
        word4 = findViewById(R.id.word4);
        word5 = findViewById(R.id.word5);
        word6 = findViewById(R.id.word6);
        song = findViewById(R.id.song);
        pic = findViewById(R.id.pic);
        backBtn = findViewById(R.id.backBtn);
        soundBtnLinearLayout = findViewById(R.id.soundBtnLinearLayout);
        Intent i = getIntent();
        String layout;
        layout = i.getStringExtra("ClickedOn?");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //For Layouts
        switch (layout) {

            //Group 1
            case "a_sound": {
                heading.setText("Aa");
                soundBtn.setText("Aa");
                song.setText(" /a/-/a/ ants on my arm, \n /a/-/a/ ants on my arm, \n /a/-/a/ ants on my arm, \n They're causing me alarm.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ants_on_my_arm_boy);
                pic.setImageDrawable(myDrawable2);
                word1.setText("ant");
                word2.setText("pan");
                word3.setText("man");
                word4.setText("mat");
                word5.setText("cat");
                word6.setText("can");
                break;
            }

            case "i_sound": {
                heading.setText("Ii");
                soundBtn.setText("Ii");
                song.setTextSize(15);
                song.setText(" Inky the mouse is my pet, \n She spilled the ink and got wet, \n The ink is spread \n     all over the deck, \n /i/-/i/-/i/-/i/ \n Inky's wet.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.inki_mouse_song_mouse);
                pic.setImageDrawable(myDrawable2);
                word1.setText("ink");
                word2.setText("ill");
                word3.setText("tip");
                word4.setText("pit");
                word5.setText("pig");
                word6.setText("pin");
                break;
            }

            case "n_sound": {
                heading.setText("Nn");
                soundBtn.setText("Nn");
                song.setText(" Hear the aeroplane, \n /nnn/! \n Hear the aeroplane, \n /nnn/! \n Hear the aeroplane, \n /nnn/! \n Making lots of noise.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.nnnn_airplane_song_airplane);
                pic.setImageDrawable(myDrawable2);
                word1.setText("nap");
                word2.setText("nut");
                word3.setText("nit");
                word4.setText("Nat");
                word5.setText("tan");
                word6.setText("tin");
                break;
            }

            case "p_sound": {
                heading.setText("Pp");
                soundBtn.setText("Pp");
                song.setText(" Puff out the candles \n    on the pink big cake, \n /p/-/p/-/p/ \n /p/-/p/-/p/ \n Puff out the candles \n   on the pink big cake, \n Puff! Puff! Puff!\"");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.pppp_cake_song_cake);
                pic.setImageDrawable(myDrawable2);
                word1.setText("pan");
                word2.setText("nap");
                word3.setText("snap");
                word4.setText("nip");
                word5.setText("pin");
                word6.setText("pen");
                break;
            }

            case "s_sound": {
                heading.setText("Ss");
                soundBtn.setText("Ss");
                song.setText(" The snake is in the grass, \n The snake is in the grass, \n /s/-/s/-/s/ \n The snake is in the grass.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ssss_snake_song_snake);
                pic.setImageDrawable(myDrawable2);
                word1.setText("snap");
                word2.setText("sat");
                word3.setText("sit");
                word4.setText("sip");
                word5.setText("sun");
                word6.setText("snail");
                break;
            }

            case "t_sound": {
                heading.setText("Tt");
                soundBtn.setText("Tt");
                song.setText(" When I watch the tennis game, \n /t/-/t/-/t/ \n /t/-/t/-/t/ \n When I watch the tennis game, \n My head goes back and forth.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.tttt_tennis_song_tennis);
                pic.setImageDrawable(myDrawable2);
                word1.setText("bat");
                word2.setText("fat");
                word3.setText("rat");
                word4.setText("get");
                word5.setText("hit");
                word6.setText("tip");
                break;
            }


            //Group 2
            case "c_sound": {
                heading.setText("Cc");
                soundBtn.setText("Cc");
                song.setText(" We are clicking castanets, \n /c/-/c/-/c/ \n We are clicking castanets, \n /c/-/c/-/c/ \n We are clicking castanets, \n   clicking castanets... \n ...we are clicking castanets \n /c/-/c/-/c/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.cccc_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("cat");
                word2.setText("can");
                word3.setText("cup");
                word4.setText("cap");
                word5.setText("cut");
                word6.setText("clap");
                break;
            }

            case "k_sound": {
                heading.setText("Kk");
                soundBtn.setText("Kk");
                song.setText(" Kites are flying in the sky, \n /k/-/k/-/k/ \n Kites are flying in the sky, \n /k/-/k/-/k/ \n Kites are flying in the sky, \n   flying in the sky... \n ...kites are flying in the sky, \n /k/-/k/-k/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.kkkk_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("kite");
                word2.setText("sock");
                word3.setText("kid");
                word4.setText("kit");
                word5.setText("Kim");
                word6.setText("duck");
                break;
            }

            case "m_sound": {
                heading.setText("Mm");
                soundBtn.setText("Mm");
                song.setText(" The mum and the dad make many meals, \n /m/-/m/-/m/ \n /m/-/m/-/m/ \n The mum and the dad make many meals, \n for their hungry children.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.mmmm_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("mat");
                word2.setText("man");
                word3.setText("mop");
                word4.setText("mug");
                word5.setText("map");
                word6.setText("mum");
                break;
            }

            case "r_sound": {
                heading.setText("Rr");
                soundBtn.setText("Rr");
                song.setText(" See my puppy rip the rag, \n /rrr/-/rrr/ \n see my puppy rip the rag, \n when he pulls so hard.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.rrrr_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("rat");
                word2.setText("red");
                word3.setText("run");
                word4.setText("rod");
                word5.setText("rug");
                word6.setText("rub");
                break;
            }

            case "e_sound": {
                heading.setText("Ee");
                soundBtn.setText("Ee");
                song.setText(" Eggs in the pan /e/-/e/-/e/. \n Eggs in the pan /e/-/e/-/e/. \n Eggs in the pan /e/-/e/-/e/. \n Crack the eggs like this.../e/!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.eeee_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("egg");
                word2.setText("red");
                word3.setText("bed");
                word4.setText("leg");
                word5.setText("den");
                word6.setText("hen");
                break;
            }

            case "h_sound": {
                heading.setText("Hh");
                soundBtn.setText("Hh");
                song.setText(" I like to hop, hop, hop, \n   up and down. \n I like to hop, hop, hop, \n   all around. \n I like to hop, hop, hop, \n    up and down. \n /h/-/h/-/h/-/h/-/h/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.hhhh_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("hat");
                word2.setText("hut");
                word3.setText("hit");
                word4.setText("hop");
                word5.setText("hip");
                word6.setText("him");
                break;
            }

            case "d_sound": {
                heading.setText("Dd");
                soundBtn.setText("Dd");
                song.setText(" See me play on my drum, \n playing drum is lots of fun, \n with a /d/-/d/-/d/-/d/ \n /d/-/d/-/d/-/d/-/d/ \n see me play upon my drum");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.dddd_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("den");
                word2.setText("dad");
                word3.setText("dip");
                word4.setText("dog");
                word5.setText("dig");
                word6.setText("dot");
                break;
            }


            //Group 3

            case "g_sound": {
                heading.setText("Gg");
                soundBtn.setText("Gg");
                song.setText(" The water gurgles \n down the drain. \n The water gurgles \n down the drain. \n The water gurgles \n down the drain. \n with a /g/-/g/-/g/-/g/-/g/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.gggg_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("gap");
                word2.setText("get");
                word3.setText("gun");
                word4.setText("gum");
                word5.setText("fog");
                word6.setText("bag");
                break;
            }

            case "o_sound": {
                heading.setText("Oo");
                soundBtn.setText("Oo");
                song.setText(" Now its dark, \n the lights go on, \n /o/-/o/-/o/-/o-/o/. \n Time for bed, \n the lights go off, \n /o/-/o/-/o/-/o/-/o/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.oooo_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("dog");
                word2.setText("log");
                word3.setText("frog");
                word4.setText("hop");
                word5.setText("mop");
                word6.setText("pop");
                break;
            }

            case "u_sound": {
                heading.setText("Uu");
                soundBtn.setText("Uu");
                song.setText(" /u/-/u/ up goes umbrellas, \n /u/-/u/ up goes umbrellas, \n /u/-/u/ up goes umbrellas, \n when it starts to rain!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.uuuu_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("mud");
                word2.setText("cup");
                word3.setText("run");
                word4.setText("hug");
                word5.setText("tub");
                word6.setText("bug");
                break;
            }

            case "l_sound": {
                heading.setText("Ll");
                soundBtn.setText("Ll");
                song.setText(" We lick our lollipops. \n We lick our lollipops. \n /l/-/l/-/l/-/l/!, \n We lick our lollipops.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.llll_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("log");
                word2.setText("lap");
                word3.setText("let");
                word4.setText("leaf");
                word5.setText("lamb");
                word6.setText("lamp");
                break;
            }

            case "f_sound": {
                heading.setText("Ff");
                soundBtn.setText("Ff");
                song.setText(" My friends and I \n went to the beach \n with my floating fish. \n It got a hole... \n ...the air came out \n /ffff/!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ffff_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("fish");
                word2.setText("fox");
                word3.setText("frog");
                word4.setText("fix");
                word5.setText("fan");
                word6.setText("fit");
                break;
            }

            case "b_sound": {
                heading.setText("Bb");
                soundBtn.setText("Bb");
                song.setText(" Bring your bat and \n bring your ball, \n /b/-/b/! \n Bring your bat and \n bring your ball... \n ...to the park to play!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.bbbb_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("bed");
                word2.setText("Ben");
                word3.setText("bug");
                word4.setText("bag");
                word5.setText("bat");
                word6.setText("ball");
                break;
            }


            //Group 4

            case "ai_sound": {
                heading.setText("ai");
                soundBtn.setText("ai");
                song.setText(" My ear hurts \n I was in pain, \n /ai/-/ai/ \n My ear hurt \n I was in pain \n what did you try to say?");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ai_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("pain");
                word2.setText("tail");
                word3.setText("sail");
                word4.setText("maid");
                word5.setText("mail");
                word6.setText("wait");
                break;
            }

            case "ee_sound": {
                heading.setText("ee");
                soundBtn.setText("ee");
                song.setText(" See the donkey \n in its stall, \n Eeyore! \n /ee/-/or/! \n is it call.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.eeor_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("bee");
                word2.setText("knee");
                word3.setText("jeep");
                word4.setText("feet");
                word5.setText("seen");
                word6.setText("heel");
                break;
            }

            case "ie_sound": {
                heading.setText("ie");
                soundBtn.setText("ie");
                song.setText(" The captain said /ie/-/ie/!, The captain said /ie-/ie/!, Stand up straignt, don't be late! \n The captain said /ie/-/ie/!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ie_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("tie");
                word2.setText("pie");
                word3.setText("lie");
                word4.setText("field");
                word5.setText("die");
                word6.setText("flies");
                break;
            }

            case "or_sound": {
                heading.setText("or");
                soundBtn.setText("or");
                song.setText(" See the donkey \n in its stall, \n Eeyore! \n /ee/-/or/! \n is it call.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.eeor_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("word");
                word2.setText("horn");
                word3.setText("cord");
                word4.setText("corn");
                word5.setText("torch");
                word6.setText("fork");
                break;
            }

            case "j_sound": {
                heading.setText("Jj");
                soundBtn.setText("Jj");
                song.setText(" Jelly and jam, \n jelly and jam, \n jiggling on the plate. \n Oh, what will I eat with it, \n /j/-/j/-/j/-/j/-/j/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.jjjj_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("jam");
                word2.setText("jet");
                word3.setText("job");
                word4.setText("jog");
                word5.setText("jar");
                word6.setText("jump");
                break;
            }

            case "oa_sound": {
                heading.setText("oa");
                soundBtn.setText("oa");
                song.setText(" Oh, did you see \n the billy goat? \n /oa/-/oa/-/oa/, \n /oa/-/oa/-/oa/ \n Oh, did you see \n the billy goat, \n under the old oak tree?");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.oa_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("oak");
                word2.setText("goat");
                word3.setText("boat");
                word4.setText("coat");
                word5.setText("soap");
                word6.setText("loaf");
                break;
            }


            //Group 5

            case "OO_sound": {
                heading.setText("oo");
                soundBtn.setText("oo");
                song.setText(" Who wants to be \n a cuckoo? \n Who wants to be \n a cuckoo? \n Who wants to be \n a cuckoo? \n /oo/-/OO/, /oo/-/OO/, \n /oo/-/OO/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.oo_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("moon");
                word2.setText("room");
                word3.setText("roof");
                word4.setText("food");
                word5.setText("pool");
                word6.setText("noon");
                break;
            }

            case "oo_sound": {
                heading.setText("oo");
                soundBtn.setText("oo");
                song.setText(" Who wants to be \n a cuckoo? \n Who wants to be \n a cuckoo? \n Who wants to be \n a cuckoo? \n /oo/-/OO/, /oo/-/OO/, \n /oo/-/OO/");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.oo_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("cook");
                word2.setText("book");
                word3.setText("look");
                word4.setText("hook");
                word5.setText("took");
                word6.setText("foot");
                break;
            }

            case "ng_sound": {
                heading.setText("ng");
                soundBtn.setText("ng");
                song.setText(" If you are strong and you know it, \n say \"ng\"! \n If you are strong and you know it, \n say \"ng\"! \n If you are strong and you know it, \n and you really want to show it... \n ...if you are strong and ypu know it \n say \"ng\"!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ng_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("king");
                word2.setText("ring");
                word3.setText("sing");
                word4.setText("wing");
                word5.setText("song");
                word6.setText("bang");
                break;
            }

            case "z_sound": {
                heading.setText("Zz");
                soundBtn.setText("Zz");
                song.setText(" Did you ever hear \n a bee buzz, \n a bee buzz, \n a bee buzz? \n Did you ever hear \n a bee buzz, \n \"/zzz/\"!, like this?");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.zzzz_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("zoo");
                word2.setText("zap");
                word3.setText("buzz");
                word4.setText("zig");
                word5.setText("zag");
                word6.setText("zip");
                break;
            }

            case "w_sound": {
                heading.setText("Ww");
                soundBtn.setText("Ww");
                song.setText(" I see the clouds moving, \n /w/-/w/-/w/. \n I see the kites flying, \n /w/-/w/-/w/. \n I see the trees bending, \n /w/-/w/-/w/. \n The wind is blowing strong!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.wwww_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("word");
                word2.setText("wind");
                word3.setText("web");
                word4.setText("was");
                word5.setText("west");
                word6.setText("went");
                break;
            }

            case "v_sound": {
                heading.setText("Vv");
                soundBtn.setText("Vv");
                song.setText(" Drive Vic's van \n round the village. \n Drive Vic's van \n round the village. \n Drive Vic's van \n round the village. \n /v/-/v/-/v/-/v/-/v/!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.eeor_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("veg");
                word2.setText("vest");
                word3.setText("van");
                word4.setText("vet");
                word5.setText("volcono");
                word6.setText("Vic");
                break;
            }


            //Group 6

            case "y_sound": {
                heading.setText("Yy");
                soundBtn.setText("Yy");
                song.setText(" I like to eat, eat, eat, \n yogurt and bananas. \n I like to eat, eat, eat, \n yogurt and bananas. \n I like to eat, eat, eat, \n yogurt and bananas. \n /y/-/y/-/y/-/y/-/y/!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.yyyy_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("york");
                word2.setText("yolk");
                word3.setText("yes");
                word4.setText("yell");
                word5.setText("yap");
                word6.setText("yum");
                break;
            }

            case "x_sound": {
                heading.setText("Xx");
                soundBtn.setText("Xx");
                song.setText(" /ks/-/ks/ take an x-ray. \n /ks/-/ks/ take an x-ray. \n /ks/-/ks/ take an x-ray. \n - x-ray of my hand!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.xxxx_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("fox");
                word2.setText("six");
                word3.setText("box");
                word4.setText("exit");
                word5.setText("mix");
                word6.setText("ox");
                break;
            }

            case "ch_sound": {
                heading.setText("ch");
                soundBtn.setText("ch");
                song.setText(" Trains are chugging \n up the hill. \n /ch/-/ch/-/ch/, \n /ch/-/ch/-/ch/. \n Trains ae chugging up the hill. \n /ch/-/ch/-/ch/ \n choo, choo!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ch_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("chain");
                word2.setText("rich");
                word3.setText("chop");
                word4.setText("inch");
                word5.setText("chin");
                word6.setText("chat");
                break;
            }

            case "sh_sound": {
                heading.setText("sh");
                soundBtn.setText("sh");
                song.setText(" Hush! Hush! Hush! \n Don't make sound. \n Be as quite \n as you can be. \n The baby's asleep \n and I'm tired out. \n Sh! /sh/-/sh/-/sh/-/sh!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.sh_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("shut");
                word2.setText("dish");
                word3.setText("shop");
                word4.setText("fish");
                word5.setText("ship");
                word6.setText("shoe");
                break;
            }

            case "TH_sound": {
                heading.setText("th");
                soundBtn.setText("th");
                song.setText(" Did you ever hear \n a rude clown \n make this sound \n and that sound? \n Did you ever hear \n a rude clown. \n say /th/-/th/ /TH/-/TH/?");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.th_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("that");
                word2.setText("than");
                word3.setText("the");
                word4.setText("they");
                word5.setText("there");
                word6.setText("them");
                break;
            }

            case "th_sound": {
                heading.setText("th");
                soundBtn.setText("th");
                song.setText(" Did you ever hear \n a rude clown \n make this sound \n and that sound? \n Did you ever hear \n a rude clown. \n say /th/-/th/ /TH/-/TH/?");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.th_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("thin");
                word2.setText("thick");
                word3.setText("thief");
                word4.setText("think");
                word5.setText("thaw");
                word6.setText("thing");
                break;
            }


            //Group 7

            case "qu_sound": {
                heading.setText("qu");
                soundBtn.setText("qu");
                song.setText(" The duck in the pond \n quacks, \"/qu/-/qu/-/qu/\", \n \"/qu/-/qu/-/qu/\", \n \"/qu/-/qu/-/qu/\", \n The duck in the pond \n quacks, \"/qu/-/qu/-/qu/\", \n all around the pond.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.qu_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("quiz");
                word2.setText("quack");
                word3.setText("queen");
                word4.setText("quiet");
                word5.setText("quit");
                word6.setText("quick");
                break;
            }

            case "ou_sound": {
                heading.setText("ou");
                soundBtn.setText("ou");
                song.setText(" I pricked my \n thumb with a needle. \n /ou/-/ou/-/ou/! \n /ou/-/ou/-/ou/! \n I pricked my thumb \n with a needle. \n /ou/-/ou/ ouch!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ou_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("out");
                word2.setText("loud");
                word3.setText("found");
                word4.setText("foul");
                word5.setText("cloud");
                word6.setText("pound");
                break;
            }

            case "oi_sound": {
                heading.setText("oi");
                soundBtn.setText("oi");
                song.setText(" The sailors met upon the sea, \n /oi/-/oi/, /oi/-/oi/, /oi/, \n They found some oil \n way down deep. \n /oi/-/oi/, \"Ship ahoy!\" ");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.oi_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("join");
                word2.setText("oil");
                word3.setText("coin");
                word4.setText("soil");
                word5.setText("point");
                word6.setText("moist");
                break;
            }

            case "ue_sound": {
                heading.setText("ue");
                soundBtn.setText("ue");
                song.setText(" I'd like to have a barbecue \n /ue/-/ue/-/ue/, \n /ue/-/ue/-/ue/, \n I'd like to have a barbecue \n with you, and you, and you!");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ue_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("clue");
                word2.setText("blue");
                word3.setText("glue");
                word4.setText("argue");
                word5.setText("cruel");
                word6.setText("true");
                break;
            }

            case "er_sound": {
                heading.setText("er");
                soundBtn.setText("er");
                song.setText(" The mixer in the bowl \n goes /er/-/er/-/er/, \n /er/-/er/-/er/, \n /er/-/er/-/er/, \n The mixer in the bowl \n goes /er/-/er/-/er/, \n mixing the food together.");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.er_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("her");
                word2.setText("fern");
                word3.setText("water");
                word4.setText("super");
                word5.setText("tower");
                word6.setText("term");
                break;
            }

            case "ar_sound": {
                heading.setText("ar");
                soundBtn.setText("ar");
                song.setText(" \"Open wide,\" \n the doctor said. \n /ar/! /ar/! \n \"Let me look \n at your sore throat. \n Please say, '/ar/!'\"");
                Drawable myDrawable2 = getResources().getDrawable(R.drawable.ar_song_pic);
                pic.setImageDrawable(myDrawable2);
                word1.setText("bar");
                word2.setText("jar");
                word3.setText("car");
                word4.setText("star");
                word5.setText("park");
                word6.setText("card");
                break;
            }

        }



        //For Letter sound
        soundBtnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(sound != null){
                    sound.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": { }

                    case "k_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ai);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_oa);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.long_oo_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.short_oo_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ng_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.z_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.v_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "y_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.y_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ch_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sh_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.voiced_th_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.unvoiced_th_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "qu_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.qu_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ou_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.oi_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ue_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.er_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ar_sound);
                        sound.start();
                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                            }
                        });
                        break;
                    }

                }
            }
        });


        //For Songs
        SongPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(songPlay != null) {
                    songPlay.release();
                }

                switch (layout) {

                    //Group 1
                    case "a_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.a_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.i_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.n_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.p_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.s_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.t_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this,R.raw.c_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.k_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.m_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.d_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.e_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.h_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.r_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.b_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.f_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.g_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.l_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.o_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.u_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ai_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.eeor_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ie_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.eeor_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.j_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.oa_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.oo_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.oo_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ng_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.z_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.w_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.v_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }


                    //Group 6
                    case "y_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.y_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.x_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ch_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.sh_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.th_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.th_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }


                    //Group 7
                    case "qu_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.qu_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ou_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.oi_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ue_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.er_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        songPlay = MediaPlayer.create(LetterSounds.this, R.raw.ar_song);
                        songPlay.start();
                        songPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                songPlay.release();
                            }
                        });
                        break;
                    }
                }

            }
        });


        //For Words
        word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(words != null) {
                    words.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.ant_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.ink_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.nap_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.pan_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.snap_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.bat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.cat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.kite_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.mat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.den_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.egg_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.rat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.bed_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sh_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fish_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.gap_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.log_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.dog_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.mud_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ai);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.pain_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.bee_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.tie_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.word_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.jam_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_oa);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.oak_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    //Group 5
                    case "OO_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.long_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.moon_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.short_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.cook_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ng_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.king_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.z_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.long_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.zoo_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.word_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.v_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.veg_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    //Group 6
                    case "y_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.y_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.york_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fox_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.ch_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ai);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.chain_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sh_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.shut_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.voiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.that_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.unvoiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.thin_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    //Group 7
                    case "qu_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.qu_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.z_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.quiz_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.ou_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.out_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.oi_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.join_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ue_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.clue_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.er_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.her_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ar_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.bar_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                if(words != null) {
                                                    words.release();
                                                }
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }
                }
            }
        });




        word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(words != null) {
                    words.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.pan_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.ill_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.nut_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.nap_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.sat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.can_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.sock_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.man_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.dad_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "e_sound":

                    case "r_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.red_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hut_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.ben_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fox_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.get_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.lap_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.log_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.cup_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ai);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.tail_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.knee_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.ant_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.horn_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.jet_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_oa);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.goat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.long_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.room_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.short_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.book_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ng_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.ring_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.z_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.zap_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.wind_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    //Group 6
                    case "v_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.v_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.vest_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "y_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.y_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.yolk_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.six_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ch_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.rich_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sh_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.dish_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.voiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.that_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.unvoiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.thick_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "qu_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.qu_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.quack_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ou_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.loud_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.oi_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.oil_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ue_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.blue_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.er_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fern_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ar_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.zap_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }
                }
            }
        });




        word3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(words != null) {
                    words.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.man_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.tip_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.nit_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.snap_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.sit_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.rat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.cup_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.kid_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.mop_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.dip_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.bed_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hit_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.run_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.bug_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.frog_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.gun_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });

                        break;
                    }

                    case "l_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.let_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });

                        break;
                    }

                    case "o_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.frog_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.run_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });

                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ai);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.sail_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });

                        break;
                    }

                    case "ee_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.jeep_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });

                        break;
                    }

                    case "ie_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.lie_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.cord_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.job_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_oa);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.boat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.long_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.roof_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.short_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.look_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ng_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.sing_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.z_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.buzz_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.web_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.v_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.van_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "y_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.y_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.yes_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.box_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.ch_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.chop_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sh_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.shop_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.the_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.unvoiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.thief_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "qu_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.qu_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.queen_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ou_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.found_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.oi_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.coin_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ue_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.glue_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.er_sound);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.water_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ar_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        words = MediaPlayer.create(LetterSounds.this, R.raw.car_sound);
                                        words.start();

                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                words.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }
                }
            }
        });





        word4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(words != null) {
                    words.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.mat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.pit_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.nat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.nip_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.sip_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.get_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.cap_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.kit_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.mug_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.dog_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.leg_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hop_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.rod_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_b);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.bag_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fix_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.gum_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.leaf_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hop_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hug_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_m);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ai);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.maid_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ee);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.feet_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.cried_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_or);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.corn_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_j);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.jog_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_oa);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.coat_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.long_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_d);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.food_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_h);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.short_oo_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.hook_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ng_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.wing_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.z_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.zig_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.w_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_o);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.was_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.v_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.vet_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "y_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.y_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.yell_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.x_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.exit_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ch_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.inch_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sh_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.fish_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.voiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_e);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.y_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.they_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.unvoiced_th_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_i);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_n);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ck);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.think_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "qu_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.qu_sound);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_ie);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.quiet_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });


                        break;
                    }

                    case "ou_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_f);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ou_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.foul_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });


                        break;
                    }

                    case "oi_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.oi_sound);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_l);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.soil_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });


                        break;
                    }

                    case "ue_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_a);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_r);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_g);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.ue_sound);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.argue_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_u);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_p);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                sound = MediaPlayer.create(LetterSounds.this, R.raw.er_sound);
                                                sound.start();

                                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        sound.release();
                                                        words = MediaPlayer.create(LetterSounds.this, R.raw.super_sound);
                                                        words.start();

                                                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                            @Override
                                                            public void onCompletion(MediaPlayer mp) {
                                                                words.release();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        sound =  MediaPlayer.create(LetterSounds.this, R.raw.sound_s);
                        sound.start();

                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                sound.release();
                                sound = MediaPlayer.create(LetterSounds.this, R.raw.sound_t);
                                sound.start();

                                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        sound.release();
                                        sound = MediaPlayer.create(LetterSounds.this, R.raw.ar_sound);
                                        sound.start();

                                        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                sound.release();
                                                words = MediaPlayer.create(LetterSounds.this, R.raw.star_sound);
                                                words.start();

                                                words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        words.release();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }
                }
            }
        });





        word5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(words != null) {
                    words.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.cat_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pig_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.tan_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pin_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.sun_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.hit_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.cut_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.kim_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.map_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.dig_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.den_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.hip_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.rug_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.bat_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.fan_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.fog_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.lamb_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.mop_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.tub_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.mail_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.seen_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.die_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.torch_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.jar_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.soap_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pool_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.took_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.song_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.zag_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.west_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.volcano_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "y_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.yap_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.mix_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.chin_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.ship_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.there_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.thaw_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "qu_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.quit_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.cloud_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.point_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.cruel_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.tower_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.park_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }
                }
            }
        });





        word6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(words != null) {
                    words.release();
                }

                switch (layout){

                    //Group 1
                    case "a_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.can_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "i_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pin_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "n_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.tin_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "p_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pen_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "s_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.snail_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "t_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.tip_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }


                    //Group 2
                    case "c_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.clap_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "k_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.duck_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "m_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.mum_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "d_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.dot_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "e_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.hen_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "h_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.him_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "r_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.rub_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }


                    //Group 3
                    case "b_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.ball_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "f_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.fit_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "g_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.bag_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "l_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.lamp_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "o_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pop_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "u_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.bug_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }


                    //Group 4
                    case "ai_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.wait_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ee_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.heel_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ie_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.flies_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "or_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.fork_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "j_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.jump_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "oa_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.loaf_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "OO_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.noon_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "oo_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.foot_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ng_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.bang_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "z_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.zip_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "w_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.went_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "v_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.vic_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "y_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.yum_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "x_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.ox_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ch_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.chat_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "sh_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.shoe_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "TH_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.them_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "th_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.thing_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "qu_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.quick_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ou_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.pound_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "oi_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.moist_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ue_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.true_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "er_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.tower_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }

                    case "ar_sound": {
                        words = MediaPlayer.create(LetterSounds.this, R.raw.card_sound);
                        words.start();
                        words.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                words.release();
                            }
                        });
                        break;
                    }
                }
            }
        });



        //Finishing activity
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(sound != null) {
            sound.release();
        }

        if(songPlay != null) {
            songPlay.release();
        }

        if(words != null){
            words.release();
        }
    }
}