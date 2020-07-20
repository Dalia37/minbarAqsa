package com.example.Adapters;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class StoryDialog {
    Activity context ;
    Dialog dialog ;

    RecyclerView rv ;
    ArrayList<storyModel> stories = new ArrayList<>();

    public  void showDialog(Activity activity , String msg){
        dialog = new Dialog(activity);
        this.context=activity;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.storycustom);
        rv=dialog.findViewById(R.id.story_rv);




        stories.add(new storyModel(R.drawable.img_story_firstimg));
        stories.add(new storyModel(R.drawable.img_story_secondimg));

        storyAdapter adapter = new storyAdapter(stories,context,this);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);





        dialog.show();

        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(R.drawable.black_bg);
        window.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);




    }

void dismiss(){
        dialog.dismiss();
}
}
