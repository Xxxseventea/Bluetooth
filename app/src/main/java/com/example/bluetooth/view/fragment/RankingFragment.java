package com.example.bluetooth.view.fragment;

import android.os.Bundle;

import com.example.bluetooth.R;
import com.example.bluetooth.adapter.ExpandableListAdapter;
import com.example.bluetooth.adapter.RankListRecyclerViewAdapter;
import com.example.bluetooth.bean.RankBean;
import com.example.bluetooth.contract.RankingContract;
import com.example.bluetooth.view.fragment.base.BaseFragment;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RankingFragment extends BaseFragment implements RankingContract.rankingView {

    /**
     * 单例模式
     * @return
     */
    public static RankingFragment getInstance(){
        Bundle args = new Bundle();
        RankingFragment fragment1 = new RankingFragment();
        fragment1.setArguments(args);
        return fragment1;
    }
    @Override
    protected int getLayout() {
        return R.layout.fragment_ranking;
    }

    @Override
    protected void initView() {
        //网络请求获得数据
        RecyclerView recyclerView = getView().findViewById(R.id.recyclerview_list);

        //recyclerview
        ArrayList<RankBean> arrayList = new ArrayList<>();
        RankListRecyclerViewAdapter adapter = new RankListRecyclerViewAdapter(getContext(),arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
