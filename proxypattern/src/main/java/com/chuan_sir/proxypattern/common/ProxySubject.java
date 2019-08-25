package com.chuan_sir.proxypattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 15:36
 * description :
 */
public class ProxySubject extends Subject {


    private RealSubject mSubject;

    public ProxySubject(RealSubject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void visit() {
        if (mSubject != null) {
            mSubject.visit();
        }
    }
}
