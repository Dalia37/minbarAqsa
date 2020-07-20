package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.Adapters.viewPagerAdapter;
import com.example.Fragments.ChatNotification;
import com.example.Fragments.generalNotificationFragment;
import com.example.Fragments.jerusalemNewsFragments;
import com.example.Fragments.newsMinberFragment;
import com.google.android.material.tabs.TabLayout;

public class notificationActivity extends AppCompatActivity {
    TabLayout notification_tablayout ;
    ViewPager notification_viewpager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notification_tablayout = findViewById(R.id.notification_tablayout);
        notification_viewpager=findViewById(R.id.notification_viewpager);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
        getSupportActionBar().setTitle(getResources().getString(R.string.notifications));

        com.example.Adapters.viewPagerAdapter pagerAdapter = new viewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new generalNotificationFragment(),getResources().getString(R.string.item1));
        pagerAdapter.addFragment(new generalNotificationFragment(),getResources().getString(R.string.item2));

        notification_viewpager.setAdapter(pagerAdapter);
        notification_tablayout.setupWithViewPager(notification_viewpager);





    }
}
