package com.chuan_sir.compositepattern.filefoldersample;

/**
 * author : dongxiaochuan
 * date : 2019-08-29 15:54
 * description :
 */
public class Client {


    public static void main(String[] args) {

        Dir diskC = new Folder("C");

        diskC.addDir(new File("ImbaMallLog.txt"));

        Dir dirWin = new Folder("Windows");
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        diskC.print();
    }
}
