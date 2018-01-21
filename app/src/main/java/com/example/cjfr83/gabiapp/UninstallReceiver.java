package com.example.cjfr83.gabiapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class UninstallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.e("onReceive: ","Version code *4*: " + intent.getAction() );

    }
}
