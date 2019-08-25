package com.chuan_sir.mediatorpattern.ReadCD;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:09
 * description : 负责读取光盘的数据给主板
 */
public class CDDevice extends Colleague {


    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }


    public void loadData() {
        data = "视频数据,音频数据";
        mediator.change(this);
    }

    public String read() {
        return data;
    }

}
