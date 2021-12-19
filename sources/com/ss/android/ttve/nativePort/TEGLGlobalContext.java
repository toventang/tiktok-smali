package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;

public class TEGLGlobalContext {
    public static native void nativeSetGLVersion(int i2);

    public static native void nativeSetMaxRenderSize(int i2, int i3);

    static {
        Covode.recordClassIndex(37719);
        d.a();
    }
}
