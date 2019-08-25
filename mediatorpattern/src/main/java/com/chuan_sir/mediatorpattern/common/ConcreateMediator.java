package com.chuan_sir.mediatorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 11:45
 * description :
 */
public class ConcreateMediator extends Mediator {

    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
