package com.chuan_sir.proxypattern.NotificationSample;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.chuan_sir.proxypattern.NotificationSample.activity.NotifyActivity;
import com.chuan_sir.proxypattern.R;

/**
 * author : dongxiaochuan
 * date : 2019-08-23 16:08
 * description : 通知抽象类
 */
public abstract class Notify {

    protected Context context;

    protected NotificationManagerCompat notificationManagerCompat;
    protected NotificationCompat.Builder builder;

    @SuppressLint("ServiceCast")
    public Notify(Context context) {
        this.context = context;
        notificationManagerCompat = NotificationManagerCompat.from(context);
        builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, NotifyActivity.class), PendingIntent.FLAG_UPDATE_CURRENT));

    }

    /**
     * 发送通知
     */
    public abstract void send();

    /**
     * 取消发送通知
     */
    public abstract void cancel();

}
