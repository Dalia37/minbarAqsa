package com.example.Adapters;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.minbaraqsa.AboutApp;
import com.example.minbaraqsa.HomeActivity;
import com.example.minbaraqsa.R;
import com.example.minbaraqsa.applanguage;
import com.example.minbaraqsa.loginActivity;

import static androidx.core.content.ContextCompat.getColor;
import static androidx.core.content.ContextCompat.startActivity;

public class CustomDilog {
    Activity context ;
    Dialog dialog;

    TextView app_language , about_app , login , close ;

    public  void showDialog(Activity activity , String msg){
         dialog = new Dialog(activity);
        this.context=activity;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.more_custom);

        showAleart();


    }

    private void showAleart() {

        app_language=dialog.findViewById(R.id.more_applanguage);
        about_app=dialog.findViewById(R.id.more_aboutapp);
        login=dialog.findViewById(R.id.logout);
        close=dialog.findViewById(R.id.close);

        app_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),applanguage.class);
                context.startActivity(intent);
            }

        });
        about_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),AboutApp.class);
                context.startActivity(intent);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),loginActivity.class);
                context.startActivity(intent);
            }
        });

        dialog.show();

        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(R.drawable.black_bg);
        window.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);


    }


}
