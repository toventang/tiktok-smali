package com.ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioFrameObserver;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineEventHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCMetadataObserver;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.utils.RTCRunnable;
import com.ss.bytertc.engine.video.IVideoSink;
import java.nio.ByteBuffer;
import java.util.List;
import org.webrtc.VideoFrame;

public final class NativeFunctions {
    static {
        Covode.recordClassIndex(100777);
    }

    public static native int nativeAdjustAudioMixingPlayoutVolume(long j2, int i2);

    public static native int nativeAdjustAudioMixingPublishVolume(long j2, int i2);

    public static native int nativeAdjustAudioMixingVolume(long j2, int i2);

    public static native int nativeCheckVideoEffectLicense(Context context, long j2, String str);

    public static native void nativeClearHardWareEncodeContext();

    public static native long nativeCreateAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler);

    public static native long nativeCreateEngine(Context context, String str, RTCEngineEventHandler rTCEngineEventHandler, String str2);

    public static native long nativeCreateRtcRoom(long j2, String str);

    public static native void nativeDestroyEngine(long j2);

    public static native void nativeDisableExternalAudioDevice(long j2);

    public static native int nativeEnableAutoSubscribe(long j2, int i2, int i3);

    public static native void nativeEnableExternalAudioDevice(long j2, int i2, int i3, int i4, int i5);

    public static native int nativeEnableRangeAudio(long j2, boolean z);

    public static native int nativeEnableSubscribeLocalStream(long j2, boolean z);

    public static native int nativeEnableVideoEffect(long j2, boolean z);

    public static native int nativeGetAudioMixingCurrentPosition(long j2);

    public static native int nativeGetAudioMixingDuration(long j2);

    public static native long nativeGetAudioMixingManager(long j2);

    public static native int nativeGetAudioMixingStreamCachedFrameNum(long j2);

    public static native int nativeGetEffectVolume(long j2, int i2);

    public static native String nativeGetErrorDescription(int i2);

    public static native void nativeGetPeerOnlineStatus(long j2, String str);

    public static native String nativeGetSDKVersion();

    public static native int nativeHttpClientCallback(int i2, int i3, int i4, String str);

    public static native void nativeInvokeWorkerUninterruptibly(long j2, RTCRunnable rTCRunnable);

    public static native int nativeJoinRoom(long j2, String str, String str2, UserInfo userInfo, int i2);

    public static native int nativeJoinRoomWithRoomConfig(long j2, String str, String str2, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public static native int nativeLeaveRoom(long j2);

    public static native void nativeLogin(long j2, String str, String str2);

    public static native void nativeLogout(long j2);

    public static native void nativeMuteAllRemoteAudio(long j2, int i2);

    public static native int nativeMuteAllRemoteVideo(long j2, int i2);

    public static native void nativeMuteLocalAudio(long j2, int i2);

    public static native void nativeMuteLocalVideo(long j2, int i2);

    public static native void nativeMuteRemoteAudio(long j2, String str, int i2);

    public static native int nativeMuteRemoteVideo(long j2, String str, int i2);

    public static native int nativePauseAllEffects(long j2);

    public static native void nativePauseAllSubscribedStream(long j2, int i2);

    public static native int nativePauseAudioMixing(long j2);

    public static native int nativePauseEffect(long j2, int i2);

    public static native int nativePlayEffect(long j2, int i2, String str, boolean z, int i3, int i4);

    public static native int nativePreloadEffect(long j2, int i2, String str);

    public static native int nativePublish(long j2);

    public static native int nativePublishScreen(long j2);

    public static native boolean nativePullExternalAudioFrame(long j2, byte[] bArr, int i2);

    public static native boolean nativePushAudioMixingStreamData(long j2, byte[] bArr, int i2);

    public static native boolean nativePushExternalAudioFrame(long j2, byte[] bArr, int i2);

    public static native boolean nativePushExternalVideoFrame(long j2, VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j3);

    public static native boolean nativePushScreenFrame(long j2, VideoFrame videoFrame);

    public static native void nativeRegisterInternalEventObserver(long j2, RTCEngineInternalEventHandler rTCEngineInternalEventHandler);

    public static native void nativeRegisterLocalEncodedVideoFrameObserver(long j2, RTCLocalEncodedVideoFrameObserver rTCLocalEncodedVideoFrameObserver);

    public static native void nativeRegisterVideoFrameObserver(long j2, RTCVideoFrameObserver rTCVideoFrameObserver);

    public static native int nativeReportFeedback(String str);

    public static native int nativeResumeAllEffects(long j2);

    public static native void nativeResumeAllSubscribedStream(long j2, int i2);

    public static native int nativeResumeAudioMixing(long j2);

    public static native int nativeResumeEffect(long j2, int i2);

    public static native int nativeSendRoomBinaryMessage(long j2, byte[] bArr);

    public static native int nativeSendRoomMessage(long j2, String str);

    public static native long nativeSendServerBinaryMessage(long j2, byte[] bArr);

    public static native long nativeSendServerMessage(long j2, String str);

    public static native long nativeSendUserBinaryMessage(long j2, String str, byte[] bArr);

    public static native long nativeSendUserBinaryMessageOutsideRoom(long j2, String str, byte[] bArr);

    public static native long nativeSendUserMessage(long j2, String str, String str2);

    public static native long nativeSendUserMessageOutsideRoom(long j2, String str, String str2);

    public static native void nativeSetAppState(long j2, String str);

    public static native void nativeSetAudioFrameObserver(long j2, RTCAudioFrameObserver rTCAudioFrameObserver);

    public static native int nativeSetAudioMixingPosition(long j2, int i2);

    public static native int nativeSetAudioPlaybackDevice(long j2, int i2);

    public static native void nativeSetAudioPlayoutMixStream(long j2, boolean z, int i2, int i3);

    public static native int nativeSetAudioRecvMode(long j2, int i2);

    public static native void nativeSetAudioScenario(long j2, int i2);

    public static native int nativeSetAudioSendMode(long j2, int i2);

    public static native void nativeSetAudioVolumeIndicationInterval(long j2, int i2);

    public static native int nativeSetBusinessId(long j2, String str);

    public static native void nativeSetCustomizeEncryptHandler(long j2, RTCEncryptHandler rTCEncryptHandler);

    public static native int nativeSetDeviceId(String str);

    public static native int nativeSetEffectsVolume(long j2, int i2);

    public static native void nativeSetEnableSpeakerphoneForTest(long j2, boolean z);

    public static native void nativeSetEncryptInfo(long j2, int i2, String str);

    public static native int nativeSetEnv(int i2);

    public static native boolean nativeSetHardWareEncodeContext();

    public static native int nativeSetLocalVideoCanvas(long j2, int i2, View view, int i3);

    public static native int nativeSetLocalVideoMirrorMode(long j2, int i2);

    public static native int nativeSetLocalVideoSink(long j2, int i2, IVideoSink iVideoSink, int i3);

    public static native void nativeSetMetadataObserver(long j2, RTCMetadataObserver rTCMetadataObserver);

    public static native int nativeSetMirror(long j2, boolean z);

    public static native void nativeSetMixedAudioFrameParameters(long j2, int i2, int i3);

    public static native void nativeSetNetworkRequestIntercept(int i2);

    public static native void nativeSetNetworkType(long j2, int i2);

    public static native int nativeSetParameters(String str);

    public static native void nativeSetPlaybackAudioFrameParameters(long j2, int i2, int i3);

    public static native void nativeSetPlaybackVolume(long j2, int i2);

    public static native int nativeSetPublishFallbackOption(long j2, int i2);

    public static native void nativeSetRecordingAudioFrameParameters(long j2, int i2, int i3);

    public static native void nativeSetRecordingVolume(long j2, int i2);

    public static native void nativeSetRemoteAudioPlaybackVolume(long j2, String str, int i2);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j2, int i2);

    public static native int nativeSetRemoteUserPriority(long j2, String str, int i2);

    public static native int nativeSetRemoteVideoCanvas(long j2, String str, int i2, View view, int i3);

    public static native int nativeSetRemoteVideoSink(long j2, String str, String str2, int i2, IVideoSink iVideoSink, int i3);

    public static native int nativeSetRtcMode(long j2, int i2);

    public static native void nativeSetRuntimeParameters(long j2, String str);

    public static native void nativeSetServerParams(long j2, String str, String str2);

    public static native int nativeSetTeamId(long j2, String str);

    public static native void nativeSetUpperHttpClient(boolean z);

    public static native int nativeSetUserRole(long j2, int i2);

    public static native int nativeSetUserVisibility(long j2, boolean z);

    public static native void nativeSetVideoEffectAlgoModelPath(long j2, String str);

    public static native int nativeSetVideoEffectColorFilter(long j2, String str);

    public static native int nativeSetVideoEffectColorFilterIntensity(long j2, float f2);

    public static native int nativeSetVideoEffectNodes(long j2, String[] strArr);

    public static native void nativeSetVideoEncoderConfig(long j2, List<InternalVideoStreamDescription> list);

    public static native void nativeSetVideoInputType(long j2, int i2);

    public static native void nativeSetVideoSourceType(long j2, int i2);

    public static native int nativeSetVolumeOfEffect(long j2, int i2, int i3);

    public static native int nativeSetupLocalScreenSink(long j2, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideoSink(long j2, IVideoSink iVideoSink, String str);

    public static native void nativeStartASR(long j2, RTCASREngineEventHandler rTCASREngineEventHandler, String str, String str2, String str3, String str4, int i2, String str5);

    public static native void nativeStartAudioCapture(long j2);

    public static native int nativeStartAudioCaptureDeviceTest(long j2, int i2);

    public static native int nativeStartAudioMixing(long j2, String str, boolean z, boolean z2, int i2);

    public static native int nativeStartAudioPlaybackDeviceTest(long j2, String str);

    public static native int nativeStartFileRecording(long j2, int i2, String str, int i3, int i4);

    public static native void nativeStartLiveTranscoding(long j2, String str, LiveTranscodingObserver liveTranscodingObserver);

    public static native int nativeStartScreenSharing(long j2, Intent intent, InternalScreenSharingParams internalScreenSharingParams);

    public static native void nativeStartVideoCapture(long j2);

    public static native void nativeStopASR(long j2);

    public static native int nativeStopAllEffects(long j2);

    public static native void nativeStopAudioCapture(long j2);

    public static native int nativeStopAudioCaptureDeviceTest(long j2);

    public static native void nativeStopAudioMixing(long j2);

    public static native int nativeStopAudioPlaybackDeviceTest(long j2);

    public static native int nativeStopEffect(long j2, int i2);

    public static native void nativeStopFileRecording(long j2, int i2);

    public static native void nativeStopLiveTranscoding(long j2);

    public static native int nativeStopScreenSharing(long j2);

    public static native void nativeStopVideoCapture(long j2);

    public static native void nativeSubscribeStream(long j2, String str, boolean z, boolean z2, boolean z3, int i2);

    public static native void nativeSubscribeUserStream(long j2, String str, boolean z, int i2, int i3, int i4);

    public static native int nativeSwitchCamera(long j2, int i2);

    public static native int nativeUnPublish(long j2);

    public static native int nativeUnSubscribe(long j2, String str, boolean z);

    public static native int nativeUnloadAllEffects(long j2);

    public static native int nativeUnloadEffect(long j2, int i2);

    public static native int nativeUnpublishScreen(long j2);

    public static native int nativeUpdateAudioRecvRange(long j2, int i2, int i3);

    public static native void nativeUpdateCloudRending(long j2, String str);

    public static native void nativeUpdateLiveTranscoding(long j2, String str);

    public static native void nativeUpdateLoginToken(long j2, String str);

    public static native int nativeUpdateScreenSharingParameters(long j2, InternalScreenSharingParams internalScreenSharingParams);

    public static native int nativeUpdateSelfPosition(long j2, int i2, int i3, int i4);

    public static native int nativeUpdateToken(long j2, String str);

    public static native int nativeUpdateVideoEffectNode(long j2, String str, String str2, float f2);
}
