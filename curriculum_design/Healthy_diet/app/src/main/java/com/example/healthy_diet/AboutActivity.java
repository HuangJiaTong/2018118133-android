package com.example.healthy_diet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    ViewPager aboutVp;
    TextView shareTv;
    LinearLayout pointLayout;
    List<View> viewList;   //ViewPager的数据源
    int[]picIds = {R.mipmap.ab1,R.mipmap.ab2,R.mipmap.ab3,R.mipmap.ab4,R.mipmap.ab5};
    private AboutAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutVp = findViewById(R.id.about_vp);
        shareTv = findViewById(R.id.about_tv_share);
        pointLayout = findViewById(R.id.about_layout_point);
        shareTv.setOnClickListener(this);
        viewList = new ArrayList<>();
        //初始化ViewPager的页面信息
        for (int i = 0; i < picIds.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.item_aboutvp, null);
            ImageView iv = view.findViewById(R.id.item_aboutvp_iv);
            iv.setImageResource(picIds[i]);
            viewList.add(view);
        }
        // 创建适配器对象
        adapter = new AboutAdapter(viewList);
        //设置适配器
        aboutVp.setAdapter(adapter);
        //发送切换页面消息

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