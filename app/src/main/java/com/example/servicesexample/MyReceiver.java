package com.example.servicesexample;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {

//        String status = intent.getStringExtra("time-zone");
//        Toast.makeText(context, status, Toast.LENGTH_SHORT).show();

        String status2 = intent.getAction();
        Toast.makeText(context, "" + status2, Toast.LENGTH_SHORT).show();

//        boolean isOn = intent.getBooleanExtra("state", false);
//        Toast.makeText(context, "Airplane mode is: " + isOn, Toast.LENGTH_SHORT).show();

    }
}