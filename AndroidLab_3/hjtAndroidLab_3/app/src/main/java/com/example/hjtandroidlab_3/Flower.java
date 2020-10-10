package com.example.hjtandroidlab_3;

public class Flower {
    private String name;
    private int imageId;
    public Flower(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
