package com.example.bluetooth.adapter;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewpagerAdapter extends FragmentPagerAdapter {


    ArrayList<Fragment> arrayList;

    public ViewpagerAdapter(@NonNull FragmentManager fm,ArrayList<Fragment> arrayList) {
        super(fm);
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
