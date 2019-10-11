package com.chuan_sir.decoratorpattern.simple;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 15:36
 * description :
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person person) {
        super(person);
    }


    @Override
    public void dressed() {
        super.dressed();
        dressA();
    }

    public void dressA() {

        System.out.println("穿上西服");
    }
}
