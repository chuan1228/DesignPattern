package com.chuan_sir.flyweight.common;

import java.util.HashMap;
import java.util.Map;

/**
 * author : dongxiaochuan
 * date : 2019-10-12 09:48
 * description :
 */
public class FlyWeightFactory {

    private static Map<String, FlyWeight> mMap = new HashMap<>();

    public static FlyWeight getFlyWeight(String state) {

        if (mMap.containsKey(state)) {
            System.out.println("使用缓存--->" + state);
            return mMap.get(state);
        } else {
            System.out.println("创建新的对象--->" + state);
            FlyWeight flyWeight = new ConCreateFlyWeight(state);
            mMap.put(state, flyWeight);
            return flyWeight;
        }
    }
}
