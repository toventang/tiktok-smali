package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class EventLog {
    static {
        Covode.recordClassIndex(103259);
    }

    public static void writeEvent(int i2, int i3) {
        android.util.EventLog.writeEvent(i2, i3);
    }
}
