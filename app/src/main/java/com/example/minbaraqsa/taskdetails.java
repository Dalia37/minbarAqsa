package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class taskdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskdetails);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
        getSupportActionBar().setTitle(getResources().getString(R.string.detais));

    }
}
