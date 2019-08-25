package com.chuan_sir.mediatorpattern.ReadCD;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:19
 * description :
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }


    public void soundPlay(String data) {
        System.out.println("音频：" + data);
    }
}
