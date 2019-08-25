package com.chuan_sir.proxypattern.staticProxy;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 15:53
 * description :
 */
public class Client {

    public static void main(String[] args) {

        ILawsuit lawer = new Lawer(new Xiaomin());

        lawer.submit();
        lawer.burde();
        lawer.defend();
        lawer.finish();
    }
}
