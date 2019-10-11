package com.chuan_sir.adapterpattern.objectsimple;

/**
 * author : dongxiaochuan
 * date : 2019-08-30 10:35
 * description :
 */
public class Test {


    public static void main() {

        VoltAdapter voltAdapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压：" + voltAdapter.getVolt5());
    }
}
