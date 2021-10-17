package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.content.Intent;
import android.os.Bundle;

public class Signuppg extends AppCompatActivity {

    EditText edtfname,edtlname,edtdate,edtmail;
    RadioButton rdtmale,rdtfemale;
    Spinner spdd,spmm,spyy;
    Button btnsub1;
    String ugender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppg);

        edtfname=(EditText)findViewById(R.id.edtfname);
        edtlname=(EditText)findViewById(R.id.edtlname);
        edtmail=(EditText)findViewById(R.id.edtmail);
        rdtmale=(RadioButton)findViewById(R.id.rdtmale);
        rdtfemale=(RadioButton)findViewById(R.id.rdtfemale);
        edtdate=(EditText)findViewById(R.id.edtdate);
        btnsub1=(Button)findViewById(R.id.btnsub1);

        Intent i=getIntent();

        btnsub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Signuppg.this,Signuppg2.class);
                i.putExtra("fname",edtfname.getText().toString());
                i.putExtra("lname",edtlname.getText().toString());
                i.putExtra("mail",edtmail.getText().toString());
                i.putExtra("date",edtdate.getText().toString());
                if(rdtmale.isChecked()){
                    ugender="Male";
                }
                if(rdtfemale.isChecked())
                {
                    ugender="Female";
                }
                i.putExtra("gender",ugender);
                startActivity(i);
            }
        });
        edtfname.addTextChangedListener(textWatcher);
        edtlname.addTextChangedListener(textWatcher);
        edtdate.addTextChangedListener(textWatcher);
        edtmail.addTextChangedListener(textWatcher);
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

            if( edtfname.getText().toString().equals("") && edtlname.getText().toString().equals("") && edtdate.getText().toString().equals("") && edtmail.getText().toString().equals(""))
            {
                btnsub1.setVisibility(View.GONE);
            }
            if( edtfname.getText().toString().length() != 0 && edtlname.getText().toString().length() != 0  && edtdate.getText().toString().length() != 0 && edtmail.getText().toString().length() != 0)
            {
                btnsub1.setVisibility(View.VISIBLE);

            }
            else
            {
                btnsub1.setVisibility(View.GONE);
            }
        }
    };

}