package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;

public class TEGPUInfoReader {
    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();

    static {
        Covode.recordClassIndex(37720);
        d.b();
    }
}
