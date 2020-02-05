package com.example.bluetooth.model;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.contract.PeriodContract;
import com.example.bluetooth.model.base.BaseModel;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class PeriodModel extends BaseModel implements PeriodContract.PeriodModel {

    public PeriodModel(){
        super();
    }

    @Override
    public void attainInfo(Observer<DataBean> observer) {

        BaseModel.getBaseModelInstance().getApi().getDynamicFindData()

                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }
}
