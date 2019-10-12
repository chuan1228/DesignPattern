package com.chuan_sir.flyweight.simple;

/**
 * author : dongxiaochuan
 * date : 2019-10-12 10:18
 * description :
 */
public class Client {


    public static void main(String[] args) {

        Ticket ticket1 = TicketFactory.getTicket("北京", "上海");
        ticket1.showTicketInfo("上铺");

        Ticket ticket2 = TicketFactory.getTicket("北京", "上海");
        ticket1.showTicketInfo("中铺");

        Ticket ticket3 = TicketFactory.getTicket("北京", "上海");
        ticket1.showTicketInfo("下铺");
    }
}
