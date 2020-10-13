package com.example.hjtandroidlab_3;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {

    private List<Flower> mFlowerList;

    static  class ViewHolder extends RecyclerView.ViewHolder{
        View flowerView;
        ImageView flowerImage;
        EditText flowerName;


        public ViewHolder(View view){
            super(view);
            flowerView = view;
            flowerImage = (ImageView) view.findViewById(R.id.flower_image);
            flowerName =  (EditText) view.findViewById(R.id.flower_name);
        }


    }

    public FlowerAdapter(List<Flower> flowerList){
        mFlowerList = flowerList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flower_item,parent,false);
        final ViewHolder holder =  new ViewHolder(view);
        holder.flowerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Flower flower = mFlowerList.get(position);
                Toast.makeText(v.getContext(),"双击编辑",
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.flowerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Flower flower = mFlowerList.get(position);
                Toast.makeText(v.getContext(),"you clicked image"+flower.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
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
