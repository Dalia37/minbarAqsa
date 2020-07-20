package com.example.minbaraqsa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.Adapters.viewPagerAdapter;
import com.example.Fragments.jerusalemNewsFragments;
import com.example.Fragments.newsMinberFragment;
import com.example.Fragments.textspeachFragment;
import com.example.Fragments.videospeachFragment;
import com.google.android.material.tabs.TabLayout;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

public class TextspeachActivity extends AppCompatActivity {
    ViewPager viewPager ;
    TabLayout tabLayout ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textspeach);
        viewPager = findViewById(R.id.textspeach_viewpager);
        tabLayout=findViewById(R.id.textspeach_tablayout);


        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
        getSupportActionBar().setTitle(getResources().getString(R.string.speach));

        com.example.Adapters.viewPagerAdapter pagerAdapter = new viewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new textspeachFragment(),"خطب نصية");
        pagerAdapter.addFragment(new videospeachFragment(),"خطب مرئية ");

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
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

    }

    public void addtextspeach(View view) {
        Intent intent = new Intent(this,addvisualActivity.class);
        startActivity(intent);
    }
}
