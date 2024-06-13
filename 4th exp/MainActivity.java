package com.example.a4thexp;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText et;
    String[] country ={"Andhra Pradesh","Telangana","Tamil Ncharanadu","Karnataka","Kerala","Goa","Gujarat","Madhya Pradesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.submit);
        Spinner spin=findViewById(R.id.spinner);
        ArrayAdapter a=new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(a);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="";
                et=findViewById(R.id.uni);
                s+="Hello "+et.getText().toString()+"\n";
                et=findViewById(R.id.adri);
                s+="Address : "+et.getText().toString()+"\n";
                RadioGroup rb=findViewById(R.id.gr);
                int d=rb.getCheckedRadioButtonId();
                RadioButton r=findViewById(d);
                s+="Gender : "+r.getText().toString()+"\n";
                et=findViewById(R.id.dobi);
                s+="Date of Birth : "+et.getText().toString()+"\n";
                et=findViewById(R.id.agei);
                s+="Age : "+et.getText().toString()+"\n";
                s+="State : "+spin.getSelectedItem().toString()+"\n";
                TextView tv=findViewById(R.id.tv);
                tv.setText(s);
            }
        });
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),country[position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}