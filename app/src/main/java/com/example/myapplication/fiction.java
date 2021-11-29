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

public class fiction extends AppCompatActivity {
    Button fic1, fic2, fic3, fic4;
    ImageView ficback;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);
        fic1 = (Button) findViewById(R.id.ficbut1);
        fic2 = (Button) findViewById(R.id.ficbut2);
        fic3 = (Button) findViewById(R.id.ficbut3);
        fic4 = (Button) findViewById(R.id.ficbut4);
        ficback = (ImageView)findViewById(R.id.Ficback);

        builder = new AlertDialog.Builder(this);
        ficback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Intent i=new Intent(fiction.this,waitingpg.class);
                                startActivity(i);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(fiction.this,"We will provide you more books.",Toast.LENGTH_SHORT).show();

                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Breathing Activity");
                alert.show();
            }
        });
    //WINGS OF FIRE
        fic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/wings-of-fire-e33405285.html"));
                startActivity(viewIntent);
            }
        });

    // RICH DAD POOR DAD
        fic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/rich-dad-poor-dad-e136494023.html"));
                startActivity(viewIntent);
            }
        });

    //Zero to One: Notes on Startups, or How to Build the Future
        fic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/zero-to-one-notes-on-startups-or-how-to-build-the-future-e162071379.html"));
                startActivity(viewIntent);
            }
        });

    //The Intelligent Investor
        fic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.pdfdrive.com/the-intelligent-investor-e12634278.html"));
                startActivity(viewIntent);
            }
        });

    }
}