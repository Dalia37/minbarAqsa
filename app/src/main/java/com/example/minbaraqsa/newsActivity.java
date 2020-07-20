package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.Adapters.viewPagerAdapter;
import com.example.Fragments.jerusalemNewsFragments;
import com.example.Fragments.newsMinberFragment;
import com.google.android.material.tabs.TabLayout;

public class newsActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        tabLayout=findViewById(R.id.news_tablayout);
        viewPager=findViewById(R.id.news_viewpager);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
        getSupportActionBar().setTitle(getResources().getString(R.string.news));

        viewPagerAdapter  pagerAdapter = new viewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new newsMinberFragment(),"أخبار المنبر");
        pagerAdapter.addFragment(new jerusalemNewsFragments(),"أخبار القدس");

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);





    }
}
