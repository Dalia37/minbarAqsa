package com.example.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Adapters.OnItemClickListener;
import com.example.Adapters.fragmentModel;
import com.example.Adapters.fragmentOnItemClickListener;
import com.example.Adapters.minberNewsFragmentAdapter;
import com.example.minbaraqsa.R;
import com.example.minbaraqsa.detailsActivity;

import java.util.ArrayList;


public class newsMinberFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<fragmentModel> images = new ArrayList<>();

    RecyclerView rv ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment newsMinberFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static newsMinberFragment newInstance(String param1, String param2) {
        newsMinberFragment fragment = new newsMinberFragment();
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

    private void ArrayData() {
        images.add(new fragmentModel(R.drawable.img_firstminbarnews));
        images.add(new fragmentModel(R.drawable.img_secondminbernews));
        images.add(new fragmentModel(R.drawable.img_thirdminbernews));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_minber, container, false);
        rv = view.findViewById(R.id.rv);
        ArrayData();

        minberNewsFragmentAdapter adapter = new minberNewsFragmentAdapter(images, rv, new fragmentOnItemClickListener() {
            @Override
            public void onItemClick(fragmentModel fragmentModel) {
                startActivity(new Intent(getContext(), detailsActivity.class));
            }
        });
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        return view;


    }
}




