package com.example.minbaraqsa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setTitle(getResources().getString(R.string.details));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C58528")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.share:
                shareicon();
                return  true;
                default:
                    Intent intent = new Intent(this , HomeActivity.class);
                    startActivity(intent);
                    
        }

   return true;
    }

    private void shareicon() {
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
}
