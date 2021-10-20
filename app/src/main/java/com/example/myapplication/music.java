package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class music extends AppCompatActivity {
    private Button InstrumentalButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_categories);

        InstrumentalButton = findViewById(R.id.instrumental);
        InstrumentalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenPlayer();
            }
        });

    }

    public void OpenPlayer() {

        Intent i = new Intent(this,activity_music_player.class);
        startActivity(i);
    }
}