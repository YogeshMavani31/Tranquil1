package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class novel extends AppCompatActivity {
    Button nov1, nov2, nov3, nov4;
    AlertDialog.Builder builder;
    ImageView novelback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);
        nov1 = (Button) findViewById(R.id.novbut1);
        nov2 = (Button) findViewById(R.id.novbut2);
        nov3 = (Button) findViewById(R.id.novbut3);
        nov4 = (Button) findViewById(R.id.novbut4);
        novelback = (ImageView) findViewById(R.id.novelback);

        builder = new AlertDialog.Builder(this);
        novelback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Intent i=new Intent(novel.this,waitingpg.class);
                                startActivity(i);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(novel.this,"We will provide you more books.",Toast.LENGTH_SHORT).show();

                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Breathing Activity");
                alert.show();
            }
        });

        //Spiritual Warfare by Kenneth E. Hagin
        nov1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/spiritual-warfare-by-kenneth-e-hagin-e34325757.html"));
                startActivity(viewIntent);
            }
        });

        //Exceedingly Growing Faith by Kenneth E. Hagin
        nov2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/exceedingly-growing-faith-by-kenneth-e-hagin-e17483815.html"));
                startActivity(viewIntent);
            }
        });

        //The Monk Who Sold His Ferrari
        nov3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/the-monk-who-sold-his-ferrari-e18783734.html"));
                startActivity(viewIntent);
            }
        });

        //Three Mistakes of My Life by Chetan Bhagat
        nov4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/three-mistakes-of-my-life-by-chetan-bhagat-e24667028.html"));
                startActivity(viewIntent);
            }
        });
    }
}