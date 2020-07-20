package com.example.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class minberNewsFragmentAdapter extends RecyclerView.Adapter<minberNewsFragmentAdapter.minberNewsViewHolder> {

    ArrayList<fragmentModel> images = new ArrayList<>();
    RecyclerView rv ;
    Context context ;
    fragmentOnItemClickListener listener ;

    public minberNewsFragmentAdapter(ArrayList<fragmentModel> images, RecyclerView rv, fragmentOnItemClickListener listener) {
        this.images = images;
        this.rv = rv;
        this.listener = listener;
    }

    @NonNull
    @Override
    public minberNewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new minberNewsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.firstfragmentdesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull minberNewsViewHolder holder, int position) {
        holder.image.setImageResource(images.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class minberNewsViewHolder extends RecyclerView.ViewHolder {

        ImageView image ;
        fragmentModel fragmentModel;

        public minberNewsViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.img_firstfragment);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = rv.getChildAdapterPosition(view);
                    listener.onItemClick(images.get(pos));

                }
            });
        }
    }
}
