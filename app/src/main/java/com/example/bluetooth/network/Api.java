package com.example.bluetooth.network;

import com.example.bluetooth.bean.DataBean;
import com.example.bluetooth.bean.SignInBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {
    //打卡主页
   @GET("/BASystem_A-1.0-SNAPSHOT/getData")
   Observable<DataBean> getDynamicFindData();

   //登录
    @POST("现在还不知道啊= =")
    @FormUrlEncoded
    Observable<SignInBean> getSignin(@Field(" ") String name,@Field(" ") String password);

    //目前不知道后端的数据，我假装这个bean类是对的
}
