package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page6 extends AppCompatActivity {

    Button btnhealth,btnvol,btnwork,btndaily;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        btnvol = (Button)findViewById(R.id.btnvol);
        btnwork = (Button)findViewById(R.id.btnwork);
        btndaily = (Button)findViewById(R.id.btndaily);
        btnhealth = (Button)findViewById(R.id.btnhealth);

        Intent i=getIntent();

        btnvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page6.this,page7.class);
                startActivity(i);
            }
        });

        btndaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page6.this,page7.class);
                startActivity(i);
            }
        });
        btnhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page6.this,page7.class);
                startActivity(i);
            }
        });
        btnwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page6.this,page7.class);
                startActivity(i);
            }
        });
    }
}