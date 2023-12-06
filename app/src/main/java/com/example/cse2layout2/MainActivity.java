package com.example.cse2layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button setting;
    private Button start;
    private Button synch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setting = (Button) findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
            opensetting();
            }
        });
        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openstart();
            }
        });
        synch = (Button) findViewById(R.id.synch);
        synch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            opensynch();
            }
        });
    }
    public void opensetting() {
        Intent intent = new Intent(this,setting.class);
        startActivity(intent);
    }
    public void openstart() {
        Intent intent = new Intent(this,start.class);
        startActivity(intent);
    }
    public void opensynch() {
        Intent intent = new Intent(this,synch.class);
        startActivity(intent);
    }
}