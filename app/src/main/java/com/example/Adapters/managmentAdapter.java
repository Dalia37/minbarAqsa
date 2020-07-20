package com.example.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minbaraqsa.R;

import java.util.ArrayList;

public class managmentAdapter extends RecyclerView.Adapter<managmentAdapter.managmentViewHolder> {

    ArrayList<ManagmentModel> tasks = new ArrayList<>();
    RecyclerView rv ;
    onItemManageListener listener ;
    Context context ;

    public managmentAdapter(ArrayList<ManagmentModel> tasks, RecyclerView rv, onItemManageListener listener, Context context) {
        this.tasks = tasks;
        this.rv = rv;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public managmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new managmentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.managmentrow, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull managmentViewHolder holder, int position) {
        holder.managment_img.setImageResource(tasks.get(position).getManagment_img());
        holder.name.setText(tasks.get(position).getManagment_name());
        holder.task.setText(tasks.get(position).getManagment_task());
        holder.desc.setText(tasks.get(position).getManagment_desc());
        holder.date.setText(tasks.get(position).getManagment_date());
        holder.datevalue.setText(tasks.get(position).getGetManagment_datevalu());
        holder.time.setText(tasks.get(position).getGetManagment_time());
        holder.managment_btn.setText(tasks.get(position).getManagment_btn());
        holder.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "you are done", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public class managmentViewHolder extends RecyclerView.ViewHolder {
        ImageView managment_img  , menu  ;
        TextView name , task , desc , date , datevalue , time ;
        Button managment_btn ;

        public managmentViewHolder(@NonNull View itemView) {

            super(itemView);
            managment_img=itemView.findViewById(R.id.managment_img);
            name=itemView.findViewById(R.id.managment_name);
            task=itemView.findViewById(R.id.managment_task);
            desc=itemView.findViewById(R.id.managment_desc);
            date=itemView.findViewById(R.id.managment_date);
            datevalue=itemView.findViewById(R.id.managment_datevalue);
            time=itemView.findViewById(R.id.managment_time);
            managment_btn=itemView.findViewById(R.id.managment_btn);
            menu=itemView.findViewById(R.id.managment_menu);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = rv.getChildAdapterPosition(view);
                    listener.OnItemClick(tasks.get(pos));
                }
            });
        }
    }
}
