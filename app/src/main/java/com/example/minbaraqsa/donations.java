package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;

import com.example.Adapters.Onitemdonationlistener;
import com.example.Adapters.donationsAdapter;
import com.example.Adapters.donationsModel;

import java.util.ArrayList;

public class donations extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<donationsModel> donations = new ArrayList<>();
    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);

        rv=findViewById(R.id.donations_rv);

        getSupportActionBar().setTitle(getResources().getString(R.string.donations));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));



        donations.add(new donationsModel(R.drawable.img_donations_firstimg,getResources().getString(R.string.donations_first)));
        donations.add(new donationsModel(R.drawable.img_donations_secondimg,getResources().getString(R.string.donations_second)));
        donations.add(new donationsModel(R.drawable.img_donations_thirdimg,getResources().getString(R.string.donations_third)));
        donations.add(new donationsModel(R.drawable.img_donations_forthimg,getResources().getString(R.string.donations_forth)));
        donations.add(new donationsModel(R.drawable.img_donathins_fifthimg,getResources().getString(R.string.donations_fifth)));

        donationsAdapter adapter = new donationsAdapter(donations, new Onitemdonationlistener() {
            @Override
            public void Onclick(donationsModel donationsModel) {
                Intent intent = new Intent(getApplicationContext(),donationdetails.class);
                intent.putExtra("title",donationsModel.getDonations_tv());
                intent.putExtra("image",donationsModel.getDonations_img());
                startActivity(intent);
            }
        }, rv);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);


    }


}
