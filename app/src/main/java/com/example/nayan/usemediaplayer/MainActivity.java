package com.example.nayan.usemediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSound, btnSound1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSound = (Button) findViewById(R.id.btnSound);
        btnSound1 = (Button) findViewById(R.id.btnSound1);
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeSound(R.raw.ek);
            }
        });

        btnSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopSound();
            }
        });
    }

    public void makeSound(int file) {
        mediaPlayer = MediaPlayer.create(this, file);
        mediaPlayer.start();
    }

    public void stopSound() {


        mediaPlayer.release();
        Log.e("sound",":");
    }
}
