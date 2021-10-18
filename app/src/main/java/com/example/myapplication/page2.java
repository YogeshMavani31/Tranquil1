package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    Button btnyes,btnno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        btnyes = (Button)findViewById(R.id.btnyes);
        btnno = (Button)findViewById(R.id.btnno);
        Intent i=getIntent();

        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page2.this,page3.class);
                startActivity(i);


            }
        });

        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page2.this,page3.class);
                startActivity(i);
            }
        });

    }
}