package com.gjf.common.base;

import android.app.Application;

import com.gjf.common.core.AppCore;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCore.getInstance().init(this);
    }
}
