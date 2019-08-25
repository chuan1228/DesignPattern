package com.chuan_sir.proxypattern.aidl;

import android.os.RemoteException;

/**
 * author : dongxiaochuan
 * date : 2019-08-23 15:36
 * description :
 */
public class UserBinder extends IUserAIDL.Stub {
    @Override
    public String evaluation() throws RemoteException {
        return "五星好评！";
    }
}
