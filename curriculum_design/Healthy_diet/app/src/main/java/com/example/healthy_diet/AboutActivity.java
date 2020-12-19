package com.example.healthy_diet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    ViewPager aboutVp;
    TextView shareTv;
    LinearLayout pointLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutVp = findViewById(R.id.about_vp);
        shareTv = findViewById(R.id.about_tv_share);
        pointLayout = findViewById(R.id.about_layout_point);
        shareTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //调用系统自带的分享功能
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String msg= "健康饮食非常的重要，了解饮食各种营养素和热量，摄入正确的食物，让你变得更健康，想要了解更多么，快来下载健康饮食app吧~~";
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        startActivity(Intent.createChooser(intent,"健康饮食分享"));
    }
}