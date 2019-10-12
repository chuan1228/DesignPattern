package com.chuan_sir.flyweight.common;

/**
 * author : dongxiaochuan
 * date : 2019-10-12 09:47
 * description :
 */
public class ConCreateFlyWeight extends FlyWeight {

    private String intrinsiState;

    public ConCreateFlyWeight(String intrinsiState) {
        this.intrinsiState = intrinsiState;
    }

    @Override
    public void doSomething() {

        System.out.println("doSomething");
    }
}
