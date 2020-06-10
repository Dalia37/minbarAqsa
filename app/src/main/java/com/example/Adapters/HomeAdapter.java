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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewModel> {

    ArrayList<HomeModel> categories = new ArrayList<>();

    public HomeAdapter(ArrayList<HomeModel> categories) {
        this.categories = categories;
    }



    @NonNull
    @Override
    public HomeViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewModel(LayoutInflater.from(parent.getContext()).inflate(R.layout.homedesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewModel holder, int position) {
        holder.category_name.setText(categories.get(position).getName());
        holder.category_img.setImageResource(categories.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public void setList(ArrayList<HomeModel> homeList){
        this.categories=homeList;
        notifyDataSetChanged();

    }



    public class HomeViewModel extends RecyclerView.ViewHolder {

        TextView category_name;
        ImageView category_img;

        public HomeViewModel(@NonNull View itemView) {

            super(itemView);
            category_name=itemView.findViewById(R.id.homdesign_tv);
            category_img=itemView.findViewById(R.id.homedesign_img);

        }
    }
}
