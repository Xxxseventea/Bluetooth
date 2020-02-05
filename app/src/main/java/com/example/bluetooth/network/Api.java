package com.example.bluetooth.network;

import com.example.bluetooth.bean.DataBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {
    //打卡主页
   @GET("/BASystem_A-1.0-SNAPSHOT/getData")
   Observable<DataBean> getDynamicFindData();


}
