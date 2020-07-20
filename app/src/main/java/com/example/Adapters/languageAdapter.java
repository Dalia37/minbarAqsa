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

public class languageAdapter extends RecyclerView.Adapter<languageAdapter.languageViewHolder> {

    ArrayList<languageModel> languages  = new ArrayList<>();
    OnItemClickListener listener ;
    RecyclerView mRecyclerView ;
    Context context ;

    public languageAdapter(ArrayList<languageModel> languages, OnItemClickListener listener, RecyclerView mRecyclerView) {
        this.languages = languages;
        this.listener = listener;
        this.mRecyclerView = mRecyclerView;
    }

    @NonNull
    @Override
    public languageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new languageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.languagedesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull languageViewHolder holder, int position) {
        holder.flag.setImageResource(languages.get(position).getIc_flag());
        holder.language.setText(languages.get(position).getLanguage());

    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    public class languageViewHolder extends RecyclerView.ViewHolder {

        TextView language ;
        ImageView flag ;
        languageModel languageModel;

        public languageViewHolder(@NonNull final View itemView)
        {
            super(itemView);
            language=itemView.findViewById(R.id.language);
            flag=itemView.findViewById(R.id.ic_flag);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = mRecyclerView.getChildAdapterPosition(view);
                    listener.onItemClick(languages.get(pos));
                }
            });
        }
    }
}
