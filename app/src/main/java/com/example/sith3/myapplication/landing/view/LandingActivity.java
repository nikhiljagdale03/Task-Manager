package com.example.sith3.myapplication.landing.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sith3.myapplication.BaseActivity;
import com.example.sith3.myapplication.LoginActivity;
import com.example.sith3.myapplication.R;
import com.example.sith3.myapplication.util.PreferenceHelper;

import butterknife.BindView;

public class LandingActivity extends BaseActivity {

    Button signIn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        signIn = findViewById(R.id.login_button_landing);
        intent = new Intent(LandingActivity.this,LoginActivity.class);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }


    @Override
    protected void init() {

    }
}
