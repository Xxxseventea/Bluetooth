package com.example.bluetooth.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.bluetooth.R;
import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.contract.PeriodContract;
import com.example.bluetooth.presenter.PeriodPresenter;
import com.example.bluetooth.view.fragment.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class PeriodFragment extends BaseFragment implements PeriodContract.PeridoView {
    TextView time_yyyy;
    TextView time_mm;
    ExpandableListView expandableListView;

    private PeriodPresenter periodPresenter;

    public static PeriodFragment newInstance(){
        Bundle args = new Bundle();
        PeriodFragment fragment = new PeriodFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int getLayout() {
        return R.layout.fragment_period;
    }

    @Override
    protected void initView() {

        time_yyyy = getView().findViewById(R.id.time_yyyy);
        time_mm = getView().findViewById(R.id.time_mm);
        expandableListView = getView().findViewById(R.id.expanded_today);
        ArrayList<String> groupList = new ArrayList<>();
        groupList.add("今日考勤");
        groupList.add("历史考勤");
    }

    @Override
    public void showInfo(List<DataBean.DatabaseBean> list) {

    }
}
