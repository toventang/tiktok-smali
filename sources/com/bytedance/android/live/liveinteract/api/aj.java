package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public final class aj {
    static {
        Covode.recordClassIndex(5149);
    }

    public static boolean a(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static int b(int i2, int i3) {
        if (a(i2, i3)) {
            return i2 ^ i3;
        }
        return i2;
    }
}
