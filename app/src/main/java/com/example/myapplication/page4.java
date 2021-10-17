package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page4 extends AppCompatActivity {

    Button btnmild,btnmod,btnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        btnmild = (Button)findViewById(R.id.btnmild);
        btnmod = (Button)findViewById(R.id.btnmod);
        btnext = (Button)findViewById(R.id.btnext);

        Intent i=getIntent();

        btnmild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(page4.this,page5.class);
                startActivity(i);
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(page4.this,page5.class);
                startActivity(i);
            }
        });
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(page4.this,page5.class);
                startActivity(i);
            }
        });
    }
}