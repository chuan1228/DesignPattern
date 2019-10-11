package com.chuan_sir.decoratorpattern.simple;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 15:37
 * description :
 */
public class Client {


    public static void main(String[] args) {

        Person boy = new Boy();

        PersonCloth cheapCloth = new CheapCloth(boy);

        PersonCloth expensiveCloth = new ExpensiveCloth(boy);

        cheapCloth.dressed();

        expensiveCloth.dressed();
    }
}
