package com.example.fragmentdemo.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentdemo.R;

public class MySecondFragment extends Fragment {
    public static MySecondFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString("name",title);
        MySecondFragment fragment = new MySecondFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_second_fragment_layout,container,false);
        TextView textView = view.findViewById(R.id.textView);
        String title = getArguments().getString("name");
        textView.setText(title);
        return view;
    }
}
