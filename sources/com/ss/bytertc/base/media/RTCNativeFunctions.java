package com.ss.bytertc.base.media;

import com.bytedance.covode.number.Covode;

public final class RTCNativeFunctions {
    static {
        Covode.recordClassIndex(100711);
    }

    public static native void nativeNotifySurfaceAvailable(long j2, Object obj, boolean z);

    public static native void nativeNotifySurfaceDestroyed(long j2, Object obj, boolean z);

    public static native void nativeNotifySurfaceSizeChanged(long j2);
}
