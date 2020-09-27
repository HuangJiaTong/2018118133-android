package com.example.hjtandroidlab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class hjtFifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hjtFifthActivity","Task id is" + getTaskId());
        setContentView(R.layout.activity_hjt_fifth);
    }
}