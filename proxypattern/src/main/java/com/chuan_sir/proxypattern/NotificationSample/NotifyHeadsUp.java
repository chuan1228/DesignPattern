package com.chuan_sir.proxypattern.NotificationSample;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

import com.chuan_sir.proxypattern.R;

/**
 * author : dongxiaochuan
 * date : 2019-08-23 19:28
 * description :
 */
public class NotifyHeadsUp extends Notify {


    public NotifyHeadsUp(Context context) {
        super(context);
    }

    @Override
    public void send() {
        Notification notification = builder.build();
        notification.contentView = new RemoteViews(context.getPackageName(), R.layout.remote_notify_proxy_normal);
        notification.bigContentView = new RemoteViews(context.getPackageName(), R.layout.remote_notify_proxy_big);
        notification.contentView = new RemoteViews(context.getPackageName(), R.layout.remote_notify_proxy_normal);
        notificationManagerCompat.notify(0, notification);
    }

    @Override
    public void cancel() {
        notificationManagerCompat.cancel(0);
    }
}
