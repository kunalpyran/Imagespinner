package com.example.kunalkumar.imagespinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class level extends AppCompatActivity {
    private static Button easybut;
    private static Button medbut;
    private static Button hardbut;
    int Levd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        easybut = (Button) findViewById(R.id.easy);
        medbut = (Button) findViewById(R.id.medium);
        hardbut = (Button) findViewById(R.id.hard);
        easybut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent ie = new Intent(level.this, game.class);
                        ie.putExtra( "Levd",8);
                        startActivity(ie);
                    }
                }
        );
        medbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent im = new Intent(level.this, game.class);
                        im.putExtra( "Levd",11);
                        startActivity(im);
                    }
                }
        );
        hardbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ih = new Intent(level.this, game.class);
                        ih.putExtra( "Levd",14);
                        startActivity(ih);
                    }
                }
        );
    }

}
