package com.ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.IRTCAudioDeviceManager;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.MediaInputType;
import com.ss.bytertc.engine.data.MirrorMode;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.RTCEglContextChecker;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.ScreenSharingParameters;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.util.List;
import org.json.JSONObject;
import org.webrtc.EglBase$$CC;

public abstract class RTCEngine {
    private static RTCEngineImpl mInstance;
    protected static RTCEglContextChecker mRtcEglContextChecker;
    public static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public abstract int EnableRangeAudio(boolean z);

    public abstract int SetAudioRecvMode(RangeAudioMode rangeAudioMode);

    public abstract int SetAudioSendMode(RangeAudioMode rangeAudioMode);

    public abstract int SetRtcMode(RtcMode rtcMode);

    public abstract int SetTeamId(String str);

    public abstract int UpdateAudioRecvRange(int i2, int i3);

    public abstract int UpdateSelfPosition(int i2, int i3, int i4);

    public abstract int adjustAudioMixingPlayoutVolume(int i2);

    public abstract int adjustAudioMixingPublishVolume(int i2);

    public abstract int adjustAudioMixingVolume(int i2);

    public abstract int checkVideoEffectLicense(Context context, String str);

    public abstract IRTCRoom createRoom(String str);

    public abstract void disableExternalAudioDevice();

    public abstract void enableAutoSubscribe(SubscribeMode subscribeMode, SubscribeMode subscribeMode2);

