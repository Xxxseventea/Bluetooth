package com.example.bluetooth.contract;

import com.example.bluetooth.bean.SignInBean;
import com.example.bluetooth.view.interfaces.IBaseView;

import io.reactivex.Observer;

public class RankingContract {


    public interface rankingView extends IBaseView {

    }

    public interface rankingPresenter{

    }

    public interface rankingModel{

        void signIn(String user, String password, Observer<SignInBean> observer);
    }
}
