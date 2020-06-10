package com.example.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class actionAdapter extends RecyclerView.Adapter<actionAdapter.actionViewHolder> {

    ArrayList<actionModel> actions = new ArrayList<>();

    public actionAdapter(ArrayList<actionModel> actions) {
        this.actions = actions;
    }

    @NonNull
    @Override
    public actionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new actionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.actiondesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull actionViewHolder holder, int position) {
        holder.action_name.setText(actions.get(position).getAction_name());
        holder.action_description.setText(actions.get(position).getAction_description());
        holder.action_date.setText(actions.get(position).getAction_date());

    }

    @Override
    public int getItemCount() {
        return actions.size();
    }

    public class actionViewHolder extends RecyclerView.ViewHolder {

        TextView action_name , action_description , action_date;

        public actionViewHolder(@NonNull View itemView) {
            super(itemView);
            action_name=itemView.findViewById(R.id.action_name);
            action_description=itemView.findViewById(R.id.action_description);
            action_date=itemView.findViewById(R.id.action_date);
        }
    }
}