    public abstract void enableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2);

    public abstract void enableSubscribeLocalStream(boolean z);

    public abstract int enableVideoEffect(boolean z);

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract IAudioMixingManager getAudioMixingManager();

    public abstract int getAudioMixingStreamCachedFrameNum();

    public abstract int getEffectVolume(int i2);

    public abstract void getPeerOnlineStatus(String str);

    public abstract boolean isSpeakerphoneEnabled();

    public abstract int joinRoom(String str, String str2, UserInfo userInfo, ChannelProfile channelProfile);

    public abstract int joinRoom(String str, String str2, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public abstract int leaveRoom();

    public abstract void login(String str, String str2);

    public abstract void logout();

    public abstract void muteAllRemoteAudio(MuteState muteState);

    public abstract int muteAllRemoteVideo(MuteState muteState);

    public abstract void muteLocalAudio(MuteState muteState);

    public abstract void muteLocalVideo(MuteState muteState);

    public abstract void muteRemoteAudio(String str, MuteState muteState);

    public abstract int muteRemoteVideo(String str, MuteState muteState);

    public abstract int pauseAllEffects();

    public abstract void pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    public abstract int pauseAudioMixing();

    public abstract int pauseEffect(int i2);

    public abstract int playEffect(int i2, String str, boolean z, int i3, int i4);

    public abstract int preloadEffect(int i2, String str);

    public abstract int publish();

    public abstract int publishScreen();

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract boolean pushAudioMixingStreamData(byte[] bArr, int i2);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract boolean pushExternalVideoFrame(RTCVideoFrame rTCVideoFrame);

    public abstract boolean pushExternalVideoFrame(RTCVideoFrame rTCVideoFrame, boolean z);

    public abstract boolean pushScreenFrame(RTCVideoFrame rTCVideoFrame);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract void registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    public abstract void registerMetadataObserver(IMetadataObserver iMetadataObserver);

    public abstract int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    public abstract int resumeAllEffects();

    public abstract void resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i2);

    public abstract long sendRoomBinaryMessage(byte[] bArr);

    public abstract long sendRoomMessage(String str);

    public abstract long sendServerBinaryMessage(byte[] bArr);

    public abstract long sendServerMessage(String str);

    public abstract long sendUserBinaryMessage(String str, byte[] bArr);

    public abstract long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr);

    public abstract long sendUserMessage(String str, String str2);

    public abstract long sendUserMessageOutsideRoom(String str, String str2);

    public abstract int setAudioMixingPosition(int i2);

    public abstract int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice);

    public abstract void setAudioPlayoutMixStream(boolean z, int i2, int i3);

    public abstract void setAudioScenario(AudioScenarioType audioScenarioType);

    public abstract void setAudioVolumeIndicationInterval(int i2);

    public abstract int setBusinessId(String str);

    public abstract void setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler);

    public abstract int setEffectsVolume(int i2);

    public abstract void setEncryptInfo(int i2, String str);

    public abstract void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler);

    public abstract int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract int setLocalVideoMirrorMode(MirrorMode mirrorMode);

    public abstract void setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i2);

    public abstract boolean setMixedAudioFrameParameters(int i2, int i3);

    public abstract void setOnDestroyCompletedCallback(Runnable runnable);

    public abstract boolean setPlaybackAudioFrameParameters(int i2, int i3);

    public abstract void setPlaybackVolume(int i2);

    public abstract int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    public abstract boolean setRecordingAudioFrameParameters(int i2, int i3);

    public abstract void setRecordingVolume(int i2);

    public abstract void setRemoteAudioPlaybackVolume(String str, int i2);

    public abstract int setRemoteSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    public abstract int setRemoteUserPriority(String str, RemoteUserPriority remoteUserPriority);

    public abstract int setRemoteVideoCanvas(String str, StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract void setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i2);

    public abstract void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler);

    public abstract void setRuntimeParameters(JSONObject jSONObject);

    public abstract void setServerParams(String str, String str2);

    public abstract int setUserRole(ClientRole clientRole);

    public abstract int setUserVisibility(boolean z);

    public abstract void setVideoEffectAlgoModelPath(String str);

    public abstract int setVideoEffectColorFilter(String str);

    public abstract int setVideoEffectColorFilterIntensity(float f2);

    public abstract int setVideoEffectNodes(List<String> list);

    public abstract int setVideoEncoderConfig(List<VideoStreamDescription> list);

    public abstract int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode);

    public abstract void setVideoInputType(MediaInputType mediaInputType);

    public abstract void setVideoSourceType(VideoSourceType videoSourceType);

    public abstract int setVolumeOfEffect(int i2, int i3);

    public abstract int setupLocalVideoRender(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, String str, String str2);

    public abstract void startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler);

    public abstract void startAudioCapture();

    public abstract int startAudioMixing(String str, boolean z, boolean z2, int i2);

    public abstract void startCloudRendering(String str);

    public abstract int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig);

    public abstract void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver);

    public abstract int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters);

    public abstract void startVideoCapture();

    public abstract void stopASR();

    public abstract int stopAllEffects();

    public abstract void stopAudioCapture();

    public abstract int stopAudioMixing();

    public abstract void stopCloudRendering();

    public abstract int stopEffect(int i2);

    public abstract void stopFileRecording(StreamIndex streamIndex);

    public abstract void stopLiveTranscoding();

    public abstract int stopScreenSharing();

    public abstract void stopVideoCapture();

    public abstract void subscribeStream(String str, SubscribeConfig subscribeConfig);

    public abstract void subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig);

    public abstract int switchCamera(CameraId cameraId);

    public abstract void unSubscribe(String str, boolean z);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i2);

    public abstract int unpublish();

    public abstract int unpublishScreen();

    public abstract void updateCloudRendering(String str);

    public abstract void updateLiveTranscoding(LiveTranscoding liveTranscoding);

    public abstract void updateLoginToken(String str);

    public abstract int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters);

    public abstract int updateToken(String str);

    public abstract int updateVideoEffectNode(String str, String str2, float f2);

    public enum BackgroundMode {
        BACKGROUND_A(0),
        BACKGROUND_B(1),
        BLUR(2),
        NONE(3);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100787);
        }

        private BackgroundMode(int i2) {
            this.value = i2;
        }
    }

    public enum DivideModel {
        EFFECT(0),
        DEFAULT(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100791);
        }

        private DivideModel(int i2) {
            this.value = i2;
        }
    }

    public enum PublishFallbackOption {
        kPublishFallbackDisable(0),
        kPublishFallbackSimulcastSmallVideoOnly(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100795);
        }

        private PublishFallbackOption(int i2) {
            this.value = i2;
        }
    }

    public enum RangeAudioMode {
        RANGE_AUDIO_MODE_UNDEFINED(0),
        RANGE_AUDIO_MODE_TEAM(1),
        RANGE_AUDIO_MODE_WORLD(2);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100796);
        }

        private RangeAudioMode(int i2) {
            this.value = i2;
        }
    }

    public enum RecordingFileType {
        RECORDING_FILE_TYPE_AAC(0),
        RECORDING_FILE_TYPE_MP4(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100797);
        }

        public static RecordingFileType fromId(int i2) {
            RecordingFileType[] values = values();
            for (RecordingFileType recordingFileType : values) {
                if (recordingFileType.value() == i2) {
                    return recordingFileType;
                }
            }
            return null;
        }

        private RecordingFileType(int i2) {
            this.value = i2;
        }
    }

    public enum RecordingType {
        RECORD_AUDIO_ONLY(0),
        RECORD_VIDEO_ONLY(1),
        RECORD_VIDEO_AND_AUDIO(2);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100798);
        }

        public static RecordingType fromId(int i2) {
            RecordingType[] values = values();
            for (RecordingType recordingType : values) {
                if (recordingType.value() == i2) {
                    return recordingType;
                }
            }
            return null;
        }

        private RecordingType(int i2) {
            this.value = i2;
        }
    }

    public enum RemoteUserPriority {
        REMOTE_USER_PRIORITY_LOW(0),
        REMOTE_USER_PRIORITY_MEDIUM(100),
        REMOTE_USER_PRIORITY_HIGH(200);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100799);
        }

        private RemoteUserPriority(int i2) {
            this.value = i2;
        }
    }

    public enum RtcMode {
        RTC_MODE_GENERAL(0),
        RTC_MODE_LOCAL_AUDIO(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100800);
        }

        private RtcMode(int i2) {
            this.value = i2;
        }
    }

    public enum SubscribeFallbackOptions {
        SUBSCRIBE_FALLBACK_OPTIONS_DISABLED(0),
        SUBSCRIBE_FALLBACK_OPTIONS_STREAM_LOW(1),
        SUBSCRIBE_FALLBACK_OPTIONS_AUDIO_ONLY(2);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100802);
        }

        private SubscribeFallbackOptions(int i2) {
            this.value = i2;
        }
    }

    public enum SubscribeMode {
        AUTO_SUBSCRIBE_MODE(0),
        MANUAL_SUBSCRIBE_MODE(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100804);
        }

        private SubscribeMode(int i2) {
            this.value = i2;
        }
    }

    public static String getSdkVersion() {
        return RTCEngineImpl.getSdkVersion();
    }

    static {
        Covode.recordClassIndex(100785);
    }

    public static synchronized void destroy() {
        synchronized (RTCEngine.class) {
            RTCEngineImpl rTCEngineImpl = mInstance;
            if (rTCEngineImpl != null) {
                rTCEngineImpl.doDestroy();
                mInstance = null;
                mRtcNativeLibraryLoader = null;
                mRtcEglContextChecker = null;
                System.gc();
            }
        }
    }

    public enum ClientRole {
        CLIENT_ROLE_BROADCASTER,
        CLIENT_ROLE_SILENT_AUDIENCE;

        static {
            Covode.recordClassIndex(100789);
        }
    }

    public enum Env {
        ENV_PRODUCT,
        ENV_BOE,
        ENV_TEST;

        static {
            Covode.recordClassIndex(100792);
        }
    }

    public enum PauseResumeControlMediaType {
        RTC_PAUSE_RESUME_CONTROL_AUDIO,
        RTC_PAUSE_RESUME_CONTROL_VIDEO,
        RTC_PAUSE_RESUME_CONTROL_AUDIO_AND_VIDEO;

        static {
            Covode.recordClassIndex(100793);
        }
    }

    public enum RtcRenderViewType {
        RTC_SURFACEVIEW,
        RTC_TEXTUREVIEW;

        static {
            Covode.recordClassIndex(100801);
        }
    }

    public enum SubscribeMediaType {
        RTC_SUBSCRIBE_MEDIA_TYPE_NONE,
        RTC_SUBSCRIBE_MEDIA_TYPE_AUDIO_ONLY,
        RTC_SUBSCRIBE_MEDIA_TYPE_VIDEO_ONLY,
        RTC_SUBSCRIBE_MEDIA_TYPE_AUDIO_AND_VIDEO;

        static {
            Covode.recordClassIndex(100803);
        }
    }

    public enum AudioScenarioType {
        AUDIO_SCENARIO_MUSIC,
        AUDIO_SCENARIO_HIGHQUALITY_COMMUNICATION,
        AUDIO_SCENARIO_COMMUNICATION,
        AUDIO_SCENARIO_MEDIA,
        AUDIO_SCENARIO_GAME_STREAMING;

        static {
            Covode.recordClassIndex(100786);
        }
    }

    public enum ChannelProfile {
        CHANNEL_PROFILE_COMMUNICATION,
        CHANNEL_PROFILE_LIVE_BROADCASTING,
        CHANNEL_PROFILE_GAME,
        CHANNEL_PROFILE_CLOUD_GAME,
        CHANNEL_PROFILE_LOW_LATENCY;

        static {
            Covode.recordClassIndex(100788);
        }
    }

    public enum ConnectionState {
        CONNECTION_START,
        CONNECTION_STATE_DISCONNECTED,
        CONNECTION_STATE_CONNECTING,
        CONNECTION_STATE_CONNECTED,
        CONNECTION_STATE_RECONNECTING,
        CONNECTION_STATE_RECONNECTED;

        static {
            Covode.recordClassIndex(100790);
        }
    }

    public enum ProblemFeedback {
        PROBLEM_NONE(0, "No problem"),
        PROBLEM_OTHER_MSG(1, "Other Issues"),
        PROBLEM_AUDIO_NOT_CLEAR(2, "Sound is not clear"),
        PROBLEM_VIDEO_NOT_CLEAR(4, "Video is not clear"),
        PROBLEM_SYNC(8, "Audio and video is not synchronized"),
        PROBLEM_AUDIO_LAGGING(16, "Audio lagging"),
        PROBLEM_VIDEO_LAGGING(32, "Video lagging"),
        PROBLEM_CONNECT_FAILED(64, "Connect failed"),
        PROBLEM_AUDIO_DELAY(128, "Audio Delay"),
        PROBLEM_VIDEO_DELAY(256, "Video Delay"),
        PROBLEM_DISCONNECT(512, "Disconnect"),
        PROBLEM_NO_AUDIO(1024, "No audio"),
        PROBLEM_NO_VIDEO(2048, "No video"),
        PROBLEM_AUDIO_STRENGTH(4096, "Sound is either too loud or too quiet"),
        PROBLEM_ECHO(8192, "Echo Noise");
        
        public final String desc;
        public final int value;

        static {
            Covode.recordClassIndex(100794);
        }

        private ProblemFeedback(int i2, String str) {
            this.value = i2;
            this.desc = str;
        }
    }

    public static void setHttpClient(RTCHttpClient rTCHttpClient) {
        RTCEngineImpl.setRtcHttpClient(rTCHttpClient);
    }

    public static String getErrorDescription(int i2) {
        return RTCEngineImpl.getErrorDescription(i2);
    }

    public static int setDeviceId(String str) {
        return RTCEngineImpl.setDeviceId(str);
    }

    public static int setEnv(Env env) {
        return RTCEngineImpl.setEnv(env);
    }

    public static int setParameters(String str) {
        return RTCEngineImpl.setParameters(str);
    }

    public static void setRtcEglContextChecker(RTCEglContextChecker rTCEglContextChecker) {
        if (rTCEglContextChecker != null) {
            mRtcEglContextChecker = rTCEglContextChecker;
            EglBase$$CC.setEglContextChecker$$STATIC$$(rTCEglContextChecker);
        }
    }

    public static synchronized IRTCAudioDeviceManager createAudioDeviceManager(IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        IRTCAudioDeviceManager createAudioDeviceManager;
        synchronized (RTCEngine.class) {
            createAudioDeviceManager = RTCEngineImpl.createAudioDeviceManager(iRTCAudioDeviceEventHandler);
        }
        return createAudioDeviceManager;
    }

    public static synchronized void destroyEngine(RTCEngine rTCEngine) {
        synchronized (RTCEngine.class) {
            if (rTCEngine != null) {
                if (rTCEngine == mInstance) {
                    destroy();
                } else {
                    ((RTCEngineImpl) rTCEngine).doDestroy();
                    System.gc();
                }
            }
        }
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        LogUtil.i("RtcEngine", "set rtc native library loader".concat(String.valueOf(rTCNativeLibraryLoader)));
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler, null);
        }
        return createShared;
    }

    public static int feedback(Context context, int i2, int i3, String str) {
        return RTCEngineImpl.feedback(context, i2, i3, str);
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler, eGLContext);
        }
        return createShared;
    }

    protected static synchronized RTCEngine createShared(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj) {
        synchronized (RTCEngine.class) {
            if (context == null || str == null) {
                return null;
            }
            if (mInstance == null) {
                try {
                    mInstance = new RTCEngineImpl(context, str, iRTCEngineEventHandler, obj, null);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            return mInstance;
        }
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler, obj);
        }
        return createShared;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, javax.microedition.khronos.egl.EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler, eGLContext);
        }
        return createShared;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0013, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.ss.bytertc.engine.RTCEngine createEngine(android.content.Context r3, java.lang.String r4, com.ss.bytertc.engine.handler.IRTCEngineEventHandler r5, java.lang.Object r6, org.json.JSONObject r7) {
        /*
            java.lang.Class<com.ss.bytertc.engine.RTCEngine> r1 = com.ss.bytertc.engine.RTCEngine.class
            monitor-enter(r1)
            r0 = 0
            if (r3 == 0) goto L_0x0014
            if (r4 == 0) goto L_0x0014
            com.ss.bytertc.engine.engineimpl.RTCEngineImpl r2 = new com.ss.bytertc.engine.engineimpl.RTCEngineImpl     // Catch:{ IllegalStateException -> 0x0012, all -> 0x000f }
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IllegalStateException -> 0x0012, all -> 0x000f }
            monitor-exit(r1)
            return r2
        L_0x000f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0012:
            monitor-exit(r1)
            return r0
        L_0x0014:
            monitor-exit(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.RTCEngine.createEngine(android.content.Context, java.lang.String, com.ss.bytertc.engine.handler.IRTCEngineEventHandler, java.lang.Object, org.json.JSONObject):com.ss.bytertc.engine.RTCEngine");
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Env env, EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            setEnv(env);
            createShared = createShared(context, str, iRTCEngineEventHandler, eGLContext);
        }
        return createShared;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Env env, javax.microedition.khronos.egl.EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            setEnv(env);
            createShared = createShared(context, str, iRTCEngineEventHandler, eGLContext);
        }
        return createShared;
    }
}
