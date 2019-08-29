package com.chuan_sir.compositepattern.common_safe;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 15:34
 * description :
 */
public class Test {


    public static void main(String[] args) {

        Composite root = new Composite("Root");

        Composite branch1 = new Composite("Branch1");
        Composite branch2 = new Composite("Branch2");

        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");

        branch1.addChild(leaf1);

        branch2.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }
}
