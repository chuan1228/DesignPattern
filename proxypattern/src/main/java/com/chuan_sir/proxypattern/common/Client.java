package com.chuan_sir.proxypattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 15:40
 * description :
 */
public class Client {

    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }

}
