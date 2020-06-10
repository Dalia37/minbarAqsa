package com.example.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class mytaskAdapter extends RecyclerView.Adapter<mytaskAdapter.mytaskHolder> {

    ArrayList<mytaskModel> tasks = new ArrayList<>();

    public mytaskAdapter(ArrayList<mytaskModel> tasks) {
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public mytaskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new mytaskHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mytaskdesign, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull mytaskHolder holder, int position) {

        holder.mytask_date.setText(tasks.get(position).getTaskdate());
        holder.mytask_type.setText(tasks.get(position).getTasktype());
        holder.mytask_description.setText(tasks.get(position).getTaskdescription());
        holder.mytask_exec.setText(tasks.get(position).getExcute());



    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public class mytaskHolder extends RecyclerView.ViewHolder {

        TextView mytask_date , mytask_type , mytask_description ;
        Button mytask_exec ;


        public mytaskHolder(@NonNull View itemView) {
            super(itemView);
            mytask_date = itemView.findViewById(R.id.mytask_date);
            mytask_type = itemView.findViewById(R.id.mytask_type);
            mytask_description = itemView.findViewById(R.id.mytask_decription);
            mytask_exec = itemView.findViewById(R.id.mytask_excecute);





        }
    }
}
