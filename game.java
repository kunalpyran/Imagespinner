package com.example.kunalkumar.imagespinner;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class game extends AppCompatActivity {

    private static ImageView img_view;
    private static Button startbut;
    private static Button checkbut;
    public boolean[] arr = new boolean[17];
    private final static String Boolean_array="com.example.kunalkumar.boolean";
    int[] images = {R.drawable.image0, R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14, R.drawable.image15};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent in = getIntent();
        int Value = in.getIntExtra("Levd", 0);

        spin(Value);
        checkbut = (Button) findViewById(R.id.check);
        checkbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ic = new Intent(game.this, check.class);
                        ic.putExtra("Boolean_array", arr);
                        startActivity(ic);
                    }
                }
        );
    }

    public void spin(final int value) {
        final int max = 16;
        img_view = (ImageView) findViewById(R.id.spinimage);
        startbut = (Button) findViewById(R.id.start);
        startbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnimationDrawable animation = new AnimationDrawable();
                        animation.setOneShot(true);
                        for (int j = 0; j < value; j++) {
                            int i = (int) (Math.random() * max);
                            arr[i] = true;
                            animation.addFrame(getResources().getDrawable(images[i]), 800);
                            animation.stop();
                        }
                        img_view.setBackgroundDrawable(animation);
                        animation.start();
                        startbut.setEnabled(false);
                    }
                }
        );
    }
}