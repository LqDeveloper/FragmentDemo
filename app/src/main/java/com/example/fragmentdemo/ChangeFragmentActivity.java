package com.example.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fragmentdemo.fragments.MyFirstFragment;
import com.example.fragmentdemo.fragments.MySecondFragment;

public class ChangeFragmentActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_fragment);
        mTextView = findViewById(R.id.changeTextView);
        mTextView.setOnClickListener(this);
        setTitle("切换Fragment");
        MyFirstFragment firstFragment  =  MyFirstFragment.newInstance("这是第一个Fragment");
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout,firstFragment).commit();
    }

    @Override
    public void onClick(View v) {
        MySecondFragment secondFragment  =  MySecondFragment.newInstance("这是第二个Fragment");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,secondFragment);
        fragmentTransaction.addToBackStack("MySecondFragment");
        fragmentTransaction.commit();
    }
}
