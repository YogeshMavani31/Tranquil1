package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.text.TextWatcher;
import android.widget.EditText;

public class Signuppg3 extends AppCompatActivity {

    EditText edtuid, edtpass;
    Button btnsub3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppg3);

        edtuid = (EditText) findViewById(R.id.edtuid);
        edtpass = (EditText) findViewById(R.id.edtpass);
        btnsub3 = (Button) findViewById(R.id.btnsub3);
        Intent i = getIntent();
        btnsub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signuppg3.this, MainActivity.class);
                i.putExtra("id", edtuid.getText().toString());
                i.putExtra("pass", edtpass.getText().toString());
                startActivity(i);
            }

        });
        edtpass.addTextChangedListener(textWatcher);
        edtuid.addTextChangedListener(textWatcher);

    }
    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }
        @Override
        public void afterTextChanged(Editable editable) {
            if( edtuid.getText().toString().equals("") && edtpass.getText().toString().equals(""))
            {
                btnsub3.setVisibility(View.GONE);
            }
            if( edtuid.getText().toString().length() != 0 && edtpass.getText().toString().length() != 0)
            {
                btnsub3.setVisibility(View.VISIBLE);
            }
            else {
                btnsub3.setVisibility(View.GONE);
            }
        }

    };
}