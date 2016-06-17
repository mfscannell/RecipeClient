package com.scannell.mark.android.recipe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * The startup page.
 */
public class StartupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

//        GoogleApiClient credentialsApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .enableAutoManage(this, this)
//                .addApi(Auth.CREDENTIALS_API)
//                .build();
        Intent loginIntent = new Intent(this, LoginActivity.class);
        Bundle loginBundle = new Bundle();
        loginIntent.putExtras(loginBundle);
        startActivity(loginIntent);
    }
}
