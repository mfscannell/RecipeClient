package com.scannell.mark.android;


import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by mscannell on 5/30/16.
 */
public class LoginUtilities {
    private LoginUtilities() {

    }

    public static void storeCredentials(String username, String password) {
        Credential credential = new Credential.Builder(username)
                .setPassword(password)
                .build();
    }

//    public static void getCredentials(String username, String password) {
//        GoogleApiClient credentialsApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .enableAutoManage(this, this)
//                .addApi(Auth.CREDENTIALS_API)
//                .build();
//    }
}
