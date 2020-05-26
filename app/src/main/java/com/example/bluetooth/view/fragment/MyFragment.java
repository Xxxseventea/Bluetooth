package com.example.bluetooth.view.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.bluetooth.R;
import com.example.bluetooth.adapter.ViewpagerAdapter;
import com.example.bluetooth.contract.MyContract;
import com.example.bluetooth.view.activity.SettingActivity;
import com.example.bluetooth.view.activity.SignInActivity;
import com.example.bluetooth.view.activity.UserInfo;
import com.example.bluetooth.view.activity.UserInfoRecord;
import com.example.bluetooth.view.fragment.base.BaseFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Field;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import cn.finalteam.toolsfinal.ActivityManager;

public class MyFragment extends BaseFragment implements MyContract.MyView, View.OnClickListener{

    ImageView head;
    TextView name;
    RelativeLayout xinxi;
    RelativeLayout kaoqin;
    RelativeLayout setting;
    TextView exit;

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
        //初始化硬件
        head = getView().findViewById(R.id.my_head);
        name = getView().findViewById(R.id.my_name);
        xinxi = getView().findViewById(R.id.my_xinxi);
        kaoqin = getView().findViewById(R.id.my_kaoqin);
        setting = getView().findViewById(R.id.my_setting);
        exit = getView().findViewById(R.id.exit);
        xinxi.setOnClickListener(this);
        kaoqin.setOnClickListener(this);
        setting.setOnClickListener(this);
        exit.setOnClickListener(this);

    }

    //网络请求的数据
    @Override
    public void getData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.my_xinxi:{
                Intent intent = new Intent(getActivity(), UserInfo.class);
                startActivity(intent);
                break;
            }

            case R.id.my_kaoqin:{
                Intent intent = new Intent(getActivity(), UserInfoRecord.class);
                startActivity(intent);
                break;
            }

            case R.id.my_setting:{
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.exit:{
                Intent intent = new Intent(getActivity(), SignInActivity.class);
                intent.putExtra("isExit1", true);
                startActivity(intent);
            }
        }
    }
}
