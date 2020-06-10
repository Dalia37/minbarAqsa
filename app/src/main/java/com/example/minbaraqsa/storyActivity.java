package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adapters.storyAdapter;
import com.example.Adapters.storyModel;

import java.util.ArrayList;

public class storyActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<storyModel>  stories = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        rv=findViewById(R.id.story_rv);

        stories.add(new storyModel(R.drawable.img_story_firstimg));
        stories.add(new storyModel(R.drawable.img_story_secondimg));
    }

    public void story_recycler(){

        storyAdapter adapter = new storyAdapter(stories);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);



    }
}
