package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class waitingpg extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waitingpg);

        Intent i=getIntent();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent i=new Intent(waitingpg.this,optionpg.class);
                startActivity(i);
            }
        },20000);
    }
}