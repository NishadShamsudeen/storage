package com.example.user.database;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user on 01-10-2017.
 */

public class AppStorage {
    public static final String PREFERENCE_NAME = "SharedPreferenceAnroid";
    public static SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public static void insertStringData(Context context, String key, String value) {
        getSharedPreferences(context).edit().putString(key,value).apply();
    }

    public static void insertBoolenData(Context context, String key, boolean value) {
        getSharedPreferences(context).edit().putBoolean(key,value).apply();
    }

    public static boolean getBooleanData(Context context, String key) {
        return getSharedPreferences(context).getBoolean(key,false);
    }
}
