package com.chuan_sir.proxypattern.staticProxy;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 15:51
 * description :
 */
public class Xiaomin implements ILawsuit {


    @Override
    public void submit() {

        System.out.println("Xiaomin submit");
    }

    @Override
    public void burde() {

        System.out.println("Xiaomin burde");
    }

    @Override
    public void defend() {

        System.out.println("Xiaomin defend");
    }

    @Override
    public void finish() {

        System.out.println("Xiaomin finish");
    }
}
