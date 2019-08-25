package com.chuan_sir.proxypattern.aidl;

import android.os.RemoteException;

/**
 * author : dongxiaochuan
 * date : 2019-08-23 14:40
 * description :Binder Server
 */
public class BankBinder extends IBankAIDL.Stub {

    private IUserAIDL userBinser;

    public IUserAIDL getUserBinser() {
        return userBinser;
    }

    @Override
    public void registerUser(IUserAIDL iUserAIDL) throws RemoteException {
        userBinser = iUserAIDL;
    }

    @Override
    public String openAccount(String name, String password) {
        return name + "开户成功!账号为：" + name;
    }

    @Override
    public String saveMoney(int money, String account) {
        return "账户：" + account + " 存入 " + money + "单位：人民币";
    }

    @Override
    public String takeMoney(int money, String account, String password) {
        return "账户：" + account + " 支取 " + money + "单位：人民币";
    }

    @Override
    public String closeAccount(String account, String password) {
        return account + " 销户成功！";
    }
}
