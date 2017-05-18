package com.mzya.lxy.native_module;

/**
 * Created by lxy on 5/19/17.
 */

public class MyClass {
    static {
        System.loadLibrary("native_module");
    }

    public native String getString();
}
