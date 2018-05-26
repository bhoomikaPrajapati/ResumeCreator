package com.resumecreator.baseclass;

import android.app.Application;

import com.resumecreator.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class BaseApplication extends Application {



    private static BaseApplication baseApplication = null;


    public static BaseApplication getBaseApplication() {
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        setFont();

    }

    private void setFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/sansation_regular.ttf").setFontAttrId(R.attr.fontPath).build());

    }


}