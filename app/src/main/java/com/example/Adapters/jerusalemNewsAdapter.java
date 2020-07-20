package com.example.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class jerusalemNewsAdapter extends RecyclerView.Adapter<jerusalemNewsAdapter.jerusalemViewHolder> {

    ArrayList<secondFragmentModel> imgs = new ArrayList<>();
    Context context ;
    RecyclerView rv ;
    OnItemClickListeners listener ;

    public jerusalemNewsAdapter(ArrayList<secondFragmentModel> imgs, RecyclerView rv, OnItemClickListeners listener) {
        this.imgs = imgs;
        this.rv = rv;
        this.listener = listener;
    }

    @NonNull
    @Override
    public jerusalemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new jerusalemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.secondfragmentdesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull jerusalemViewHolder holder, int position) {
        holder.img.setImageResource(imgs.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return imgs.size();
    }

    public class jerusalemViewHolder extends RecyclerView.ViewHolder {
        ImageView img ;

        public jerusalemViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos= rv.getChildAdapterPosition(view);
                    listener.onItemClick(imgs.get(pos));
                }
            });
        }
    }
}
