package com.example.fragmentdemo;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fragmentdemo.fragments.MyFirstFragment;
import com.example.fragmentdemo.fragments.MySecondFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPageActivity extends AppCompatActivity {
    ViewPager viewPager;
    List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);
        setTitle("ViewPage");
        viewPager = findViewById(R.id.viewPage);
        fragments = new ArrayList<>();
        MyFirstFragment firstFragment = MyFirstFragment.newInstance("这是第一页");
        MySecondFragment secondFragment = MySecondFragment.newInstance("这是第二页");
        fragments.add(firstFragment);
        fragments.add(secondFragment);
        FragmentPagerAdapter pagerAdapter = new FragmentAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(pagerAdapter);
    }

    static class FragmentAdapter extends FragmentPagerAdapter {
        List<Fragment> fragments;

        public FragmentAdapter(FragmentManager fm,List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }

}
