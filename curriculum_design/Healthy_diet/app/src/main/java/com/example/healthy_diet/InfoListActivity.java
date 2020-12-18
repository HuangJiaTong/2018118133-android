package com.example.healthy_diet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

public class InfoListActivity extends AppCompatActivity {

    EditText searchEt;
    ImageView searchIv,flushIv;
    ListView showLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_list);
        //查找控件
        initView();

    }

    private void initView() {
        searchEt = findViewById(R.id.info_et_search);
        searchIv = findViewById(R.id.info_iv_search);
        flushIv = findViewById(R.id.info_iv_flush);
        showLv = findViewById(R.id.infolist_lv);
        searchIv.setOnClickListener(this); //添加点击事件的监听器
        flushIv.setOnClickListener(this);
    }
}