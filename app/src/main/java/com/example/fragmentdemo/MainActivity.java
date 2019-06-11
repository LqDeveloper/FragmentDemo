package com.example.fragmentdemo;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fragmentdemo.fragments.MyFirstFragment;
import com.example.fragmentdemo.fragments.MySecondFragment;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{
    TextView mTextView1;
    TextView mTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView1 = findViewById(R.id.changeTextView);
        mTextView2 = findViewById(R.id.viewPage);
        mTextView1.setOnClickListener(this);
        mTextView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.changeTextView:
                intent = new Intent(MainActivity.this,ChangeFragmentActivity.class);
                startActivity(intent);
                break;
            case  R.id.viewPage:
                intent = new Intent(MainActivity.this,ViewPageActivity.class);
                startActivity(intent);
                break;
        }
    }
}
