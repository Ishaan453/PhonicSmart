package com.ishaan.ishaanphonicsmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class TrickyWord extends AppCompatActivity {

    MediaPlayer tricky_sound;
    ImageView backBtn;
    private AdView mAdView;

    //Tricky grp 1
    TextView tricky_i, tricky_the, tricky_he, tricky_she, tricky_we, tricky_me, tricky_be, tricky_was, tricky_to, tricky_do, tricky_are, tricky_all;

    //Tricky grp 2
    TextView tricky_who, tricky_where, tricky_why, tricky_which, tricky_many, tricky_any, tricky_more, tricky_before, tricky_other, tricky_were, tricky_because, tricky_want;

    //Tricky grp 3
    TextView tricky_you, tricky_your, tricky_come, tricky_some, tricky_said, tricky_here, tricky_there, tricky_they, tricky_go, tricky_no, tricky_so, tricky_my;

    //Tricky grp 4
    TextView tricky_saw, tricky_put, tricky_could, tricky_should, tricky_would, tricky_right, tricky_two, tricky_four, tricky_goes, tricky_does, tricky_made, tricky_their;

    //Tricky grp 5
    TextView tricky_one, tricky_by, tricky_only, tricky_old, tricky_like, tricky_have, tricky_live, tricky_give, tricky_little, tricky_down, tricky_what, tricky_when;

    //Tricky grp 6
    TextView tricky_once, tricky_upon, tricky_always, tricky_also, tricky_of, tricky_eight, tricky_love, tricky_cover, tricky_after, tricky_every, tricky_mother, tricky_father;

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

        //Tricky grp 3
        tricky_you = findViewById(R.id.tricky_you);
        tricky_your = findViewById(R.id.tricky_your);
        tricky_come = findViewById(R.id.tricky_come);
        tricky_some = findViewById(R.id.tricky_some);
        tricky_said = findViewById(R.id.tricky_said);
        tricky_here = findViewById(R.id.tricky_here);
        tricky_there = findViewById(R.id.tricky_there);
        tricky_they = findViewById(R.id.tricky_they);
        tricky_go = findViewById(R.id.tricky_go);
        tricky_no = findViewById(R.id.tricky_no);
        tricky_so = findViewById(R.id.tricky_so);
        tricky_my = findViewById(R.id.tricky_my);

        //Tricky grp 4
        tricky_saw = findViewById(R.id.tricky_saw);
        tricky_put = findViewById(R.id.tricky_put);
        tricky_could = findViewById(R.id.tricky_could);
        tricky_should = findViewById(R.id.tricky_should);
        tricky_would = findViewById(R.id.tricky_would);
        tricky_right = findViewById(R.id.tricky_right);
        tricky_two = findViewById(R.id.tricky_two);
        tricky_four = findViewById(R.id.tricky_four);
        tricky_goes = findViewById(R.id.tricky_goes);
        tricky_does = findViewById(R.id.tricky_does);
        tricky_made = findViewById(R.id.tricky_made);
        tricky_their = findViewById(R.id.tricky_their);

        //Tricky grp 5
        tricky_one = findViewById(R.id.tricky_one);
        tricky_by = findViewById(R.id.tricky_by);
        tricky_only = findViewById(R.id.tricky_only);
        tricky_old = findViewById(R.id.tricky_old);
        tricky_like = findViewById(R.id.tricky_like);
        tricky_have = findViewById(R.id.tricky_have);
        tricky_live = findViewById(R.id.tricky_live);
        tricky_give = findViewById(R.id.tricky_give);
        tricky_little = findViewById(R.id.tricky_little);
        tricky_down = findViewById(R.id.tricky_down);
        tricky_what = findViewById(R.id.tricky_what);
        tricky_when = findViewById(R.id.tricky_when);

        //Tricky grp 6
        tricky_once = findViewById(R.id.tricky_once);
        tricky_upon = findViewById(R.id.tricky_upon);
        tricky_always = findViewById(R.id.tricky_always);
        tricky_also = findViewById(R.id.tricky_also);
        tricky_of = findViewById(R.id.tricky_of);
        tricky_eight = findViewById(R.id.tricky_eight);
        tricky_love = findViewById(R.id.tricky_love);
        tricky_cover = findViewById(R.id.tricky_cover);
        tricky_after = findViewById(R.id.tricky_after);
        tricky_every = findViewById(R.id.tricky_every);
        tricky_mother = findViewById(R.id.tricky_mother);
        tricky_father = findViewById(R.id.tricky_father);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.TrickyAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


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
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_the.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_the);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_he);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_she);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_me);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_we);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_be);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_was.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_was);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_to);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_do);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_are.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_are);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_all);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_why.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_why);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_where);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_who.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_who);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_which.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_which);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_any);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_many.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_many);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_more);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_before);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_other);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_were.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_were);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_because.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_because);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_want.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_want);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_you);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_your.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_your);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_come.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_come);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_some.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_some);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_said.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_said);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_here);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_there.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_there);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_they.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_they);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_go);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_no);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_so);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_my);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_saw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_saw);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_put.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_put);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_could.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_could);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_should.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_should);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_would.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_would);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_right);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_two);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_four);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_goes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_goes);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_does.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_does);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_made.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_made);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_their.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_their);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_one);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_by);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_only.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_only);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_old);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_like);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_have.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_have);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_live);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_give.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_give);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_little.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_little);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_what);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_when.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_when);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_once);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_upon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_upon);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_always.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_always);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_also.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_also);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_of.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_of);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_eight);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_love);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_cover);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_after);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_every.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_every);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_mother);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_father);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });

        tricky_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricky_sound = MediaPlayer.create(TrickyWord.this, R.raw.tricky_down);
                tricky_sound.start();
                tricky_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        tricky_sound.release();
                    }
                });
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(tricky_sound != null){
            tricky_sound.release();
        }
    }
}