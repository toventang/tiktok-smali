package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;

public final class GURLUtils {
    static {
        Covode.recordClassIndex(103371);
    }

    private static native String nativeGetOrigin(String str);

    private static native String nativeGetScheme(String str);
}
