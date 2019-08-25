package com.chuan_sir.proxypattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 15:35
 * description :
 */
public class RealSubject extends Subject {

    @Override
    public void visit() {

        System.out.println("real visit");
    }
}
