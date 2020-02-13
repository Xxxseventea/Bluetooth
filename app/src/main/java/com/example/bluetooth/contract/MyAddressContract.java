package com.example.bluetooth.contract;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.view.interfaces.IBaseView;

import io.reactivex.Observer;

public class MyAddressContract {
    public interface MyAddressView extends IBaseView{
        void showData();
    }

    public interface MyAddressModel{
        void attainInfo(Observer<DataBean> observer);
    }

    public interface MyAddressPresenter{
        void getInfo();
    }
}
