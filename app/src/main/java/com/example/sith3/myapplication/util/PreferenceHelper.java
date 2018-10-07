package com.example.sith3.myapplication.util;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class PreferenceHelper {

    boolean Boolean;
    public static PreferenceHelper instance;
    SharedPreferences preferences;
    private PreferenceHelper(Context context){
        preferences = context.getSharedPreferences("TaskManager_Preference",MODE_PRIVATE);
    }
    public static PreferenceHelper getInstance(Context context){
        if(instance == null){
            instance = new PreferenceHelper(context);
        }
        return instance;
    }

    public void putBoolean(String key,boolean DefaultValue){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, DefaultValue);
        editor.apply();
    }
    public boolean getBoolean(String key,boolean DefaultValue){
        return preferences.getBoolean(key, DefaultValue);
    }
}
