package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;

import com.example.Adapters.AleartDialog;
import com.example.Adapters.HomeAdapter;
import com.example.Adapters.HomeModel;
import com.example.Adapters.OnItemClickListener;
import com.example.Adapters.languageModel;
import com.example.Adapters.libraryAdapter;
import com.example.Adapters.libraryModel;

import java.util.ArrayList;

public class libraryActivity extends AppCompatActivity {

    RecyclerView rv ;
    Context context;
    ArrayList<libraryModel> books= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        rv=findViewById(R.id.library_rv);


         getSupportActionBar().setTitle(getResources().getString(R.string.library));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));







        books.add(new libraryModel(R.drawable.ic_library_dawnloadic,R.drawable.img_library_firstclip,"...الأسرة المسلمة في ظل التغ","المؤلف: رائد جميل عكاشة","عدد الصفحات : 156"));
        books.add(new libraryModel(R.drawable.ic_library_refresh,R.drawable.img_library_secondclip,"كيف ننصر المسجد الأقصى","المؤلف: محمد وصفي الجلاد","عدد الصفحات : 208"));
        books.add(new libraryModel(R.drawable.ic_library_dawnloaded,R.drawable.img_library_thirdclip,"...الثقافة الإسلامية بين التغريـ","المؤلف: شلتاع عبود","عدد الصفحات : 340"));
        books.add(new libraryModel(0,R.drawable.img_library_forthclip,"...الفكر الفلسفي في المغرب","المؤلف: د.كمال عبد اللطيف","عدد الصفحات : 282"));

        libraryAdapter adapter = new libraryAdapter(books, new OnItemClickListener() {
            @Override
            public void onItemClick(HomeModel homeModel) {

            }

            @Override
            public void onItemClick(libraryModel libraryModel) {

              showAleart();

            }

            @Override
            public void onItemClick(languageModel languageModel) {

            }
        },rv);


















        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rv.setLayoutManager(gridLayoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);




    }

    private void showAleart() {
        AleartDialog alert = new AleartDialog();
        alert.showDialog(this, getResources().getString(R.string.dawnloaded));

    }


}
