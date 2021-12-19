package com.bytedance.liko.memoryexplorer.android;

import com.bytedance.covode.number.Covode;

public class AndroidOS {
    public static String MANUFACTURER = "";
    public static String MODEL = "";
    public static String RELEASE = "";
    public static int SDK_INT;

    private AndroidOS() {
    }

    static {
        Covode.recordClassIndex(24744);
    }
}
