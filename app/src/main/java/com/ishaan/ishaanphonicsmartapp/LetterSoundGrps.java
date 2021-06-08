package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LetterSoundGrps extends AppCompatActivity {
    //Group 1 & 2
    TextView A_sound, I_sound, N_sound, P_sound, S_sound, T_sound, C_sound, M_sound, K_sound, R_sound, E_sound, H_sound, D_sound;

    //Group 3 & 4
    TextView G_sound, O_sound, U_sound, L_sound, F_sound, B_sound, AI_sound, EE_sound, IE_sound, OR_sound, J_sound, OA_sound;

    //Group 5 , 6 & 7
    LinearLayout OO_sound, oo_sound, TH_sound, th_sound;
    TextView NG_sound, Z_sound, W_sound, V_sound, Y_sound, X_sound, CH_sound, SH_sound, QU_sound, OU_sound, OI_sound, UE_sound, ER_sound, AR_sound;

    //Alt grp 1
    TextView Alt_OA_sound, Alt_S_sound, Alt_F_sound, Alt_AI_sound, Alt_J_sound, Alt_IE_sound;

    //Alt grp 2
    TextView Alt_EE_sound, Alt_OR_sound, Alt_OU_sound, alt_OI_sound, Alt_UE_sound, Alt_ER_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_sound_grps);
        //Group 1
        A_sound = findViewById(R.id.A_sound);
        I_sound = findViewById(R.id.I_sound);
        N_sound = findViewById(R.id.N_sound);
        P_sound = findViewById(R.id.P_sound);
        S_sound = findViewById(R.id.S_sound);
        T_sound = findViewById(R.id.T_sound);

        //Group 2
        C_sound = findViewById(R.id.C_sound);
        M_sound = findViewById(R.id.M_sound);
        K_sound = findViewById(R.id.K_sound);
        R_sound = findViewById(R.id.R_sound);
        E_sound = findViewById(R.id.E_sound);
        H_sound = findViewById(R.id.H_sound);
        D_sound = findViewById(R.id.D_sound);

        //Group 3
        G_sound = findViewById(R.id.G_sound);
        O_sound = findViewById(R.id.O_sound);
        U_sound = findViewById(R.id.U_sound);
        L_sound = findViewById(R.id.L_sound);
        F_sound = findViewById(R.id.F_sound);
        B_sound = findViewById(R.id.B_sound);

        //Group 4
        AI_sound = findViewById(R.id.AI_sound);
        EE_sound = findViewById(R.id.EE_sound);
        IE_sound = findViewById(R.id.IE_sound);
        OR_sound = findViewById(R.id.OR_sound);
        J_sound = findViewById(R.id.J_sound);
        OA_sound = findViewById(R.id.OA_sound);

        //Group 5
        OO_sound = findViewById(R.id.OO_sound);
        oo_sound = findViewById(R.id.oo_sound);
        NG_sound = findViewById(R.id.NG_sound);
        Z_sound = findViewById(R.id.Z_sound);
        W_sound = findViewById(R.id.W_sound);
        V_sound = findViewById(R.id.V_sound);

        //Group 6
        Y_sound = findViewById(R.id.Y_sound);
        X_sound = findViewById(R.id.X_sound);
        CH_sound = findViewById(R.id.CH_sound);
        SH_sound = findViewById(R.id.SH_sound);
        TH_sound = findViewById(R.id.TH_sound);
        th_sound = findViewById(R.id.th_sound);

        //Group 7
        QU_sound = findViewById(R.id.QU_sound);
        OU_sound = findViewById(R.id.OU_sound);
        OI_sound = findViewById(R.id.OI_sound);
        UE_sound = findViewById(R.id.UE_sound);
        ER_sound = findViewById(R.id.ER_sound);
        AR_sound = findViewById(R.id.AR_sound);


        //Alt grp 1
        Alt_OA_sound = findViewById(R.id.Alt_OA_sound);
        Alt_S_sound = findViewById(R.id.Alt_S_sound);
        Alt_F_sound = findViewById(R.id.Alt_F_sound);
        Alt_AI_sound = findViewById(R.id.Alt_AI_sound);
        Alt_J_sound = findViewById(R.id.Alt_J_sound);
        Alt_IE_sound = findViewById(R.id.Alt_IE_sound);

        //Alt grp 2
        Alt_EE_sound = findViewById(R.id.Alt_EE_sound);
        Alt_OR_sound = findViewById(R.id.Alt_OR_sound);
        Alt_OU_sound = findViewById(R.id.Alt_OU_sound);
        alt_OI_sound = findViewById(R.id.Alt_OI_sound);
        Alt_UE_sound = findViewById(R.id.Alt_UE_sound);
        Alt_ER_sound = findViewById(R.id.Alt_ER_sound);






        //adding On Click listeners.

        //For Group 1
        A_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "a_sound");
                startActivity(intent);
            }
        });

        I_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "i_sound");
                startActivity(intent);
            }
        });

        N_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "n_sound");
                startActivity(intent);
            }
        });

        P_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "p_sound");
                startActivity(intent);
            }
        });

        S_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "s_sound");
                startActivity(intent);
            }
        });

        T_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "t_sound");
                startActivity(intent);
            }
        });


        //For Group 2

        C_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "c_sound");
                startActivity(intent);
            }
        });

        M_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "m_sound");
                startActivity(intent);
            }
        });

        K_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "k_sound");
                startActivity(intent);
            }
        });

        R_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "r_sound");
                startActivity(intent);
            }
        });

        E_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "e_sound");
                startActivity(intent);
            }
        });

        H_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "h_sound");
                startActivity(intent);
            }
        });

        D_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "d_sound");
                startActivity(intent);
            }
        });


        //For Group 3

        G_sound.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                    intent.putExtra("ClickedOn?", "g_sound");
                    startActivity(intent);
                }
        });

        O_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "o_sound");
                startActivity(intent);
            }
        });

        U_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "u_sound");
                startActivity(intent);
            }
        });

        L_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "l_sound");
                startActivity(intent);
            }
        });

        F_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "f_sound");
                startActivity(intent);
            }
        });

        B_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "b_sound");
                startActivity(intent);
            }
        });


        //For Group 4

        AI_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ai_sound");
                startActivity(intent);
            }
        });

        EE_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ee_sound");
                startActivity(intent);
            }
        });

        IE_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ie_sound");
                startActivity(intent);
            }
        });

        OR_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "or_sound");
                startActivity(intent);
            }
        });

        J_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "j_sound");
                startActivity(intent);
            }
        });

        OA_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "oa_sound");
                startActivity(intent);
            }
        });


        //For Group 5

        OO_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "OO_sound");
                startActivity(intent);
            }
        });

        oo_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "oo_sound");
                startActivity(intent);
            }
        });

        NG_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ng_sound");
                startActivity(intent);
            }
        });

        Z_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "z_sound");
                startActivity(intent);
            }
        });

        W_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "w_sound");
                startActivity(intent);
            }
        });

        V_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "v_sound");
                startActivity(intent);
            }
        });


        //For Group 6

        Y_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "y_sound");
                startActivity(intent);
            }
        });

        X_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "x_sound");
                startActivity(intent);
            }
        });

        CH_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ch_sound");
                startActivity(intent);
            }
        });

        SH_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "sh_sound");
                startActivity(intent);
            }
        });

        TH_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "TH_sound");
                startActivity(intent);
            }
        });

        th_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "th_sound");
                startActivity(intent);
            }
        });


        //For Group 7

        QU_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "qu_sound");
                startActivity(intent);
            }
        });

        OU_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ou_sound");
                startActivity(intent);
            }
        });

        OI_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "oi_sound");
                startActivity(intent);
            }
        });

        UE_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ue_sound");
                startActivity(intent);
            }
        });

        ER_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "er_sound");
                startActivity(intent);
            }
        });

        AR_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetterSoundGrps.this, LetterSounds.class);
                intent.putExtra("ClickedOn?", "ar_sound");
                startActivity(intent);
            }
        });

        Alt_OA_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_OA");
                startActivity(AltInt);
            }
        });

        Alt_S_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_S");
                startActivity(AltInt);
            }
        });

        Alt_F_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_F");
                startActivity(AltInt);
            }
        });

        Alt_AI_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_AI");
                startActivity(AltInt);
            }
        });

        Alt_J_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_J");
                startActivity(AltInt);
            }
        });

        Alt_IE_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_IE");
                startActivity(AltInt);
            }
        });

        Alt_EE_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_EE");
                startActivity(AltInt);
            }
        });

        Alt_OR_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_OR");
                startActivity(AltInt);
            }
        });

        Alt_OU_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_OU");
                startActivity(AltInt);
            }
        });

        alt_OI_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_OI");
                startActivity(AltInt);
            }
        });

        Alt_UE_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_UE");
                startActivity(AltInt);
            }
        });

        Alt_ER_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AltInt = new Intent(LetterSoundGrps.this, AlternativeSounds.class);
                AltInt.putExtra("ClickedOn?", "Alt_ER");
                startActivity(AltInt);
            }
        });
    }
}