package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;

public class NativeRTCRoomFunctions {
    static {
        Covode.recordClassIndex(100779);
    }

    public static native void nativeDestory(long j2);

    public static native void nativeEnableSubscribeLocalStream(long j2, boolean z);

    public static native int nativeJoinRoom(long j2, String str, UserInfo userInfo, int i2);

    public static native int nativeJoinRoomWithRoomConfig(long j2, String str, UserInfo userInfo, MultiRoomConfig multiRoomConfig);

    public static native void nativeLeaveRoom(long j2);

    public static native void nativeMuteAllRemoteAudio(long j2, int i2);

    public static native void nativeMuteAllRemoteVideo(long j2, int i2);

    public static native void nativeMuteRemoteAudio(long j2, String str, int i2);

    public static native void nativeMuteRemoteVideo(long j2, String str, int i2);

    public static native void nativePauseAllSubscribedStream(long j2, int i2);

    public static native void nativePublish(long j2);

    public static native void nativePublishScreen(long j2);

    public static native void nativeReleaseRTCRoomEventHandler(long j2);

    public static native void nativeResumeAllSubscribedStream(long j2, int i2);

    public static native void nativeSendRoomBinaryMessage(long j2, byte[] bArr);

    public static native void nativeSendRoomMessage(long j2, String str);

    public static native void nativeSendUserBinaryMessage(long j2, String str, byte[] bArr);

    public static native void nativeSendUserMessage(long j2, String str, String str2);

    public static native void nativeSetAudioVolumeIndicationInterval(long j2, int i2);

    public static native void nativeSetAutoSubscribe(long j2, int i2, int i3);

    public static native void nativeSetCustomUserRole(long j2, String str);

    public static native long nativeSetRTCRoomEventHandler(long j2, RTCRoomEventHandler rTCRoomEventHandler);

    public static native void nativeSetUserRole(long j2, int i2);

    public static native void nativeSetUserVisibility(long j2, boolean z);

    public static native void nativeStartLiveTranscoding(long j2, String str, ILiveTranscodingObserver iLiveTranscodingObserver);

    public static native void nativeStopLiveTranscoding(long j2);

    public static native void nativeSubscribe(long j2, String str, boolean z, boolean z2, boolean z3, int i2);

    public static native void nativeSubscribeUserStream(long j2, String str, boolean z, int i2, int i3, int i4);

    public static native void nativeUnpublish(long j2);

    public static native void nativeUnpublishScreen(long j2);

    public static native void nativeUnsubscribe(long j2, String str, boolean z);

    public static native void nativeUpdateLiveTranscoding(long j2, String str);

    public static native void nativeUpdateToken(long j2, String str);
}
