package com.chuan_sir.decoratorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 14:47
 * description :
 */
public class ConcreateDecoratorA extends Decorator {


    public ConcreateDecoratorA(Component component) {
        super(component);
    }

    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    public void operateA() {

        System.out.println("装饰者扩展方法A的具体实现");
    }

    public void operateB() {

        System.out.println("装饰者扩展方法B的具体实现");
    }
}
