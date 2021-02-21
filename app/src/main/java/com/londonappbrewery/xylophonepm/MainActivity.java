package com.londonappbrewery.xylophonepm;

import android.annotation.SuppressLint;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool

        final SoundPool soundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, 3, 0);

        // TODO: Load and get the IDs to identify the sound
        mCSoundId = soundPool.load(getApplicationContext(), R.raw.note1_c, PRIORITY);
        mDSoundId = soundPool.load(getApplicationContext(), R.raw.note2_d, PRIORITY);
        mESoundId = soundPool.load(getApplicationContext(), R.raw.note3_e, PRIORITY);
        mFSoundId = soundPool.load(getApplicationContext(), R.raw.note4_f, PRIORITY);
        mGSoundId = soundPool.load(getApplicationContext(), R.raw.note5_g, PRIORITY);
        mASoundId = soundPool.load(getApplicationContext(), R.raw.note6_a, PRIORITY);
        mBSoundId = soundPool.load(getApplicationContext(), R.raw.note7_b, PRIORITY);

        // TODO: Add the play methods triggered by the buttons
        Button cSound = findViewById(R.id.c_key);
        Button dSound = findViewById(R.id.d_key);
        Button eSound = findViewById(R.id.e_key);
        Button fSound = findViewById(R.id.f_key);
        Button gSound = findViewById(R.id.g_key);
        Button aSound = findViewById(R.id.a_key);
        Button bSound = findViewById(R.id.b_key);

/*      View.OnClickListener cSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };
        View.OnClickListener dSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };
        View.OnClickListener eSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };
        View.OnClickListener fSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };
        View.OnClickListener gSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };
        View.OnClickListener aSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };
        View.OnClickListener bSoundListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        };

        cSound.setOnClickListener(cSoundListner);
        dSound.setOnClickListener(dSoundListner);
        eSound.setOnClickListener(eSoundListner);
        fSound.setOnClickListener(fSoundListner);
        gSound.setOnClickListener(gSoundListner);
        aSound.setOnClickListener(aSoundListner);
        bSound.setOnClickListener(bSoundListner);
*/
        View.OnTouchListener cTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button C touched");
                return false;
            }
        };
        View.OnTouchListener dTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button D touched");
                return false;
            }
        };
        View.OnTouchListener eTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button E touched");
                return false;
            }
        };
        View.OnTouchListener fTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button F touched");
                return false;
            }
        };
        View.OnTouchListener gTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button G touched");
                return false;
            }
        };
        View.OnTouchListener aTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button A touched");
                return false;
            }
        };

        View.OnTouchListener bTouchListner = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                }
                Log.d("Xylophone", "Button B touched");
                return false;
            }
        };

        cSound.setOnTouchListener(cTouchListner);
        dSound.setOnTouchListener(dTouchListner);
        eSound.setOnTouchListener(eTouchListner);
        fSound.setOnTouchListener(fTouchListner);
        gSound.setOnTouchListener(gTouchListner);
        aSound.setOnTouchListener(aTouchListner);
        bSound.setOnTouchListener(bTouchListner);
    }
}

