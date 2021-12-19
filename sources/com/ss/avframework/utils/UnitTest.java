package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.MediaEngineFactory;

public class UnitTest {
    static {
        Covode.recordClassIndex(100623);
    }

    private static native int nativeUnitTest(String str, TEBundle tEBundle);

    public static void run(String str, TEBundle tEBundle) {
    }

    public static void init() {
        MediaEngineFactory.getVersion();
    }
}
