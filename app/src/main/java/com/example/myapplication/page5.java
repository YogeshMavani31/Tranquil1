package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page5 extends AppCompatActivity {

    Button btnthree,btnfive,btnseven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        btnthree = (Button)findViewById(R.id.btnthree);
        btnfive = (Button)findViewById(R.id.btnfive);
        btnseven = (Button)findViewById(R.id.btnseven);

        Intent i=getIntent();

        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page5.this,page6.class);
                startActivity(i);
            }
        });

        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page5.this,page6.class);
                startActivity(i);
            }
        });

        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page5.this,page6.class);
                startActivity(i);
            }
        });
    }
}