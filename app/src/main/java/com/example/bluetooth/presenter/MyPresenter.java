package com.example.bluetooth.presenter;

import com.example.bluetooth.contract.MyContract;
import com.example.bluetooth.presenter.base.BasePresenter;

public class MyPresenter extends BasePresenter<MyContract.MyView> implements MyContract.MyPresenter {
    MyContract.MyModel myModel;
    @Override
    public void getInfo() {

    }
}
