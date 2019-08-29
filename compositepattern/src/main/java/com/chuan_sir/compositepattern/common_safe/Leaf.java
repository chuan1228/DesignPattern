package com.chuan_sir.compositepattern.common_safe;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 15:28
 * description :
 */
public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {

        System.out.println(name + ": doSomething");
    }
}
