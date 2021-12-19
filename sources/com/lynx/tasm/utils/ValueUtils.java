package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;

public class ValueUtils {
    static {
        Covode.recordClassIndex(35469);
    }

    private static native long nativeToNativeBoolValue(boolean z);

    private static native long nativeToNativeByteValue(byte b2);

    private static native long nativeToNativeDoubleValue(double d2);

    private static native long nativeToNativeIntValue(int i2);

    private static native long nativeToNativeLongValue(long j2);

    private static native long nativeToNativeShortValue(short s);

    private static native long nativeToNativeStringValue(String str);
}
