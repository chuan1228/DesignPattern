package com.chuan_sir.decoratorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 14:43
 * description :
 */
public class ConcreateComponent extends Component {

    @Override
    public void operate() {

        System.out.println("被装饰对象的具体实现");
    }
}
