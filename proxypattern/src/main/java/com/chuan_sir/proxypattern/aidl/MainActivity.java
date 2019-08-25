package com.chuan_sir.proxypattern.aidl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.chuan_sir.proxypattern.R;

public class MainActivity extends AppCompatActivity {

    private IBankAIDL mBankBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction("com.chuan_sir.proxypattern.aidl.bank");
        bindService(intent, conn, BIND_AUTO_CREATE);
    }


    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mBankBinder = IBankAIDL.Stub.asInterface(service);

            try {
                //注册bank进程到主进程的回调
                mBankBinder.registerUser(new UserBinder());
                Log.e(MainActivity.class.getSimpleName(), mBankBinder.openAccount("Curry", "123"));
                Log.e(MainActivity.class.getSimpleName(), mBankBinder.saveMoney(100, "curry"));
                Log.e(MainActivity.class.getSimpleName(), mBankBinder.takeMoney(50, "curry", "123"));
                Log.e(MainActivity.class.getSimpleName(), mBankBinder.openAccount("Curry", "123"));

            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(conn);
    }
}
