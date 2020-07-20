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

public class donationsAdapter extends RecyclerView.Adapter<donationsAdapter.donationsViewHolder> {

    ArrayList<donationsModel> donations = new ArrayList<>();
    Onitemdonationlistener listener ;
    RecyclerView rv ;
    Context context ;

    public donationsAdapter(ArrayList<donationsModel> donations, Onitemdonationlistener listener, RecyclerView rv) {
        this.donations = donations;
        this.listener = listener;
        this.rv = rv;
    }

    @NonNull
    @Override
    public donationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new donationsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.donationsdesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull donationsViewHolder holder, int position) {
        holder.donations_img.setImageResource(donations.get(position).getDonations_img());
        holder.donations_tv.setText(donations.get(position).getDonations_tv());

    }

    @Override
    public int getItemCount() {
        return donations.size();
    }

    public class donationsViewHolder extends RecyclerView.ViewHolder {
        ImageView donations_img ;
        TextView donations_tv ;

        public donationsViewHolder(@NonNull View itemView) {
            super(itemView);
            donations_img=itemView.findViewById(R.id.img_donation);
            donations_tv=itemView.findViewById(R.id.tv_donation);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=rv.getChildAdapterPosition(view);
                    listener.Onclick(donations.get(pos));
                }
            });
        }
    }
}
