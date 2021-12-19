package com.facebook.common.time;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public class RealtimeSinceBootClock implements b {
    private static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    static {
        Covode.recordClassIndex(28688);
    }
}
