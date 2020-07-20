package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.Adapters.HomeModel;
import com.example.Adapters.OnItemClickListener;
import com.example.Adapters.languageAdapter;
import com.example.Adapters.languageModel;
import com.example.Adapters.libraryModel;

import java.util.ArrayList;

public class applanguage extends AppCompatActivity {
    ArrayList<languageModel> languages = new ArrayList<>();
    RecyclerView rv ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applanguage);
        rv= findViewById(R.id.language_rv);

        Arraylistdata();



        languageAdapter adapter = new languageAdapter(languages, new OnItemClickListener() {
            @Override
            public void onItemClick(HomeModel homeModel) {

            }

            @Override
            public void onItemClick(libraryModel libraryModel) {

            }

            @Override
            public void onItemClick(languageModel languageModel) {

                Toast.makeText(applanguage.this,languageModel.getLanguage().toString(), Toast.LENGTH_SHORT).show();

            }
        }, rv);



        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);


    }

    private void Arraylistdata() {
        languages.add(new languageModel(R.drawable.ic_english_flag,getResources().getString(R.string.english)));
        languages.add(new languageModel(R.drawable.ic_arabic_flag,getResources().getString(R.string.arabic)));
        languages.add(new languageModel(R.drawable.ic_turki_flag,getResources().getString(R.string.turki)));
    }


}
