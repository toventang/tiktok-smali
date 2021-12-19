package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class FieldTrialList {
    static {
        Covode.recordClassIndex(103260);
    }

    private static native String nativeFindFullName(String str);

    private static native String nativeGetVariationParameter(String str, String str2);

    private static native void nativeLogActiveTrials();

    private static native boolean nativeTrialExists(String str);

    private FieldTrialList() {
    }
}
