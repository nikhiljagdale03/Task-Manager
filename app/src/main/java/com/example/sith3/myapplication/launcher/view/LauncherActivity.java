package com.example.sith3.myapplication.launcher.view;

import android.os.Bundle;

import com.example.sith3.myapplication.BaseActivity;
import com.example.sith3.myapplication.R;
import com.example.sith3.myapplication.util.PreferenceHelper;

public class LauncherActivity extends BaseActivity {

    public static boolean isLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
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
