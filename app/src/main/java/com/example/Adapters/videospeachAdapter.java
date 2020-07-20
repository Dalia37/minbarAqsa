package com.example.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class videospeachAdapter extends RecyclerView.Adapter<videospeachAdapter.videospeachViewHolder> {

    ArrayList<videospeachModel> videos = new ArrayList<>();
    Context context ;
    OnitemviedListener listener ;
    RecyclerView rv ;

    public videospeachAdapter(ArrayList<videospeachModel> videos, Context context, OnitemviedListener listener, RecyclerView rv) {
        this.videos = videos;
        this.context = context;
        this.listener = listener;
        this.rv = rv;
    }

    @NonNull
    @Override
    public videospeachViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new videospeachViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.videospeachrow, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull videospeachViewHolder holder, int position) {

//        holder.videocardview.setAnimation(AnimationUtils.loadAnimation(context,R.anim.custum_transition));
        holder.tv_title.setText(videos.get(position).getTv_title());
        holder.tv_time.setText(videos.get(position).getTv_time());
        holder.tv_name.setText(videos.get(position).getTv_name());
        holder.img_profile.setImageResource(videos.get(position).getImg_textspeach());
        holder.ic_video.setImageResource(videos.get(position).getIc_video());
        holder.ic_share.setImageResource(videos.get(position).getIc_share());
        holder.ic_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String shareBody = "   MinberAqsa \n https://play.google.com/store/apps/details?id=com.app.minbar_alaqsaa";
                String sharesub = "your subject here";
                sendIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                context.startActivity(shareIntent);            }
        });

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class videospeachViewHolder extends RecyclerView.ViewHolder {

        ImageView img_profile , ic_share , ic_video  ;
        TextView tv_name , tv_time , tv_title ;
        CardView videocardview;

        public videospeachViewHolder(@NonNull View itemView) {
            super(itemView);
            img_profile=itemView.findViewById(R.id.img_textspeach);
            ic_share=itemView.findViewById(R.id.ic_share);
            ic_video=itemView.findViewById(R.id.ic_video);
            tv_name=itemView.findViewById(R.id.tv_name);
            tv_time=itemView.findViewById(R.id.tv_time);
            tv_title=itemView.findViewById(R.id.tv_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = rv.getChildAdapterPosition(view);
                    listener.OnitemClick(videos.get(pos));
                }
            });
        }
    }
}
