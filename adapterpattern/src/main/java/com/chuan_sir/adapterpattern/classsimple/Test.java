package com.chuan_sir.adapterpattern.classsimple;

/**
 * author : dongxiaochuan
 * date : 2019-08-30 10:18
 * description :
 */
public class Test {


    public static void main(String[] args) {

        VoltAdapter voltAdapter = new VoltAdapter();
        System.out.println("输出电压：" + voltAdapter.getVolt5());
    }
}
