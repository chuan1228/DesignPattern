package com.chuan_sir.mediatorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 10:39
 * description :
 */
public abstract class Mediator {

    protected ColleagueA colleagueA;
    protected ColleagueB colleagueB;


    public abstract void method();

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
