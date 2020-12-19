package com.example.healthy_diet.food_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.healthy_diet.R;
import com.example.healthy_diet.bean.FoodBean;
import com.example.healthy_diet.bean.FoodUtils;

import java.util.List;

public class FoodGridActivity extends AppCompatActivity {

    GridView gv;
    List<FoodBean> mDatas;
    private FoodGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_grid);
        //查找控件
        gv = findViewById(R.id.food_grid_gv);
        //查找全部数据源
        mDatas = FoodUtils.getAllFoodList();
        //创建适配器对象
        adapter = new FoodGridAdapter(this, mDatas);
        //设置适配器
        gv.setAdapter(adapter);
    }
}