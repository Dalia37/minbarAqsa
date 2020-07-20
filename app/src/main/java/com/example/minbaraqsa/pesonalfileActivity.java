package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class pesonalfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesonalfile);


        getSupportActionBar().setTitle(getResources().getString(R.string.profilefile));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#CE8B2B")));


    }
}
