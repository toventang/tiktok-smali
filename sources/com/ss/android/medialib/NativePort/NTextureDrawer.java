package com.ss.android.medialib.NativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class NTextureDrawer {

    /* renamed from: a  reason: collision with root package name */
    private static final String f59642a = NTextureDrawer.class.getSimpleName();

    private native long nativeCreateHandler();

    private native void nativeDrawTexture(long j2, int i2);

    private native void nativeRelease(long j2);

    private native void nativeSetDebug(long j2, boolean z);

    private native void nativeSetFlipScale(long j2, float f2, float f3);

    private native void nativeSetRotation(long j2, float f2);

    private native void nativeSetWidthHeight(long j2, int i2, int i3);

    static {
        Covode.recordClassIndex(36827);
        d.c();
    }
}
