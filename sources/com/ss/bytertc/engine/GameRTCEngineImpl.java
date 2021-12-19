package com.ss.bytertc.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.bytertc.base.utils.NetworkConnectChangeReceiver;
import com.ss.bytertc.base.utils.NetworkUtils;
import com.ss.bytertc.engine.GameRTCEngine;
import com.ss.bytertc.engine.adapter.VideoSinkTask;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.game.GameRTCOrientationInfo;
import com.ss.bytertc.engine.game.GameRTCPositionInfo;
import com.ss.bytertc.engine.game.GameRTCReceiveRange;
import com.ss.bytertc.engine.game.GameRTCRoomConfig;
import com.ss.bytertc.engine.handler.GameRTCEventHandler;
import com.ss.bytertc.engine.handler.IGameRTCEventHandler;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import java.io.File;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.ThreadUtils;

public final class GameRTCEngineImpl extends GameRTCEngine {
    private static GameRTCEngineImpl mInstance;
    private static boolean mLibraryLoaded;
    private static EglBase mRootEglBase = null;
    private static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    private NetworkConnectChangeReceiver.Callback SetNetworkTypeCallback = new GameRTCEngineImpl$$Lambda$1(this);
    private AppMonitor.Callback appStateCallback = new GameRTCEngineImpl$$Lambda$0(this);
    private BroadcastReceiver mBroadcastReceiver;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private GameRTCEventHandler mEngineEventHandler;
    private boolean mIsUseCustomEglEnv;
    private LogUtil.LoggerSink mLoggerSink = new LogUtil.LoggerSink() {
        /* class com.ss.bytertc.engine.GameRTCEngineImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(100748);
        }

        @Override // com.ss.bytertc.engine.utils.LogUtil.LoggerSink
        public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
            IGameRTCEventHandler gameRTCEventHandler = GameRTCEngineImpl.getGameRTCEventHandler();
            if (gameRTCEventHandler != null) {
                try {
                    gameRTCEventHandler.onLoggerMessage(logLevel, str, th);
                } catch (Exception e2) {
                    LogUtil.e("GameRTCEngineImpl", "Exception in App thread when handler onLoggerMessage , e : " + e2.getMessage());
                }
            }
        }
    };
    private long mNativeGameRtcEngine = -1;
    private IGameRTCEventHandler mRtcEngineHandler;
    private VideoSinkTask mVideoSinkTask;

    public static int com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$1$GameRTCEngineImpl() {
        initEglContext(null);
    }

    static final /* synthetic */ void lambda$doDestroy$2$GameRTCEngineImpl() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
    }

    static {
        Covode.recordClassIndex(100743);
        loadSoFile();
    }

    public static String getSDKVersion() {
        MethodCollector.i(10343);
        if (!mLibraryLoaded) {
            MethodCollector.o(10343);
            return "";
        }
        String nativeGetSDKVersion = NativeGameFunctions.nativeGetSDKVersion();
        MethodCollector.o(10343);
        return nativeGetSDKVersion;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final void DisableExternalAudioDevice() {
        MethodCollector.i(11455);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, DisableExternalAudioDevice failed.");
            MethodCollector.o(11455);
            return;
        }
        NativeGameFunctions.nativeDisableExternalAudioDevice(j2);
        MethodCollector.o(11455);
    }

    public static IGameRTCEventHandler getGameRTCEventHandler() {
        MethodCollector.i(10340);
        synchronized (GameRTCEngineImpl.class) {
            try {
                GameRTCEngineImpl gameRTCEngineImpl = mInstance;
                if (gameRTCEngineImpl == null) {
                    com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("GameRTCEngineImpl", "mInstance == null");
                    return null;
                }
                IGameRTCEventHandler iGameRTCEventHandler = gameRTCEngineImpl.mRtcEngineHandler;
                if (iGameRTCEventHandler == null) {
                    com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("GameRTCEngineImpl", "mInstance.mRtcEngineHandler == null");
                    MethodCollector.o(10340);
                    return null;
                }
                MethodCollector.o(10340);
                return iGameRTCEventHandler;
            } finally {
                MethodCollector.o(10340);
            }
        }
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else if (mRtcNativeLibraryLoader != null) {
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
        } else {
            try {
                mLibraryLoaded &= mRtcNativeLibraryLoader.load("byteaudio");
                com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("volcenginertc");
                mLibraryLoaded = true;
                mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
            } catch (UnsatisfiedLinkError e2) {
                LogUtil.e("GameRTCEngineImpl", "Failed to load native library: volcenginertc", e2);
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
            }
        }
    }

