package com.example.bluetooth.view.fragment;

import android.os.Bundle;

import com.example.bluetooth.R;
import com.example.bluetooth.view.fragment.base.BaseFragment;

public class CalendarFragment extends BaseFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_calendar;
    }

    @Override
    protected void initView() {

    }
    public static CalendarFragment newInstance(){
        Bundle args = new Bundle();
        CalendarFragment calendarFragment = new CalendarFragment();
        calendarFragment.setArguments(args);
        return calendarFragment;
    }
}
