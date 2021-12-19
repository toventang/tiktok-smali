package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;

public class GlobalControler {
    private static boolean mYuvConverterUseBufferPool = true;

    public static boolean isYuvConverterUseBufferPool() {
        return mYuvConverterUseBufferPool;
    }

    static {
        Covode.recordClassIndex(100588);
    }

    public static void setYuvConverterUseBufferPool(boolean z) {
        mYuvConverterUseBufferPool = z;
    }
}
