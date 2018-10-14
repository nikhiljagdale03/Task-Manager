package com.example.sith3.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sith3.myapplication.util.PreferenceHelper;

public abstract class BaseActivity extends AppCompatActivity {

    protected PreferenceHelper  mPreferenceHelper;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        mPreferenceHelper = PreferenceHelper.getInstance(this);
    }

    protected abstract void init();
}
