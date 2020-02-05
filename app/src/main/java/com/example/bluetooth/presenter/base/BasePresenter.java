package com.example.bluetooth.presenter.base;

import com.example.bluetooth.view.interfaces.IBaseView;

public abstract class BasePresenter <V extends IBaseView>{
    protected V v;

    public void detachAcitivity(){
        v = null;
    }

    public void attachActivity(V view){
        v = view;
    }

    public boolean isAttachActivity(){
        return(v != null);
    }

    public V getV() {
        return v;
    }
}
