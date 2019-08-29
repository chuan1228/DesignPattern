package com.chuan_sir.compositepattern.common_safe;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 15:26
 * description :
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();
}
