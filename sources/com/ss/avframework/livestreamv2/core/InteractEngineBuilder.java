package com.ss.avframework.livestreamv2.core;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.utils.AVLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import org.json.JSONObject;

public class InteractEngineBuilder {
    private boolean mAdjustStreamResolutionOnInteract = true;
    private LiveCore.Builder mBuilder;
    private boolean mByteAudioEnabled = false;
    private JSONObject mDumpFrameParams;
    private boolean mEnableRtcPushStatics = false;
    private boolean mEnableSendContourInfoToRtc = false;
    public boolean mKeepLiveCoreCapture = false;
    private WeakReference<LiveCore> mLiveCore = new WeakReference<>(null);
    private Handler mLogUploadThreadHandler;
    private Config.MixStreamType mMixStreamType;
    private String mOriginUrl;
    private boolean mPkAudienceSetUpConnectionOptimize;
    private boolean mPushStreamSwitchAfterServerMixStream;
    private boolean mRenderOffInFMMode = true;
    private int mRtcOnLoggerMessageLevel;
    private boolean mStatusLiveStreamIsAudioCaptured;
    private boolean mStatusLiveStreamIsPushed;
    private String mStreamUrl;
    private String mUUID;
    public boolean mUseInteractAudioClient = false;
    public boolean mUseInteractAudioSink = false;
    private Handler mVideoThreadHandler;
    private Handler mWorkThreadHandler;

    static {
        Covode.recordClassIndex(100071);
    }

    public boolean getAdjustStreamResolutionOnInteract() {
        return this.mAdjustStreamResolutionOnInteract;
    }

    public JSONObject getDumpFrameParams() {
        return this.mDumpFrameParams;
    }

    public LiveCore.Builder getLiveCoreBuilder() {
        return this.mBuilder;
    }

    public Handler getLogUploadThreadHandler() {
        return this.mLogUploadThreadHandler;
    }

    public Config.MixStreamType getMixStreamType() {
        return this.mMixStreamType;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    public boolean getPkAudienceSetUpConnectionOptimize() {
        return this.mPkAudienceSetUpConnectionOptimize;
    }

    public boolean getPushStreamSwitchAfterServerMixStream() {
        return this.mPushStreamSwitchAfterServerMixStream;
    }

    public int getRtcOnLoggerMessageLevel() {
        return this.mRtcOnLoggerMessageLevel;
    }

    public String getStreamUrl() {
        return this.mStreamUrl;
    }

    public String getUUID() {
        return this.mUUID;
    }

    public Handler getVideoThreadHander() {
        return this.mVideoThreadHandler;
    }

    public Handler getWorkThreadHandler() {
        return this.mWorkThreadHandler;
    }

    public boolean isByteAudioEnabled() {
        return this.mByteAudioEnabled;
    }

    public boolean isEnableRtcPushStatics() {
        return this.mEnableRtcPushStatics;
    }

    public boolean isEnableSendContourInfoToRtc() {
        return this.mEnableSendContourInfoToRtc;
    }

    public boolean isRenderOffInFMMode() {
        return this.mRenderOffInFMMode;
    }

    public boolean isStatusLiveStreamIsAudioCaptured() {
        return this.mStatusLiveStreamIsAudioCaptured;
    }

    public LiveCore getLiveCore() {
        return this.mLiveCore.get();
    }

    public InteractEngineBuilder() {
        AVLog.logToIODevice(4, "InteractEngineBuilder", this + ".<init>()", new Throwable());
    }

    public InteractEngine create() {
        try {
            Constructor<?> constructor = Class.forName("com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl").getConstructor(InteractEngineBuilder.class);
            constructor.setAccessible(true);
            return (InteractEngine) constructor.newInstance(this);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isStatusLiveStreamIsPushed() {
        AVLog.ioi("InteractEngineBuilder", this + ".isStatusLiveStreamIsPushed() " + this.mStatusLiveStreamIsPushed);
        return this.mStatusLiveStreamIsPushed;
    }

    /* access modifiers changed from: package-private */
    public InteractEngineBuilder setAdjustStreamResolutionOnInteract(boolean z) {
        this.mAdjustStreamResolutionOnInteract = z;
        return this;
    }

    public InteractEngineBuilder setByteAudioEnabled(boolean z) {
        this.mByteAudioEnabled = z;
        return this;
    }

    public InteractEngineBuilder setDumpFrameParams(JSONObject jSONObject) {
        this.mDumpFrameParams = jSONObject;
        return this;
    }

    public InteractEngineBuilder setEnableSendContourInfoToRtc(boolean z) {
        this.mEnableSendContourInfoToRtc = z;
        return this;
    }

    public InteractEngineBuilder setLiveCoreBuilder(LiveCore.Builder builder) {
        this.mBuilder = builder;
        return this;
    }

    public InteractEngineBuilder setLogUploadThreadHandler(Handler handler) {
        this.mLogUploadThreadHandler = handler;
        return this;
    }

    public InteractEngineBuilder setMixStreamType(Config.MixStreamType mixStreamType) {
        this.mMixStreamType = mixStreamType;
        return this;
    }

    public InteractEngineBuilder setOriginUrl(String str) {
        this.mOriginUrl = str;
        return this;
    }

    public InteractEngineBuilder setPkAudienceSetUpConnectionOptimize(boolean z) {
        this.mPkAudienceSetUpConnectionOptimize = z;
        return this;
    }

    public InteractEngineBuilder setPushStreamSwitchAfterServerMixStream(boolean z) {
        this.mPushStreamSwitchAfterServerMixStream = z;
        return this;
    }

    public InteractEngineBuilder setRenderOffInFMMode(boolean z) {
        this.mRenderOffInFMMode = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    public InteractEngineBuilder setRtcOnLoggerMessageLevel(int i2) {
        this.mRtcOnLoggerMessageLevel = i2;
        return this;
    }

    public InteractEngineBuilder setRtcPushStatics(boolean z) {
        this.mEnableRtcPushStatics = z;
        return this;
    }

    public InteractEngineBuilder setStreamUrl(String str) {
        this.mStreamUrl = str;
        return this;
    }

    public InteractEngineBuilder setUUID(String str) {
        this.mUUID = str;
        return this;
    }

    public InteractEngineBuilder setVideoThreadHandler(Handler handler) {
        this.mVideoThreadHandler = handler;
        return this;
    }

    public InteractEngineBuilder setWorkThreadHandler(Handler handler) {
        this.mWorkThreadHandler = handler;
        return this;
    }

    public InteractEngineBuilder setLiveCore(LiveCore liveCore) {
        this.mLiveCore = new WeakReference<>(liveCore);
        return this;
    }

    public InteractEngineBuilder setStatusLiveStreamIsAudioCaptured(boolean z) {
        AVLog.logToIODevice(4, "InteractEngineBuilder", this + ".setStatusLiveStreamIsAudioCaptured(" + z + ")", new Throwable());
        this.mStatusLiveStreamIsAudioCaptured = z;
        return this;
    }

    public InteractEngineBuilder setStatusLiveStreamIsPushed(boolean z) {
        AVLog.logToIODevice(4, "InteractEngineBuilder", this + ".setStatusLiveStreamIsPushed(" + z + ")", new Throwable());
        this.mStatusLiveStreamIsPushed = z;
        return this;
    }
}
