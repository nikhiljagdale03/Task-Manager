package com.example.sith3.myapplication;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;


public class TaskManagerApplication extends Application {
    private static final String TAG="TaskManagerApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"In Oncreate method");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG,"In Terminate method");
    }
}
