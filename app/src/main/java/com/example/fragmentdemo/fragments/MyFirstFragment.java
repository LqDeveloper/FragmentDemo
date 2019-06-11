package com.example.fragmentdemo.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentdemo.R;

public class MyFirstFragment extends Fragment {


    public static MyFirstFragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString("name", title);
        MyFirstFragment fragment = new MyFirstFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("MyFirstFragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyFirstFragment","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("MyFirstFragment","onCreateView");
        View view = inflater.inflate(R.layout.my_first_fragment_layout, container, false);
        TextView textView = view.findViewById(R.id.textView);
//        通过Xml实例化getArguments() 无法获取到参数
        String title = getArguments().getString("name","");
        if (title != null) {
            textView.setText(title);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("MyFirstFragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("MyFirstFragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("MyFirstFragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("MyFirstFragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("MyFirstFragment","onPause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("MyFirstFragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyFirstFragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("MyFirstFragment","onDetach");
    }
}
