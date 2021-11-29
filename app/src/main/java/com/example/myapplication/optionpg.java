package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class optionpg extends AppCompatActivity {

    Button btnbook, btnmusic, btnvideo, btnyoga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionpg);
        btnbook = (Button)findViewById(R.id.btnbook);
        btnmusic = (Button)findViewById(R.id.btnmusic);
        btnyoga = (Button)findViewById(R.id.btnyoga);
        Intent i = getIntent();

        btnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(optionpg.this,book.class);
                startActivity(i);
            }
        });

        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(optionpg.this,music.class);
                startActivity(i);
            }
        });


        btnyoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(optionpg.this,yoga.class);
                startActivity(i);
            }
        });
    }
}