package com.bytedance.bae.router;

import com.bytedance.covode.number.Covode;

public final class ByteAudioRouterNativeFunctions {
    static {
        Covode.recordClassIndex(15369);
    }

    public static native void nativeOnAudioRoutingChanged(long j2, int i2, int i3, String str);
}
