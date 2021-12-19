package com.bytedance.common.wschannel.e;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(16043);
    }

    public static long a() {
        int i2 = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}
