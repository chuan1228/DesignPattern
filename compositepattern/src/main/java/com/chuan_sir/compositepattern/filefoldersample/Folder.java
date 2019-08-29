package com.chuan_sir.compositepattern.filefoldersample;

import java.util.List;

/**
 * author : dongxiaochuan
 * date : 2019-08-27 16:28
 * description :
 */
public class Folder extends Dir {


    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.println(getName());
        for (Dir dir : dirs) {
            dir.print();
        }
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
