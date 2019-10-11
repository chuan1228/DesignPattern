package com.chuan_sir.adapterpattern.classsimple;

/**
 * author : dongxiaochuan
 * date : 2019-08-30 10:13
 * description :
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

    @Override
    public int getVolt5() {
        return 5;
    }
}
