package com.example.healthy_diet.food_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.healthy_diet.R;
import com.example.healthy_diet.bean.FoodBean;
import com.example.healthy_diet.bean.FoodUtils;

import java.util.ArrayList;
import java.util.List;

public class InfoListActivity extends AppCompatActivity {

    EditText searchEt;
    ImageView searchIv,flushIv;
    ListView showLv;
    //ListView数据源
    List<FoodBean> mDatas;
    List<FoodBean>allFoodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_list);
        //查找控件
        initView();
        //初始化数据源
        mDatas = new ArrayList<>();
        allFoodList = FoodUtils.getAllFoodList();
        mDatas.addAll(allFoodList);
        //创建适配器
        adapter = new InfoListAdapter(this, mDatas);

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