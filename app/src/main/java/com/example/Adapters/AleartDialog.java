package com.example.Adapters;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.media.AudioAttributes;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.minbaraqsa.R;

public class AleartDialog {

    Activity context ;

    Dialog dialog ;
    TextView text;
    Button yes , No ;
    public void showDialog(Activity activity, String msg){
         dialog = new Dialog(activity);
         this.context=activity;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.aleartrow);

         text =  dialog.findViewById(R.id.text_dialog);
        text.setText(msg);

        yes = dialog.findViewById(R.id.yes);
        No=dialog.findViewById(R.id.no);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });



        dialog.show();

    }
}
