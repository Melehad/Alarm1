package com.example.alarm1;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.RelativeLayout;

import androidx.core.app.NotificationCompat;

public class AlertReceiver extends BroadcastReceiver {
    @SuppressLint("ResourceAsColor")
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());


    }


}
