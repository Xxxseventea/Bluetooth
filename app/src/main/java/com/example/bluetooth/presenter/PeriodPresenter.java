package com.example.bluetooth.presenter;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.contract.PeriodContract;
import com.example.bluetooth.model.PeriodModel;
import com.example.bluetooth.presenter.base.BasePresenter;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class PeriodPresenter extends BasePresenter<PeriodContract.PeridoView> implements PeriodContract.PeriodPresenter{

    PeriodContract.PeriodModel periodModel;


    @Override
    public void getInfo() {
        periodModel = new PeriodModel();
        periodModel.attainInfo(new Observer<DataBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(DataBean dataBean) {

                v.showInfo(dataBean.getDatabase());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
