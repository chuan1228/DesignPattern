package com.chuan_sir.mediatorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 11:43
 * description :
 */
public class ColleagueB extends Colleague {


    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("编码开发...");
    }
}
