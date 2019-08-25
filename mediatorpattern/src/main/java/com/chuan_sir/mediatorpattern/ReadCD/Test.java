package com.chuan_sir.mediatorpattern.ReadCD;

/**
 * author : dongxiaochuan
 * date : 2019-08-12 12:27
 * description :
 */
public class Test {


    public static void main(String[] args) {

        MainBoard mainBoard = new MainBoard();
        CDDevice cdDevice = new CDDevice(mainBoard);
        CPU cpu = new CPU(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        cdDevice.loadData();
    }

}
