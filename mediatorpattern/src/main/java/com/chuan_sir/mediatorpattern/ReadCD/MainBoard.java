package com.chuan_sir.mediatorpattern.ReadCD;

import android.database.Cursor;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:20
 * description : 主板
 */
public class MainBoard extends Mediator {

    private CDDevice cdDevice;
    private CPU cpu;
    private GraphicsCard graphicsCard;
    private SoundCard soundCard;

    @Override
    public void change(Colleague colleague) {

        if (colleague instanceof CDDevice) {
            handleCD(((CDDevice) colleague).read());
        } else if (colleague instanceof CPU) {
            handleCPU();
        }
    }

    private void handleCD(String data) {
        if (cpu != null) {
            cpu.decodeData(data);
        }
    }


    private void handleCPU() {
        if (cpu != null) {
            if (graphicsCard != null) {
                graphicsCard.videoPlay(cpu.getDataVideo());
            }

            if (soundCard != null) {
                soundCard.soundPlay(cpu.getDataAudio());
            }
        }
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
