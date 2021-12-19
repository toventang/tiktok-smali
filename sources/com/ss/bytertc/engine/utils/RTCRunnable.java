package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

public abstract class RTCRunnable {
    static {
        Covode.recordClassIndex(101055);
    }

    public abstract void run();
}
