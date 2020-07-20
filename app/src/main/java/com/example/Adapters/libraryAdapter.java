package com.example.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class libraryAdapter extends RecyclerView.Adapter<libraryAdapter.libraryViewHolder> {

    ArrayList<libraryModel> books = new ArrayList<>();
    OnItemClickListener listener;
    RecyclerView mRecyclerView ;
    Context context ;

    public libraryAdapter(ArrayList<libraryModel> books, OnItemClickListener listener, RecyclerView mRecyclerView) {
        this.books = books;
        this.listener = listener;
        this.mRecyclerView = mRecyclerView;
    }

    @NonNull
    @Override
    public libraryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new libraryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.librarydesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull libraryViewHolder holder, int position) {
        holder.pages.setText(books.get(position).getPages());
        holder.description.setText(books.get(position).getDescription());
        holder.auther.setText(books.get(position).getAuther());
        holder.book_image.setImageResource(books.get(position).getImg());
        holder.icon.setImageResource(books.get(position).getIc());


    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class libraryViewHolder extends RecyclerView.ViewHolder {
        ImageButton icon ;
        ImageView book_image;
        TextView description , auther , pages ;
        libraryModel libraryModel;

        public libraryViewHolder(@NonNull View itemView) {

            super(itemView);
            icon=itemView.findViewById(R.id.library_icon);
            book_image=itemView.findViewById(R.id.library_bookimg);
            description=itemView.findViewById(R.id.library_describtion);
            auther=itemView.findViewById(R.id.library_auther);
            pages=itemView.findViewById(R.id.library_pages);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = mRecyclerView.getChildAdapterPosition(view);
                    listener.onItemClick(books.get(pos));

                }
            });
        }
    }
}
