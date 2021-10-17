package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class page3 extends AppCompatActivity {

    Button btnnxt;
    CheckBox cbhead,cbdep,cbanxiety,cbfat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        btnnxt = (Button)findViewById(R.id.btnnxt);

        cbhead = (CheckBox)findViewById(R.id.cbhead);
        cbanxiety = (CheckBox)findViewById(R.id.cbanxiety);
        cbdep = (CheckBox)findViewById(R.id.cbdep);
        cbfat = (CheckBox)findViewById(R.id.cbfat);

        Intent i=getIntent();

        btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page3.this,page4.class);
                startActivity(i);
            }
        });
    }
}