package com.chuan_sir.proxypattern.dynamicProxy;

import com.chuan_sir.proxypattern.staticProxy.ILawsuit;
import com.chuan_sir.proxypattern.staticProxy.Xiaomin;

import java.lang.reflect.Proxy;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 16:18
 * description :
 */
public class Client {

    public static void main(String[] args) {

        Xiaomin xiaomin = new Xiaomin();

        DynamicProxy proxy = new DynamicProxy(xiaomin);

        ClassLoader loader = xiaomin.getClass().getClassLoader();

        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);

        lawyer.submit();

        lawyer.burde();

        lawyer.defend();

        lawyer.finish();
    }
}
