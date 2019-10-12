package com.chuan_sir.flyweight.simple;

import java.util.Random;

/**
 * author : dongxiaochuan
 * date : 2019-10-12 10:12
 * description :
 */
public class TrainTicket implements Ticket {

    public String from;
    public String to;
    public String bunk;//铺位
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String buck) {
        price = new Random().nextInt(300);
        System.out.println("购买从 " + from + " 到 " + to + " 的 " + buck + " 火车票 " + "，价格：" + price);
    }


}
