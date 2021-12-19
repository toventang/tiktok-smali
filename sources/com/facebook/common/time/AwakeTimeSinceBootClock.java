package com.facebook.common.time;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public class AwakeTimeSinceBootClock implements b {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.b
    public long now() {
        return SystemClock.uptimeMillis();
    }

    static {
        Covode.recordClassIndex(28687);
    }
}
