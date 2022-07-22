package com.example.bithdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    String name="Given Name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        input = (EditText) findViewById(R.id.inputEditText);

    }

    public void buttonFun(View view) {

        name = input.getText().toString();
        Toast.makeText(this,"Name is "+name, Toast.LENGTH_LONG).show();

        Intent intent =new Intent(this, MainActivity2.class);
        intent.putExtra("Name",name);
        Log.d("Main Activity",name);
        startActivity(intent);
    }
}