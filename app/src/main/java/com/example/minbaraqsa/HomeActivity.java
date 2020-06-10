package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adapters.HomeAdapter;
import com.example.Adapters.HomeModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<HomeModel> category = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rv=findViewById(R.id.home_rv);
        home_recycler();

        ArrayList<HomeModel> category = new ArrayList<>();
        category.add(new HomeModel(R.drawable.library,getResources().getString(R.string.library)));
        category.add(new HomeModel(R.drawable.chat,getResources().getString(R.string.chat)));
        category.add(new HomeModel(R.drawable.news,getResources().getString(R.string.news)));
        category.add(new HomeModel(R.drawable.connect,getResources().getString(R.string.connect)));
        category.add(new HomeModel(R.drawable.manage,getResources().getString(R.string.manage)));
        category.add(new HomeModel(R.drawable.voice,getResources().getString(R.string.voice)));
        category.add(new HomeModel(R.drawable.hands,getResources().getString(R.string.hands)));
        category.add(new HomeModel(R.drawable.profile,getResources().getString(R.string.profile)));
        category.add(new HomeModel(R.drawable.actions,getResources().getString(R.string.actions)));







    }


    public void home_recycler(){
        HomeAdapter adapter = new HomeAdapter(category);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rv.setLayoutManager(gridLayoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }
}
