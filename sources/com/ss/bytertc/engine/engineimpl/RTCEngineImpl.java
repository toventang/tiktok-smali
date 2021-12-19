package com.ss.bytertc.engine.engineimpl;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.bytertc.base.utils.NetworkConnectChangeReceiver;
import com.ss.bytertc.base.utils.NetworkUtils;
import com.ss.bytertc.base.utils.RtcContextUtils;
import com.ss.bytertc.engine.AudioMixingManager;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.IRTCAudioDeviceManager;
import com.ss.bytertc.engine.IRTCRoom;
import com.ss.bytertc.engine.InternalScreenSharingParams;
import com.ss.bytertc.engine.InternalVideoStreamDescription;
import com.ss.bytertc.engine.NativeFunctions;
import com.ss.bytertc.engine.RTCAudioDeviceManager;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.RTCEngineEx;
import com.ss.bytertc.engine.RTCHttpClient;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.SubscribeVideoConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.ss.bytertc.engine.adapter.VideoSinkTask;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.MediaInputType;
import com.ss.bytertc.engine.data.MirrorMode;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RTCData;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioFrameObserver;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineEventHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCMetadataObserver;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IVideoSink;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.ScreenSharingParameters;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class RTCEngineImpl extends RTCEngineEx {
    private static RTCAudioDeviceManager mAudioDeviceManager = null;
    private static WeakReference<IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler> mAudioDeviceManagerEventHandler;
    private static String mDeviceId = "";
    private static boolean mLibraryLoaded;
    private static String mPackageName;
    private static RTCAudioDeviceEventHandler mRTCAudioDeviceManagerEventHandler = null;
    private static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    private static RTCHttpClient nativeHttpClient = null;
    private static RTCEngineImpl sRtcEngineInstance;
    private static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    private NetworkConnectChangeReceiver.Callback SetNetworkTypeCallback = new RTCEngineImpl$$Lambda$2(this);
    private AppMonitor.Callback appStateCallback = new RTCEngineImpl$$Lambda$1(this);
    private boolean isMultiRoom;
    private String mAppId;
    private boolean mAudioEnabled = true;
    private WeakReference<IAudioFrameObserver> mAudioFrameObserver;
    private AudioMixingManager mAudioMixingManager;
    private BroadcastReceiver mBroadcastReceiver;
    private int mChannelProfile;
    private int mClientRole = 2;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private boolean mEnableTranscode;
    private RTCEngineEventHandler mEngineEventHandler;
    private RTCEngineInternalEventHandler mEngineInternalEventHandler;
    private boolean mIsFront = true;
    private boolean mIsUseCustomEglEnv;
    private boolean mIsVideoMirror = true;
    private LiveTranscoding mLiveTranscoding;
    private ILiveTranscodingObserver mLiveTranscodingObserver;
    private WeakReference<ILocalEncodedVideoFrameObserver> mLocalEncodedVideoFrameObserver;
    private LogUtil.LoggerSink mLoggerSink = new RTCEngineImpl$$Lambda$0(this);
    private WeakReference<IMetadataObserver> mMetadataObserver;
    private long mNativeEngine = -1;
    private Runnable mOnDestroyCompletedCallback;
    private boolean mPushMode = true;
    private RTCASREngineEventHandler mRTCASREngineEventHandler;
    private boolean mRequestSoftwareEncoder;
    private String mRoom;
    private EglBase mRootEglBase;
    private RTCAudioFrameObserver mRtcAudioFrameObserver;
    private WeakReference<IRTCEngineEventHandler> mRtcEngineHandler;
    private RTCLocalEncodedVideoFrameObserver mRtcLocalEncodedVideoFrameObserver;
    private RTCMetadataObserver mRtcMetadataObserver;
    private RTCVideoFrameObserver mRtcVideoFrameObserver;
    private VideoFrameConverter mScreenFrameConverter;
    private String mSessionId;
    private State mState;
    private String mToken;
    private LiveTranscodingObserver mTranscodingObserver;
    private boolean mUseExtTexture;
    private boolean mUseExtVideoSource;
    private String mUser;
    private boolean mVideoEnabled = true;
    private VideoFrameConverter mVideoFrameConverter;
    private VideoSinkTask mVideoSinkTask;

    public static int com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int replaceBackground(RTCEngine.BackgroundMode backgroundMode, RTCEngine.DivideModel divideModel) {
        return 0;
    }

    public static class RtcHttpCallbackImpl implements RTCHttpClient.RtcHttpCallback {
        private int callbackId;
        private int clientId;

        static {
            Covode.recordClassIndex(100890);
        }

        public int getCallbackId() {
            return this.callbackId;
        }

        public void setCallbackId(int i2) {
            this.callbackId = i2;
        }

        public void setClientId(int i2) {
            this.clientId = i2;
        }

        @Override // com.ss.bytertc.engine.RTCHttpClient.RtcHttpCallback
        public void run(int i2, String str) {
            MethodCollector.i(7971);
            NativeFunctions.nativeHttpClientCallback(this.callbackId, this.clientId, i2, str);
            MethodCollector.o(7971);
        }
    }

    public ILiveTranscodingObserver getLiveTranscodingObserver() {
        return this.mLiveTranscodingObserver;
    }

    public String getLocalUser() {
        return this.mUser;
    }

    public String getRoomName() {
        return this.mRoom;
    }

    public VideoSinkTask getVideoSinkTask() {
        return this.mVideoSinkTask;
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doDestroy$3$RTCEngineImpl() {
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler getAudioDeviceManagerEvent() {
        return mAudioDeviceManagerEventHandler.get();
    }

    public IAudioFrameObserver getAudioFrameObserver() {
        return this.mAudioFrameObserver.get();
    }

    public ILocalEncodedVideoFrameObserver getEncodedVideoFrameObserver() {
        return this.mLocalEncodedVideoFrameObserver.get();
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver.get();
    }

    public IRTCEngineEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler.get();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doDestroy$4$RTCEngineImpl() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.mRootEglBase = null;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopScreenSharing() {
        MethodCollector.i(7642);
        int nativeStopScreenSharing = NativeFunctions.nativeStopScreenSharing(this.mNativeEngine);
        MethodCollector.o(7642);
        return nativeStopScreenSharing;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void disableExternalAudioDevice() {
        MethodCollector.i(7106);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, disableExternalAudioDevice failed.");
            MethodCollector.o(7106);
            return;
        }
        NativeFunctions.nativeDisableExternalAudioDevice(j2);
        MethodCollector.o(7106);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean isSpeakerphoneEnabled() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO)).isSpeakerphoneOn();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void logout() {
        MethodCollector.i(7945);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(7945);
            return;
        }
        NativeFunctions.nativeLogout(j2);
        MethodCollector.o(7945);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopASR() {
        MethodCollector.i(11328);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopASR");
            MethodCollector.o(11328);
            return;
        }
        NativeFunctions.nativeStopASR(j2);
        MethodCollector.o(11328);
    }

    /* access modifiers changed from: package-private */
    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY;

        static {
            Covode.recordClassIndex(100891);
        }
    }

    static {
        Covode.recordClassIndex(100882);
        loadSoFile();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getAudioMixingCurrentPosition() {
        MethodCollector.i(8577);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingCurrentPosition failed.");
            MethodCollector.o(8577);
            return -1;
        }
        int nativeGetAudioMixingCurrentPosition = NativeFunctions.nativeGetAudioMixingCurrentPosition(j2);
        MethodCollector.o(8577);
        return nativeGetAudioMixingCurrentPosition;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getAudioMixingDuration() {
        MethodCollector.i(8576);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingDuration failed.");
            MethodCollector.o(8576);
            return -1;
        }
        int nativeGetAudioMixingDuration = NativeFunctions.nativeGetAudioMixingDuration(j2);
        MethodCollector.o(8576);
        return nativeGetAudioMixingDuration;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public IAudioMixingManager getAudioMixingManager() {
        MethodCollector.i(11486);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingManager");
            MethodCollector.o(11486);
            return null;
        }
        AudioMixingManager audioMixingManager = this.mAudioMixingManager;
        if (audioMixingManager != null) {
            MethodCollector.o(11486);
            return audioMixingManager;
        }
        long nativeGetAudioMixingManager = NativeFunctions.nativeGetAudioMixingManager(j2);
        if (nativeGetAudioMixingManager == 0) {
            LogUtil.e("RtcEngineImpl", "getAudioMixingManager failed");
            MethodCollector.o(11486);
            return null;
        }
        AudioMixingManager audioMixingManager2 = new AudioMixingManager(nativeGetAudioMixingManager);
        this.mAudioMixingManager = audioMixingManager2;
        MethodCollector.o(11486);
        return audioMixingManager2;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getAudioMixingStreamCachedFrameNum() {
        MethodCollector.i(8240);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingStreamCachedFrameNum failed.");
            MethodCollector.o(8240);
            return -1;
        }
        int nativeGetAudioMixingStreamCachedFrameNum = NativeFunctions.nativeGetAudioMixingStreamCachedFrameNum(j2);
        MethodCollector.o(8240);
        return nativeGetAudioMixingStreamCachedFrameNum;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pauseAllEffects() {
        MethodCollector.i(10441);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseAllEffects failed.");
            MethodCollector.o(10441);
            return -1;
        }
        int nativePauseAllEffects = NativeFunctions.nativePauseAllEffects(j2);
        MethodCollector.o(10441);
        return nativePauseAllEffects;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pauseAudioMixing() {
        MethodCollector.i(8571);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseAudioMixing failed.");
            MethodCollector.o(8571);
            return -1;
        }
        int nativePauseAudioMixing = NativeFunctions.nativePauseAudioMixing(j2);
        MethodCollector.o(8571);
        return nativePauseAudioMixing;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int publish() {
        MethodCollector.i(8560);
        LogUtil.d("RtcEngineImpl", "publish");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publish failed.");
            MethodCollector.o(8560);
            return -1;
        }
        NativeFunctions.nativePublish(j2);
        MethodCollector.o(8560);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int publishScreen() {
        MethodCollector.i(7378);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
            MethodCollector.o(7378);
            return -1;
        }
        int nativePublishScreen = NativeFunctions.nativePublishScreen(j2);
        MethodCollector.o(7378);
        return nativePublishScreen;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int resumeAllEffects() {
        MethodCollector.i(10601);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeAllEffects failed.");
            MethodCollector.o(10601);
            return -1;
        }
        int nativeResumeAllEffects = NativeFunctions.nativeResumeAllEffects(j2);
        MethodCollector.o(10601);
        return nativeResumeAllEffects;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int resumeAudioMixing() {
        MethodCollector.i(8572);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeAudioMixing failed.");
            MethodCollector.o(8572);
            return -1;
        }
        int nativeResumeAudioMixing = NativeFunctions.nativeResumeAudioMixing(j2);
        MethodCollector.o(8572);
        return nativeResumeAudioMixing;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startAudioCapture() {
        MethodCollector.i(8384);
        LogUtil.d("RtcEngineImpl", "startAudioCapture");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startAudioCapture failed.");
            MethodCollector.o(8384);
            return;
        }
        NativeFunctions.nativeStartAudioCapture(j2);
        MethodCollector.o(8384);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startVideoCapture() {
        MethodCollector.i(8218);
        LogUtil.d("RtcEngineImpl", "startVideoCapture");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startVideoCapture failed.");
            MethodCollector.o(8218);
            return;
        }
        NativeFunctions.nativeStartVideoCapture(j2);
        MethodCollector.o(8218);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopAllEffects() {
        MethodCollector.i(10126);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopAllEffects failed.");
            MethodCollector.o(10126);
            return -1;
        }
        int nativeStopAllEffects = NativeFunctions.nativeStopAllEffects(j2);
        MethodCollector.o(10126);
        return nativeStopAllEffects;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopAudioCapture() {
        MethodCollector.i(8387);
        LogUtil.d("RtcEngineImpl", "stopAudioCapture");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopAudioCapture failed.");
            MethodCollector.o(8387);
            return;
        }
        NativeFunctions.nativeStopAudioCapture(j2);
        MethodCollector.o(8387);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopAudioMixing() {
        MethodCollector.i(8567);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopAudioMixing failed.");
            MethodCollector.o(8567);
            return -1;
        }
        NativeFunctions.nativeStopAudioMixing(j2);
        MethodCollector.o(8567);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopCloudRendering() {
        MethodCollector.i(10681);
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopCloudRendering failed.");
            MethodCollector.o(10681);
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("stopped", "");
        if (cloudRenderingInfo == null) {
            MethodCollector.o(10681);
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
        MethodCollector.o(10681);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopLiveTranscoding() {
        MethodCollector.i(6573);
        LogUtil.d("RtcEngineImpl", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, disableLiveTranscoding failed.");
            MethodCollector.o(6573);
            return;
        }
        NativeFunctions.nativeStopLiveTranscoding(j2);
        MethodCollector.o(6573);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopVideoCapture() {
        MethodCollector.i(8269);
        LogUtil.d("RtcEngineImpl", "stopVideoCapture");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopVideoCapture failed.");
            MethodCollector.o(8269);
            return;
        }
        NativeFunctions.nativeStopVideoCapture(j2);
        MethodCollector.o(8269);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unloadAllEffects() {
        MethodCollector.i(10295);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unloadAllEffects failed.");
            MethodCollector.o(10295);
            return -1;
        }
        int nativeUnloadAllEffects = NativeFunctions.nativeUnloadAllEffects(j2);
        MethodCollector.o(10295);
        return nativeUnloadAllEffects;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unpublish() {
        MethodCollector.i(8563);
        LogUtil.d("RtcEngineImpl", "unpublish");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unpublish failed.");
            MethodCollector.o(8563);
            return -1;
        }
        NativeFunctions.nativeUnPublish(j2);
        MethodCollector.o(8563);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unpublishScreen() {
        MethodCollector.i(7442);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unpublishScreen failed.");
            MethodCollector.o(7442);
            return -1;
        }
        int nativeUnpublishScreen = NativeFunctions.nativeUnpublishScreen(j2);
        MethodCollector.o(7442);
        return nativeUnpublishScreen;
    }

    public static String getSdkVersion() {
        MethodCollector.i(12212);
        if (!mLibraryLoaded) {
            MethodCollector.o(12212);
            return "";
        }
        try {
            NativeFunctions.nativeGetSDKVersion();
            String nativeGetSDKVersion = NativeFunctions.nativeGetSDKVersion();
            MethodCollector.o(12212);
            return nativeGetSDKVersion;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("rtc loader info:" + sRtcLoaderInfo.toString() + " exception info:" + e2.getStackTrace().toString());
            MethodCollector.o(12212);
            throw unsatisfiedLinkError;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int leaveRoom() {
        IRTCEngineEventHandler iRTCEngineEventHandler;
        MethodCollector.i(12055);
        LogUtil.d("RtcEngineImpl", "leaveChannel");
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, leaveChannel failed.");
            MethodCollector.o(12055);
            return -1;
        }
        this.mState = State.IDLE;
        this.mRoom = "";
        this.mUser = "";
        this.mSessionId = "";
        this.mToken = "";
        WeakReference<IRTCEngineEventHandler> weakReference = this.mRtcEngineHandler;
        if (!(weakReference == null || (iRTCEngineEventHandler = weakReference.get()) == null)) {
            iRTCEngineEventHandler.onLeaveRoom(null);
        }
        NativeFunctions.nativeLeaveRoom(this.mNativeEngine);
        MethodCollector.o(12055);
        return 0;
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else {
            if (mRtcNativeLibraryLoader != null) {
                mLibraryLoaded = true;
                boolean load = mRtcNativeLibraryLoader.load("byteaudio") & true;
                mLibraryLoaded = load;
                boolean load2 = load & mRtcNativeLibraryLoader.load("volcenginertc");
                mLibraryLoaded = load2;
                if (load2) {
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                } else {
                    mRtcNativeLibraryListener.onLoadError("volcenginertc");
                }
                sRtcLoaderInfo.setLoaderClassName(mRtcNativeLibraryLoader.getClass().getSimpleName());
            } else {
                try {
                    com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("byteaudio");
                    com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("volcenginertc");
                    mLibraryLoaded = true;
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                } catch (UnsatisfiedLinkError e2) {
                    LogUtil.e("RtcEngineImpl", "Failed to load native library: volcenginertc", e2);
                }
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
            }
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStamp(System.currentTimeMillis());
            sRtcLoaderInfo.setSdkVersion(RTCEngine.getSdkVersion());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    public void doDestroy() {
        MethodCollector.i(8152);
        LogUtil.d("RtcEngineImpl", "destroy RtcEngineImpl.");
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, no need to destroy now.");
            MethodCollector.o(8152);
            return;
        }
        this.mState = State.DESTORY;
        NetworkUtils.unregisterReceiver(this.mContext, this.mBroadcastReceiver);
        this.mBroadcastReceiver = null;
        NativeFunctions.nativeDestroyEngine(this.mNativeEngine);
        NativeFunctions.nativeClearHardWareEncodeContext();
        this.mNativeEngine = -1;
        this.mIsFront = true;
        this.mIsVideoMirror = true;
        this.mVideoFrameConverter.dispose();
        this.mVideoFrameConverter = null;
        this.mScreenFrameConverter.dispose();
        this.mScreenFrameConverter = null;
        new Handler(Looper.getMainLooper()).post(new RTCEngineImpl$$Lambda$4(this));
        AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new RTCEngineImpl$$Lambda$5(this));
        HandlerThread handlerThread = this.mEglThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        LogUtil.setLoggerSink(null);
        MethodCollector.o(8152);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$AudioScenarioType;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$Env;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$PauseResumeControlMediaType;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$SubscribeMediaType;

        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|64) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|64) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|64) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|64) */
        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|64) */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0107 */
        static {
            /*
            // Method dump skipped, instructions count: 274
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.engineimpl.RTCEngineImpl.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushExternalVideoFrame(RTCVideoFrame rTCVideoFrame) {
        return pushExternalVideoFrame(rTCVideoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        this.mEngineInternalEventHandler.setInternalEventHandler(iRTCEngineInternalEventHandler);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(List<VideoStreamDescription> list) {
        return setVideoEncoderConfig(list, VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE);
    }

    public static void com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static Context com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler) {
        LogUtil.d("RtcEngineImpl", "setRtcEngineEventHandler");
        this.mRtcEngineHandler = new WeakReference<>(iRTCEngineEventHandler);
    }

    public static File com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static IRTCAudioDeviceManager createAudioDeviceManager(IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        mAudioDeviceManagerEventHandler = new WeakReference<>(iRTCAudioDeviceEventHandler);
        RTCAudioDeviceManager rTCAudioDeviceManager = mAudioDeviceManager;
        if (rTCAudioDeviceManager != null) {
            return rTCAudioDeviceManager;
        }
        mRTCAudioDeviceManagerEventHandler = new RTCAudioDeviceEventHandler();
        RTCAudioDeviceManager rTCAudioDeviceManager2 = new RTCAudioDeviceManager(mRTCAudioDeviceManagerEventHandler);
        mAudioDeviceManager = rTCAudioDeviceManager2;
        return rTCAudioDeviceManager2;
    }

    public static String getErrorDescription(int i2) {
        String str;
        MethodCollector.i(12215);
        if (i2 != -1072) {
            str = NativeFunctions.nativeGetErrorDescription(i2);
        } else {
            str = "Failed to load library.";
        }
        MethodCollector.o(12215);
        return str;
    }

    public static int setDeviceId(String str) {
        MethodCollector.i(8212);
        if (str == null) {
            MethodCollector.o(8212);
            return -1;
        }
        mDeviceId = str;
        if (!mLibraryLoaded) {
            MethodCollector.o(8212);
            return -1;
        }
        int nativeSetDeviceId = NativeFunctions.nativeSetDeviceId(str);
        MethodCollector.o(8212);
        return nativeSetDeviceId;
    }

    public static void setRtcHttpClient(RTCHttpClient rTCHttpClient) {
        MethodCollector.i(8495);
        if (mLibraryLoaded) {
            nativeHttpClient = rTCHttpClient;
            NativeFunctions.nativeSetUpperHttpClient(true);
        }
        MethodCollector.o(8495);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void getPeerOnlineStatus(String str) {
        MethodCollector.i(8125);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8125);
            return;
        }
        NativeFunctions.nativeGetPeerOnlineStatus(j2, str);
        MethodCollector.o(8125);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$1$RTCEngineImpl(int i2) {
        String str;
        MethodCollector.i(11824);
        long j2 = this.mNativeEngine;
        if (i2 == 1) {
            str = "active";
        } else {
            str = "background";
        }
        NativeFunctions.nativeSetAppState(j2, str);
        MethodCollector.o(11824);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$2$RTCEngineImpl(Object obj) {
        MethodCollector.i(11822);
        initEglContext(obj);
        this.mRootEglBase.createDummyPbufferSurface();
        this.mRootEglBase.makeCurrent();
        NativeFunctions.nativeSetHardWareEncodeContext();
        this.mRootEglBase.detachCurrent();
        MethodCollector.o(11822);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$5$RTCEngineImpl(int i2) {
        MethodCollector.i(11658);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetNetworkType failed.");
            MethodCollector.o(11658);
            return;
        }
        NativeFunctions.nativeSetNetworkType(j2, i2);
        MethodCollector.o(11658);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendServerBinaryMessage(byte[] bArr) {
        MethodCollector.i(8139);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8139);
            return -1;
        }
        long nativeSendServerBinaryMessage = NativeFunctions.nativeSendServerBinaryMessage(j2, bArr);
        MethodCollector.o(8139);
        return nativeSendServerBinaryMessage;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendServerMessage(String str) {
        MethodCollector.i(8136);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8136);
            return -1;
        }
        long nativeSendServerMessage = NativeFunctions.nativeSendServerMessage(j2, str);
        MethodCollector.o(8136);
        return nativeSendServerMessage;
    }

    public void setAudioMode(int i2) {
        AudioManager audioManager;
        Context context = this.mContext;
        if (context != null && (audioManager = (AudioManager) com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO)) != null && audioManager.getMode() != i2) {
            audioManager.setMode(i2);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler) {
        MethodCollector.i(10037);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setCustomizeEncryptHandler failed.");
            MethodCollector.o(10037);
            return;
        }
        NativeFunctions.nativeSetCustomizeEncryptHandler(j2, rTCEncryptHandler);
        MethodCollector.o(10037);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setLocalVideoMirrorMode(MirrorMode mirrorMode) {
        boolean z;
        MethodCollector.i(11578);
        if (mirrorMode != MirrorMode.MIRROR_MODE_OFF) {
            z = true;
        } else {
            z = false;
        }
        this.mIsVideoMirror = z;
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.o(11578);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setPlaybackVolume(int i2) {
        MethodCollector.i(8570);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPlaybackVolume failed.");
            MethodCollector.o(8570);
            return;
        }
        NativeFunctions.nativeSetPlaybackVolume(j2, i2);
        MethodCollector.o(8570);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRecordingVolume(int i2) {
        MethodCollector.i(8569);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRecordingVolume failed.");
            MethodCollector.o(8569);
            return;
        }
        NativeFunctions.nativeSetRecordingVolume(j2, i2);
        MethodCollector.o(8569);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoEffectAlgoModelPath(String str) {
        MethodCollector.i(10198);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEffectAlgoModelPath failed.");
            MethodCollector.o(10198);
            return;
        }
        NativeFunctions.nativeSetVideoEffectAlgoModelPath(j2, str);
        MethodCollector.o(10198);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateLoginToken(String str) {
        MethodCollector.i(8006);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8006);
            return;
        }
        NativeFunctions.nativeUpdateLoginToken(j2, str);
        MethodCollector.o(8006);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters) {
        MethodCollector.i(7561);
        int nativeUpdateScreenSharingParameters = NativeFunctions.nativeUpdateScreenSharingParameters(this.mNativeEngine, new InternalScreenSharingParams(screenSharingParameters));
        MethodCollector.o(7561);
        return nativeUpdateScreenSharingParameters;
    }

    private long getNativeEglHandle(RTCVideoFrame rTCVideoFrame) {
        if (rTCVideoFrame == null || rTCVideoFrame.eglContext14 == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return rTCVideoFrame.eglContext14.getNativeHandle();
        }
        int i2 = Build.VERSION.SDK_INT;
        return (long) rTCVideoFrame.eglContext14.getHandle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int setEnv(com.ss.bytertc.engine.RTCEngine.Env r5) {
        /*
            r4 = 8215(0x2017, float:1.1512E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            boolean r0 = com.ss.bytertc.engine.engineimpl.RTCEngineImpl.mLibraryLoaded
            if (r0 != 0) goto L_0x000e
            r0 = -1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x000e:
            int[] r1 = com.ss.bytertc.engine.engineimpl.RTCEngineImpl.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$Env
            int r0 = r5.ordinal()
            r3 = r1[r0]
            r2 = 2
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x0020
            if (r3 == r2) goto L_0x0029
            r0 = 3
            if (r3 == r0) goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            int r0 = com.ss.bytertc.engine.NativeFunctions.nativeSetEnv(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0029:
            r2 = 1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.engineimpl.RTCEngineImpl.setEnv(com.ss.bytertc.engine.RTCEngine$Env):int");
    }

    public static int setParameters(String str) {
        MethodCollector.i(8545);
        if (!mLibraryLoaded) {
            MethodCollector.o(8545);
            return -1;
        } else if (str == null || str.isEmpty()) {
            MethodCollector.o(8545);
            return -1;
        } else {
            int nativeSetParameters = NativeFunctions.nativeSetParameters(str);
            MethodCollector.o(8545);
            return nativeSetParameters;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int EnableRangeAudio(boolean z) {
        MethodCollector.i(9169);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, EnableRangeAudio failed.");
            MethodCollector.o(9169);
            return -1;
        }
        int nativeEnableRangeAudio = NativeFunctions.nativeEnableRangeAudio(j2, z);
        MethodCollector.o(9169);
        return nativeEnableRangeAudio;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int SetAudioRecvMode(RTCEngine.RangeAudioMode rangeAudioMode) {
        MethodCollector.i(8515);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetAudioRecvMode failed.");
            MethodCollector.o(8515);
            return -1;
        }
        int nativeSetAudioRecvMode = NativeFunctions.nativeSetAudioRecvMode(j2, rangeAudioMode.value());
        MethodCollector.o(8515);
        return nativeSetAudioRecvMode;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int SetAudioSendMode(RTCEngine.RangeAudioMode rangeAudioMode) {
        MethodCollector.i(8513);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetAudioSendMode failed.");
            MethodCollector.o(8513);
            return -1;
        }
        int nativeSetAudioSendMode = NativeFunctions.nativeSetAudioSendMode(j2, rangeAudioMode.value());
        MethodCollector.o(8513);
        return nativeSetAudioSendMode;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int SetRtcMode(RTCEngine.RtcMode rtcMode) {
        MethodCollector.i(8510);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetRtcMode failed.");
            MethodCollector.o(8510);
            return -1;
        }
        int nativeSetRtcMode = NativeFunctions.nativeSetRtcMode(j2, rtcMode.value());
        MethodCollector.o(8510);
        return nativeSetRtcMode;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int SetTeamId(String str) {
        MethodCollector.i(8793);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetTeamId failed.");
            MethodCollector.o(8793);
            return -1;
        }
        int nativeSetTeamId = NativeFunctions.nativeSetTeamId(j2, str);
        MethodCollector.o(8793);
        return nativeSetTeamId;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingPlayoutVolume(int i2) {
        MethodCollector.i(8903);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPlayoutVolume failed.");
            MethodCollector.o(8903);
            return -1;
        }
        int nativeAdjustAudioMixingPlayoutVolume = NativeFunctions.nativeAdjustAudioMixingPlayoutVolume(j2, i2);
        MethodCollector.o(8903);
        return nativeAdjustAudioMixingPlayoutVolume;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingPublishVolume(int i2) {
        MethodCollector.i(8905);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPublishVolume failed.");
            MethodCollector.o(8905);
            return -1;
        }
        int nativeAdjustAudioMixingPublishVolume = NativeFunctions.nativeAdjustAudioMixingPublishVolume(j2, i2);
        MethodCollector.o(8905);
        return nativeAdjustAudioMixingPublishVolume;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingVolume(int i2) {
        MethodCollector.i(8575);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingVolume failed.");
            MethodCollector.o(8575);
            return -1;
        }
        int nativeAdjustAudioMixingVolume = NativeFunctions.nativeAdjustAudioMixingVolume(j2, i2);
        MethodCollector.o(8575);
        return nativeAdjustAudioMixingVolume;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public IRTCRoom createRoom(String str) {
        MethodCollector.i(8509);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, createRoom failed.");
            MethodCollector.o(8509);
            return null;
        }
        long nativeCreateRtcRoom = NativeFunctions.nativeCreateRtcRoom(j2, str);
        if (nativeCreateRtcRoom == 0) {
            LogUtil.e("RtcEngineImpl", "createRoom faildd, native room is invalid");
            MethodCollector.o(8509);
            return null;
        }
        RTCRoom rTCRoom = new RTCRoom(str, nativeCreateRtcRoom, this);
        this.isMultiRoom = true;
        MethodCollector.o(8509);
        return rTCRoom;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableSubscribeLocalStream(boolean z) {
        MethodCollector.i(6592);
        LogUtil.d("RtcEngineImpl", "enableSubscribeLocalStream: ".concat(String.valueOf(z)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableSubscribeLocalStream failed.");
            MethodCollector.o(6592);
            return;
        }
        NativeFunctions.nativeEnableSubscribeLocalStream(j2, z);
        MethodCollector.o(6592);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int enableVideoEffect(boolean z) {
        MethodCollector.i(10199);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableVideoEffect failed.");
            MethodCollector.o(10199);
            return 1000;
        }
        int nativeEnableVideoEffect = NativeFunctions.nativeEnableVideoEffect(j2, z);
        MethodCollector.o(10199);
        return nativeEnableVideoEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getEffectVolume(int i2) {
        MethodCollector.i(8906);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getEffectVolume failed.");
            MethodCollector.o(8906);
            return -1;
        }
        int nativeGetEffectVolume = NativeFunctions.nativeGetEffectVolume(j2, i2);
        MethodCollector.o(8906);
        return nativeGetEffectVolume;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteAllRemoteAudio(MuteState muteState) {
        MethodCollector.i(12504);
        LogUtil.d("RtcEngineImpl", "muteAllRemoteAudio: " + muteState.value());
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudio failed.");
            MethodCollector.o(12504);
            return;
        }
        NativeFunctions.nativeMuteAllRemoteAudio(j2, muteState.value());
        MethodCollector.o(12504);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int muteAllRemoteVideo(MuteState muteState) {
        boolean z;
        MethodCollector.i(6336);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.d("RtcEngineImpl", "muteAllRemoteVideoStreams: ".concat(String.valueOf(z)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAllRemoteVideoStreams failed.");
            MethodCollector.o(6336);
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteVideo(j2, muteState.value());
        MethodCollector.o(6336);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteLocalAudio(MuteState muteState) {
        MethodCollector.i(12364);
        LogUtil.d("RtcEngineImpl", "muteLocalAudio " + muteState.value());
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteLocalAudio failed.");
            MethodCollector.o(12364);
            return;
        }
        NativeFunctions.nativeMuteLocalAudio(j2, muteState.value());
        MethodCollector.o(12364);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteLocalVideo(MuteState muteState) {
        MethodCollector.i(6261);
        LogUtil.d("RtcEngineImpl", "muteLocalVideo: " + muteState.toString());
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteLocalVideoStream failed.");
        }
        NativeFunctions.nativeMuteLocalVideo(this.mNativeEngine, muteState.value());
        MethodCollector.o(6261);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pauseEffect(int i2) {
        MethodCollector.i(9802);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseEffect failed.");
            MethodCollector.o(9802);
            return -1;
        }
        int nativePauseEffect = NativeFunctions.nativePauseEffect(j2, i2);
        MethodCollector.o(9802);
        return nativePauseEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.i(7303);
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
            MethodCollector.o(7303);
            return -1;
        } else if (NativeFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.o(7303);
            return 0;
        } else {
            MethodCollector.o(7303);
            return -2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.i(7200);
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
            MethodCollector.o(7200);
            return -1;
        } else if (NativeFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.o(7200);
            return 0;
        } else {
            MethodCollector.o(7200);
            return -2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushScreenFrame(RTCVideoFrame rTCVideoFrame) {
        MethodCollector.i(7518);
        VideoFrameConverter videoFrameConverter = this.mScreenFrameConverter;
        if (videoFrameConverter != null) {
            VideoFrame convert2I420Frame = videoFrameConverter.convert2I420Frame(rTCVideoFrame);
            if (convert2I420Frame != null) {
                long j2 = this.mNativeEngine;
                if (j2 == -1) {
                    LogUtil.e("RtcEngineImpl", "native engine is invalid, pushScreenFrame failed.");
                    MethodCollector.o(7518);
                    return false;
                }
                boolean nativePushScreenFrame = NativeFunctions.nativePushScreenFrame(j2, convert2I420Frame);
                convert2I420Frame.release();
                MethodCollector.o(7518);
                return nativePushScreenFrame;
            }
            MethodCollector.o(7518);
            return false;
        }
        MethodCollector.o(7518);
        return false;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        MethodCollector.i(10755);
        this.mAudioFrameObserver = new WeakReference<>(iAudioFrameObserver);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerAudioFrameObserver failed.");
            MethodCollector.o(10755);
            return -1;
        }
        if (iAudioFrameObserver == null) {
            NativeFunctions.nativeSetAudioFrameObserver(j2, null);
        } else {
            NativeFunctions.nativeSetAudioFrameObserver(j2, this.mRtcAudioFrameObserver);
        }
        MethodCollector.o(10755);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        MethodCollector.i(10921);
        this.mLocalEncodedVideoFrameObserver = new WeakReference<>(iLocalEncodedVideoFrameObserver);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerAudioFrameObserver failed.");
            MethodCollector.o(10921);
        } else if (iLocalEncodedVideoFrameObserver == null) {
            NativeFunctions.nativeRegisterLocalEncodedVideoFrameObserver(j2, null);
            MethodCollector.o(10921);
        } else {
            NativeFunctions.nativeRegisterLocalEncodedVideoFrameObserver(j2, this.mRtcLocalEncodedVideoFrameObserver);
            MethodCollector.o(10921);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void registerMetadataObserver(IMetadataObserver iMetadataObserver) {
        MethodCollector.i(9701);
        this.mMetadataObserver = new WeakReference<>(iMetadataObserver);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerMetadataObserver failed.");
            MethodCollector.o(9701);
        } else if (iMetadataObserver == null) {
            NativeFunctions.nativeSetMetadataObserver(j2, null);
            MethodCollector.o(9701);
        } else {
            NativeFunctions.nativeSetMetadataObserver(j2, this.mRtcMetadataObserver);
            MethodCollector.o(9701);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int resumeEffect(int i2) {
        MethodCollector.i(9968);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeEffect failed.");
            MethodCollector.o(9968);
            return -1;
        }
        int nativeResumeEffect = NativeFunctions.nativeResumeEffect(j2, i2);
        MethodCollector.o(9968);
        return nativeResumeEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendRoomBinaryMessage(byte[] bArr) {
        MethodCollector.i(7749);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            MethodCollector.o(7749);
            return -1;
        }
        long nativeSendRoomBinaryMessage = (long) NativeFunctions.nativeSendRoomBinaryMessage(j2, bArr);
        MethodCollector.o(7749);
        return nativeSendRoomBinaryMessage;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendRoomMessage(String str) {
        MethodCollector.i(7746);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            MethodCollector.o(7746);
            return -1;
        }
        long nativeSendRoomMessage = (long) NativeFunctions.nativeSendRoomMessage(j2, str);
        MethodCollector.o(7746);
        return nativeSendRoomMessage;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioMixingPosition(int i2) {
        MethodCollector.i(8901);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioMixingPosition failed.");
            MethodCollector.o(8901);
            return -1;
        }
        int nativeSetAudioMixingPosition = NativeFunctions.nativeSetAudioMixingPosition(j2, i2);
        MethodCollector.o(8901);
        return nativeSetAudioMixingPosition;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice) {
        MethodCollector.i(6584);
        LogUtil.d("RtcEngineImpl", "setAudioPlaybackDevice: " + audioPlaybackDevice.value());
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioPlaybackDevice failed.");
            MethodCollector.o(6584);
            return -1;
        }
        int nativeSetAudioPlaybackDevice = NativeFunctions.nativeSetAudioPlaybackDevice(j2, audioPlaybackDevice.value());
        MethodCollector.o(6584);
        return nativeSetAudioPlaybackDevice;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioVolumeIndicationInterval(int i2) {
        MethodCollector.i(6433);
        LogUtil.d("RtcEngineImpl", "setAudioVolumeIndicationInterval interval: ".concat(String.valueOf(i2)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioVolumeIndicationInterval failed.");
            MethodCollector.o(6433);
            return;
        }
        NativeFunctions.nativeSetAudioVolumeIndicationInterval(j2, i2);
        MethodCollector.o(6433);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setBusinessId(String str) {
        MethodCollector.i(9868);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setBusinessId failed.");
            MethodCollector.o(9868);
            return -1;
        }
        int nativeSetBusinessId = NativeFunctions.nativeSetBusinessId(j2, str);
        MethodCollector.o(9868);
        return nativeSetBusinessId;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setEffectsVolume(int i2) {
        MethodCollector.i(9106);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setEffectsVolume failed.");
            MethodCollector.o(9106);
            return -1;
        }
        int nativeSetEffectsVolume = NativeFunctions.nativeSetEffectsVolume(j2, i2);
        MethodCollector.o(9106);
        return nativeSetEffectsVolume;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setPublishFallbackOption(RTCEngine.PublishFallbackOption publishFallbackOption) {
        MethodCollector.i(9170);
        LogUtil.d("RtcEngineImpl", "setPublishFallbackOption: option: ".concat(String.valueOf(publishFallbackOption)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPublishFallbackOption failed.");
            MethodCollector.o(9170);
            return -1;
        }
        NativeFunctions.nativeSetPublishFallbackOption(j2, publishFallbackOption.value());
        MethodCollector.o(9170);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setRemoteSubscribeFallbackOption(RTCEngine.SubscribeFallbackOptions subscribeFallbackOptions) {
        MethodCollector.i(9377);
        LogUtil.d("RtcEngineImpl", "setRemoteSubscribeFallbackOption: option: ".concat(String.valueOf(subscribeFallbackOptions)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
            MethodCollector.o(9377);
            return -1;
        }
        NativeFunctions.nativeSetRemoteSubscribeFallbackOption(j2, subscribeFallbackOptions.value());
        MethodCollector.o(9377);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRuntimeParameters(JSONObject jSONObject) {
        String jSONObject2;
        MethodCollector.i(10837);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetRuntimeParameters failed.");
            MethodCollector.o(10837);
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = "";
        } else {
            jSONObject2 = jSONObject.toString();
        }
        NativeFunctions.nativeSetRuntimeParameters(j2, jSONObject2);
        MethodCollector.o(10837);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setUserRole(RTCEngine.ClientRole clientRole) {
        MethodCollector.i(8551);
        LogUtil.d("RtcEngineImpl", "setUserRole. role : ".concat(String.valueOf(clientRole)));
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setUserRole failed.");
            MethodCollector.o(8551);
            return -1;
        }
        int i2 = 1;
        if (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole[clientRole.ordinal()] != 1) {
            i2 = 2;
        }
        NativeFunctions.nativeSetUserRole(this.mNativeEngine, i2);
        MethodCollector.o(8551);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setUserVisibility(boolean z) {
        MethodCollector.i(8556);
        LogUtil.d("RtcEngineImpl", "setUserVisibility. enable : ".concat(String.valueOf(z)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setUserVisibility failed.");
            MethodCollector.o(8556);
            return -1;
        }
        NativeFunctions.nativeSetUserVisibility(j2, z);
        MethodCollector.o(8556);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectColorFilter(String str) {
        MethodCollector.i(10195);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEffectColorFilter failed.");
            MethodCollector.o(10195);
            return 1000;
        }
        int nativeSetVideoEffectColorFilter = NativeFunctions.nativeSetVideoEffectColorFilter(j2, str);
        MethodCollector.o(10195);
        return nativeSetVideoEffectColorFilter;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectColorFilterIntensity(float f2) {
        MethodCollector.i(10196);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEffectColorFilterIntensity failed.");
            MethodCollector.o(10196);
            return 1000;
        }
        int nativeSetVideoEffectColorFilterIntensity = NativeFunctions.nativeSetVideoEffectColorFilterIntensity(j2, f2);
        MethodCollector.o(10196);
        return nativeSetVideoEffectColorFilterIntensity;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectNodes(List<String> list) {
        MethodCollector.i(10359);
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEffectPath failed.");
            MethodCollector.o(10359);
            return 1000;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        int nativeSetVideoEffectNodes = NativeFunctions.nativeSetVideoEffectNodes(this.mNativeEngine, strArr);
        MethodCollector.o(10359);
        return nativeSetVideoEffectNodes;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startCloudRendering(String str) {
        MethodCollector.i(10522);
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startCloudRendering failed.");
            MethodCollector.o(10522);
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("started", str);
        if (cloudRenderingInfo == null) {
            MethodCollector.o(10522);
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
        MethodCollector.o(10522);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopEffect(int i2) {
        MethodCollector.i(9626);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopEffect failed.");
            MethodCollector.o(9626);
            return -1;
        }
        int nativeStopEffect = NativeFunctions.nativeStopEffect(j2, i2);
        MethodCollector.o(9626);
        return nativeStopEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopFileRecording(StreamIndex streamIndex) {
        MethodCollector.i(11485);
        LogUtil.d("RtcEngineImpl", "stopFileRecording");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopFileRecording failed.");
            MethodCollector.o(11485);
            return;
        }
        NativeFunctions.nativeStopFileRecording(j2, streamIndex.value());
        MethodCollector.o(11485);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unloadEffect(int i2) {
        MethodCollector.i(9477);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unloadEffect failed.");
            MethodCollector.o(9477);
            return -1;
        }
        int nativeUnloadEffect = NativeFunctions.nativeUnloadEffect(j2, i2);
        MethodCollector.o(9477);
        return nativeUnloadEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateCloudRendering(String str) {
        MethodCollector.i(10680);
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateCloudRendering failed.");
            MethodCollector.o(10680);
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("changed", str);
        if (cloudRenderingInfo == null) {
            MethodCollector.o(10680);
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
        MethodCollector.o(10680);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateToken(String str) {
        MethodCollector.i(13052);
        LogUtil.d("RtcEngineImpl", "updateToken: ".concat(String.valueOf(str)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateToken failed.");
            MethodCollector.o(13052);
            return -1;
        }
        NativeFunctions.nativeUpdateToken(j2, str);
        MethodCollector.o(13052);
        return 0;
    }

    private void initEglContext(Object obj) {
        if (obj == null) {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof EGLContext) {
            this.mRootEglBase = EglBase$$CC.createEgl10$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mRootEglBase = EglBase$$CC.createEgl14$$STATIC$$((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$();
        }
        this.mIsUseCustomEglEnv = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3 != 3) goto L_0x0037;
     */
    @Override // com.ss.bytertc.engine.RTCEngine
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pauseAllSubscribedStream(com.ss.bytertc.engine.RTCEngine.PauseResumeControlMediaType r8) {
        /*
            r7 = this;
            r6 = 12614(0x3146, float:1.7676E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "pauseAllSubscribedStream: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r5 = "RtcEngineImpl"
            com.ss.bytertc.engine.utils.LogUtil.d(r5, r0)
            long r3 = r7.mNativeEngine
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "native engine is invalid, muteAllRemoteAudio failed."
            com.ss.bytertc.engine.utils.LogUtil.e(r5, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0025:
            int[] r1 = com.ss.bytertc.engine.engineimpl.RTCEngineImpl.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$PauseResumeControlMediaType
            int r0 = r8.ordinal()
            r3 = r1[r0]
            r2 = 2
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x0037
            if (r3 == r2) goto L_0x0041
            r0 = 3
            if (r3 == r0) goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            long r0 = r7.mNativeEngine
            com.ss.bytertc.engine.NativeFunctions.nativePauseAllSubscribedStream(r0, r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0041:
            r2 = 1
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.engineimpl.RTCEngineImpl.pauseAllSubscribedStream(com.ss.bytertc.engine.RTCEngine$PauseResumeControlMediaType):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3 != 3) goto L_0x0037;
     */
    @Override // com.ss.bytertc.engine.RTCEngine
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resumeAllSubscribedStream(com.ss.bytertc.engine.RTCEngine.PauseResumeControlMediaType r8) {
        /*
            r7 = this;
            r6 = 12737(0x31c1, float:1.7848E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "resumeAllSubscribedStream: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r5 = "RtcEngineImpl"
            com.ss.bytertc.engine.utils.LogUtil.d(r5, r0)
            long r3 = r7.mNativeEngine
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "native engine is invalid, muteAllRemoteAudio failed."
            com.ss.bytertc.engine.utils.LogUtil.e(r5, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0025:
            int[] r1 = com.ss.bytertc.engine.engineimpl.RTCEngineImpl.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$PauseResumeControlMediaType
            int r0 = r8.ordinal()
            r3 = r1[r0]
            r2 = 2
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x0037
            if (r3 == r2) goto L_0x0041
            r0 = 3
            if (r3 == r0) goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            long r0 = r7.mNativeEngine
            com.ss.bytertc.engine.NativeFunctions.nativeResumeAllSubscribedStream(r0, r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0041:
            r2 = 1
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.engineimpl.RTCEngineImpl.resumeAllSubscribedStream(com.ss.bytertc.engine.RTCEngine$PauseResumeControlMediaType):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r5 != 5) goto L_0x0039;
     */
    @Override // com.ss.bytertc.engine.RTCEngine
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAudioScenario(com.ss.bytertc.engine.RTCEngine.AudioScenarioType r8) {
        /*
            r7 = this;
            r6 = 8390(0x20c6, float:1.1757E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "setAudioScenario...audioScenario: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r5 = "RtcEngineImpl"
            com.ss.bytertc.engine.utils.LogUtil.d(r5, r0)
            long r3 = r7.mNativeEngine
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "native engine is invalid, setAudioScenario failed."
            com.ss.bytertc.engine.utils.LogUtil.e(r5, r0)
        L_0x0021:
            int[] r1 = com.ss.bytertc.engine.engineimpl.RTCEngineImpl.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$AudioScenarioType
            int r0 = r8.ordinal()
            r5 = r1[r0]
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            r0 = 0
            if (r5 == r1) goto L_0x0039
            if (r5 == r2) goto L_0x0047
            if (r5 == r3) goto L_0x0045
            if (r5 == r4) goto L_0x0043
            r0 = 5
            if (r5 == r0) goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            long r0 = r7.mNativeEngine
            com.ss.bytertc.engine.NativeFunctions.nativeSetAudioScenario(r0, r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0043:
            r4 = 3
            goto L_0x003a
        L_0x0045:
            r4 = 2
            goto L_0x003a
        L_0x0047:
            r4 = 1
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.engineimpl.RTCEngineImpl.setAudioScenario(com.ss.bytertc.engine.RTCEngine$AudioScenarioType):void");
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoInputType(MediaInputType mediaInputType) {
        boolean z;
        MethodCollector.i(6531);
        if (mediaInputType == MediaInputType.MEDIA_INPUT_TYPE_EXTERNAL) {
            z = true;
        } else {
            z = false;
        }
        this.mUseExtVideoSource = z;
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoInputType failed.");
            MethodCollector.o(6531);
            return;
        }
        NativeFunctions.nativeSetVideoInputType(j2, mediaInputType.value());
        if (this.mUseExtVideoSource) {
            NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, MirrorMode.MIRROR_MODE_OFF.value());
            MethodCollector.o(6531);
            return;
        }
        MirrorMode mirrorMode = MirrorMode.MIRROR_MODE_OFF;
        if (this.mIsVideoMirror && this.mIsFront) {
            mirrorMode = MirrorMode.MIRROR_MODE_ON;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.o(6531);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoSourceType(VideoSourceType videoSourceType) {
        boolean z;
        MethodCollector.i(6541);
        if (videoSourceType == VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL) {
            z = true;
        } else {
            z = false;
        }
        this.mUseExtVideoSource = z;
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoInputType failed.");
            MethodCollector.o(6541);
            return;
        }
        NativeFunctions.nativeSetVideoSourceType(j2, videoSourceType.value());
        if (this.mUseExtVideoSource) {
            NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, MirrorMode.MIRROR_MODE_OFF.value());
            MethodCollector.o(6541);
            return;
        }
        MirrorMode mirrorMode = MirrorMode.MIRROR_MODE_OFF;
        if (this.mIsVideoMirror && this.mIsFront) {
            mirrorMode = MirrorMode.MIRROR_MODE_ON;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.o(6541);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int switchCamera(CameraId cameraId) {
        MethodCollector.i(6184);
        LogUtil.d("RtcEngineImpl", "switchCamera");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, switchCamera failed.");
            MethodCollector.o(6184);
            return -1;
        }
        NativeFunctions.nativeSwitchCamera(j2, cameraId.value());
        this.mIsFront = !this.mIsFront;
        MirrorMode mirrorMode = MirrorMode.MIRROR_MODE_OFF;
        if (this.mIsVideoMirror && this.mIsFront) {
            mirrorMode = MirrorMode.MIRROR_MODE_ON;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.o(6184);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateLiveTranscoding(LiveTranscoding liveTranscoding) {
        MethodCollector.i(6580);
        LogUtil.d("RtcEngineImpl", "updateLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.d("RtcEngineImpl", "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
            MethodCollector.o(6580);
        } else if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateLiveTranscoding failed.");
            MethodCollector.o(6580);
        } else {
            liveTranscoding.setAction("layoutChanged");
            String jSONObject = liveTranscoding.getTranscodeMessage().toString();
            LogUtil.d("RtcEngineImpl", "updateLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeFunctions.nativeUpdateLiveTranscoding(this.mNativeEngine, jSONObject);
            MethodCollector.o(6580);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRender(iVideoSink, this.mRoom, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void login(String str, String str2) {
        MethodCollector.i(7874);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(7874);
            return;
        }
        NativeFunctions.nativeLogin(j2, str, str2);
        MethodCollector.o(7874);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setEncryptInfo(int i2, String str) {
        MethodCollector.i(9869);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setEncryptInfo failed.");
            MethodCollector.o(9869);
            return;
        }
        NativeFunctions.nativeSetEncryptInfo(j2, i2, str);
        MethodCollector.o(9869);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setServerParams(String str, String str2) {
        MethodCollector.i(8018);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8018);
            return;
        }
        NativeFunctions.nativeSetServerParams(j2, str, str2);
        MethodCollector.o(8018);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters) {
        MethodCollector.i(7558);
        int nativeStartScreenSharing = NativeFunctions.nativeStartScreenSharing(this.mNativeEngine, intent, new InternalScreenSharingParams(screenSharingParameters));
        MethodCollector.o(7558);
        return nativeStartScreenSharing;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int UpdateAudioRecvRange(int i2, int i3) {
        MethodCollector.i(8796);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, UpdateAudioRecvRange failed.");
            MethodCollector.o(8796);
            return -1;
        }
        int nativeUpdateAudioRecvRange = NativeFunctions.nativeUpdateAudioRecvRange(j2, i2, i3);
        MethodCollector.o(8796);
        return nativeUpdateAudioRecvRange;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int checkVideoEffectLicense(Context context, String str) {
        MethodCollector.i(10197);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, checkVideoEffectLicense failed.");
            MethodCollector.o(10197);
            return -1;
        }
        int nativeCheckVideoEffectLicense = NativeFunctions.nativeCheckVideoEffectLicense(context, j2, str);
        MethodCollector.o(10197);
        return nativeCheckVideoEffectLicense;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int preloadEffect(int i2, String str) {
        MethodCollector.i(9476);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, preloadEffect failed.");
            MethodCollector.o(9476);
            return -1;
        }
        int nativePreloadEffect = NativeFunctions.nativePreloadEffect(j2, i2, str);
        MethodCollector.o(9476);
        return nativePreloadEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushAudioMixingStreamData(byte[] bArr, int i2) {
        MethodCollector.i(8292);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pushAudioMixingStreamData failed.");
            MethodCollector.o(8292);
            return false;
        }
        boolean nativePushAudioMixingStreamData = NativeFunctions.nativePushAudioMixingStreamData(j2, bArr, i2);
        MethodCollector.o(8292);
        return nativePushAudioMixingStreamData;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserBinaryMessage(String str, byte[] bArr) {
        MethodCollector.i(7817);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(7817);
            return -1;
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendBinaryMessage: uid is null send failed");
            MethodCollector.o(7817);
            return -2;
        } else {
            long nativeSendUserBinaryMessage = NativeFunctions.nativeSendUserBinaryMessage(j2, str, bArr);
            MethodCollector.o(7817);
            return nativeSendUserBinaryMessage;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr) {
        MethodCollector.i(8133);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8133);
            return -1;
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendUserBinaryMessageOutsideRoom: uid is null send failed");
            MethodCollector.o(8133);
            return -2;
        } else {
            long nativeSendUserBinaryMessageOutsideRoom = NativeFunctions.nativeSendUserBinaryMessageOutsideRoom(j2, str, bArr);
            MethodCollector.o(8133);
            return nativeSendUserBinaryMessageOutsideRoom;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserMessage(String str, String str2) {
        MethodCollector.i(7760);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendMessage failed.");
            MethodCollector.o(7760);
            return -1;
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendMessage: uid is null send failed");
            MethodCollector.o(7760);
            return -2;
        } else {
            long nativeSendUserMessage = NativeFunctions.nativeSendUserMessage(j2, str, str2);
            MethodCollector.o(7760);
            return nativeSendUserMessage;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserMessageOutsideRoom(String str, String str2) {
        MethodCollector.i(8128);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.o(8128);
            return -1;
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendUserMessageOutsideRoom: uid is null send failed");
            MethodCollector.o(8128);
            return -2;
        } else {
            long nativeSendUserMessageOutsideRoom = NativeFunctions.nativeSendUserMessageOutsideRoom(j2, str, str2);
            MethodCollector.o(8128);
            return nativeSendUserMessageOutsideRoom;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        MethodCollector.i(11738);
        if (videoCanvas == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setLocalVideoCanvas canvas is null");
            MethodCollector.o(11738);
            return -1;
        }
        NativeFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode);
        MethodCollector.o(11738);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean setMixedAudioFrameParameters(int i2, int i3) {
        MethodCollector.i(10754);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setMixedAudioFrameParameters failed.");
            MethodCollector.o(10754);
            return false;
        }
        NativeFunctions.nativeSetMixedAudioFrameParameters(j2, i2, i3);
        MethodCollector.o(10754);
        return true;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean setPlaybackAudioFrameParameters(int i2, int i3) {
        MethodCollector.i(10753);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPlaybackAudioFrameParameters failed.");
            MethodCollector.o(10753);
            return false;
        }
        NativeFunctions.nativeSetPlaybackAudioFrameParameters(j2, i2, i3);
        MethodCollector.o(10753);
        return true;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean setRecordingAudioFrameParameters(int i2, int i3) {
        MethodCollector.i(10752);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRecordingAudioFrameParameters failed.");
            MethodCollector.o(10752);
            return false;
        }
        NativeFunctions.nativeSetRecordingAudioFrameParameters(j2, i2, i3);
        MethodCollector.o(10752);
        return true;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRemoteAudioPlaybackVolume(String str, int i2) {
        MethodCollector.i(8295);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
            MethodCollector.o(8295);
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "setRemoteAudioPlaybackVolume: uid is null adjust failed");
            MethodCollector.o(8295);
        } else {
            NativeFunctions.nativeSetRemoteAudioPlaybackVolume(j2, str, i2);
            MethodCollector.o(8295);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVolumeOfEffect(int i2, int i3) {
        MethodCollector.i(9105);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVolumeOfEffect failed.");
            MethodCollector.o(9105);
            return -1;
        }
        int nativeSetVolumeOfEffect = NativeFunctions.nativeSetVolumeOfEffect(j2, i2, i3);
        MethodCollector.o(9105);
        return nativeSetVolumeOfEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str) {
        VideoSinkAdapter videoSinkAdapter;
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupLocalVideoRender, uid is null");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupLocalVideoRender deprecatedVideoSink is null");
            videoSinkAdapter = null;
        } else {
            LogUtil.i("RtcEngineImpl", "EventType: setupLocalVideoRender canvas:" + iVideoSink.hashCode());
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
            iVideoSink.onInitialize();
            iVideoSink.onStart();
        }
        setLocalVideoSink(StreamIndex.STREAM_INDEX_MAIN, videoSinkAdapter, 1);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig) {
        MethodCollector.i(11329);
        LogUtil.d("RtcEngineImpl", "startFileRecording");
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startFileRecording failed.");
            MethodCollector.o(11329);
            return -1;
        }
        int nativeStartFileRecording = NativeFunctions.nativeStartFileRecording(j2, streamIndex.value(), recordingConfig.dirPath, recordingConfig.recordingFileType.value(), recordingConfig.recordingType.value());
        MethodCollector.o(11329);
        return nativeStartFileRecording;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void unSubscribe(String str, boolean z) {
        MethodCollector.i(6886);
        LogUtil.d("RtcEngineImpl", "unSubscribe: ".concat(String.valueOf(str)));
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unSubscribe failed.");
            MethodCollector.o(6886);
            return;
        }
        NativeFunctions.nativeUnSubscribe(j2, str, z);
        MethodCollector.o(6886);
    }

    private JSONObject AddParameters(JSONObject jSONObject, Context context) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String path = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getPath();
        if (path == null || path.isEmpty()) {
            path = "/data/data/" + context.getPackageName() + "/files";
        }
        try {
            jSONObject.put("rtc.log_location", path + "/rtc_log");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static Object com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(12217);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(12217);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put(StringSet.type, "render");
            jSONObject2.put("effect", str2);
            jSONObject3.put("layout", jSONObject2);
            jSONObject.put("renderMeta", jSONObject3);
            return jSONObject.toString();
        } catch (Exception e2) {
            LogUtil.e("RtcEngineImpl", "getCloudRenderingInfo catch exception , e : " + e2.getMessage());
            return null;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableAutoSubscribe(RTCEngine.SubscribeMode subscribeMode, RTCEngine.SubscribeMode subscribeMode2) {
        MethodCollector.i(6720);
        LogUtil.d("RtcEngineImpl", "enableAutoSubscribe: audio:" + subscribeMode + ", video: " + subscribeMode2);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableAutoSubscribe failed.");
            MethodCollector.o(6720);
            return;
        }
        NativeFunctions.nativeEnableAutoSubscribe(j2, subscribeMode.value(), subscribeMode2.value());
        MethodCollector.o(6720);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2) {
        MethodCollector.i(7036);
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableExternalAudioDevice failed.");
            MethodCollector.o(7036);
        } else if (audioFormat.sampleRate == null || audioFormat.channel == null || audioFormat2.sampleRate == null || audioFormat2.channel == null) {
            LogUtil.e("RtcEngineImpl", "parameter is invalid, EnableExternalAudioDevice failed.");
            MethodCollector.o(7036);
        } else {
            NativeFunctions.nativeEnableExternalAudioDevice(this.mNativeEngine, audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat2.sampleRate.value(), audioFormat2.channel.value());
            MethodCollector.o(7036);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteRemoteAudio(String str, MuteState muteState) {
        MethodCollector.i(12860);
        LogUtil.d("RtcEngineImpl", "muteRemoteAudio, uid: " + str + " , muted: " + muteState.value());
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteRemoteAudio failed.");
            MethodCollector.o(12860);
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "muteRemoteAudio, uid is null mute failed.");
            MethodCollector.o(12860);
        } else {
            NativeFunctions.nativeMuteRemoteAudio(j2, str, muteState.value());
            MethodCollector.o(12860);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int muteRemoteVideo(String str, MuteState muteState) {
        boolean z;
        MethodCollector.i(12956);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.d("RtcEngineImpl", "muteRemoteVideoStream, uid: " + str + " , muted: " + z);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteRemoteVideo failed.");
            MethodCollector.o(12956);
            return -1;
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "muteRemoteVideoStream, uid is null mute failed");
            MethodCollector.o(12956);
            return -2;
        } else {
            NativeFunctions.nativeMuteRemoteVideo(j2, str, muteState.value());
            MethodCollector.o(12956);
            return 0;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setRemoteUserPriority(String str, RTCEngine.RemoteUserPriority remoteUserPriority) {
        MethodCollector.i(9547);
        LogUtil.d("RtcEngineImpl", "setRemoteUserPriority: uid: " + str + ", priority: " + remoteUserPriority);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRemoteUserPriority failed.");
            MethodCollector.o(9547);
            return -1;
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "setRemoteUserPriority: uid is null set failed");
            MethodCollector.o(9547);
            return -2;
        } else {
            NativeFunctions.nativeSetRemoteUserPriority(j2, str, remoteUserPriority.value());
            MethodCollector.o(9547);
            return 0;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode) {
        MethodCollector.i(6651);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            MethodCollector.o(6651);
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoStreamDescription videoStreamDescription : list) {
            if (!videoStreamDescription.isValid()) {
                LogUtil.e("RtcEngineImpl", "setVideoResolutions with illegal params");
                MethodCollector.o(6651);
                return -2;
            }
            arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
        }
        RTCData.instance().setOrientationMode(orientationMode);
        NativeFunctions.nativeSetVideoEncoderConfig(this.mNativeEngine, arrayList);
        MethodCollector.o(6651);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        String str;
        String str2;
        String str3;
        String str4;
        MethodCollector.i(11170);
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startASR");
            MethodCollector.o(11170);
        } else if (iRTCASREngineEventHandler == null || rTCASRConfig == null) {
            MethodCollector.o(11170);
        } else {
            String str5 = "";
            if (rTCASRConfig.userId == null) {
                str = str5;
            } else {
                str = rTCASRConfig.userId;
            }
            if (rTCASRConfig.appId == null) {
                str2 = str5;
            } else {
                str2 = rTCASRConfig.appId;
            }
            if (rTCASRConfig.accessToken == null) {
                str3 = str5;
            } else {
                str3 = rTCASRConfig.accessToken;
            }
            if (rTCASRConfig.secretKey == null) {
                str4 = str5;
            } else {
                str4 = rTCASRConfig.secretKey;
            }
            int value = rTCASRConfig.authorizationType.value();
            if (rTCASRConfig.cluster != null) {
                str5 = rTCASRConfig.cluster;
            }
            this.mRTCASREngineEventHandler.setAsrEventHandler(iRTCASREngineEventHandler);
            NativeFunctions.nativeStartASR(this.mNativeEngine, this.mRTCASREngineEventHandler, str, str2, str3, str4, value, str5);
            MethodCollector.o(11170);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        MethodCollector.i(6559);
        this.mLiveTranscodingObserver = iLiveTranscodingObserver;
        LogUtil.d("RtcEngineImpl", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.d("RtcEngineImpl", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
            MethodCollector.o(6559);
        } else if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableLiveTranscoding failed.");
            MethodCollector.o(6559);
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            liveTranscoding.setAction("started");
            JSONObject transcodeMessage = this.mLiveTranscoding.getTranscodeMessage();
            if (transcodeMessage == null) {
                MethodCollector.o(6559);
                return;
            }
            String jSONObject = transcodeMessage.toString();
            LogUtil.d("RtcEngineImpl", "enableLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeFunctions.nativeStartLiveTranscoding(this.mNativeEngine, jSONObject, this.mTranscodingObserver);
            MethodCollector.o(6559);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void subscribeStream(String str, SubscribeConfig subscribeConfig) {
        String subscribeConfig2;
        MethodCollector.i(6740);
        StringBuilder append = new StringBuilder("subscribeStream: ").append(str).append(", info:");
        if (subscribeConfig == null) {
            subscribeConfig2 = "null";
        } else {
            subscribeConfig2 = subscribeConfig.toString();
        }
        LogUtil.d("RtcEngineImpl", append.append(subscribeConfig2).toString());
        if (subscribeConfig != null) {
            long j2 = this.mNativeEngine;
            if (j2 == -1) {
                LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
                MethodCollector.o(6740);
                return;
            }
            NativeFunctions.nativeSubscribeStream(j2, str, subscribeConfig.isScreen, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
        }
        MethodCollector.o(6740);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushExternalVideoFrame(RTCVideoFrame rTCVideoFrame, boolean z) {
        VideoFrame convert2I420Frame;
        RTCVideoFrame rTCVideoFrame2 = rTCVideoFrame;
        MethodCollector.i(7321);
        if (!rTCVideoFrame2.hasReleaseCallback()) {
            rTCVideoFrame2 = RTCVideoFrame.shallowCopy(rTCVideoFrame2);
        }
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            MethodCollector.o(7321);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VideoFrameConverter videoFrameConverter = this.mVideoFrameConverter;
        if (videoFrameConverter == null || !this.mUseExtVideoSource) {
            LogUtil.e("RtcEngineImpl", "pushExternalVideoFrame failed videoFrameConverter:" + this.mVideoFrameConverter + " useExtVideoSource:" + this.mUseExtVideoSource);
            MethodCollector.o(7321);
            return false;
        }
        if (z) {
            convert2I420Frame = videoFrameConverter.convert2VideoFrame(rTCVideoFrame2);
        } else {
            convert2I420Frame = videoFrameConverter.convert2I420Frame(rTCVideoFrame2);
        }
        if (convert2I420Frame != null) {
            if (z) {
                NativeFunctions.nativePushExternalVideoFrame(this.mNativeEngine, convert2I420Frame, VideoFrameConverter.getExtendedData(rTCVideoFrame2), VideoFrameConverter.getSupplementaryInfo(rTCVideoFrame2), currentTimeMillis);
                convert2I420Frame.release();
            } else {
                NativeFunctions.nativePushExternalVideoFrame(this.mNativeEngine, convert2I420Frame, VideoFrameConverter.getExtendedData(rTCVideoFrame2), VideoFrameConverter.getSupplementaryInfo(rTCVideoFrame2), currentTimeMillis);
                convert2I420Frame.release();
            }
            MethodCollector.o(7321);
            return true;
        }
        LogUtil.e("RtcEngineImpl", "pushExternalVideoFrame convert video frame is null");
        MethodCollector.o(7321);
        return false;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioPlayoutMixStream(boolean z, int i2, int i3) {
        MethodCollector.i(8195);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioPlayoutMixStream failed.");
            MethodCollector.o(8195);
            return;
        }
        NativeFunctions.nativeSetAudioPlayoutMixStream(j2, z, i2, i3);
        MethodCollector.o(8195);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int UpdateSelfPosition(int i2, int i3, int i4) {
        MethodCollector.i(8971);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, UpdateSelfPosition failed.");
            MethodCollector.o(8971);
            return -1;
        }
        int nativeUpdateSelfPosition = NativeFunctions.nativeUpdateSelfPosition(j2, i2, i3, i4);
        MethodCollector.o(8971);
        return nativeUpdateSelfPosition;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$RTCEngineImpl(LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCEngineEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th);
            } catch (Exception e2) {
                LogUtil.e("RtcEngineImpl", "Exception in App thread when handler onLoggerMessage , e : " + e2.getMessage());
            }
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setLocalVideoSink(StreamIndex streamIndex, com.ss.bytertc.engine.video.IVideoSink iVideoSink, int i2) {
        MethodCollector.i(11405);
        if (streamIndex == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, streamIndex is null");
            MethodCollector.o(11405);
            return;
        }
        VideoSinkAdapter videoSinkAdapter = null;
        if (iVideoSink != null) {
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
        }
        NativeFunctions.nativeSetLocalVideoSink(this.mNativeEngine, streamIndex.value(), videoSinkAdapter, i2);
        MethodCollector.o(11405);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setRemoteVideoCanvas(String str, StreamIndex streamIndex, VideoCanvas videoCanvas) {
        MethodCollector.i(11081);
        if (videoCanvas == null || videoCanvas.uid == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteVideo canvas or uid is null");
            MethodCollector.o(11081);
            return -1;
        }
        NativeFunctions.nativeSetRemoteVideoCanvas(this.mNativeEngine, videoCanvas.uid, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode);
        MethodCollector.o(11081);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateVideoEffectNode(String str, String str2, float f2) {
        MethodCollector.i(10360);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateVideoEffect failed.");
            MethodCollector.o(10360);
            return 1000;
        }
        int nativeUpdateVideoEffectNode = NativeFunctions.nativeUpdateVideoEffectNode(j2, str, str2, f2);
        MethodCollector.o(10360);
        return nativeUpdateVideoEffectNode;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRemoteVideoSink(RemoteStreamKey remoteStreamKey, com.ss.bytertc.engine.video.IVideoSink iVideoSink, int i2) {
        String str;
        MethodCollector.i(11244);
        if (remoteStreamKey == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, streamKey is null");
            MethodCollector.o(11244);
        } else if (remoteStreamKey.getStreamIndex() == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, streamIndex is null");
            MethodCollector.o(11244);
        } else {
            if (remoteStreamKey.getRoomId() == null || remoteStreamKey.getRoomId().isEmpty()) {
                str = this.mRoom;
                if (str == null) {
                    str = "";
                }
            } else {
                str = remoteStreamKey.getRoomId();
            }
            VideoSinkAdapter videoSinkAdapter = null;
            if (iVideoSink != null) {
                videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
            }
            NativeFunctions.nativeSetRemoteVideoSink(this.mNativeEngine, str, remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoSinkAdapter, i2);
            MethodCollector.o(11244);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2) {
        VideoSinkAdapter videoSinkAdapter;
        if (str2 == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteVideoRender, uid is null");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteVideoRender deprecatedVideoSink is null");
            videoSinkAdapter = null;
        } else {
            LogUtil.i("RtcEngineImpl", "EventType: setupLocalVideoRender canvas:" + iVideoSink.hashCode());
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
            iVideoSink.onInitialize();
            iVideoSink.onStart();
        }
        setRemoteVideoSink(new RemoteStreamKey(this.mRoom, str2, StreamIndex.STREAM_INDEX_MAIN), videoSinkAdapter, 1);
        return 0;
    }

    public static void httpGetAsync(String str, int i2, int i3, int i4) {
        if (nativeHttpClient == null) {
            com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("bytertc", "native http client has not been init!");
            return;
        }
        RtcHttpCallbackImpl rtcHttpCallbackImpl = new RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i3);
        rtcHttpCallbackImpl.setClientId(i4);
        nativeHttpClient.GetAsync(str, rtcHttpCallbackImpl, i2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i2) {
        MethodCollector.i(8565);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startAudioMixing failed.");
            MethodCollector.o(8565);
            return -1;
        }
        int nativeStartAudioMixing = NativeFunctions.nativeStartAudioMixing(j2, str, z, z2, i2);
        MethodCollector.o(8565);
        return nativeStartAudioMixing;
    }

    public static int feedback(Context context, int i2, int i3, String str) {
        MethodCollector.i(11010);
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("grade", i2);
            jSONObject.put(StringSet.type, i3);
            jSONObject.put("problem_desc", str);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("network_type", NetworkUtils.getNetworkAccessType(context));
            int nativeReportFeedback = NativeFunctions.nativeReportFeedback(jSONObject.toString());
            MethodCollector.o(11010);
            return nativeReportFeedback;
        } catch (JSONException e2) {
            e2.printStackTrace();
            MethodCollector.o(11010);
            return -1;
        }
    }

    private int setLocalRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "setLocalRenderInternal, uid is null set failed.");
            return -2;
        } else if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink is null, ThreadPool  workthreadID" + Thread.currentThread().getId());
            return 0;
        } else {
            LogUtil.i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink:" + iVideoSink.hashCode() + ", ThreadPool  workthreadID" + Thread.currentThread().getId());
            new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
            return 0;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int joinRoom(String str, String str2, UserInfo userInfo, RTCEngine.ChannelProfile channelProfile) {
        String uid;
        MethodCollector.i(11740);
        StringBuilder append = new StringBuilder("joinChannel with token: ").append(str).append(" , roomId: ").append(str2).append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LogUtil.d("RtcEngineImpl", append.append(uid).toString());
        if (this.mState != State.IDLE) {
            MethodCollector.o(11740);
            return -4;
        } else if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            MethodCollector.o(11740);
            return -3;
        } else if (userInfo == null) {
            LogUtil.e("RtcEngineImpl", "userInfo is null, joinChannel failed");
            MethodCollector.o(11740);
            return -2;
        } else if (userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.e("RtcEngineImpl", "uid is invalid, joinChannel failed.");
            MethodCollector.o(11740);
            return -2;
        } else if (str2 == null || str2.isEmpty()) {
            LogUtil.e("RtcEngineImpl", "channel is invalid, joinChannel failed.");
            MethodCollector.o(11740);
            return -1;
        } else {
            this.mState = State.IN_ROOM;
            this.mRoom = str2;
            this.mUser = userInfo.getUid();
            int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile[channelProfile.ordinal()];
            int i3 = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            i3 = 1;
                        } else if (i2 == 5) {
                            i3 = 4;
                        }
                    }
                    i3 = 0;
                } else {
                    i3 = 3;
                }
            }
            int min = Math.min(NativeFunctions.nativeJoinRoom(this.mNativeEngine, str, str2, userInfo, i3), 0);
            MethodCollector.o(11740);
            return min;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void subscribeUserStream(String str, StreamIndex streamIndex, RTCEngine.SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        boolean z;
        String subscribeVideoConfig2;
        int i2;
        MethodCollector.i(6881);
        if (streamIndex == StreamIndex.STREAM_INDEX_SCREEN) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder append = new StringBuilder("subscribeUserStream: ").append(str).append(", isScreen: ").append(z).append(", mediaType: ").append(subscribeMediaType).append(", info: ");
        if (subscribeVideoConfig == null) {
            subscribeVideoConfig2 = "null";
        } else {
            subscribeVideoConfig2 = subscribeVideoConfig.toString();
        }
        LogUtil.d("RtcEngineImpl", append.append(subscribeVideoConfig2).toString());
        if (subscribeVideoConfig != null) {
            if (this.mNativeEngine == -1) {
                LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
                MethodCollector.o(6881);
                return;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$SubscribeMediaType[subscribeMediaType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = 1;
                } else if (i3 == 3) {
                    i2 = 2;
                } else if (i3 == 4) {
                    i2 = 3;
                }
                NativeFunctions.nativeSubscribeUserStream(this.mNativeEngine, str, z, i2, subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
            }
            i2 = 0;
            NativeFunctions.nativeSubscribeUserStream(this.mNativeEngine, str, z, i2, subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
        }
        MethodCollector.o(6881);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int joinRoom(String str, String str2, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        String uid;
        MethodCollector.i(11904);
        StringBuilder append = new StringBuilder("joinChannel with token: ").append(str).append(" , roomId: ").append(str2).append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LogUtil.d("RtcEngineImpl", append.append(uid).toString());
        if (this.mState != State.IDLE) {
            MethodCollector.o(11904);
            return -4;
        } else if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            MethodCollector.o(11904);
            return -3;
        } else if (userInfo == null) {
            LogUtil.e("RtcEngineImpl", "userInfo is null, joinChannel failed");
            MethodCollector.o(11904);
            return -2;
        } else if (userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.e("RtcEngineImpl", "uid is invalid, joinChannel failed.");
            MethodCollector.o(11904);
            return -2;
        } else if (str2 == null || str2.isEmpty()) {
            LogUtil.e("RtcEngineImpl", "channel is invalid, joinChannel failed.");
            MethodCollector.o(11904);
            return -1;
        } else {
            this.mState = State.IN_ROOM;
            this.mRoom = str2;
            this.mUser = userInfo.getUid();
            int min = Math.min(NativeFunctions.nativeJoinRoomWithRoomConfig(this.mNativeEngine, str, str2, userInfo, rTCRoomConfig), 0);
            MethodCollector.o(11904);
            return min;
        }
    }

    public static void httpPostAsync(String str, String str2, int i2, int i3, int i4) {
        if (nativeHttpClient == null) {
            com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("bytertc", "native http client has not been init!");
            return;
        }
        com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("bytertc", "http in java called, callback Id: ".concat(String.valueOf(i3)));
        RtcHttpCallbackImpl rtcHttpCallbackImpl = new RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i3);
        rtcHttpCallbackImpl.setClientId(i4);
        nativeHttpClient.PostAsync(str, str2, rtcHttpCallbackImpl, i2);
    }

    private int setupRemoteVideoRenderInternal(IVideoSink iVideoSink, String str, String str2, boolean z, boolean z2) {
        if (str2 == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, uid is null");
            return -2;
        } else if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteRenderInternal videoSink is null");
            return 0;
        } else {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteRenderInternal canvas:" + iVideoSink.hashCode());
            new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
            return 0;
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int playEffect(int i2, String str, boolean z, int i3, int i4) {
        MethodCollector.i(9291);
        long j2 = this.mNativeEngine;
        if (j2 == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, playEffect failed.");
            MethodCollector.o(9291);
            return -1;
        }
        int nativePlayEffect = NativeFunctions.nativePlayEffect(j2, i2, str, z, i3, i4);
        MethodCollector.o(9291);
        return nativePlayEffect;
    }

    public RTCEngineImpl(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj, JSONObject jSONObject) {
        int i2;
        String str2;
        String jSONObject2;
        MethodCollector.i(8047);
        LogUtil.d("RtcEngineImpl", "create RtcEngineImpl with appId: ".concat(String.valueOf(str)));
        if (!mLibraryLoaded || str == null) {
            JSONObject jSONObject3 = new JSONObject();
            if (!mLibraryLoaded) {
                i2 = -1072;
                str2 = "rtc sdk load so failed";
            } else {
                i2 = -1005;
                str2 = "app id is null";
            }
            try {
                jSONObject3.put("event_key", "rtc_error");
                jSONObject3.put("rtc_app_id", str);
                jSONObject3.put("device_id", mDeviceId);
                jSONObject3.put("error_code", i2);
                jSONObject3.put("message", str2);
                jSONObject3.put("timestamp", System.currentTimeMillis());
                jSONObject3.put("rtc_timestamp", System.currentTimeMillis());
                jSONObject3.put("os", "android");
                jSONObject3.put("product_line", "rtc");
                jSONObject3.put("report_version", 5);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (iRTCEngineEventHandler != null) {
                iRTCEngineEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject3);
                iRTCEngineEventHandler.onError(i2);
            }
            LogUtil.e("RtcEngineImpl", str2);
            IllegalStateException illegalStateException = new IllegalStateException("Create engine failed ".concat(str2));
            MethodCollector.o(8047);
            throw illegalStateException;
        }
        sRtcEngineInstance = this;
        HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
        this.mEglThread = handlerThread;
        handlerThread.start();
        VideoSinkTask videoSinkTask = new VideoSinkTask();
        this.mVideoSinkTask = videoSinkTask;
        videoSinkTask.init();
        Handler handler = new Handler(this.mEglThread.getLooper());
        this.mEglHandler = handler;
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new RTCEngineImpl$$Lambda$3(this, obj));
        Context com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        this.mContext = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        mPackageName = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getPackageName();
        this.mAppId = str;
        this.mState = State.IDLE;
        this.mRtcEngineHandler = new WeakReference<>(iRTCEngineEventHandler);
        LogUtil.setLoggerSink(this.mLoggerSink);
        JSONObject AddParameters = AddParameters(jSONObject, context);
        this.mEngineEventHandler = new RTCEngineEventHandler(this);
        this.mEngineInternalEventHandler = new RTCEngineInternalEventHandler(this);
        this.mVideoFrameConverter = new VideoFrameConverter();
        this.mScreenFrameConverter = new VideoFrameConverter();
        this.mRtcVideoFrameObserver = new RTCVideoFrameObserver();
        this.mRtcAudioFrameObserver = new RTCAudioFrameObserver(this);
        this.mRtcLocalEncodedVideoFrameObserver = new RTCLocalEncodedVideoFrameObserver(this);
        this.mRtcMetadataObserver = new RTCMetadataObserver(this);
        this.mTranscodingObserver = new LiveTranscodingObserver(this);
        this.mRTCASREngineEventHandler = new RTCASREngineEventHandler();
        try {
            Context com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2 = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(this.mContext);
            RTCEngineEventHandler rTCEngineEventHandler = this.mEngineEventHandler;
            if (AddParameters == null) {
                jSONObject2 = "";
            } else {
                jSONObject2 = AddParameters.toString();
            }
            long nativeCreateEngine = NativeFunctions.nativeCreateEngine(com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2, str, rTCEngineEventHandler, jSONObject2);
            this.mNativeEngine = nativeCreateEngine;
            if (nativeCreateEngine == -1) {
                LogUtil.e("RtcEngineImpl", "create native engine error, native engine is invalid.");
            } else {
                NativeFunctions.nativeRegisterInternalEventObserver(nativeCreateEngine, this.mEngineInternalEventHandler);
            }
            NetworkConnectChangeReceiver networkConnectChangeReceiver = new NetworkConnectChangeReceiver(this.SetNetworkTypeCallback);
            this.mBroadcastReceiver = networkConnectChangeReceiver;
            NetworkUtils.registerReceiver(context, networkConnectChangeReceiver);
            AppMonitor.get(context).register(context, this.appStateCallback);
            MethodCollector.o(8047);
        } catch (UnsatisfiedLinkError e3) {
            e3.printStackTrace();
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("rtc loader info:" + sRtcLoaderInfo.toString() + " exception info:" + e3.getStackTrace().toString());
            MethodCollector.o(8047);
            throw unsatisfiedLinkError;
        }
    }
}
