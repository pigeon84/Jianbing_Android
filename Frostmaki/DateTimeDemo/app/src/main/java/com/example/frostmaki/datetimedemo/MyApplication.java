package com.example.frostmaki.datetimedemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Frostmaki on 2016/6/18.
 */
public class MyApplication extends Application{
    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
