package com.example.bithdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView rishi;

        rishi = findViewById(R.id.birthdayGreetings);

        Intent intent= getIntent();
        String name = intent.getStringExtra("Name");
        Log.d("Main Activity2",name);
        //System.out.println(name);
       rishi.setText("Happy Birthday "+name);

    }
}