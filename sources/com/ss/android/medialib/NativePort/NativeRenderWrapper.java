package com.ss.android.medialib.NativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class NativeRenderWrapper {
    private native long nativeCreate();

    private native void nativeDestroy(long j2);

    private native float nativeGetFilterIntensity(long j2, String str);

    private native int nativeInit(long j2, int i2, int i3, String str);

    private native int nativeProcessTexture(long j2, int i2, int i3, double d2);

    private native int nativeSetDoubleFilterNew(long j2, String str, String str2, float f2, float f3, float f4);

    private native int nativeSetFilter(long j2, String str, float f2);

    private native int nativeSetFilter2(long j2, String str, String str2, float f2, float f3);

    private native int nativeSetFilterNew(long j2, String str, float f2);

    static {
        Covode.recordClassIndex(36828);
        d.c();
    }
}
