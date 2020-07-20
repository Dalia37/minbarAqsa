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

import com.example.Adapters.OnitemtextListener;
import com.example.Adapters.TextspeachModel;
import com.example.Adapters.textspeachAdapter;
import com.example.minbaraqsa.R;
import com.example.minbaraqsa.TextspeachActivity;
import com.example.minbaraqsa.speachdetailsActivity;

import java.util.ArrayList;


public class textspeachFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    RecyclerView rv ;
    ArrayList<TextspeachModel> texts = new ArrayList<>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public textspeachFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment textspeachFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static textspeachFragment newInstance(String param1, String param2) {
        textspeachFragment fragment = new textspeachFragment();
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
        View view =  inflater.inflate(R.layout.fragment_textspeach, container, false);
        rv = view.findViewById(R.id.text_rv);
        arraydata();
        textspeachAdapter adapter = new textspeachAdapter(texts, rv, new OnitemtextListener() {
            @Override
            public void OnitemClick(TextspeachModel textspeachModel) {
                Intent intent = new Intent(getContext() , speachdetailsActivity.class);
                startActivity(intent);
            }
        },getContext());

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);



        return  view ;
    }

    private void arraydata() {
        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));
        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));
        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));

        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));
        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));

        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));

        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));

        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));

        texts.add(new TextspeachModel(R.drawable.ic_textspeach,R.drawable.ic_textspeach_dawnload,"خالد عبد العزيز","منذ 5 دقائق","ادركوا المسجد الأقصى","الحمد لله الذي في السماء تعالى و تقدس واصطفى من البقاع الحرمين الشريفين والبيت المقدس وأشهد ألا إله إلا الله وحده لا شريك له وأشهد أن محمداً عبده ورسوله شرفه الله تعالى\n" +
                "..الرسالة وعرج به من المسجد الحرام الى المسجد الاقصى"));





    }


}
