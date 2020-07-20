package com.example.minbaraqsa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.Adapters.CustomDilog;
import com.example.Adapters.HomeAdapter;
import com.example.Adapters.HomeModel;
import com.example.Adapters.OnItemClickListener;
import com.example.Adapters.StoryDialog;
import com.example.Adapters.TextspeachModel;
import com.example.Adapters.languageModel;
import com.example.Adapters.libraryModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ImageView ic_notification , ic_share , ic_menu ;
    RecyclerView rv;
    ArrayList<HomeModel> category = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        inflate();
        ArryList_data();
        menu_Action();







        HomeAdapter adapter = new HomeAdapter(category, new OnItemClickListener() {
            @Override
            public void onItemClick(HomeModel homeModel) {
                if (homeModel.getName().equals(getResources().getString(R.string.library))) {
                    startActivity(new Intent(getApplicationContext(), libraryActivity.class));
                } else if (homeModel.getName().equals(getResources().getString(R.string.news))) {
                    startActivity(new Intent(getApplicationContext(), newsActivity.class));
                } else if (homeModel.getName().equals(getResources().getString(R.string.connect))) {
                    startActivity(new Intent(getApplicationContext(), contactusActivity.class));
                } else if (homeModel.getName().equals(getResources().getString(R.string.voice))) {
                    startActivity(new Intent(getApplicationContext(), Drawer.class));
                } else if (homeModel.getName().equals(getResources().getString(R.string.hands))) {
                    startActivity(new Intent(getApplicationContext(), donations.class));
                } else if (homeModel.getName().equals(getResources().getString(R.string.actions))) {
                    startActivity(new Intent(getApplicationContext(), ActionsActivity.class));
                } else if (homeModel.getName().equals(getResources().getString(R.string.manage))) {
                    startActivity(new Intent(getApplicationContext(), manage.class));

                } else if (homeModel.getName().equals(getResources().getString(R.string.profile))) {
                    startActivity(new Intent(getApplicationContext(), pesonalfileActivity.class));
                }


            }

            @Override
            public void onItemClick(libraryModel libraryModel) {

            }

            @Override
            public void onItemClick(languageModel languageModel) {

            }
        }, rv);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rv.setLayoutManager(gridLayoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);


    }

    private void menu_Action() {
        ic_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),notificationActivity.class));
            }
        });

        ic_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String shareBody = "   MinberAqsa \n https://play.google.com/store/apps/details?id=com.app.minbar_alaqsaa";
                String sharesub = "your subject here";
                sendIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
        ic_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAleart();
            }
        });
    }

    private void ArryList_data() {
        category.add(new HomeModel(R.drawable.library, getResources().getString(R.string.library)));
        category.add(new HomeModel(R.drawable.chat, getResources().getString(R.string.chat)));
        category.add(new HomeModel(R.drawable.news, getResources().getString(R.string.news)));
        category.add(new HomeModel(R.drawable.connect, getResources().getString(R.string.connect)));
        category.add(new HomeModel(R.drawable.manage, getResources().getString(R.string.manage)));
        category.add(new HomeModel(R.drawable.voice, getResources().getString(R.string.voice)));
        category.add(new HomeModel(R.drawable.hands, getResources().getString(R.string.hands)));
        category.add(new HomeModel(R.drawable.profile, getResources().getString(R.string.profile)));
        category.add(new HomeModel(R.drawable.actions, getResources().getString(R.string.actions)));
    }

    private void inflate() {
        rv = findViewById(R.id.home_rv);
        ic_notification=findViewById(R.id.ic_notification);
        ic_share=findViewById(R.id.ic_share);
        ic_menu=findViewById(R.id.ic_menu);
    }


    private  void showAleart() {
        CustomDilog alert = new CustomDilog();
        alert.showDialog(this, "Error de conexión al servidor");
    }


    public void lookStory(View view) {
        StoryDialog dialog = new StoryDialog();
        dialog.showDialog(this, "Error de conexión al servidor");


    }
}
