package com.example.bluetooth.view.fragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bluetooth.R;
import com.example.bluetooth.adapter.ViewpagerAdapter;
import com.example.bluetooth.contract.MyContract;
import com.example.bluetooth.view.fragment.base.BaseFragment;
import com.example.bluetooth.view.fragment.childfragment.MyCalendarFragment;
import com.example.bluetooth.view.fragment.childfragment.MyAddressFragment;
import com.example.bluetooth.view.fragment.childfragment.MySettingFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class MyFragment extends BaseFragment implements MyContract.MyView {

    ImageView head;
    TextView name;
    TextView snumber;
    Button edit;
    TabLayout tabLayout;
    ViewPager viewPager;

    /**
     * 单例模式
     * @return
     */
    public static MyFragment getInstance(){
        Bundle args = new Bundle();
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int getLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView() {
        head = getView().findViewById(R.id.my_head);
        name = getView().findViewById(R.id.my_name);
        snumber = getView().findViewById(R.id.my_snumber);
        edit = getView().findViewById(R.id.edit);
        tabLayout = getView().findViewById(R.id.my_tablayout);
        viewPager = getView().findViewById(R.id.my_viewpager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new MyCalendarFragment());
        fragments.add(new MyAddressFragment());
        fragments.add(new MySettingFragment());

        ViewpagerAdapter adapter = new ViewpagerAdapter(getChildFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    //网络请求的数据
    @Override
    public void getData() {

    }
}
