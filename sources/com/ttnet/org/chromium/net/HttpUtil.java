package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;

public final class HttpUtil {
    static {
        Covode.recordClassIndex(103377);
    }

    private static native boolean nativeIsAllowedHeader(String str, String str2);
}
