package com.beautiful.beautiful;

import android.app.Application;

import org.xutils.x;

/**
 * Created by luojurong on 2017/3/2.
 */

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        //
    }
}
