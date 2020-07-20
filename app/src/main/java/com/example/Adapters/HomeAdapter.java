package com.example.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewModel> {

    ArrayList<HomeModel> categories = new ArrayList<>();
    OnItemClickListener listener;
    RecyclerView mRecyclrerView;
    Context context;

    public HomeAdapter(ArrayList<HomeModel> categories, OnItemClickListener listener,RecyclerView mrecyclerview) {
        this.categories = categories;
        this.listener = listener;
        this.mRecyclrerView=mrecyclerview;
    }

    @NonNull
    @Override
    public HomeViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        return new HomeViewModel(LayoutInflater.from(parent.getContext()).inflate(R.layout.homedesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewModel holder, final int position) {
        holder.category_name.setText(categories.get(position).getName());
        holder.category_img.setImageResource(categories.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }



    public class HomeViewModel extends RecyclerView.ViewHolder {

        TextView category_name;
        ImageView category_img;
        HomeModel homeModel;

        public HomeViewModel(@NonNull final View itemView) {

            super(itemView);
            category_name=itemView.findViewById(R.id.homdesign_tv);
            category_img=itemView.findViewById(R.id.homedesign_img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                int pos = mRecyclrerView.getChildAdapterPosition(view);

                    listener.onItemClick(categories.get(pos));

                }
            });


        }
    }
}
