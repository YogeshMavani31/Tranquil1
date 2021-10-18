package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class nonfic extends AppCompatActivity {
    Button nonfic1, nonfic2, nonfic3, nonfic4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonfic);
        nonfic1 = (Button) findViewById(R.id.nonficbut1);
        nonfic2 = (Button) findViewById(R.id.nonficbut2);
        nonfic3 = (Button) findViewById(R.id.nonficbut3);
        nonfic4 = (Button) findViewById(R.id.nonficbut4);

    }
}