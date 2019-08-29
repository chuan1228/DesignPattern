package com.chuan_sir.compositepattern.common_transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 16:13
 * description :
 */
public class Composite extends Component {


    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        for (Component component : components) {
            component.doSomething();
        }
    }

    @Override
    public void addChild(Component component) {
        components.add(component);
    }

    @Override
    public void removeChild(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChildren(int index) {
        return components.get(index);
    }
}
