package com.example.sith3.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.sith3.myapplication.util.PreferenceHelper;

public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    protected PreferenceHelper  mPreferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"In Base Activity");
        mPreferenceHelper = PreferenceHelper.getInstance(this);
    }

    protected abstract void init();
}
