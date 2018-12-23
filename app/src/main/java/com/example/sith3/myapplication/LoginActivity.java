package com.example.sith3.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView textView1,textView2;
    Button btn1;
    //private DatabaseRefrence mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserModel userModel;
                String val1,val2;
                val1 = textView1.getText().toString();
                val2 = textView2.getText().toString();
                userModel = new UserModel(val1,val2);
            }
        });
    }
}
