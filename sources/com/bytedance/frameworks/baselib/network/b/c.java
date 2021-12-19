package com.bytedance.frameworks.baselib.network.b;

import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(16960);
    }

    a a();

    int b();

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE;

        static {
            Covode.recordClassIndex(16961);
        }
    }
}
