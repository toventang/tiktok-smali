package com.bytedance.im.core.internal.utils;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class w {
    static {
        Covode.recordClassIndex(23174);
    }

    public static long a() {
        int i2 = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}
