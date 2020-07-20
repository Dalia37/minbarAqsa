package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.Adapters.donationsModel;

public class donationdetails extends AppCompatActivity {

    ImageView donationdetais_img ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donationdetails);
        donationdetais_img=findViewById(R.id.donationdetais_img);
        int icon = getIntent().getIntExtra("image",0);

        String title = getIntent().getStringExtra("title");

        donationdetais_img.setImageResource(icon);

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
}
}
