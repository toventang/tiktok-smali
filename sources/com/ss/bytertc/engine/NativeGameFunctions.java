package com.ss.bytertc.engine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.handler.GameRTCEventHandler;
import org.webrtc.EglBase;

public final class NativeGameFunctions {
    static {
        Covode.recordClassIndex(100778);
    }

    public static native long nativeCreateEngine(Context context, String str, GameRTCEventHandler gameRTCEventHandler, String str2, EglBase.Context context2, long j2);

    public static native void nativeDestroyEngine(long j2);

    public static native void nativeDisableExternalAudioDevice(long j2);

    public static native int nativeEnableAudioReceive(long j2, String str, String str2, boolean z);

    public static native int nativeEnableAudioSend(long j2, String str, boolean z);

    public static native void nativeEnableExternalAudioDevice(long j2, int i2, int i3, int i4, int i5);

    public static native int nativeEnableMicrophone(long j2, String str, boolean z);

    public static native int nativeEnableSpeakerphone(long j2, String str, boolean z);

    public static native String nativeGetSDKVersion();

    public static native int nativeJoinRoom(long j2, String str, String str2, String str3, boolean z, boolean z2, int i2, int i3);

    public static native int nativeLeaveRoom(long j2, String str);

    public static native boolean nativePullExternalAudioFrame(long j2, byte[] bArr, int i2);

    public static native boolean nativePushExternalAudioFrame(long j2, byte[] bArr, int i2);

    public static native void nativeSetAppState(long j2, String str);

    public static native void nativeSetAudioScenario(long j2, int i2);

    public static native void nativeSetNetworkType(long j2, int i2);

    public static native int nativeSetPlaybackVolume(long j2, int i2);

    public static native int nativeSetRecordingVolume(long j2, int i2);

    public static native int nativeSetRemoteAudioPlaybackVolume(long j2, String str, String str2, int i2);

    public static native int nativeUpdateOrientation(long j2, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10);

    public static native int nativeUpdatePosition(long j2, String str, int i2, int i3, int i4);

    public static native int nativeUpdateReceiveRange(long j2, String str, int i2, int i3);

    public static native int nativeUpdateToken(long j2, String str, String str2);
}
