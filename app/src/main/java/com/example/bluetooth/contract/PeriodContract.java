package com.example.bluetooth.contract;

import android.database.Observable;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.view.interfaces.IBaseView;

import java.util.List;

import io.reactivex.Observer;

public class PeriodContract {

  public interface PeridoView extends IBaseView{
        void showInfo(List<DataBean.DatabaseBean> list);
    }

    public interface PeriodPresenter{
        void getInfo();
    }

    public interface PeriodModel{

        void attainInfo(Observer<DataBean> observer);
    }
}
