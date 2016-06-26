package com.scannell.mark.recipeclient;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class UserSettings {
    public static final String PREFERENCES_USER_NAME = "PREFERENCES_USER_NAME";
    public static final String PREFERENCES_PASSWORD = "PREFERENCES_PASSWORD";
    public static final String EMPTY_STRING = "";

    private static String userName;
    private static String password;

    private UserSettings() {
    }

    public static boolean hasUser(Context context) {
        boolean containsUser = true;

        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor preferencesEditor = sharedPreferences.edit();

        String userName = sharedPreferences.getString(PREFERENCES_USER_NAME, EMPTY_STRING);
        String password = sharedPreferences.getString(PREFERENCES_PASSWORD, EMPTY_STRING);

        if (userName.equals(EMPTY_STRING) && password.equals(EMPTY_STRING)) {
            containsUser = false;
        }

        return containsUser;
    }

    public static void saveUser(Context context, String userName, String password) {
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor preferencesEditor = sharedPreferences.edit();

        preferencesEditor.putString(PREFERENCES_USER_NAME, userName);
        preferencesEditor.putString(PREFERENCES_PASSWORD, password);
    }
}
