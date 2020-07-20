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

public class generalNotificationAdapter extends RecyclerView.Adapter<generalNotificationAdapter.generalNotificatioViewHolder> {

    ArrayList<generalNotificationModel> notificatios = new ArrayList<>();
    RecyclerView rv ;
    Context context ;
    OnitemClicedListener listener  ;

    public generalNotificationAdapter(ArrayList<generalNotificationModel> notificatios, RecyclerView rv, OnitemClicedListener listener) {
        this.notificatios = notificatios;
        this.rv = rv;
        this.listener = listener;
    }

    @NonNull
    @Override
    public generalNotificatioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new generalNotificatioViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.generalrow, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull generalNotificatioViewHolder holder, int position) {
        holder.ic_img.setImageResource(notificatios.get(position).getIc_img());
        holder.title.setText(notificatios.get(position).getTitle());
        holder.describtion.setText(notificatios.get(position).getDescribtion());
        holder.time.setText(notificatios.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return notificatios.size();
    }

    public class generalNotificatioViewHolder extends RecyclerView.ViewHolder {
        ImageView ic_img ;
        TextView title , describtion , time ;

        public generalNotificatioViewHolder(@NonNull View itemView) {
            super(itemView);
            ic_img=itemView.findViewById(R.id.ic_img);
            title= itemView.findViewById(R.id.tv_title);
            describtion=itemView.findViewById(R.id.tv_describe);
            time=itemView.findViewById(R.id.tv_time);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = rv.getChildAdapterPosition(view);
                    listener.onItemClick(notificatios.get(pos));
                }
            });

        }
    }
}
