package com.example.bluetooth.model.base;

import com.example.bluetooth.network.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.bluetooth.common.Constant.BaseUrl;

public class BaseModel {
    /**
     * 单例模式
     */
    private static final BaseModel BASE_MODEL_INSTANCE = new BaseModel();
    OkHttpClient okHttpClient;
    Api api;

  public BaseModel(){
        initOkHttpClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(Api.class);
    }

    public static BaseModel getBaseModelInstance(){
        return BASE_MODEL_INSTANCE;
    }

    public Api getApi() {
        return api;
    }

    public void initOkHttpClient(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if(okHttpClient == null){
            okHttpClient = new OkHttpClient.Builder()
                    .retryOnConnectionFailure(true)//默认重试一次,若需要重试N次,则要实现拦截器。
                    .addNetworkInterceptor(interceptor)  //添加网络拦截器
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .build();
        }
    }
}
