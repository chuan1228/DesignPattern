package com.chuan_sir.mediatorpattern.ReadCD;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:08
 * description :
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }



}
