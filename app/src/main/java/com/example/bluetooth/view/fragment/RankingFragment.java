package com.example.bluetooth.view.fragment;

import android.os.Bundle;

import com.example.bluetooth.R;
import com.example.bluetooth.contract.RankingContract;
import com.example.bluetooth.view.fragment.base.BaseFragment;

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


    }
}
