package com.chuan_sir.compositepattern.common_transparent;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 16:16
 * description :
 */
public class Client {


    public static void main(String[] args) {

        Component root = new Composite("Root");

        Component branch1 = new Composite("branch1");
        Component branch2 = new Composite("branch2");

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }
}
