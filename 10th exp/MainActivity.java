package com.example.a10thexp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText cnameedt=findViewById(R.id.cname),ctimeedt=findViewById(R.id.ctime),ctracksedt=findViewById(R.id.ctracks),cdesedt=findViewById(R.id.cdes);
                String cname=cnameedt.getText().toString(),ctime=ctimeedt.getText().toString(),ctracks=ctracksedt.getText().toString(),cdes=cdesedt.getText().toString();
                if(cname.isEmpty()||ctime.isEmpty()||ctracks.isEmpty()||cdes.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all the data", Toast.LENGTH_LONG).show();
                    return;
                }
                DBHandler db=new DBHandler(MainActivity.this);
                db.addNewCourse(cname,ctime,cdes,ctracks);
                Toast.makeText(MainActivity.this, "Course has been added", Toast.LENGTH_SHORT).show();
                cnameedt.setText("");
                ctimeedt.setText("");
                cdesedt.setText("");
                ctracksedt.setText("");
            }
        });
    }
}