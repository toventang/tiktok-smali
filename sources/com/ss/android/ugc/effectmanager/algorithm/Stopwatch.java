package com.ss.android.ugc.effectmanager.algorithm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public class Stopwatch {
    private long startTick;

    static {
        Covode.recordClassIndex(95233);
    }

    public long elapsedMillis() {
        return SystemClock.uptimeMillis() - this.startTick;
    }

    public static Stopwatch createStarted() {
        return new Stopwatch(SystemClock.uptimeMillis());
    }

    Stopwatch(long j2) {
        this.startTick = j2;
    }
}
