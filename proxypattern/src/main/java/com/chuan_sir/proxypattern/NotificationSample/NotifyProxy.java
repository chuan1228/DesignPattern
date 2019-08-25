package com.chuan_sir.proxypattern.NotificationSample;

import android.content.Context;
import android.os.Build;

/**
 * author : dongxiaochuan
 * date : 2019-08-23 19:30
 * description : 通知代理
 */
public class NotifyProxy extends Notify {

    private Notify notify;

    public NotifyProxy(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            notify = new NotifyHeadsUp(context);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            notify = new NotifyBig(context);
        } else {
            notify = new NotifyNormal(context);
        }
    }

    @Override
    public void send() {
        notify.send();
    }

    @Override
    public void cancel() {
        notify.cancel();
    }
}
