package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adapters.mytaskAdapter;
import com.example.Adapters.mytaskModel;

import java.util.ArrayList;

public class MyTask extends AppCompatActivity {

    RecyclerView rv ;

    ArrayList<mytaskModel> tasks = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_task);
        rv=findViewById(R.id.mytask_rv);
        tasks.add(new mytaskModel("05/01/2020","مهمة إدارية","هناك حقيقة مثبتة منذ زمن طويل وهي أن المحتوى المقروء لصفحة ما سيلهي القارئ عن التركيز على الشكل الخارجي للنص أو شكل توضع الفقرات","تم التنفيذ"));



    }

    public void execute_recyclerview(){
        mytaskAdapter adapter = new mytaskAdapter(tasks);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }


}
