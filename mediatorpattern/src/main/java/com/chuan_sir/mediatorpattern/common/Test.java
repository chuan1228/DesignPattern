package com.chuan_sir.mediatorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 11:50
 * description :
 */
public class Test {


    public static void main(String[] args) {
        ConcreateMediator concreateMediator = new ConcreateMediator();
        ColleagueA colleagueA = new ColleagueA(concreateMediator);
        ColleagueB colleagueB = new ColleagueB(concreateMediator);
        concreateMediator.setColleagueA(colleagueA);
        concreateMediator.setColleagueB(colleagueB);

    }
}
