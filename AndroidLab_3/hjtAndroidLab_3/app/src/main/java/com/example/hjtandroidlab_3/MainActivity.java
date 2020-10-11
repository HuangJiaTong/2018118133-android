package com.example.hjtandroidlab_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity{

    private List<Flower> flowerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFlowers();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FlowerAdapter adapter = new FlowerAdapter(flowerList);
        recyclerView.setAdapter(adapter);
    }

    private  void initFlowers(){
        for (int i = 0; i < 2; i++){
            Flower jasmine = new Flower(getRandomlengthName("Camellia"),R.drawable.jasmine);
            flowerList.add(jasmine);
            Flower carnation = new Flower(getRandomlengthName("Carnation"),R.drawable.carnation);
            flowerList.add(carnation);
            Flower gardenia = new Flower(getRandomlengthName("Gardenia"),R.drawable.gardenia);
            flowerList.add(gardenia);
            Flower hyacinth = new Flower(getRandomlengthName("Hyacinth"),R.drawable.hyacinth);
            flowerList.add(hyacinth);
            Flower lily = new Flower(getRandomlengthName("Lily"),R.drawable.lily);
            flowerList.add(lily);
            Flower peony = new Flower(getRandomlengthName("Peony"),R.drawable.peony);
            flowerList.add(peony);
            Flower rose = new Flower(getRandomlengthName("Rose"),R.drawable.rose);
            flowerList.add(rose);
            Flower poppy =  new Flower(getRandomlengthName("Poppy"),R.drawable.poppy);
            flowerList.add(poppy);
            Flower kapok = new Flower(getRandomlengthName("Kapok"),R.drawable.kapok);
            flowerList.add(kapok);
            Flower mimosa = new Flower(getRandomlengthName("Mimosa"),R.drawable.mimosa);
            flowerList.add(mimosa);

        }
    }
    private String getRandomlengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++){
            builder.append(name);
        }
        return builder.toString();
    }

}