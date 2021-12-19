package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

public class AVMDLTaskEventID {
    static {
        Covode.recordClassIndex(101124);
    }

    public static boolean eventTypeIsValid(int i2) {
        return i2 >= 0 && i2 < 2;
    }

    public static boolean taskTypeIsValid(int i2) {
        return i2 > 0 && i2 < 4;
    }
}
