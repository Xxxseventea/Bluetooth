package com.example.bluetooth.contract;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.view.interfaces.IBaseView;

import io.reactivex.Observer;

public class MyContract {
    public interface MyView extends IBaseView{
        void getData();

        //目前不知道参数
    }
    public interface MyPresenter{
        void getInfo();
    }

    public interface MyModel{
        void attainInfo(Observer<DataBean> observer);

        //不知道参数
    }
}
