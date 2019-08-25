package com.chuan_sir.mediatorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 11:42
 * description :
 */
public class ColleagueA extends Colleague {


    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("提出需求...");
    }
}
