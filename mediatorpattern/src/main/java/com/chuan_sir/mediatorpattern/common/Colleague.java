package com.chuan_sir.mediatorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 10:39
 * description :
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();
}
