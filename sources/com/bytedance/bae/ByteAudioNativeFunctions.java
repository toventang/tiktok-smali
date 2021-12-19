package com.bytedance.bae;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public final class ByteAudioNativeFunctions {
    static {
        Covode.recordClassIndex(15312);
    }

    public static native long nativeAddEventHandler(long j2, ByteAudioEventHandlerProxy byteAudioEventHandlerProxy);

    public static native int nativeAddInputStreamNameForMix(long j2, String str);

    public static native int nativeAdjustHeadsetMonitorVolume(long j2, int i2);

    public static native int nativeAdjustPlaybackVolume(long j2, int i2);

    public static native int nativeAdjustRecordVolume(long j2, int i2);

    public static native long nativeAuxStreamGetId(long j2);

    public static native String nativeAuxStreamGetName(long j2);

    public static native ByteAudioStreamOption nativeAuxStreamGetValue(long j2, int i2);

    public static native int nativeAuxStreamPause(long j2);

    public static native int nativeAuxStreamResume(long j2);

    public static native int nativeAuxStreamSetFormat(long j2, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native int nativeAuxStreamSetGain(long j2, int i2);

    public static native int nativeAuxStreamSetPath(long j2, String str);

    public static native long nativeAuxStreamSetSink(long j2, ByteAudioAuxSinkProxy byteAudioAuxSinkProxy);

    public static native int nativeAuxStreamSetValue(long j2, int i2, ByteAudioStreamOption byteAudioStreamOption);

    public static native int nativeAuxStreamStart(long j2);

    public static native int nativeAuxStreamStop(long j2);

    public static native int nativeClearInputStreamNameForMix(long j2);

    public static native long nativeCreateAuxStream(long j2, String str);

    public static native long nativeCreateInputStream(long j2, String str);

    public static native long nativeCreateOutputStream(long j2, String str);

    public static native void nativeDestroyAuxStream(long j2, long j3);

    public static native void nativeDestroyInputStream(long j2, long j3);

    public static native void nativeDestroyOutputStream(long j2, long j3);

    public static native void nativeEnableAudioRoute(long j2, boolean z);

    public static native void nativeEnableEarMonitor(long j2, boolean z);

    public static native void nativeEnableLocalAudio(long j2, boolean z);

    public static native long nativeGetInstance();

    public static native ByteAudioStreamOption nativeGetValue(long j2, int i2);

    public static native long nativeInputStreamGetId(long j2);

    public static native String nativeInputStreamGetName(long j2);

    public static native LinkedHashMap nativeInputStreamGetStatsReport(long j2);

    public static native ByteAudioStreamOption nativeInputStreamGetValue(long j2, int i2);

    public static native int nativeInputStreamSetFormat(long j2, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native int nativeInputStreamSetGain(long j2, int i2);

    public static native int nativeInputStreamSetMute(long j2, boolean z);

    public static native long nativeInputStreamSetSink(long j2, ByteAudioInputSinkProxy byteAudioInputSinkProxy);

    public static native int nativeInputStreamSetValue(long j2, int i2, ByteAudioStreamOption byteAudioStreamOption);

    public static native int nativeInputStreamStart(long j2);

    public static native int nativeInputStreamStop(long j2);

    public static native int nativeInputStreamUpdateFormat(long j2, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native boolean nativeIsExternalAudioSource(long j2);

    public static native long nativeOutputStreamGetId(long j2);

    public static native String nativeOutputStreamGetName(long j2);

    public static native LinkedHashMap nativeOutputStreamGetStatsReport(long j2);

    public static native ByteAudioStreamOption nativeOutputStreamGetValue(long j2, int i2);

    public static native int nativeOutputStreamSetFormat(long j2, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native int nativeOutputStreamSetGain(long j2, int i2);

    public static native int nativeOutputStreamSetGainWithFade(long j2, int i2, int i3);

    public static native int nativeOutputStreamSetMute(long j2, boolean z);

    public static native long nativeOutputStreamSetSink(long j2, ByteAudioOutputSinkProxy byteAudioOutputSinkProxy);

    public static native int nativeOutputStreamSetValue(long j2, int i2, ByteAudioStreamOption byteAudioStreamOption);

    public static native int nativeOutputStreamStart(long j2);

    public static native int nativeOutputStreamStop(long j2);

    public static native int nativePullExternalAudioBuffer(long j2, ByteAudioStreamBuffer byteAudioStreamBuffer);

    public static native int nativePushExternalAudioBuffer(long j2, ByteAudioStreamBuffer byteAudioStreamBuffer);

    public static native void nativeRemoveEventHandler(long j2, long j3);

    public static native int nativeSetAudioScenario(long j2, int i2);

    public static native void nativeSetEnableSpeakerphone(long j2, boolean z);

    public static native void nativeSetExternalAudioSource(long j2, boolean z, int i2, int i3, int i4, int i5);

    public static native long nativeSetFrontInputFilter(long j2, ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3);

    public static native long nativeSetInputFilter(long j2, ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3);

    public static native long nativeSetOutputFilter(long j2, ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3);

    public static native int nativeSetServerConfigure(long j2, String str);

    public static native int nativeSetValue(long j2, int i2, ByteAudioStreamOption byteAudioStreamOption);
}
