package com.example.mechrevo.xutilstest;

import android.app.Application;
import org.xutils.x;

/**
 * Created by mechrevo on 2016/5/1.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化
        x.Ext.init(this);
        // 设置是否输出debug
        x.Ext.setDebug(true);
    }

}