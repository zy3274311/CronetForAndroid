package com.google.samples.cronet_sample;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by zhangying62 on 2020/9/28.
 */
public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
