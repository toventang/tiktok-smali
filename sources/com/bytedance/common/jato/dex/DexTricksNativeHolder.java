package com.bytedance.common.jato.dex;

import com.bytedance.common.jato.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DexTricksNativeHolder {
    private static boolean sInited;

    static {
        Covode.recordClassIndex(15833);
    }

    private static native int verifyEnableNative();

    private static native int verifyNoneNative(int i2, int i3);

    private static synchronized boolean ensureInited() {
        boolean z;
        synchronized (DexTricksNativeHolder.class) {
            MethodCollector.i(8953);
            if (!sInited && c.a()) {
                sInited = true;
            }
            z = sInited;
            MethodCollector.o(8953);
        }
        return z;
    }

    protected static int verifyEnable() {
        MethodCollector.i(7497);
        if (ensureInited()) {
            int verifyEnableNative = verifyEnableNative();
            MethodCollector.o(7497);
            return verifyEnableNative;
        }
        MethodCollector.o(7497);
        return -1;
    }

    protected static int verifyNone(int i2, int i3) {
        MethodCollector.i(7492);
        if (ensureInited()) {
            int verifyNoneNative = verifyNoneNative(i2, i3);
            MethodCollector.o(7492);
            return verifyNoneNative;
        }
        MethodCollector.o(7492);
        return -1;
    }
}
