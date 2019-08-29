package com.chuan_sir.compositepattern.common_safe;

import java.util.ArrayList;
import java.util.List;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 15:28
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


    public void addChild(Component component) {
        components.add(component);
    }

    public void removeChild(Component component) {
        components.remove(component);
    }

    public Component getChildren(int i) {
        return components.get(i);
    }
}
