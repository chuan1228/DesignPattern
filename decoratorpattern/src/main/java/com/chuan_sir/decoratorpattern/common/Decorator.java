package com.chuan_sir.decoratorpattern.common;

/**
 * author : dongxiaochuan
 * date : 2019-10-11 14:46
 * description :
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
