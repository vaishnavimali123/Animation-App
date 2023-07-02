package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.media.MediaPlayer;

import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.song);
        mp.start();
        img=findViewById(R.id.imageView);
        img.animate().translationYBy(-2000).setDuration(15000).alpha(0.2f).setDuration(15000);
        img=findViewById(R.id.imageView4);
        img.animate().translationXBy(-2000).setDuration(20000);
        img=findViewById(R.id.imageView5);
        img.animate().translationXBy(2000).setDuration(40000);

    }
}

