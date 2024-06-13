package com.example.a5thexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                EditText et=findViewById(R.id.un);
                i.putExtra("un",et.getText().toString());
                et=findViewById(R.id.pwd);
                i.putExtra("pwd",et.getText().toString());
                startActivity(i);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}