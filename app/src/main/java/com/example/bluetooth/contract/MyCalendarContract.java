package com.example.bluetooth.contract;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.view.interfaces.IBaseView;

import io.reactivex.Observer;

public class MyCalendarContract {
    public interface MyCalendarView extends IBaseView{

    }
    public interface MyCalendarPresenter{

    }
    public interface MyCalendarModel{
        void attainInfo(Observer<DataBean> observer);
    }
}
