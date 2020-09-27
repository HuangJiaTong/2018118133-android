package com.example.hjtandroidlab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class hjtFourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hjtFourthActivity","Task id is" + getTaskId());
        setContentView(R.layout.activity_hjt_fourth);
        Button button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hjtFourthActivity.this,hjtFifthActivity.class);
                startActivity(intent);
            }
        });
    }
}