package com.lynx.tasm.behavior.ui.utils;

import com.bytedance.covode.number.Covode;

public class d {
    static {
        Covode.recordClassIndex(35193);
    }

    public static int a(int i2, int i3) {
        if (i3 == 255) {
            return i2;
        }
        if (i3 == 0) {
            return i2 & 16777215;
        }
        return (i2 & 16777215) | ((((i2 >>> 24) * (i3 + (i3 >> 7))) >> 8) << 24);
    }
}
