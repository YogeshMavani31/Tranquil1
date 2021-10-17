package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signuppg2 extends AppCompatActivity {

    TextView tvfname,tvlname,tvmail,tvgender,tvdate;
    Button btnsub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppg2);

        tvfname=(TextView)findViewById(R.id.tvfname);
        tvlname=(TextView)findViewById(R.id.tvlname);
        tvmail=(TextView)findViewById(R.id.tvmail);
        tvgender=(TextView)findViewById(R.id.tvgender);
        tvdate=(TextView)findViewById(R.id.tvdate);
        btnsub2=(Button)findViewById(R.id.btnsub2);
        Intent i=getIntent();
        String firstnm=i.getStringExtra("fname");
        String lastname=i.getStringExtra("lname");
        String gender=i.getStringExtra("gender");
        String bdate=i.getStringExtra("date");
        String email=i.getStringExtra("mail");

        tvfname.setText("First Name:- "+firstnm);
        tvlname.setText("Last Name:- "+lastname);
        tvgender.setText("Gender:- "+gender);
        tvdate.setText("Birthdate:- "+bdate);
        tvmail.setText("E-mail:- "+email);

        btnsub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Signuppg2.this,Signuppg3.class);
                startActivity(i);
            }
        });
    }
}