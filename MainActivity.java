package com.example.kunalkumar.imagespinner;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static ImageView img_view;
    private static Button playbut;
    private static Button exitbut;
    private static Button helpbut;
    private static Button highbut;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbut = (Button) findViewById(R.id.play);
        exitbut = (Button) findViewById(R.id.Exit);
        helpbut = (Button) findViewById(R.id.help);
        highbut = (Button) findViewById(R.id.highscore);
        final SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        player = MediaPlayer.create(this, R.raw.music);
        player.setLooping(true); // Set looping
        player.setVolume(100, 100);
        player.start();
        playbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, level.class);
                        startActivity(i);
                    }
                }
        );

        highbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int score = prefs.getInt("key", 0);
                        Toast.makeText(getApplicationContext(),"High Score : " +score, Toast.LENGTH_LONG).show();
                    }

                }
        );
        helpbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, help.class);
                        startActivity(i);
                    }
                }
        );
        exitbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        System.exit(0);
                    }
                }
        );
    }



    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
        super.onBackPressed();
    }




}