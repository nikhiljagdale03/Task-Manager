package com.example.sith3.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sith3.myapplication.launcher.view.LauncherActivity;

public class SplashActivity extends AppCompatActivity {
    private static int FLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LauncherActivity.class);
                startActivity(intent);
                finish();
            }
        },FLASH_TIME_OUT);

    }
}
