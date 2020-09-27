package com.example.hjtandroidlab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class hjtSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hjtSecondActivity",this.toString());
        setContentView(R.layout.activity_hjt_second);
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hjtSecondActivity.this,hjtThirdActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
        protected void onRestart(){
            super.onRestart();
            Log.d("hjtSecondActivity","onRestart");
    }
}