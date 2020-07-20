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

import com.example.Adapters.OnitemviedListener;
import com.example.Adapters.videospeachAdapter;
import com.example.Adapters.videospeachModel;
import com.example.minbaraqsa.R;
import com.example.minbaraqsa.speachdetailsActivity;

import java.util.ArrayList;


public class videospeachFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ArrayList<videospeachModel> videos = new ArrayList<>();
    RecyclerView rv  ;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public videospeachFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment videospeachFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static videospeachFragment newInstance(String param1, String param2) {
        videospeachFragment fragment = new videospeachFragment();
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
        View view =  inflater.inflate(R.layout.fragment_videospeach, container, false);
        rv=view.findViewById(R.id.videospeach_rv);
        ArrayData();
        videospeachAdapter adapter = new videospeachAdapter(videos, getContext()  ,new OnitemviedListener() {
            @Override
            public void OnitemClick(videospeachModel videospeachModel) {
                Intent intent = new Intent(getContext() , speachdetailsActivity.class);
                startActivity(intent);

            }
        }, rv);

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);


        return view ;
    }

    private void ArrayData() {
        videos.add(new videospeachModel(R.drawable.ic_textspeach,R.drawable.ic_share,R.drawable.img_videospeach,R.drawable.ic_video,"خالد عبد العزيز ","منذ 5 دقائق ","أدركوا المسجد الأقصى"));
        videos.add(new videospeachModel(R.drawable.ic_textspeach,R.drawable.ic_share,R.drawable.img_videospeach,R.drawable.ic_video,"خالد عبد العزيز ","منذ 5 دقائق ","أدركوا المسجد الأقصى"));
        videos.add(new videospeachModel(R.drawable.ic_textspeach,R.drawable.ic_share,R.drawable.img_videospeach,R.drawable.ic_video,"خالد عبد العزيز ","منذ 5 دقائق ","أدركوا المسجد الأقصى"));
        videos.add(new videospeachModel(R.drawable.ic_textspeach,R.drawable.ic_share,R.drawable.img_videospeach,R.drawable.ic_video,"خالد عبد العزيز ","منذ 5 دقائق ","أدركوا المسجد الأقصى"));

    }


}
