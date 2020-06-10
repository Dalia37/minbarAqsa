package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adapters.donationsAdapter;
import com.example.Adapters.donationsModel;

import java.util.ArrayList;

public class donations extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<donationsModel> donations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);

        rv=findViewById(R.id.donations_rv);


        donations.add(new donationsModel(R.drawable.img_donations_firstimg,getResources().getString(R.string.donations_first)));
        donations.add(new donationsModel(R.drawable.img_donations_secondimg,getResources().getString(R.string.donations_second)));
        donations.add(new donationsModel(R.drawable.img_donations_thirdimg,getResources().getString(R.string.donations_third)));
        donations.add(new donationsModel(R.drawable.img_donations_forthimg,getResources().getString(R.string.donations_forth)));
        donations.add(new donationsModel(R.drawable.img_donathins_fifthimg,getResources().getString(R.string.donations_fifth)));


    }

    public void creat_recycler(){
        donationsAdapter adapter = new donationsAdapter(donations);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }
}
