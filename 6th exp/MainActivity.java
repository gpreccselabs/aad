package com.example.a6thexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num=findViewById(R.id.num),msg=findViewById(R.id.msg);
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms",num.getText().toString(),null));
                i.putExtra("sms_body",msg.getText().toString());
                startActivity(i);
            }
        });
    }
}