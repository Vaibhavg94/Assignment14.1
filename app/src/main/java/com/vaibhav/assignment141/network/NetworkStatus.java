package com.vaibhav.assignment141.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkStatus {

    private static NetworkStatus instance = new NetworkStatus();
    private static Context context;
    private ConnectivityManager connectivityManager;
    private boolean connected = false;

    public static NetworkStatus getInstance(Context ctx) {
        context = ctx;
        return instance;
    }

    public boolean isConnectedToInternet() {
        connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null;
    }
}