package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class NativeAudioMixingManagerFunctions {
    static {
        Covode.recordClassIndex(100776);
    }

    public static native void nativeDisableAudioMixingFrame(long j2);

    public static native void nativeEnableAudioMixingFrame(long j2, int i2);

    public static native int nativeGetAudioMixingCurrentPosition(long j2, int i2);

    public static native int nativeGetAudioMixingDuration(long j2, int i2);

    public static native void nativePauseAudioMixing(long j2, int i2);

    public static native void nativePreloadAudioMixing(long j2, int i2, String str);

    public static native int nativePushAudioMixingFrame(long j2, byte[] bArr, int i2, int i3, int i4);

    public static native void nativeResumeAudioMixing(long j2, int i2);

    public static native void nativeSetAudioMixingPosition(long j2, int i2, int i3);

    public static native void nativeSetAudioMixingVolume(long j2, int i2, int i3, int i4);

    public static native void nativeStartAudioMixing(long j2, int i2, String str, int i3, int i4);

    public static native void nativeStopAudioMixing(long j2, int i2);

    public static native void nativeUnloadAudioMixing(long j2, int i2);
}
