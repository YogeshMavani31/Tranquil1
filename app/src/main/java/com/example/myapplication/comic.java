package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class comic extends AppCompatActivity {
    Button com1, com2, com3, com4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);
        com1 = (Button) findViewById(R.id.combut1);
        com2 = (Button) findViewById(R.id.combut2);
        com3 = (Button) findViewById(R.id.combut3);
        com4 = (Button) findViewById(R.id.combut4);
    }
}