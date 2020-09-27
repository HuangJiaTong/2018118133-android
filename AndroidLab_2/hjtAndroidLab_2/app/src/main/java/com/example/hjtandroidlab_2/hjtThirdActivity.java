package com.example.hjtandroidlab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class hjtThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hjtThirdActivity","Task id is" + getTaskId());
        setContentView(R.layout.activity_hjt_third);
        Button button2 = (Button) findViewById(R.id.button_2);
        Button button4 = (Button) findViewById(R.id.button_4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hjtThirdActivity.this,hjtSecondActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hjtThirdActivity.this,hjtFourthActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("hjtThirdActivity","onDestroy");
    }
}