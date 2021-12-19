package com.bytedance.frameworks.apm.trace;

import com.bytedance.apm.block.a.g;
import com.bytedance.covode.number.Covode;

public class MethodCollector {
    static {
        Covode.recordClassIndex(16942);
    }

    public static void i(int i2) {
        g.a(i2, 0L);
    }

    public static void o(int i2) {
        g.b(i2, 0);
    }
}
