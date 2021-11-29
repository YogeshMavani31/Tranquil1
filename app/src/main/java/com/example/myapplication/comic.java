package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.URI;

public class comic extends AppCompatActivity {
    DownloadManager manager;
    Button com1, com2, com3, com4;
    AlertDialog.Builder builder;
    ImageView comicback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);
        com1 = (Button) findViewById(R.id.combut1);
        com2 = (Button) findViewById(R.id.combut2);
        com3 = (Button) findViewById(R.id.combut3);
        comicback = (ImageView) findViewById(R.id.comicback);

        builder = new AlertDialog.Builder(this);
        comicback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Intent i=new Intent(comic.this,waitingpg.class);
                                startActivity(i);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(comic.this,"We will provide you more books.",Toast.LENGTH_SHORT).show();

                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Breathing Activity");
                alert.show();
            }
        });

        //The 1955 Romance Comics Trial - adelaide comics and books
        com1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/the-1955-romance-comics-trial-adelaide-comics-and-books-e12490957.html"));
                startActivity(viewIntent);
            }
        });

        //The DC Comics Guide to Digitally Drawing Comics
        com2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/the-dc-comics-guide-to-digitally-drawing-comics-e158555349.html"));
                startActivity(viewIntent);
            }
        });

        //DC Marvel Comics - Batman & Spiderman
        com3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/dc-marvel-comics-batman-spiderman-e156711129.html"));
                startActivity(viewIntent);
            }
        });



    }
}