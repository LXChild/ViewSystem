package com.lxchild.utils;

/**
 * Created by LXChild on 15/10/2016.
 */

public class BsPatch {
    static {
        System.loadLibrary("bsdiff");
    }
    public static native int bspatch(String oldApk, String newApk, String patch);
}
