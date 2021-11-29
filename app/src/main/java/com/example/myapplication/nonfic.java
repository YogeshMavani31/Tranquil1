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

public class nonfic extends AppCompatActivity {
    Button nonfic1, nonfic2, nonfic3, nonfic4;
    ImageView nonficback;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonfic);
        nonfic1 = (Button) findViewById(R.id.nonficbut1);
        nonfic2 = (Button) findViewById(R.id.nonficbut2);
        nonfic3 = (Button) findViewById(R.id.nonficbut3);
        nonfic4 = (Button) findViewById(R.id.nonficbut4);
        nonficback = (ImageView) findViewById(R.id.nonficback);

        builder = new AlertDialog.Builder(this);
        nonficback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Intent i=new Intent(nonfic.this,waitingpg.class);
                                startActivity(i);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(nonfic.this,"We will provide you more books.",Toast.LENGTH_SHORT).show();

                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Breathing Activity");
                alert.show();
            }
        });

        //The Science Fiction Hall of Fame, Volume Two B:
        nonfic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/the-science-fiction-hall-of-fame-volume-two-b-the-greatest-science-fiction-novellas-of-all-time-chosen-by-the-members-of-the-science-fiction-writers-of-america-sf-hall-of-fame-e156951439.html"));
                startActivity(viewIntent);
            }
        });

        //Writing Creative Non-Fiction
        nonfic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/writing-creative-non-fiction-e26687816.html"));
                startActivity(viewIntent);
            }
        });

        //Spoken English: Flourish Your Language
        nonfic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/spoken-english-flourish-your-language-e1509842.html"));
                startActivity(viewIntent);
            }
        });

        //Fun With A Pencil by Andrew Loomis - Alex Hays
        nonfic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/fun-with-a-pencil-by-andrew-loomis-alex-hays-e8151153.html"));
                startActivity(viewIntent);
            }
        });

    }
}