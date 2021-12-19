package com.ss.avframework.livestreamv2.core;

import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.MediaSource;
import com.ss.avframework.engine.MediaTrack;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.engine.VsyncModule;
import com.ss.avframework.livestreamv2.IDualGameEngine;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.ktv.IKaraokeMovie;
import com.ss.avframework.livestreamv2.log.ILogUploader;
import com.ss.avframework.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.avframework.livestreamv2.sdkparams.PushBase;
import com.ss.avframework.livestreamv2.tinyjson.NumberInitializer;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.GLTracer;
import com.ss.avframework.player.IAVPlayer;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONObject;

public abstract class LiveCore implements ILiveStream {
    protected ILiveCoreWarningListener mWarningListener;

    public interface ILiveCoreTextureFrameAvailableListener extends ILiveStream.ITextureFrameAvailableListener {
        static {
            Covode.recordClassIndex(100088);
        }

        void onTextureFrameAvailable(EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr);
    }

    public interface ILiveCoreWarningListener {
        static {
            Covode.recordClassIndex(100089);
        }

        void onWarning(int i2, int i3, Exception exc);
    }

    public interface ILiveForInteractListener {
        static {
            Covode.recordClassIndex(100090);
        }

        void onDispose();

        void onPause();

        void onResume();

        void stopInteract();

        void updateAuthInfo(JSONObject jSONObject, Client.FrameType frameType);

        void updateOriginUrl(String str);

        void updateSei(String str, Object obj);

        void updateStreamUrl(String str);
    }

    public interface IPushFrameAfterCapture {
        static {
            Covode.recordClassIndex(100091);
        }

        void release();

        void start(Surface surface);

        void stop();

        void toAddSurfaceViewCallback();

        void toRemoveSurfaceViewCallback();
    }

    public interface RtcExtraDataListener {
        static {
            Covode.recordClassIndex(100094);
        }

        void onRtcData(String str, String str2);

        void onRtcData(String str, ByteBuffer byteBuffer);
    }

    static {
        Covode.recordClassIndex(100083);
    }

    public abstract void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void changeToKTVMode(boolean z, IKaraokeMovie iKaraokeMovie) {
    }

    public abstract Client create(InteractConfig interactConfig);

    public abstract IPushFrameAfterCapture createControlPushFrameAfterCapture(int i2, int i3);

    public abstract IAVPlayer createPlayer();

    public abstract MediaTrack createTrack(MediaSource mediaSource, String str);

    public abstract AudioDeviceModule getADM();

    public abstract IAudioDeviceControl getAudioDeviceControl();

    public abstract View getCurrentDisplay();

    public abstract IDualGameEngine getDualGameEngine();

    public abstract IGameEngine getGameEngine();

    /* access modifiers changed from: protected */
    public abstract Builder getInternalBuilder();

    public abstract ILayerControl getLayerControl();

    public abstract boolean getPreviewFitMode();

    public abstract boolean getPreviewMirror(boolean z);

    public abstract List<String> getUrls();

    public abstract VsyncModule getVsyncModule();

    /* access modifiers changed from: protected */
    public abstract Handler getWorkThreadHandler();

    public void interactInfoReport(String str, Object obj, int i2, long j2, String str2, Object... objArr) {
    }

    public void interactStart() {
    }

    public void interactStop() {
    }

    public void notifyLiveStreamAdjustResolution(boolean z, int i2, int i3) {
    }

    public void pause(Object obj) {
    }

    public void pushMixedAudio() {
    }

    public void pushMixedMetaData() {
    }

    public void pushMixedVideo() {
    }

    public void pushSeiData(int i2, String str, int i3, int i4, int i5, float[] fArr, int i6, long j2, ByteBuffer byteBuffer) {
    }

    public void registerInteractListener(ILiveForInteractListener iLiveForInteractListener) {
    }

    public void release(Object obj) {
    }

    public abstract void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void resume(Object obj) {
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
    }

    public void setAudioMute(boolean z, Object obj) {
    }

    public abstract void setDisplay(View view);

    public abstract void setDisplay(View view, long j2);

    public abstract void setDisplayPlanarRender(boolean z);

