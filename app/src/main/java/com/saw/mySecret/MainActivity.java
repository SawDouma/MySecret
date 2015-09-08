package com.saw.mySecret;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.saw.mySecret.activity.AppConfig;
import com.saw.mySecret.activity.LoginActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppConfig.initToolbar(this);

        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

}
