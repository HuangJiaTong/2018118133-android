package com.example.healthy_diet.food_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healthy_diet.R;
import com.example.healthy_diet.bean.FoodBean;

import java.util.List;

public class InfoListAdapter extends BaseAdapter {

    Context context;
    List<FoodBean> mDatas;

    public InfoListAdapter(Context context, List<FoodBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        //决定了ListView列表展示的行数
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        //返回指定位置对应的数据
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        //返回指定位置所对应的id
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_infolist_lv,null); //将布局转换成view对象的方法
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
          //加载控件显示的内容
          //获取集合指定位置的数据
        FoodBean foodBean = mDatas.get(position);
        holder.titleTv.setText(foodBean.getTitle());
        holder.notTv.setText("不可匹配:"+foodBean.getNotmatch());
        holder.iv.setImageResource(foodBean.getPicId());
        return convertView;
    }

    class ViewHolder{
        ImageView iv;
        TextView titleTv,notTv;
        public ViewHolder(View view){
            iv = view.findViewById(R.id.item_info_iv);
            titleTv = view.findViewById(R.id.item_info_tv_title);
            notTv = view.findViewById(R.id.item_info_tv_notmatch);
        }
    }

}
