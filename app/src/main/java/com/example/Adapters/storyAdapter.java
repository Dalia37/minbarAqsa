package com.example.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class storyAdapter extends RecyclerView.Adapter<storyAdapter.storyViewHolder> {

    ArrayList<storyModel> stories = new ArrayList<>();

    public storyAdapter(ArrayList<storyModel> stories) {
        this.stories =stories ;
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
        ImageView img_story;

        public storyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            img_story=itemView.findViewById(R.id.story_img);
        }
    }
}
