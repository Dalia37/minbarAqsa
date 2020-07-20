package com.example.minbaraqsa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.Adapters.ManagmentModel;
import com.example.Adapters.managmentAdapter;
import com.example.Adapters.onItemManageListener;
import com.google.android.material.navigation.NavigationView;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

import java.util.ArrayList;

public class manage extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener {
    AdvanceDrawerLayout drawerLayout ;
    RecyclerView rv ;
    ArrayList<ManagmentModel> lists = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        drawerLayout=findViewById(R.id.drawer_task);
        rv=findViewById(R.id.rv_task);

        managmentAdapter adapter  = new managmentAdapter(lists, rv, new onItemManageListener() {
            @Override
            public void OnItemClick(ManagmentModel managmentModel) {
                Intent intent = new Intent(getApplicationContext(),taskdetails.class);
                startActivity(intent);


            }
        },this);
        datalist();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
        getSupportActionBar().setTitle(getResources().getString(R.string.tasks));




    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void datalist() {
        lists.add(new ManagmentModel(R.drawable.img_managment,"خالد عبد العزيز","مهمة إدارية","هناك حقيقة مثبتة منذ زمن طويل وهي أن المحتوى المقروء لصفحة ما سيلهي القارئ عن التركيز على الشكل الخارجي للنص أو شكل توضع الفقرات","غير منفذة","تاريخ الاستحقاق","05/01/2020","05/01/2020"));
        lists.add(new ManagmentModel(R.drawable.img_managment,"خالد عبد العزيز","مهمة إدارية","هناك حقيقة مثبتة منذ زمن طويل وهي أن المحتوى المقروء لصفحة ما سيلهي القارئ عن التركيز على الشكل الخارجي للنص أو شكل توضع الفقرات","غير منفذة","تاريخ الاستحقاق","05/01/2020","05/01/2020"));
        lists.add(new ManagmentModel(R.drawable.img_managment,"خالد عبد العزيز","مهمة إدارية","هناك حقيقة مثبتة منذ زمن طويل وهي أن المحتوى المقروء لصفحة ما سيلهي القارئ عن التركيز على الشكل الخارجي للنص أو شكل توضع الفقرات","غير منفذة","تاريخ الاستحقاق","05/01/2020","05/01/2020"));

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.speachmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.speach_menu:

                navigationDrawer();
                return  true;
            default:
                Intent intent = new Intent(this , HomeActivity.class);
                startActivity(intent);

        }

        return true;
    }

    private void navigationDrawer() {
        drawerLayout.openDrawer(GravityCompat.END);


    }

}
