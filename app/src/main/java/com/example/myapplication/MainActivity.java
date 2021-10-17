package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText edtid,edtpass;
    Button btnlogin,btnsignup;

    String uid = "yogesh";
    String upass = "yogesh34";
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtid = (EditText)findViewById(R.id.edtid);
        edtpass = (EditText)findViewById(R.id.edtpass);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnsignup = (Button)findViewById(R.id.btnsignup);

        Intent i=getIntent();

        final String id=i.getStringExtra("id");
        final String password=i.getStringExtra("pass");

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtid.getText().toString().trim().equals(id) && edtpass.getText().toString().trim().equals(password))
                {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,MainPage1.class);
                    i.putExtra("id",id);
                    startActivity(i);

                }
                if(edtid.getText().toString().equals(uid) && edtpass.getText().toString().equals(upass))
                {
                    Toast.makeText(MainActivity.this, "Login Success...", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,MainPage1.class);
                    i.putExtra("id",uid);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed....", Toast.LENGTH_SHORT).show();
                    counter = counter + 1;

                    if(counter>=3)
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle("Forgot Password....");
                        builder.setMessage("Do You Change Password ?");

                        builder.setCancelable(false);

                        builder.setIcon(R.drawable.tranquil);


                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                counter = 0;
                            }
                        });
                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });

                        builder.show();
                    }
                }
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Signuppg.class);
                startActivity(i);
            }
        });
    }
}