package com.chuan_sir.proxypattern.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * author : dongxiaochuan
 * date : 2019-08-23 14:43
 * description :
 */
public class BankService extends Service {


    private BankBinder bankBinder;
    private Handler mHandler = new Handler();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        bankBinder = new BankBinder();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.e(BankService.class.getSimpleName(), bankBinder.getUserBinser().evaluation());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }, 5000);
        return bankBinder;
    }


}
