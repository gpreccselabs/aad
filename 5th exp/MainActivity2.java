package com.example.a5thexp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.widget.*;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        TextView tv=findViewById(R.id.un);
        tv.setText(i.getExtras().getString("un"));
        tv=findViewById(R.id.pwd);
        tv.setText(i.getExtras().getString("pwd"));
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}