package com.example.bluetooth.model;

import com.example.bluetooth.bean.SignInBean;
import com.example.bluetooth.contract.RankingContract;
import com.example.bluetooth.model.base.BaseModel;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RankingModel extends BaseModel implements RankingContract.rankingModel {
    public RankingModel(){
        super();
    }

    @Override
    public void signIn(String user, String password, Observer<SignInBean> observer) {
        BaseModel.getBaseModelInstance().getApi().getSignin(user,password)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
