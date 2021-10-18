package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class fiction extends AppCompatActivity {
    Button fic1, fic2, fic3, fic4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);
        fic1 = (Button) findViewById(R.id.ficbut1);
        fic2 = (Button) findViewById(R.id.ficbut2);
        fic3 = (Button) findViewById(R.id.ficbut3);
        fic4 = (Button) findViewById(R.id.ficbut4);
    }
}