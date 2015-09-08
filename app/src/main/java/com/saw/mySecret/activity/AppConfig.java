package com.saw.mySecret.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.saw.mySecret.R;

/**
 * Created by Saw on 2015/1/23.
 */
public class AppConfig {
    public static final String SERVERURL = "http://demo.eoeschool.com/api/v1/nimings/io";
    public static final String APP_ID = "com.saw.mySecret";
    public static final String TOKEN_KEY = "token";


    public static final int RESULT_STATUS_SUCCESS = 1;
    public static final int RESULT_STATUS_FAIL = 0;
    public static final int RESULT_STATUS_INVALID_TOKEN = 2;

    /**
     * get token
     *
     * @param context the context of activity
     * @return the cache token
     */
    public static String getToken(Context context) {
        SharedPreferences sp = context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE);
        String tokenStr = sp.getString(TOKEN_KEY, null);
        return tokenStr;
    }

    /**
     * cache the token according to phone number
     *
     * @param context     the context of activity
     * @param phoneNumber the phone number
     * @return whether store successfully.
     */
    public static boolean cacheToken(Context context, String phoneNumber) {
        SharedPreferences sp = context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(TOKEN_KEY, phoneNumber);
        return editor.commit();
    }

    public static void initToolbar(ActionBarActivity actionBarActivity) {
        Toolbar toolbar = (Toolbar) actionBarActivity.findViewById(R.id.toolbar);
        actionBarActivity.setSupportActionBar(toolbar);
        ActionBar actionBar = actionBarActivity.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
