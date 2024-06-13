package com.example.a3rdexp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = findViewById(R.id.et);
                TextView tv = findViewById(R.id.tv);
                tv.setText("Hello " + et.getText().toString()+"!");
            }
        });
    }
}
//    public void name(View view)
//    {
//        Button b=findViewById(R.id.bt);
//
//    }
//}