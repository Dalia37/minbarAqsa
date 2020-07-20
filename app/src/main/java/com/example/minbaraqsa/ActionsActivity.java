package com.example.minbaraqsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adapters.actionAdapter;
import com.example.Adapters.actionModel;

import java.util.ArrayList;

public class ActionsActivity extends AppCompatActivity {

    RecyclerView rv ;
    ArrayList<actionModel> actions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actions);

        rv=findViewById(R.id.action_rv);

        actions.add(new actionModel("ملتقى منبر الأقصى للخطباء والدعاة الثاني","فعاليات ملتقى منبر الأقصى للخطباء والدعاة الذي تنظمه لجان القدس في الاتحاد العالمي لعلماء المسلمين وهيئة","1/3/2020"));
        actions.add(new actionModel("ملتقى منبر الأقصى للخطباء والدعاة الأول","فعاليات ملتقى منبر الأقصى للخطباء والدعاة الذي تنظمه لجان القدس في الاتحاد العالمي لعلماء المسلمين وهيئة","1/3/2019"));

        actionAdapter adapter = new actionAdapter(actions);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }


}
