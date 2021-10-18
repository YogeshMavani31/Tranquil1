package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class book extends AppCompatActivity {

    Button fiction, nonfiction, novel, comic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        fiction = (Button) findViewById(R.id.btnfiction);
        nonfiction = (Button) findViewById(R.id.btnnonfiction);
        novel = (Button) findViewById(R.id.btnnovel);
        comic = (Button) findViewById(R.id.btncomic);
        Intent i = getIntent();

        fiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(book.this,fiction.class);
                startActivity(i);
            }
        });

        nonfiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(book.this,nonfic.class);
                startActivity(i);
            }
        });

        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(book.this,novel.class);
                startActivity(i);
            }
        });

        comic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(book.this,comic.class);
                startActivity(i);
            }
        });
    }
}