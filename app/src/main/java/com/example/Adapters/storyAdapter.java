package com.example.Adapters;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.HomeActivity;
import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class storyAdapter extends RecyclerView.Adapter<storyAdapter.storyViewHolder> {

    ArrayList<storyModel> stories = new ArrayList<>();
    Context context ;
    StoryDialog dialog ;

    public storyAdapter(ArrayList<storyModel> stories, Context context, StoryDialog dialog) {
        this.stories = stories;
        this.context = context;
        this.dialog = dialog;
    }

    @NonNull
    @Override
    public storyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new storyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.storydesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull storyViewHolder holder, int position) {
        holder.img_story.setImageResource(stories.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class storyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_story , close;

        public storyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            img_story=itemView.findViewById(R.id.story_img);
            close=itemView.findViewById(R.id.ic_close);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
        }
    }
}
