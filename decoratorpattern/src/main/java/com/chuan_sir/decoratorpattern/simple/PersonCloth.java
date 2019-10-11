package com.chuan_sir.decoratorpattern.simple;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 15:33
 * description :
 */
public abstract class PersonCloth extends Person {

    private Person person;


    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {

        person.dressed();
    }
}
