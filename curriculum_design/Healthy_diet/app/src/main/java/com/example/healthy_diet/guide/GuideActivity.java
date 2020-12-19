package com.example.healthy_diet.guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.healthy_diet.R;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity implements View.OnClickListener{

    ViewPager guideVp;
    TextView tv1,tv2,tv3;
    Button guideBtn;
    List<View> viewList;  //ViewPager的数据源
    List<TextView>numList;  //表示页码的集合
    int resId[] = {R.mipmap.pic1,R.mipmap.pic2,R.mipmap.pic3};  //所显示的图片资源数组

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        guideVp = findViewById(R.id.guide_vp);
        tv1 = findViewById(R.id.guide_tv1);
        tv2 = findViewById(R.id.guide_tv2);
        tv3 = findViewById(R.id.guide_tv3);
        guideBtn = findViewById(R.id.guide_btn);

        viewList = new ArrayList<>();
        numList = new ArrayList<>();
        //初始化ViewPager的页面资源
        for (int i = 0; i < resId.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.item_guide1,null);
            view.setBackgroundResource(resId[i]);
            viewList.add(view);
        }
    }

    @Override
    public void onClick(View v) {

    }
}