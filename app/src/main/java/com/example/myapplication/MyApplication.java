package com.example.myapplication;

import android.app.Application;

import com.yct.yctridingsdk.YctRidingSDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        YctRidingSDK.getInstance().init(this,true);
    }
}
