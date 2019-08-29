package com.chuan_sir.compositepattern.common_transparent;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 16:09
 * description :
 */
public abstract class Component {


    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(Component component);

    public abstract void removeChild(Component component);

    public abstract Component getChildren(int index);
}
