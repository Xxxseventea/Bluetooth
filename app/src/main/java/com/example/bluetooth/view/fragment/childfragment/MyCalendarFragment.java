package com.example.bluetooth.view.fragment.childfragment;

import android.widget.CalendarView;

import com.example.bluetooth.R;
import com.example.bluetooth.view.fragment.base.BaseFragment;

public class MyCalendarFragment extends BaseFragment {
    CalendarView calendarView;
    @Override
    protected int getLayout() {
        return R.layout.fragmen_mychild_calendar;
    }

    @Override
    protected void initView() {
        calendarView = getView().findViewById(R.id.calendar)
    }
}
