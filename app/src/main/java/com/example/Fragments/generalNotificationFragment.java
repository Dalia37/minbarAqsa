package com.example.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.Adapters.OnitemClicedListener;
import com.example.Adapters.generalNotificationAdapter;
import com.example.Adapters.generalNotificationModel;
import com.example.minbaraqsa.R;
import com.example.minbaraqsa.detailsActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link generalNotificationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class generalNotificationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    RecyclerView rv ;
    ArrayList<generalNotificationModel> notifications = new ArrayList<>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public generalNotificationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment generalNotificationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static generalNotificationFragment newInstance(String param1, String param2) {
        generalNotificationFragment fragment = new generalNotificationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_general_notification, container, false);
        rv=view.findViewById(R.id.general_rv);
        arrayData();
        generalNotificationAdapter adapter =new generalNotificationAdapter(notifications, rv, new OnitemClicedListener() {
            @Override
            public void onItemClick(generalNotificationModel generalNotificationModel) {

                Intent intent = new Intent(getContext() , detailsActivity.class);
                startActivity(intent);

            }
        });
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);



        return view;
    }

    private void arrayData() {
        notifications.add(new generalNotificationModel(R.drawable.ic_notificationicons,"تنبيه","سيتم إيقاف التطبيق الساعة غدا \n  لأعمال الصيانة","منذ 3 د"));
        notifications.add(new generalNotificationModel(R.drawable.ic_addtask,"مهمة جديدة","خطبة الجمعة بمسجد سليمان القانوني","منذ 22 د"));
        notifications.add(new generalNotificationModel(R.drawable.ic_remeber,"! تذكير","خطبة الجمعة بمسجد سليمان القانوني","منذ 22 د"));


    }


}
