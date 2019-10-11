package com.chuan_sir.decoratorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 14:50
 * description :
 */
public class Client {


    public static void main(String[] args) {
        //构造被装饰的组件对象
        Component component = new ConcreateComponent();

        //根据组件对象构造装饰者对象A,此时相当于给组件对象添加装饰者的方法
        Decorator decorator = new ConcreateDecoratorA(component);
        decorator.operate();
    }
}
