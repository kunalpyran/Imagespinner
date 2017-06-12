package com.example.kunalkumar.imagespinner;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class check extends AppCompatActivity {
    private static CheckBox radbut1;
    private static CheckBox radbut2;
    private static CheckBox radbut3;
    private static CheckBox radbut4;
    private static CheckBox radbut5;
    private static CheckBox radbut6;
    private static CheckBox radbut7;
    private static CheckBox radbut8;
    private static CheckBox radbut9;
    private static CheckBox radbut10;
    private static CheckBox radbut11;
    private static CheckBox radbut12;
    private static CheckBox radbut13;
    private static CheckBox radbut14;
    private static CheckBox radbut15;
    private static CheckBox radbut16;
    private static Button submitbut;
    private static Button playagainbut;
    int newscore;

    public final static String Boolean_array="com.example.kunalkumar.boolean";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        final CheckBox rad1=(CheckBox)findViewById(R.id.rad1);
        final CheckBox rad2= (CheckBox) findViewById(R.id.rad2);
        final CheckBox rad3= (CheckBox) findViewById(R.id.rad3);
        final CheckBox rad4= (CheckBox) findViewById(R.id.rad4);
        final CheckBox rad5= (CheckBox) findViewById(R.id.rad5);
        final CheckBox rad6= (CheckBox) findViewById(R.id.rad6);
        final CheckBox rad7= (CheckBox) findViewById(R.id.rad7);
        final CheckBox rad8= (CheckBox) findViewById(R.id.rad8);
        final CheckBox rad9= (CheckBox) findViewById(R.id.rad9);
        final CheckBox rad10= (CheckBox) findViewById(R.id.rad10);
        final CheckBox rad11= (CheckBox) findViewById(R.id.rad11);
        final CheckBox rad12= (CheckBox) findViewById(R.id.rad12);
        final CheckBox rad13= (CheckBox) findViewById(R.id.rad13);
        final CheckBox rad14= (CheckBox) findViewById(R.id.rad14);
        final CheckBox rad15= (CheckBox) findViewById(R.id.rad15);
        final CheckBox rad16= (CheckBox) findViewById(R.id.rad16);
        final SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);

        Intent in=getIntent();
        final boolean[] arr=in.getBooleanArrayExtra("Boolean_array");

        submitbut = (Button) findViewById(R.id.submit);
        submitbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        playagainbut.setEnabled(true);
                        submitbut.setEnabled(false);
                        int flag=0,count=0,flag2 = 0;
                        for(int i=0;i<arr.length;i++)
                        {
                            if(arr[i]==true)
                            {
                                count++;
                                switch(i)
                                {
                                    case 0:if(rad1.isChecked())
                                                flag++;
                                        break;
                                    case 1:if(rad2.isChecked())
                                        flag++;
                                        break;
                                    case 2:if(rad3.isChecked())
                                        flag++;
                                        break;
                                    case 3:if(rad4.isChecked())
                                        flag++;
                                        break;
                                    case 4:if(rad5.isChecked())
                                        flag++;
                                        break;
                                    case 5:if(rad6.isChecked())
                                        flag++;
                                        break;
                                    case 6:if(rad7.isChecked())
                                        flag++;
                                        break;
                                    case 7:if(rad8.isChecked())
                                        flag++;
                                        break;
                                    case 8:if(rad9.isChecked())
                                        flag++;
                                        break;
                                    case 9:if(rad10.isChecked())
                                        flag++;
                                        break;
                                    case 10:if(rad11.isChecked())
                                        flag++;
                                        break;
                                    case 11:if(rad12.isChecked())
                                        flag++;
                                        break;
                                    case 12:if(rad13.isChecked())
                                        flag++;
                                        break;
                                    case 13:if(rad14.isChecked())
                                        flag++;
                                        break;
                                    case 14:if(rad15.isChecked())
                                        flag++;
                                        break;
                                    case 15:if(rad16.isChecked())
                                        flag++;
                                }
                            }
                            else
                            {
                                switch(i)
                                {
                                    case 0:if(rad1.isChecked())
                                        flag2++;
                                        break;
                                    case 1:if(rad2.isChecked())
                                        flag2++;
                                        break;
                                    case 2:if(rad3.isChecked())
                                        flag2++;
                                        break;
                                    case 3:if(rad4.isChecked())
                                        flag2++;
                                        break;
                                    case 4:if(rad5.isChecked())
                                        flag2++;
                                        break;
                                    case 5:if(rad6.isChecked())
                                        flag2++;
                                        break;
                                    case 6:if(rad7.isChecked())
                                        flag2++;
                                        break;
                                    case 7:if(rad8.isChecked())
                                        flag2++;
                                        break;
                                    case 8:if(rad9.isChecked())
                                        flag2++;
                                        break;
                                    case 9:if(rad10.isChecked())
                                        flag2++;
                                        break;
                                    case 10:if(rad11.isChecked())
                                        flag2++;
                                        break;
                                    case 11:if(rad12.isChecked())
                                        flag2++;
                                        break;
                                    case 12:if(rad13.isChecked())
                                        flag2++;
                                        break;
                                    case 13:if(rad14.isChecked())
                                        flag2++;
                                        break;
                                    case 14:if(rad15.isChecked())
                                        flag2++;
                                        break;
                                    case 15:if(rad16.isChecked())
                                        flag2++;
                                }
                        }
                        }
                        if(flag==count && flag2==0) {
                            Toast.makeText(getApplicationContext(), "You Won", Toast.LENGTH_LONG).show();
                            newscore = flag * 10;
                            Toast.makeText(getApplicationContext(),"score : "+newscore,Toast.LENGTH_LONG).show();
                            int score = prefs.getInt("key", 0);
                            if(newscore>score)
                            {
                                SharedPreferences.Editor editor = prefs.edit();
                                editor.putInt("key", newscore);
                                editor.commit();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "You Lose", Toast.LENGTH_LONG).show();
                            newscore = (flag*100)/count;
                            Toast.makeText(getApplicationContext(), newscore+"% Correct", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        playagainbut = (Button) findViewById(R.id.playagain);
        playagainbut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(check.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                }
        );
    }

}