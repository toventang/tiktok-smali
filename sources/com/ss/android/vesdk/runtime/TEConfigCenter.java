package com.ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class TEConfigCenter {
    public static native void nativeClear();

    public static native void nativeSetBoolConfig(String str, boolean z, boolean z2, int i2);

    public static native void nativeSetFloatConfig(String str, float f2, boolean z, int i2);

    public static native void nativeSetIntConfig(String str, int i2, boolean z, int i3);

    public static native void nativeSetStringConfig(String str, String str2, boolean z, int i2);

    static {
        Covode.recordClassIndex(99561);
        d.a();
    }
}
