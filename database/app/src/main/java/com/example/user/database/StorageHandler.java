package com.example.user.database;

import android.content.Context;

/**
 * Created by user on 01-10-2017.
 */

public class StorageHandler {


    private static final String USER_NAME = "user_name";
    private static final String USER_PASSWORD = "password";
    private static final String IS_CHECKED = "is_checked";

    public static void insertUserName(Context context, String value) {

        AppStorage.insertStringData(context, USER_NAME, value);

    }

    public static void insertPassword(Context context, String value) {
        AppStorage.insertStringData(context, USER_PASSWORD, value);

    }

    public static boolean isChecked(Context context) {

       return AppStorage.getBooleanData(context,IS_CHECKED);

    }

    public static void setCheked(Context context, boolean value) {
        AppStorage.insertBoolenData(context, IS_CHECKED, value);
    }
}
