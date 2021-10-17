package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page7 extends AppCompatActivity {

    Button btny,btnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        btny = (Button)findViewById(R.id.btny);
        btnn = (Button)findViewById(R.id.btnn);
        Intent i=getIntent();

        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(page7.this,waitingpg.class);
                startActivity(i);


            }
        });

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(page7.this,waitingpg.class);
                startActivity(i);


            }
        });

    }
}