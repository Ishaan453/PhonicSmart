package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

    //Word set 1
    TextView Element_heading1, word11, word12, word13, word14, word15, word16, word17, word18;

    //Word set 2
    TextView Element_heading2, word21, word22, word23, word24, word25, word26, word27, word28;

    //Word set 3
    TextView Element_heading3, word31, word32, word33, word34, word35, word36, word37, word38;

    //Word set 4
    TextView Element_heading4, word41, word42, word43, word44, word45, word46, word47, word48;

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
        word12 = findViewById(R.id.word12);
        word13 = findViewById(R.id.word13);
        word14 = findViewById(R.id.word14);
        word15 = findViewById(R.id.word15);
        word16 = findViewById(R.id.word16);
        word17 = findViewById(R.id.word17);
        word18 = findViewById(R.id.word18);

        //Word set 2
        Element_heading2 = findViewById(R.id.Elements_heading2);
        word21 = findViewById(R.id.word21);
        word22 = findViewById(R.id.word22);
        word23 = findViewById(R.id.word23);
        word24 = findViewById(R.id.word24);
        word25 = findViewById(R.id.word25);
        word26 = findViewById(R.id.word26);
        word27 = findViewById(R.id.word27);
        word28 = findViewById(R.id.word28);

        //Word set 3
        Element_heading3 = findViewById(R.id.Elements_heading3);
        word31 = findViewById(R.id.word31);
        word32 = findViewById(R.id.word32);
        word33 = findViewById(R.id.word33);
        word34 = findViewById(R.id.word34);
        word35 = findViewById(R.id.word35);
        word36 = findViewById(R.id.word36);
        word37 = findViewById(R.id.word37);
        word38 = findViewById(R.id.word38);

        //Word set 4
        Element_heading4 = findViewById(R.id.Elements_heading4);
        word41 = findViewById(R.id.word41);
        word42 = findViewById(R.id.word42);
        word43 = findViewById(R.id.word43);
        word44 = findViewById(R.id.word44);
        word45 = findViewById(R.id.word45);
        word46 = findViewById(R.id.word46);
        word47 = findViewById(R.id.word47);
        word48 = findViewById(R.id.word48);




        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = findViewById(R.id.Alt_adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




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
                word26.setText("snow");
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
                word18.setText("school");

                word21.setText("city");
                word22.setText("face");
                word23.setText("ice");
                word24.setText("rice");
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
                word14.setText("juice");
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

                word11.setText("chief");
                word12.setText("thief");
                word13.setText("movie");
                word14.setText("tie");
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
        }
    }
}