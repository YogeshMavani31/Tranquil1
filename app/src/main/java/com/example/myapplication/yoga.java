package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class yoga extends AppCompatActivity {
    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        button = findViewById(R.id.button);//for beginner
        button2 = findViewById(R.id.button2);//for meditation
        button3 = findViewById(R.id.button3);//for relaxation
        button4 = findViewById(R.id.button4);//for stress relief

    }

    //on click listener for beginner yoga(Add videos accordingly)
    public void Beginner(View view) {
        Toast.makeText(this, "Work Succesfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_yoga_1.class);
        startActivity(intent);
    }

    public void Med(View view) {
        Toast.makeText(this, "Work Succesfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_yoga_2.class);
        startActivity(intent);
    }
    public void Relax(View view) {
        Toast.makeText(this, "Work Succesfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_yoga_3.class);
        startActivity(intent);
    }

    public void Stress(View view) {
        Toast.makeText(this, "Work Succesfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_yoga_4.class);
        startActivity(intent);
    }
}