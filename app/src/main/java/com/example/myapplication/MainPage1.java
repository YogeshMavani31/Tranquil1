package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage1 extends AppCompatActivity {

    Button btnwp,btnstu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page1);

        btnwp = (Button)findViewById(R.id.btnwp);
        btnstu = (Button)findViewById(R.id.btnstu);
        Intent i=getIntent();

        btnwp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainPage1.this,page2.class);
                startActivity(i);


            }
        });

        btnstu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainPage1.this,page2.class);
                startActivity(i);
            }
        });
    }
}