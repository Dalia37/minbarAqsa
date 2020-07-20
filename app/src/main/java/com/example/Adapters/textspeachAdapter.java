package com.example.Adapters;

import android.content.Context;
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

public class textspeachAdapter extends RecyclerView.Adapter<textspeachAdapter.textspeachViewHolder> {

    ArrayList<TextspeachModel> texts = new ArrayList<>();
    RecyclerView rv ;
    OnitemtextListener listener ;
    Context context ;

    public textspeachAdapter(ArrayList<TextspeachModel> texts, RecyclerView rv, OnitemtextListener listener, Context context) {
        this.texts = texts;
        this.rv = rv;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public textspeachViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new textspeachViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.textspeachrow, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull textspeachViewHolder holder, int position) {

        holder.textcard.setAnimation(AnimationUtils.loadAnimation(context,R.anim.custum_transition));


        holder.profile.setImageResource(texts.get(position).getImg_textspeach());
        holder.title.setText(texts.get(position).getTitle());
        holder.time.setText(texts.get(position).getTime());
        holder.description.setText(texts.get(position).getDescription());
        holder.dawnolad.setImageResource(texts.get(position).getIc_dawnload());
        holder.name.setText(texts.get(position).getName());

        holder.dawnolad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "dawnloaded ", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return texts.size();
    }

    public class textspeachViewHolder extends RecyclerView.ViewHolder {
        ImageView  profile , dawnolad ;
        TextView name , time , title , description ;
        CardView textcard ;

        public textspeachViewHolder(@NonNull View itemView)
        {
            super(itemView);
            profile=itemView.findViewById(R.id.img_textspeach);
            dawnolad=itemView.findViewById(R.id.ic_dawnload);
            name=itemView.findViewById(R.id.tv_name);
            time=itemView.findViewById(R.id.tv_time);
            title=itemView.findViewById(R.id.tv_title);
            description=itemView.findViewById(R.id.tv_describtion);
            textcard=itemView.findViewById(R.id.textcard);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = rv.getChildAdapterPosition(view);
                    listener.OnitemClick(texts.get(pos));
                }
            });



        }
    }
}
