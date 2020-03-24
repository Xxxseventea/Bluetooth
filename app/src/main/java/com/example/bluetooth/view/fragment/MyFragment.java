package com.example.bluetooth.view.fragment;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
    RelativeLayout chuqinglv;
    RelativeLayout chidao;
    RelativeLayout qingjia;

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
        snumber = getView().findViewById(R.id.my_snumber);
        edit = getView().findViewById(R.id.edit);
        tabLayout = getView().findViewById(R.id.my_tablayout);
        viewPager = getView().findViewById(R.id.my_viewpager);
        chuqinglv = getView().findViewById(R.id.chuqinglv);
        chidao = getView().findViewById(R.id.chidao);
        qingjia = getView().findViewById(R.id.qingjia);

        //设置数据
        TextView text1 = chuqinglv.findViewById(R.id.text);
        text1.setText("本月出勤率");
        TextView data1 = chuqinglv.findViewById(R.id.data);
        data1.setText("");  //后端数据设置

        TextView text2 = chidao.findViewById(R.id.text);
        text2.setText("迟到次数");
        TextView data2 = chidao.findViewById(R.id.data);
        data2.setText("");  //后端数据设置

        TextView text3 = qingjia.findViewById(R.id.text);
        text3.setText("请假次数");
        TextView data3 = qingjia.findViewById(R.id.data);
        data3.setText("");  //后端数据设置

        //添加fragment
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
