package com.example.hjtandroidlab_3;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {

    private List<Flower> mFlowerList;

    static  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView flowerImage;
        TextView flowerName;


        public ViewHolder(View view){
            super(view);
            flowerImage = (ImageView) view.findViewById(R.id.flower_image);
            flowerName =  (TextView) view.findViewById(R.id.flower_name);
        }

    }

    public FlowerAdapter(List<Flower> flowerList){
        mFlowerList = flowerList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flower_item,parent,false);
        ViewHolder holder =  new ViewHolder(view);
        return holder;
    }

    @Override
    public  void onBindViewHolder(ViewHolder holder,int position){
        Flower flower = mFlowerList.get(position);
        holder.flowerImage.setImageResource(flower.getImageId());
        holder.flowerName.setText(flower.getName());
    }

    @Override
    public int getItemCount(){
        return mFlowerList.size();
    }
}