    public final void doDestroy() {
        MethodCollector.i(10342);
        LogUtil.d("GameRTCEngineImpl", "destroy GameRTCEngineImpl.");
        if (this.mNativeGameRtcEngine == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, no need to destroy now.");
            MethodCollector.o(10342);
            return;
        }
        NetworkUtils.unregisterReceiver(this.mContext, this.mBroadcastReceiver);
        this.mBroadcastReceiver = null;
        AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
        NativeGameFunctions.nativeDestroyEngine(this.mNativeGameRtcEngine);
        this.mNativeGameRtcEngine = -1;
        mInstance = null;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, GameRTCEngineImpl$$Lambda$3.$instance);
        HandlerThread handlerThread = this.mEglThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        MethodCollector.o(10342);
    }

    public static void com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static Context com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static File com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$GameRTCEngineImpl(int i2) {
        String str;
        MethodCollector.i(11634);
        long j2 = this.mNativeGameRtcEngine;
        if (i2 == 1) {
            str = "active";
        } else {
            str = "background";
        }
        NativeGameFunctions.nativeSetAppState(j2, str);
        MethodCollector.o(11634);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$3$GameRTCEngineImpl(int i2) {
        MethodCollector.i(11460);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, SetNetworkType failed.");
            MethodCollector.o(11460);
            return;
        }
        NativeGameFunctions.nativeSetNetworkType(j2, i2);
        MethodCollector.o(11460);
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int leaveRoom(String str) {
        MethodCollector.i(10500);
        LogUtil.d("GameRTCEngineImpl", "leaveRoom");
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, leaveRoom failed.");
            MethodCollector.o(10500);
            return -1;
        }
        NativeGameFunctions.nativeLeaveRoom(j2, str);
        MethodCollector.o(10500);
        return 0;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int pullExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.i(11457);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
            MethodCollector.o(11457);
            return -1;
        } else if (NativeGameFunctions.nativePullExternalAudioFrame(j2, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.o(11457);
            return 0;
        } else {
            MethodCollector.o(11457);
            return -2;
        }
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int pushExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.i(11456);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
            MethodCollector.o(11456);
            return -1;
        } else if (NativeGameFunctions.nativePushExternalAudioFrame(j2, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.o(11456);
            return 0;
        } else {
            MethodCollector.o(11456);
            return -2;
        }
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final void setAudioScenario(GameRTCEngine.AudioScenarioType audioScenarioType) {
        MethodCollector.i(11458);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, SetAudioScenario failed.");
            MethodCollector.o(11458);
            return;
        }
        NativeGameFunctions.nativeSetAudioScenario(j2, audioScenarioType.value());
        MethodCollector.o(11458);
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int setPlaybackVolume(int i2) {
        MethodCollector.i(11138);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, setPlaybackVolume failed.");
            MethodCollector.o(11138);
            return -1;
        }
        int nativeSetPlaybackVolume = NativeGameFunctions.nativeSetPlaybackVolume(j2, i2);
        MethodCollector.o(11138);
        return nativeSetPlaybackVolume;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int setRecordingVolume(int i2) {
        MethodCollector.i(11137);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, setRecordingVolume failed.");
            MethodCollector.o(11137);
            return -1;
        }
        int nativeSetRecordingVolume = NativeGameFunctions.nativeSetRecordingVolume(j2, i2);
        MethodCollector.o(11137);
        return nativeSetRecordingVolume;
    }

    private void initEglContext(Object obj) {
        if (obj == null) {
            mRootEglBase = EglBase$$CC.create$$STATIC$$();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof EGLContext) {
            mRootEglBase = EglBase$$CC.createEgl10$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof android.opengl.EGLContext) {
            mRootEglBase = EglBase$$CC.createEgl14$$STATIC$$((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            mRootEglBase = EglBase$$CC.create$$STATIC$$(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            mRootEglBase = EglBase$$CC.create$$STATIC$$();
        }
        this.mIsUseCustomEglEnv = true;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int enableAudioSend(String str, boolean z) {
        MethodCollector.i(10803);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, enableAudioSend failed.");
            MethodCollector.o(10803);
            return -1;
        }
        int nativeEnableAudioSend = NativeGameFunctions.nativeEnableAudioSend(j2, str, z);
        MethodCollector.o(10803);
        return nativeEnableAudioSend;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int enableMicrophone(String str, boolean z) {
        MethodCollector.i(10802);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, enableMicrophone failed.");
            MethodCollector.o(10802);
            return -1;
        }
        int nativeEnableMicrophone = NativeGameFunctions.nativeEnableMicrophone(j2, str, z);
        MethodCollector.o(10802);
        return nativeEnableMicrophone;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int enableSpeakerphone(String str, boolean z) {
        MethodCollector.i(10804);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, enableSpeakerphone failed.");
            MethodCollector.o(10804);
            return -1;
        } else if (str == null) {
            LogUtil.e("GameRTCEngineImpl", "roomid is invalid, enableSpeakerphone failed.");
            MethodCollector.o(10804);
            return -1;
        } else {
            int nativeEnableSpeakerphone = NativeGameFunctions.nativeEnableSpeakerphone(j2, str, z);
            MethodCollector.o(10804);
            return nativeEnableSpeakerphone;
        }
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int updateOrientation(String str, GameRTCOrientationInfo gameRTCOrientationInfo) {
        MethodCollector.i(10653);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, updateOrientation failed.");
            MethodCollector.o(10653);
            return -1;
        }
        int nativeUpdateOrientation = NativeGameFunctions.nativeUpdateOrientation(j2, str, gameRTCOrientationInfo.x_axis_0, gameRTCOrientationInfo.x_axis_1, gameRTCOrientationInfo.x_axis_2, gameRTCOrientationInfo.y_axis_0, gameRTCOrientationInfo.y_axis_1, gameRTCOrientationInfo.y_axis_2, gameRTCOrientationInfo.z_axis_0, gameRTCOrientationInfo.z_axis_1, gameRTCOrientationInfo.z_axis_2);
        MethodCollector.o(10653);
        return nativeUpdateOrientation;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int updatePosition(String str, GameRTCPositionInfo gameRTCPositionInfo) {
        MethodCollector.i(10503);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, updatePosition failed.");
            MethodCollector.o(10503);
            return -1;
        }
        int nativeUpdatePosition = NativeGameFunctions.nativeUpdatePosition(j2, str, gameRTCPositionInfo.x, gameRTCPositionInfo.y, gameRTCPositionInfo.z);
        MethodCollector.o(10503);
        return nativeUpdatePosition;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int updateReceiveRange(String str, GameRTCReceiveRange gameRTCReceiveRange) {
        MethodCollector.i(10502);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, updateReceiveRange failed.");
            MethodCollector.o(10502);
            return -1;
        }
        int nativeUpdateReceiveRange = NativeGameFunctions.nativeUpdateReceiveRange(j2, str, gameRTCReceiveRange.min, gameRTCReceiveRange.max);
        MethodCollector.o(10502);
        return nativeUpdateReceiveRange;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int updateToken(String str, String str2) {
        MethodCollector.i(10501);
        LogUtil.d("GameRTCEngineImpl", "updateToken");
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, leaveRoom failed.");
            MethodCollector.o(10501);
            return -1;
        }
        int nativeUpdateToken = NativeGameFunctions.nativeUpdateToken(j2, str, str2);
        MethodCollector.o(10501);
        return nativeUpdateToken;
    }

    private JSONObject AddParameters(JSONObject jSONObject, Context context) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String path = com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getPath();
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

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final void EnableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2) {
        MethodCollector.i(11448);
        if (this.mNativeGameRtcEngine == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, EnableExternalAudioDevice failed.");
            MethodCollector.o(11448);
        } else if (audioFormat.sampleRate == null || audioFormat.channel == null || audioFormat2.sampleRate == null || audioFormat2.channel == null) {
            LogUtil.e("GameRTCEngineImpl", "parameter is invalid, EnableExternalAudioDevice failed.");
            MethodCollector.o(11448);
        } else {
            NativeGameFunctions.nativeEnableExternalAudioDevice(this.mNativeGameRtcEngine, audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat2.sampleRate.value(), audioFormat2.channel.value());
            MethodCollector.o(11448);
        }
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int enableAudioReceive(String str, String str2, boolean z) {
        MethodCollector.i(10972);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, enableAudioReceive failed.");
            MethodCollector.o(10972);
            return -1;
        }
        int nativeEnableAudioReceive = NativeGameFunctions.nativeEnableAudioReceive(j2, str, str2, z);
        MethodCollector.o(10972);
        return nativeEnableAudioReceive;
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int setRemoteAudioPlaybackVolume(String str, String str2, int i2) {
        MethodCollector.i(11294);
        long j2 = this.mNativeGameRtcEngine;
        if (j2 == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
            MethodCollector.o(11294);
            return -1;
        }
        int nativeSetRemoteAudioPlaybackVolume = NativeGameFunctions.nativeSetRemoteAudioPlaybackVolume(j2, str, str2, i2);
        MethodCollector.o(11294);
        return nativeSetRemoteAudioPlaybackVolume;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GameRTCEngineImpl(android.content.Context r18, com.ss.bytertc.engine.game.GameRTCEngineConfig r19, com.ss.bytertc.engine.handler.IGameRTCEventHandler r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.GameRTCEngineImpl.<init>(android.content.Context, com.ss.bytertc.engine.game.GameRTCEngineConfig, com.ss.bytertc.engine.handler.IGameRTCEventHandler, java.lang.String):void");
    }

    @Override // com.ss.bytertc.engine.GameRTCEngine
    public final int joinRoom(String str, String str2, String str3, GameRTCRoomConfig gameRTCRoomConfig) {
        MethodCollector.i(10499);
        LogUtil.d("GameRTCEngineImpl", "joinRoom with token: " + str3 + " , roomId: " + str + " and userId: " + str2);
        if (this.mNativeGameRtcEngine == -1) {
            LogUtil.e("GameRTCEngineImpl", "native engine is invalid, joinRoom failed.");
            MethodCollector.o(10499);
            return -3;
        } else if (str2 == null || str2.length() == 0) {
            LogUtil.e("GameRTCEngineImpl", "userId is invalid, joinRoom failed.");
            MethodCollector.o(10499);
            return -2;
        } else if (str == null || str.length() == 0) {
            LogUtil.e("GameRTCEngineImpl", "roomId is invalid, joinRoom failed.");
            MethodCollector.o(10499);
            return -1;
        } else {
            int nativeJoinRoom = NativeGameFunctions.nativeJoinRoom(this.mNativeGameRtcEngine, str, str2, str3, gameRTCRoomConfig.enableRangeAudio, gameRTCRoomConfig.enableSpatialAudio, gameRTCRoomConfig.audioVolumeIndicationInterval, gameRTCRoomConfig.roomType.value());
            if (nativeJoinRoom < 0) {
                MethodCollector.o(10499);
                return nativeJoinRoom;
            }
            MethodCollector.o(10499);
            return 0;
        }
    }
}
