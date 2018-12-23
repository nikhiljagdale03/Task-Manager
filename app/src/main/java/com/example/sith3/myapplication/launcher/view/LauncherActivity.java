package com.example.sith3.myapplication.launcher.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.example.sith3.myapplication.BaseActivity;
import com.example.sith3.myapplication.R;
import com.example.sith3.myapplication.landing.view.LandingActivity;
import com.example.sith3.myapplication.util.PreferenceHelper;

public class LauncherActivity extends BaseActivity {

    public static boolean isLogin;
    Intent intent;
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    private static final String TAG = "LauncherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        intent = new Intent(LauncherActivity.this,LauncherActivity.class);
        Log.d(TAG,"In Launcher Activity");
        isLogin = mPreferenceHelper.getBoolean(PreferenceHelper.IS_lOGIN,false);
        if (isLogin) {

            // navigate to Home Screen
            intent = new Intent(LauncherActivity.this,LauncherActivity.class);
            startActivity(intent);

        } else {
            //Navigate to Next (Landing Activity) screen

            intent = new Intent(LauncherActivity.this,LandingActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void init() {

    }
}
