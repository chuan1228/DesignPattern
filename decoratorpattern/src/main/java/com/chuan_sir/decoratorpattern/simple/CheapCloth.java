package com.chuan_sir.decoratorpattern.simple;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 15:34
 * description :
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressA();
    }

    public void dressA() {
        System.out.println("穿上短裤");
    }
}
