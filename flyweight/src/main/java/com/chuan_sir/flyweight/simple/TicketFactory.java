package com.chuan_sir.flyweight.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author : dongxiaochuan
 * date : 2019-10-12 10:15
 * description :
 */
public class TicketFactory {

    private static Map<String, Ticket> ticketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (ticketMap.containsKey(key)) {
            System.out.println("使用缓存--->" + key);
            return ticketMap.get(key);
        } else {
            System.out.println("创建对象--->" + key);
            Ticket ticket = new TrainTicket(from, to);
            ticketMap.put(key, ticket);
            return ticket;
        }
    }
}
