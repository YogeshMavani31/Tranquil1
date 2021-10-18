package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class novel extends AppCompatActivity {
    Button nov1, nov2, nov3, nov4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);
        nov1 = (Button) findViewById(R.id.novbut1);
        nov2 = (Button) findViewById(R.id.novbut2);
        nov3 = (Button) findViewById(R.id.novbut3);
        nov4 = (Button) findViewById(R.id.novbut4);
    }
}