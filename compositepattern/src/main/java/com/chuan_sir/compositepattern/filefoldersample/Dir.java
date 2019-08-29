package com.chuan_sir.compositepattern.filefoldersample;

import java.util.ArrayList;
import java.util.List;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 16:23
 * description :
 */
public abstract class Dir {

    //文件下所有的元素
    protected List<Dir> dirs = new ArrayList<>();

    //当前文件夹名字或者文件名
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加目录或者文件
     *
     * @param dir
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除目录或者文件
     *
     * @param dir
     */
    public abstract void rmDir(Dir dir);

    /**
     * 清除文件夹下的所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹的目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有的文件夹及子文件夹
     *
     * @return
     */
    public abstract List<Dir> getFiles();

    public String getName() {
        return name;
    }
}
