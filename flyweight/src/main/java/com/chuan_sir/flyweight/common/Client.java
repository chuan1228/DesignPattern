package com.chuan_sir.flyweight.common;

/**
 * author : dongxiaochuan
 * date : 2019-10-12 09:50
 * description :
 */
public class Client {


    public static void main(String[] args) {

        FlyWeightFactory.getFlyWeight("123");
        FlyWeightFactory.getFlyWeight("123");
    }
}
