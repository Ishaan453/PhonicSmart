package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class AlternativeSounds extends AppCompatActivity {
    TextView Alt_Heading, Alt_description;
    LinearLayout Layout_3, Layout_4;
    MediaPlayer alt_sound;

    //Word set 1
    TextView Element_heading1, word11, word12, word13, word14, word15, word16, word17, word18;
    TextView star11, star12, star13, star14, star15, star16, star17, star18;

    //Word set 2
    TextView Element_heading2, word21, word22, word23, word24, word25, word26, word27, word28;
    TextView star21, star22, star23, star24, star25, star26, star27, star28;

    //Word set 3
    TextView Element_heading3, word31, word32, word33, word34, word35, word36, word37, word38;
    TextView star31, star32, star33, star34, star35, star36, star37, star38;

    //Word set 4
    TextView Element_heading4, word41, word42, word43, word44, word45, word46, word47, word48;
    TextView star41, star42, star43, star44, star45, star46, star47, star48;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_sounds);

        Alt_Heading = findViewById(R.id.Alt_Heading);
        Alt_description = findViewById(R.id.Alt_description);
        Layout_3 = findViewById(R.id.Layout3);
        Layout_4 = findViewById(R.id.Layout4);

        Intent Int = getIntent();
        String Layout = Int.getStringExtra("ClickedOn?");

        //Word set 1
        Element_heading1 = findViewById(R.id.Elements_heading1);
        word11 = findViewById(R.id.word11);
        star11 = findViewById(R.id.word11star);
        word12 = findViewById(R.id.word12);
        star12 = findViewById(R.id.word12star);
        word13 = findViewById(R.id.word13);
        star13 = findViewById(R.id.word13star);
        word14 = findViewById(R.id.word14);
        star14 = findViewById(R.id.word14star);
        word15 = findViewById(R.id.word15);
        star15 = findViewById(R.id.word15star);
        word16 = findViewById(R.id.word16);
        star16 = findViewById(R.id.word16star);
        word17 = findViewById(R.id.word17);
        star17 = findViewById(R.id.word17star);
        word18 = findViewById(R.id.word18);
        star18 = findViewById(R.id.word18star);

        //Word set 2
        Element_heading2 = findViewById(R.id.Elements_heading2);
        word21 = findViewById(R.id.word21);
        star21 = findViewById(R.id.word21star);
        word22 = findViewById(R.id.word22);
        star22 = findViewById(R.id.word22star);
        word23 = findViewById(R.id.word23);
        star23 = findViewById(R.id.word23star);
        word24 = findViewById(R.id.word24);
        star24 = findViewById(R.id.word24star);
        word25 = findViewById(R.id.word25);
        star25 = findViewById(R.id.word25star);
        word26 = findViewById(R.id.word26);
        star26 = findViewById(R.id.word26star);
        word27 = findViewById(R.id.word27);
        star27 = findViewById(R.id.word27star);
        word28 = findViewById(R.id.word28);
        star28 = findViewById(R.id.word28star);

        //Word set 3
        Element_heading3 = findViewById(R.id.Elements_heading3);
        word31 = findViewById(R.id.word31);
        star31 = findViewById(R.id.word31star);
        word32 = findViewById(R.id.word32);
        star32 = findViewById(R.id.word32star);
        word33 = findViewById(R.id.word33);
        star33 = findViewById(R.id.word33star);
        word34 = findViewById(R.id.word34);
        star34 = findViewById(R.id.word34star);
        word35 = findViewById(R.id.word35);
        star35 = findViewById(R.id.word35star);
        word36 = findViewById(R.id.word36);
        star36 = findViewById(R.id.word36star);
        word37 = findViewById(R.id.word37);
        star37 = findViewById(R.id.word37star);
        word38 = findViewById(R.id.word38);
        star38 = findViewById(R.id.word38star);

        //Word set 4
        Element_heading4 = findViewById(R.id.Elements_heading4);
        word41 = findViewById(R.id.word41);
        star41 = findViewById(R.id.word41star);
        word42 = findViewById(R.id.word42);
        star42 = findViewById(R.id.word42star);
        word43 = findViewById(R.id.word43);
        star43 = findViewById(R.id.word43star);
        word44 = findViewById(R.id.word44);
        star44 = findViewById(R.id.word44star);
        word45 = findViewById(R.id.word45);
        star45 = findViewById(R.id.word45star);
        word46 = findViewById(R.id.word46);
        star46 = findViewById(R.id.word46star);
        word47 = findViewById(R.id.word47);
        star47 = findViewById(R.id.word47star);
        word48 = findViewById(R.id.word48);
        star48 = findViewById(R.id.word48star);




        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = findViewById(R.id.Alt_adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        star11.setText("");
        star12.setText("");
        star13.setText("");
        star14.setText("");
        star15.setText("");
        star16.setText("");
        star17.setText("");
        star18.setText("");

        star21.setText("");
        star22.setText("");
        star23.setText("");
        star24.setText("");
        star25.setText("");
        star26.setText("");
        star27.setText("");
        star28.setText("");

        star31.setText("");
        star32.setText("");
        star33.setText("");
        star34.setText("");
        star35.setText("");
        star36.setText("");
        star37.setText("");
        star38.setText("");

        star41.setText("");
        star42.setText("");
        star43.setText("");
        star44.setText("");
        star45.setText("");
        star46.setText("");
        star47.setText("");
        star48.setText("");





        //For Layout
        switch (Layout){
            case "Alt_OA":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.width = 10000;
                LL4.width = 0;
                LL4.height = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("oa");
                Alt_description.setText("'ow' and 'o_e' sounds same like 'oa'");
                Element_heading1.setText("oa");
                Element_heading2.setText("ow");
                Element_heading3.setText("o_e");

                word11.setText("oak");
                word12.setText("soak");
                word13.setText("soap");
                word14.setText("coal");
                word15.setText("toast");
                word16.setText("goat");
                word17.setText("float");
                word18.setText("coast");

                word21.setText("bow");
                word22.setText("snow");
                word23.setText("below");
                word24.setText("blow");
                word25.setText("crow");
                word26.setText("arrow");
                word27.setText("slow");
                word28.setText("window");

                word31.setText("nose");
                word32.setText("mode");
                word33.setText("stove");
                word34.setText("zone");
                word35.setText("woke");
                word36.setText("cone");
                word37.setText("slope");
                word38.setText("bone");
                break;
            }

            case "Alt_S":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.height = 0;
                LL3.width = 0;
                LL4.height = 0;
                LL4.width = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("Ss");
                Alt_description.setText("In some cases, 'c' sounds like 's'");
                Element_heading1.setText("s");
                Element_heading2.setText("c");

                word11.setText("sun");
                word12.setText("snail");
                word13.setText("sail");
                word14.setText("star");
                word15.setText("spoon");
                word16.setText("snake");
                word17.setText("spider");
                word18.setText("span");

                word21.setText("city");
                word22.setText("face");
                word23.setText("fence");
                word24.setText("pencil");
                word25.setText("voice");
                word26.setText("mice");
                word27.setText("space");
                word28.setText("nice");
                break;

            }

            case "Alt_F":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.height = 0;
                LL3.width = 0;
                LL4.height = 0;
                LL4.width = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("Ff");
                Alt_description.setText("'ph' sounds like 'f'");
                Element_heading1.setText("f");
                Element_heading2.setText("ph");

                word11.setText("face");
                word12.setText("fork");
                word13.setText("feet");
                word14.setText("fat");
                word15.setText("flag");
                word16.setText("fun");
                word17.setText("fail");
                word18.setText("fade");

                word21.setText("phonics");
                word22.setText("graph");
                word23.setText("photo");
                word24.setText("dolphin");
                word25.setText("trophy");
                word26.setText("phantom");
                word27.setText("phase");
                word28.setText("phone");
                break;
            }

            case "Alt_AI":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.width = 10000;
                LL4.width = 0;
                LL4.height = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("ai");
                Alt_description.setText("'ay' and 'a_e' sounds same like 'oa'");
                Element_heading1.setText("ai");
                Element_heading2.setText("ay");
                Element_heading3.setText("a_e");

                word11.setText("main");
                word12.setText("pain");
                word13.setText("bait");
                word14.setText("aim");
                word15.setText("paint");
                word16.setText("chain");
                word17.setText("rain");
                word18.setText("paid");

                word21.setText("day");
                word22.setText("hay");
                word23.setText("may");
                word24.setText("lay");
                word25.setText("stay");
                word26.setText("tray");
                word27.setText("gray");
                word28.setText("spray");

                word31.setText("slave");
                word32.setText("cane");
                word33.setText("lane");
                word34.setText("shape");
                word35.setText("lake");
                word36.setText("make");
                word37.setText("whale");
                word38.setText("shake");
                break;
            }

            case "Alt_J":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.height = 0;
                LL3.width = 0;
                LL4.height = 0;
                LL4.width = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("Jj");
                Alt_description.setText("Sometimes 'g' sounds like 'j'");
                Element_heading1.setText("j");
                Element_heading2.setText("g");

                word11.setText("jam");
                word12.setText("jet");
                word13.setText("jump");
                word14.setText("junk");
                word15.setText("jar");
                word16.setText("jug");
                word17.setText("joker");
                word18.setText("job");

                word21.setText("age");
                word22.setText("gem");
                word23.setText("cage");
                word24.setText("huge");
                word25.setText("gym");
                word26.setText("giant");
                word27.setText("page");
                word28.setText("stage");
                break;
            }

            case "Alt_IE":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.width = 10000;
                LL4.width = 0;
                LL4.height = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("ie");
                Alt_description.setText("'igh' and 'i_e' sounds same like 'ie'");
                Element_heading1.setText("ie");
                Element_heading2.setText("igh");
                Element_heading3.setText("i_e");

                word11.setText("tie");
                word12.setText("thief");
                word13.setText("lied");
                word14.setText("die");
                word15.setText("pie");
                word16.setText("lie");
                word17.setText("cried");
                word18.setText("tried");

                word21.setText("high");
                word22.setText("fight");
                word23.setText("might");
                word24.setText("light");
                word25.setText("right");
                word26.setText("tight");
                word27.setText("fright");
                word28.setText("thigh");

                word31.setText("fine");
                word32.setText("hide");
                word33.setText("line");
                word34.setText("mine");
                word35.setText("pine");
                word36.setText("five");
                word37.setText("like");
                word38.setText("kite");
                break;
            }

            case "Alt_EE":{
                Alt_Heading.setText("ee");
                Alt_description.setText("Sometimes, 'y' in the end, 'e_e', and sometimes, 'ea', sounds same like 'ee'");
                Element_heading1.setText("ee");
                Element_heading2.setText("ea");
                Element_heading3.setText("y");
                Element_heading4.setText("e_e");

                word11.setText("bee");
                word12.setText("knee");
                word13.setText("sleep");
                word14.setText("cheek");
                word15.setText("cheese");
                word16.setText("sweet");
                word17.setText("deep");
                word18.setText("green");

                word21.setText("heat");
                word22.setText("meat");
                word23.setText("seat");
                word24.setText("read");
                word25.setText("treat");
                word26.setText("leaf");
                word27.setText("eat");
                word28.setText("meal");

                word31.setText("baby");
                word32.setText("tiny");
                word33.setText("ruby");
                word34.setText("very");
                word35.setText("candy");
                word36.setText("sunny");
                word37.setText("carry");
                word38.setText("jolly");

                word41.setText("theme");
                word42.setText("Steve");
                word43.setText("scene");
                word44.setText("even");
                word45.setText("these");
                word46.setText("delete");
                word47.setText("gene");
                word48.setText("extreme");
                break;
            }

            case "Alt_OR":{
                Alt_Heading.setText("or");
                Alt_description.setText("'au', 'al' and 'aw', sounds same like 'or'");
                Element_heading1.setText("or");
                Element_heading2.setText("au");
                Element_heading3.setText("al");
                Element_heading4.setText("aw");

                word11.setText("cork");
                word12.setText("corn");
                word13.setText("born");
                word14.setText("port");
                word15.setText("cord");
                word16.setText("horn");
                word17.setText("glory");
                word18.setText("worn");

                word21.setText("audit");
                word22.setText("haul");
                word23.setText("August");
                word24.setText("audio");
                word25.setText("pause");
                word26.setText("clause");
                word27.setText("applaud");
                word28.setText("author");

                word31.setText("ball");
                word32.setText("all");
                word33.setText("wall");
                word34.setText("chalk");
                word35.setText("talk");
                word36.setText("salt");
                word37.setText("tall");
                word38.setText("stalk");

                word41.setText("paw");
                word42.setText("raw");
                word43.setText("flaw");
                word44.setText("claw");
                word45.setText("yawn");
                word46.setText("lawn");
                word47.setText("drawn");
                word48.setText("spawn");
                break;
            }

            case "Alt_OU":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.height = 0;
                LL3.width = 0;
                LL4.height = 0;
                LL4.width = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("ou");
                Alt_description.setText("'ow' sounds like 'ou'");
                Element_heading1.setText("ou");
                Element_heading2.setText("ow");

                word11.setText("pouch");
                word12.setText("mouse");
                word13.setText("couch");
                word14.setText("pound");
                word15.setText("mouth");
                word16.setText("foul");
                word17.setText("cloud");
                word18.setText("shout");

                word21.setText("bow");
                word22.setText("row");
                word23.setText("snow");
                word24.setText("below");
                word25.setText("pillow");
                word26.setText("flow");
                word27.setText("glow");
                word28.setText("show");
                break;
            }

            case "Alt_OI":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.height = 0;
                LL3.width = 0;
                LL4.height = 0;
                LL4.width = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("oi");
                Alt_description.setText("'oy' sounds like 'oi'");
                Element_heading1.setText("oi");
                Element_heading2.setText("oy");

                word11.setText("oil");
                word12.setText("boil");
                word13.setText("point");
                word14.setText("coin");
                word15.setText("join");
                word16.setText("spoil");
                word17.setText("soil");
                word18.setText("joint");

                word21.setText("toy");
                word22.setText("boy");
                word23.setText("annoy");
                word24.setText("joy");
                word25.setText("enjoy");
                word26.setText("loyal");
                word27.setText("deploy");
                word28.setText("cowboy");
                break;
            }

            case "Alt_UE":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.width = 10000;
                LL4.width = 0;
                LL4.height = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("ue");
                Alt_description.setText("'ew' and 'u_e' sounds same like 'ue'");
                Element_heading1.setText("ue");
                Element_heading2.setText("ew");
                Element_heading3.setText("u_e");

                word11.setText("true");
                word12.setText("clue");
                word13.setText("blue");
                word14.setText("cruel");
                word15.setText("value");
                word16.setText("issue");
                word17.setText("fuel");
                word18.setText("argue");

                word21.setText("blew");
                word22.setText("flew");
                word23.setText("threw");
                word24.setText("new");
                word25.setText("stew");
                word26.setText("grew");
                word27.setText("nephew");
                word28.setText("cashew");

                word31.setText("tune");
                word32.setText("tube");
                word33.setText("use");
                word34.setText("fume");
                word35.setText("cute");
                word36.setText("flute");
                word37.setText("cube");
                word38.setText("mule");
                break;
            }

            case "Alt_ER":{
                LinearLayout.LayoutParams LL3 = (LinearLayout.LayoutParams) Layout_3.getLayoutParams();
                LinearLayout.LayoutParams LL4 = (LinearLayout.LayoutParams) Layout_4.getLayoutParams();
                LL3.width = 10000;
                LL4.width = 0;
                LL4.height = 0;
                Layout_3.setLayoutParams(LL3);
                Layout_4.setLayoutParams(LL4);

                Alt_Heading.setText("er");
                Alt_description.setText("'ir' and 'ur' sounds same like 'er'");
                Element_heading1.setText("ir");
                Element_heading2.setText("ur");
                Element_heading3.setText("er");

                word11.setText("first");
                word12.setText("shirt");
                word13.setText("bird");
                word14.setText("skirt");
                word15.setText("third");
                word16.setText("circus");
                word17.setText("whirl");
                word18.setText("girl");

                word21.setText("hurt");
                word22.setText("nurse");
                word23.setText("purse");
                word24.setText("turtle");
                word25.setText("purple");
                word26.setText("burn");
                word27.setText("surf");
                word28.setText("burger");

                word31.setText("her");
                word32.setText("clerk");
                word33.setText("tiger");
                word34.setText("paper");
                word35.setText("spider");
                word36.setText("after");
                word37.setText("mother");
                word38.setText("fern");
                break;
            }
        }

        //For Sounds
        word11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(alt_sound!=null){
                    alt_sound.release();
                }

                switch(Layout){
                    case "Alt_OA":{
                        star11.setText(" *    ");
                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_oa);
                        alt_sound.start();
                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                alt_sound.release();
                                star11.setText("      *");
                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_ck);
                                alt_sound.start();
                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        alt_sound.release();
                                        star11.setText("");
                                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.alt_oak);
                                        alt_sound.start();
                                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                alt_sound.release();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        break;
                    }

                    case "Alt_S":{
                        star11.setText("*       ");
                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_s);
                        alt_sound.start();
                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                alt_sound.release();
                                star11.setText("*");
                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_u);
                                alt_sound.start();
                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        alt_sound.release();
                                        star11.setText("       *");
                                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_n);
                                        alt_sound.start();
                                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                alt_sound.release();
                                                star11.setText("");
                                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.alt_sun);
                                                alt_sound.start();
                                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        alt_sound.release();
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

                    case "Alt_F":{
                        star11.setText("*          ");
                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_f);
                        alt_sound.start();
                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                alt_sound.release();
                                star11.setText("  *     *");
                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_ai);
                                alt_sound.start();
                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        alt_sound.release();
                                        star11.setText("  *");
                                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_s);
                                        alt_sound.start();
                                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                alt_sound.release();
                                                star11.setText("");
                                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.alt_face);
                                                alt_sound.start();
                                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        alt_sound.release();
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

                    case "Alt_AI":{
                        star11.setText("*        ");
                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_m);
                        alt_sound.start();
                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                alt_sound.release();
                                star11.setText("    *");
                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_ai);
                                alt_sound.start();
                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        alt_sound.release();
                                        star11.setText("          *");
                                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_n);
                                        alt_sound.start();
                                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                alt_sound.release();
                                                star11.setText("");
                                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.alt_main);
                                                alt_sound.start();
                                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        alt_sound.release();
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

                    case "Alt_J":{
                        star11.setText("*         ");
                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_j);
                        alt_sound.start();
                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                alt_sound.release();
                                star11.setText("*    ");
                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_a);
                                alt_sound.start();
                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        alt_sound.release();
                                        star11.setText("    *");
                                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_m);
                                        alt_sound.start();
                                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                alt_sound.release();
                                                alt_sound.release();
                                                star11.setText("");
                                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.alt_jam);
                                                alt_sound.start();
                                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                    @Override
                                                    public void onCompletion(MediaPlayer mp) {
                                                        alt_sound.release();
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

                    case "Alt_IE":{
                        star11.setText("*    ");
                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_t);
                        alt_sound.start();
                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                alt_sound.release();
                                star11.setText(" *");
                                alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.sound_ie);
                                alt_sound.start();
                                alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        alt_sound.release();
                                        star11.setText("");
                                        alt_sound = MediaPlayer.create(AlternativeSounds.this, R.raw.alt_tie);
                                        alt_sound.start();
                                        alt_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                alt_sound.release();
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
    }
}