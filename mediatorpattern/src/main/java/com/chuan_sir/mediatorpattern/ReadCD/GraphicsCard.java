package com.chuan_sir.mediatorpattern.ReadCD;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:16
 * description :
 */
public class GraphicsCard extends Colleague {


    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data) {
        System.out.println("视频：" + data);
    }
}
