package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int aSoundId;
    private int bSoundId;
    private int cSoundId;
    private int dSoundId;
    private int eSoundId;
    private int fSoundId;
    private int gSoundId;

    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        // TODO: Create a new SoundPool
        aSoundId = soundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        bSoundId = soundPool.load(getApplicationContext(), R.raw.note7_b, 1);
        cSoundId = soundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        dSoundId = soundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        eSoundId = soundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        fSoundId = soundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        gSoundId = soundPool.load(getApplicationContext(), R.raw.note5_g, 1);


        // TODO: Load and get the IDs to identify the sounds

    }

    public void playA(View A){
        soundPool.play(aSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }
    public void playB(View B){
        soundPool.play(bSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void playC(View C){
        soundPool.play(cSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void playD(View D){
        soundPool.play(dSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void playE(View E){
        soundPool.play(eSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void playF(View F) {
        soundPool.play(fSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void playG(View G){
        soundPool.play(gSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    // TODO: Add the play methods triggered by the buttons



}
