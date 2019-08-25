package com.chuan_sir.proxypattern.NotificationSample.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.chuan_sir.proxypattern.NotificationSample.Notify;
import com.chuan_sir.proxypattern.NotificationSample.NotifyProxy;
import com.chuan_sir.proxypattern.R;

public class ProxyActivity extends AppCompatActivity {

    private Notify notify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        notify = new NotifyProxy(this);
    }

    public void createNotify(View view) {

        notify.send();
    }
}
