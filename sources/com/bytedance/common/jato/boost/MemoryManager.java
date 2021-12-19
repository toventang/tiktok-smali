package com.bytedance.common.jato.boost;

import com.bytedance.covode.number.Covode;

public class MemoryManager {
    static {
        Covode.recordClassIndex(15805);
    }

    public static native void nativePagePreFault(int i2, int i3, boolean z, boolean z2);
}
