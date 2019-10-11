package com.chuan_sir.adapterpattern.objectsimple;

/**
 * author : dongxiaochuan
 * date : 2019-08-30 10:34
 * description :
 */
public class VoltAdapter implements FiveVolt {


    private Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int getVolt220() {
        return volt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
