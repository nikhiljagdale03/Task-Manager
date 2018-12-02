package com.example.sith3.myapplication.launcher.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.sith3.myapplication.BaseActivity;
import com.example.sith3.myapplication.R;
import com.example.sith3.myapplication.util.PreferenceHelper;

public class LauncherActivity extends BaseActivity {

    public static boolean isLogin;
    private static final String TAG = "LauncherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Log.d(TAG,"In Launcher Activity");
        isLogin = mPreferenceHelper.getBoolean(PreferenceHelper.IS_lOGIN,false);
        if (isLogin) {
            // navigate to Home Screen
        } else {
            //Navigate to Next (Landing Activity) screen
        }
    }

    @Override
    protected void init() {

    }
}