    public void setInteractStatus(boolean z) {
    }

    public void setMixStreamType(Config.MixStreamType mixStreamType) {
    }

    public abstract void setPreviewFitMode(boolean z);

    public abstract void setPreviewMirror(boolean z, boolean z2);

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setRenderSink(VideoSink videoSink) {
    }

    public void setRtcExtraDataListener(RtcExtraDataListener rtcExtraDataListener) {
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
    }

    public void startAudioCapture(Object obj) {
    }

    public abstract int startAudioPlayer();

    public abstract void startInternal(List<String> list);

    public abstract void startInternalAudioCapture();

    public void startVideoCapture(Object obj) {
    }

    public void stopAudioCapture(Object obj) {
    }

    public abstract int stopAudioPlayer();

    public abstract void stopInternal();

    public abstract void stopInternalAudioCapture();

    public void stopVideoCapture(Object obj) {
    }

    public void switchAudioCapture(int i2, Object obj) {
    }

    public void switchVideoCapture(int i2, Object obj) {
    }

    public static class Builder extends LiveStreamBuilder {
        private boolean enableRtcExtraDataPeriodSend;
        private String mAdmPlayerType = "opensles";
        private String mAdmRecordingType = "opensles";
        private JSONObject mAdmServerCfg = null;
        private int mAdmType = 0;
        private boolean mInteractSingleViewMode;
        public ILogMonitor mLogMonitor = new ILogMonitor() {
            /* class com.ss.avframework.livestreamv2.core.LiveCore.Builder.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100085);
            }

            @Override // com.ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor
            public void onLogMonitor(String str, JSONObject jSONObject) {
            }
        };
        private boolean mMergeRtcExtraDataToLiveStream = false;
        private boolean mUsingLiveCoreAudioCaptureOnServerInteractMode;
        private IVideoEffectProcessor mVideoEffectProcessor;

        public interface ILogMonitor {
            static {
                Covode.recordClassIndex(100087);
            }

            void onLogMonitor(String str, JSONObject jSONObject);
        }

        static {
            Covode.recordClassIndex(100084);
        }

        public void setInteractSingleViewMode(boolean z) {
        }

        @Override // com.ss.avframework.livestreamv2.LiveStreamBuilder
        public Builder setLogUploader(ILogUploader iLogUploader) {
            return this;
        }

        public ILogMonitor getLogMonitor() {
            return this.mLogMonitor;
        }

        public IVideoEffectProcessor getVideoEffectProcessor() {
            return this.mVideoEffectProcessor;
        }

        public boolean isEnableRtcExtraDataPeriodSend() {
            return this.enableRtcExtraDataPeriodSend;
        }

        public boolean isGameUseCameraMainMode() {
            return this.mInteractSingleViewMode;
        }

        public boolean isXSGameFillMode() {
            return this.mInteractSingleViewMode;
        }

        public boolean needMergeRtcExtraDataToLiveStream() {
            return this.mMergeRtcExtraDataToLiveStream;
        }

        public boolean enableInteractPushFrameStatics() {
            return getSdkSetting().enableRtcPushStreamStatics;
        }

        public JSONObject getAdmServerCfg() {
            return getPushBase().admServerConfig;
        }

        public boolean getPkAudienceSetUpConnectionOptimize() {
            return getPushBase().pkAudienceSetupConnectionOptimize;
        }

        public boolean getPushStreamSwitchAfterServerMixStream() {
            return getPushBase().enablePushStreamSwitchAfterServerMixStream;
        }

        public int getRtcOnLoggerMessageLevel() {
            return getPushBase().rtconLoggerMessageLevel;
        }

        public boolean isEnableADMRenderReadMode() {
            return getSdkSetting().admRenderMode;
        }

        public boolean isEnableAecOnHeadsetMode() {
            return getPushBase().enableAecOnHeadsetMode;
        }

        public boolean isVideoRangeInRTC() {
            return getSdkSetting().videoRangeModeInRtc;
        }

        public boolean usingAecV2Algorithm() {
            return getSdkSetting().enableAecV2Algorithm;
        }

        public boolean usingAudioAgcOnAecV2Mode() {
            return getSdkSetting().agcEnableOnAecV2Mode;
        }

        public int usingAudioRNNoise() {
            return getSdkSetting().nsModeOnAecV2;
        }

        @Override // com.ss.avframework.livestreamv2.LiveStreamBuilder
        public LiveCore createDummy() {
            return new DummyLiveCoreImpl(this);
        }

        public int getAdmType() {
            getPushBase();
            if (getAudioCaptureDevice() != 5) {
                return 0;
            }
            return getPushBase().admType;
        }

        public int getVideoClientMixerBitrate() {
            PushBase.MixOnClient mixOnClient = getPushBase().mixOnClient;
            if (mixOnClient != null && NumberInitializer.isDefined(Integer.valueOf(mixOnClient.mixDefaultBitrate))) {
                return mixOnClient.mixDefaultBitrate;
            }
            return 0;
        }

        public int getVideoClientMixerMaxBitrate() {
            PushBase.MixOnClient mixOnClient = getPushBase().mixOnClient;
            if (mixOnClient != null && NumberInitializer.isDefined(Integer.valueOf(mixOnClient.mixMaxBitrate))) {
                return mixOnClient.mixMaxBitrate;
            }
            return 0;
        }

        public int getVideoClientMixerMinBitrate() {
            PushBase.MixOnClient mixOnClient = getPushBase().mixOnClient;
            if (mixOnClient != null && NumberInitializer.isDefined(Integer.valueOf(mixOnClient.mixMinBitRate))) {
                return mixOnClient.mixMinBitRate;
            }
            return 0;
        }

        public boolean isNeedChangeBitrateWhenClientMixer() {
            if (getPushBase().mixOnClient == null || !getPushBase().mixOnClient.needChangeBitrateWhenClientMixer) {
                return false;
            }
            return true;
        }

        public boolean isUsingExternAudioCaptureOnServerInteractMode() {
            AVLog.iow("LiveCore", "LiveCore.isUsingExternAudioCaptureOnServerInteractMode(): " + this.mUsingLiveCoreAudioCaptureOnServerInteractMode);
            return this.mUsingLiveCoreAudioCaptureOnServerInteractMode;
        }

        @Override // com.ss.avframework.livestreamv2.LiveStreamBuilder
        public LiveCore create() {
            AVLog.logKibana(5, "SDK_PARAMS", "sdkParams Params:" + getSdkParams(), null);
            AVLog.iow("SDK_PARAMS", "sdkParams Params:" + getSdkParams());
            return new LiveCoreImpl(this);
        }

        private Builder setEnableRtcExtraDataPeriodSend(boolean z) {
            this.enableRtcExtraDataPeriodSend = z;
            return this;
        }

        public void enableGameMode(boolean z) {
            this.mInteractSingleViewMode = z;
        }

        public void enableXSGameFillMode(boolean z) {
            this.mInteractSingleViewMode = z;
        }

        public void setMergeRtcExtraDataToLiveStream(boolean z) {
            this.mMergeRtcExtraDataToLiveStream = z;
        }

        public Builder setVideoEffectProcessor(IVideoEffectProcessor iVideoEffectProcessor) {
            this.mVideoEffectProcessor = iVideoEffectProcessor;
            return this;
        }

        public void enableAecOnHeadsetMode(boolean z) {
            getPushBase().enableAecOnHeadsetMode = z;
        }

        public void setUsingAecV2Algorithm(boolean z) {
            getSdkSetting().enableAecV2Algorithm = z;
        }

        public Builder setLogMonitor(ILogMonitor iLogMonitor) {
            this.mLogMonitor = iLogMonitor;
            this.mLogUploader = new ILogUploader() {
                /* class com.ss.avframework.livestreamv2.core.LiveCore.Builder.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(100086);
                }

                @Override // com.ss.avframework.livestreamv2.log.ILogUploader
                public void uploadLog(JSONObject jSONObject) {
                    Builder.this.mLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                }
            };
            return this;
        }

        public String getAdmApiType(boolean z) {
            String str;
            LiveSdkSetting sdkSetting = getSdkSetting();
            if (z) {
                str = sdkSetting.admRecordingType;
            } else {
                str = sdkSetting.admPlayerType;
            }
            if (AudioDeviceModule.isValidAdmApiType(str)) {
                return str;
            }
            if (z) {
                return this.mAdmRecordingType;
            }
            return this.mAdmPlayerType;
        }

        public LiveStreamBuilder setVideoClientMixerBitrate(int i2) {
            if (getPushBase().mixOnClient != null) {
                getPushBase().mixOnClient.mixDefaultBitrate = i2;
            }
            return this;
        }

        public LiveStreamBuilder setVideoClientMixerMaxBitrate(int i2) {
            if (getPushBase().mixOnClient != null) {
                getPushBase().mixOnClient.mixMaxBitrate = i2;
            }
            return this;
        }

        public LiveStreamBuilder setVideoClientMixerMinBitrate(int i2) {
            if (getPushBase().mixOnClient != null) {
                getPushBase().mixOnClient.mixMinBitRate = i2;
            }
            return this;
        }

        public Builder setUsingExternAudioCaptureOnServerInteractMode(boolean z) {
            this.mUsingLiveCoreAudioCaptureOnServerInteractMode = z;
            AVLog.iow("LiveCore", "LiveCore.setUsingExternAudioCaptureOnServerInteractMode(" + z + ") stack: " + Log.getStackTraceString(new Exception()));
            return this;
        }

        @Override // com.ss.avframework.livestreamv2.LiveStreamBuilder
        public Builder setupSdkParams(String str) {
            super.setupSdkParams(str);
            if (str != null && !str.isEmpty()) {
                GLThreadManager.enableGlobalGlContextMutex(getSdkSetting().enableGlobalGlSharedContextMutex);
                GLTracer.setEnableGlTracer(getSdkSetting().enableGLTracer);
                if (NumberInitializer.isDefined(Integer.valueOf(getPushBase().liveGlVersion))) {
                    GLThreadManager.setGLVersion(getPushBase().liveGlVersion);
                }
                if (getPushBase().mixOnClient != null) {
                    PushBase.MixOnClient mixOnClient = getPushBase().mixOnClient;
                    if (NumberInitializer.isDefined(Integer.valueOf(mixOnClient.mixDefaultBitrate)) && NumberInitializer.isDefined(Integer.valueOf(mixOnClient.mixMinBitRate)) && NumberInitializer.isDefined(Integer.valueOf(mixOnClient.mixMaxBitrate))) {
                        getPushBase().mixOnClient.needChangeBitrateWhenClientMixer = true;
                    }
                }
                if (getSdkSetting().psnrStatisics != null) {
                    getSdkSetting().psnrStatisics.setEnablePsnr(true);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(getSdkSetting().logLevel))) {
                    AVLog.setLevel(getSdkSetting().logLevel);
                }
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2) {
            return createLiveStream(handler, handler2, null, null);
        }

        public void setAdmApiType(String str, boolean z) {
            if (!AudioDeviceModule.isValidAdmApiType(str)) {
                return;
            }
            if (z) {
                this.mAdmRecordingType = str;
            } else {
                this.mAdmPlayerType = str;
            }
        }

        public void setUsingAecV2Algorithm(boolean z, int i2) {
            getSdkSetting().enableAecV2Algorithm = z;
            getSdkSetting().nsModeOnAecV2 = i2;
        }

        public void setAdmType(int i2, JSONObject jSONObject) {
            if (i2 == 0 || i2 == 1) {
                getPushBase().admType = i2;
                getPushBase().admServerConfig = jSONObject;
            }
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
            return createLiveStream(handler, handler2, audioDeviceModule, null);
        }

        public void setUsingAecV2Algorithm(boolean z, int i2, boolean z2) {
            getSdkSetting().enableAecV2Algorithm = z;
            getSdkSetting().nsModeOnAecV2 = i2;
            getSdkSetting().agcEnableOnAecV2Mode = z2;
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
            return super.create(handler, handler2, audioDeviceModule, iVideoEffectProcessor);
        }
    }

    public static class InteractConfig extends Config {
        private String mBackgroundColor;
        private boolean mCheckInvalidateSei = true;
        private String mCreateClientStack;
        private boolean mEnabelProcStatics;
        private boolean mEnableInteractConnectionStatics;
        private boolean mEnableRemoteUserStatics = true;
        private String mMixStreamUrl;
        private Client.StreamMixer mMixer;
        private boolean mNeedToggleVideoSinkRenderable;
        private String mRtcABTestConfig;
        private UrlDispatcher mUrlDispatcher;

        public interface UrlDispatcher {
            static {
                Covode.recordClassIndex(100093);
            }

            String urlDispatch(String str);
        }

        static {
            Covode.recordClassIndex(100092);
        }

        public boolean checkInvalidateSei() {
            return this.mCheckInvalidateSei;
        }

        public String getBackgroundColor() {
            return this.mBackgroundColor;
        }

        public String getCreateClientStack() {
            return this.mCreateClientStack;
        }

        public String getMixStreamRtmpUrl() {
            return this.mMixStreamUrl;
        }

        public String getRtcABTestConfig() {
            return this.mRtcABTestConfig;
        }

        public Client.StreamMixer getStreamMixer() {
            return this.mMixer;
        }

        public UrlDispatcher getUrlDispatcher() {
            return this.mUrlDispatcher;
        }

        public boolean isEnabelProcStatics() {
            return this.mEnabelProcStatics;
        }

        public boolean isEnableInteractConnectionStatics() {
            return this.mEnableInteractConnectionStatics;
        }

        public boolean isEnableRemoteUserStatics() {
            return this.mEnableRemoteUserStatics;
        }

        public boolean isNeedToggleVideoSinkRenderable() {
            return this.mNeedToggleVideoSinkRenderable;
        }

        public int getBackgroundColorValue() {
            if (!TextUtils.isEmpty(this.mBackgroundColor)) {
                if (this.mBackgroundColor.startsWith("#")) {
                    this.mBackgroundColor = this.mBackgroundColor.substring(1);
                }
                try {
                    return Integer.valueOf(this.mBackgroundColor, 16).intValue();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return 0;
        }

        public InteractConfig setBackgroundColor(String str) {
            this.mBackgroundColor = str;
            return this;
        }

        public void setCheckInvalidateSei(boolean z) {
            this.mCheckInvalidateSei = z;
        }

        /* access modifiers changed from: package-private */
        public void setCreateClientStack(String str) {
            this.mCreateClientStack = str;
        }

        public void setEnabelProcStatics(boolean z) {
            this.mEnabelProcStatics = z;
        }

        public void setEnableInteractConnectionStatics(boolean z) {
            this.mEnableInteractConnectionStatics = z;
        }

        public void setEnableRemoteUserStatics(boolean z) {
            this.mEnableRemoteUserStatics = z;
        }

        public InteractConfig setMixStreamRtmpUrl(String str) {
            this.mMixStreamUrl = str;
            return this;
        }

        public InteractConfig setNeedToggleVideoSinkRenderable(boolean z) {
            this.mNeedToggleVideoSinkRenderable = z;
            return this;
        }

        public InteractConfig setRtcABTestConfig(String str) {
            this.mRtcABTestConfig = str;
            return this;
        }

        public InteractConfig setStreamMixer(Client.StreamMixer streamMixer) {
            this.mMixer = streamMixer;
            return this;
        }

        public void setUrlDispatcher(UrlDispatcher urlDispatcher) {
            this.mUrlDispatcher = urlDispatcher;
        }
    }

    public final Builder getBuilder() {
        return getInternalBuilder();
    }

    public void setWarningListener(ILiveCoreWarningListener iLiveCoreWarningListener) {
        this.mWarningListener = iLiveCoreWarningListener;
    }

    /* access modifiers changed from: protected */
    public void onWarning(int i2, int i3, Exception exc) {
        ILiveCoreWarningListener iLiveCoreWarningListener = this.mWarningListener;
        if (iLiveCoreWarningListener != null) {
            iLiveCoreWarningListener.onWarning(i2, i3, exc);
        }
    }
}
