package com.chuan_sir.mediatorpattern.ReadCD;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:11
 * description : CPU负责处理数据，并将处理后的数据提供给主板
 */
public class CPU extends Colleague {

    private String dataVideo, dataAudio;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataAudio() {
        return dataAudio;
    }

    public void decodeData(String data) {
        String[] datas = data.split(",");
        dataVideo = datas[0];
        dataAudio = datas[1];
        mediator.change(this);
    }


}
