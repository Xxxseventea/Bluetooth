package com.example.bluetooth.model;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.contract.MyContract;
import com.example.bluetooth.model.base.BaseModel;

import io.reactivex.Observer;

public class MyModel extends BaseModel implements MyContract.MyModel {

    @Override
    public void attainInfo(Observer<DataBean> observer) {
        BaseModel.getBaseModelInstance().getApi();  //未完待续
    }
}
