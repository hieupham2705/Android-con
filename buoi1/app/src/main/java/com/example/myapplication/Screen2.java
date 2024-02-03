package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {
    private static final String TAG = "Screen2";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        tv = findViewById(R.id.textView);
        String textFromScreen1 = getIntent().getStringExtra("key");
        int number = getIntent().getIntExtra("key2",-1);
        tv.setText(textFromScreen1);
        Log.e(TAG, "onCreate: "+ number);
    }
}