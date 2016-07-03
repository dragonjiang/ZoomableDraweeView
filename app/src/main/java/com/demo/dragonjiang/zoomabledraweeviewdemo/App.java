package com.demo.dragonjiang.zoomabledraweeviewdemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @author DragonJiang
 * @Date 2016/7/3
 * @Time 17:34
 * @description
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(getApplicationContext());
    }
}
