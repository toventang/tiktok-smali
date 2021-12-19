package com.ss.avframework.livestreamv2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.livestreamv2.core.DummyLiveCoreImpl;
import com.ss.avframework.livestreamv2.log.ILogUploader;
import com.ss.avframework.livestreamv2.sdkparams.CaptureBase;
import com.ss.avframework.livestreamv2.sdkparams.KcpParams;
import com.ss.avframework.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.avframework.livestreamv2.sdkparams.NodeOptParams;
import com.ss.avframework.livestreamv2.sdkparams.PsnrStatisics;
import com.ss.avframework.livestreamv2.sdkparams.PushBase;
import com.ss.avframework.livestreamv2.sdkparams.QuicParams;
import com.ss.avframework.livestreamv2.sdkparams.RtmpCacheConfig;
import com.ss.avframework.livestreamv2.sdkparams.SandboxParams;
import com.ss.avframework.livestreamv2.tinyjson.NumberInitializer;
import com.ss.avframework.livestreamv2.tinyjson.TinyJson;
import com.ss.avframework.livestreamv2.utils.TextUtils;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.transport.ContextUtils;
import com.ss.avframework.transport.JNIUtils;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.GlobalControler;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TEBundle;
import java.util.List;
import org.json.JSONObject;

public class LiveStreamBuilder {
    public static final int AUDIO_CAPTURE_DEVICE_AUDIORECORD = 1;
    public static final int AUDIO_CAPTURE_DEVICE_OPENSL = 2;
    private Object assetManager;
    private int audioBitwidth = 16;
    private int audioQuantizeGapPeriod = 0;
    private JSONObject dumpFrameParams;
    private boolean effectAlgorithmAB;
    private String effectModePath;
    private String effectPlatformConfig;
    private Object effectResourceFinder;
    private boolean enableAudioEncodeAccelera = false;
    private String encryptedLiveAuth;
    boolean mAllowMicCaptureOnBackground = false;
    private Context mContext;
    private boolean mEnableKTV;
    protected ILogUploader mLogUploader;
    public String mProjectKey = null;
    private String mPushUrlPrefix = "";
    private int mRtmpPort = -1;
    protected JSONObject mSdkParams;
    private final LiveSdkSetting mSdkSetting = new LiveSdkSetting();
    private boolean mUseShareRecorder = true;
    private int rtmpReconnectIntervalSeconds = 3;
    private Intent screenCaptureIntent;
    private boolean useNewEffectEngine;
    private boolean useTTFaceDetect;
    private int videoGop = 0;
    private int videoHeight = 1280;
    private int videoLevel = 2;
    private int videoWidth = 720;
    private int vsyncModuleMaxIntevalOnFrameMs = 3000;
    private int vsyncModuleMaxIntevalOnNowMs = 500;

    static {
        Covode.recordClassIndex(99939);
    }

    private void parseVideoDumpSdkParams() {
    }

    public int getVideoMixerOutHeight() {
        return 0;
    }

    public int getVideoMixerOutWidth() {
        return 0;
    }

    public boolean is2DTransDisabled() {
        return false;
    }

    public boolean isCropScaleDisabled() {
        return false;
    }

    public boolean isDropFramesDisabled() {
        return false;
    }

    public boolean isEffectDisabled() {
        return false;
    }

    public boolean isUsingLiveStreamAudioCapture() {
        return true;
    }

    public LiveStreamBuilder setUsingLiveStreamAudioCapture(boolean z) {
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutHeight(int i2) {
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutWidth(int i2) {
        return this;
    }

    public Object getAssetManager() {
        return this.assetManager;
    }

    public int getAudioBitwidth() {
        return this.audioBitwidth;
    }

    public int getAudioQuantizeGapPeriod() {
        return this.audioQuantizeGapPeriod;
    }

    public Context getContext() {
        return this.mContext;
    }

    public JSONObject getDumpFrameParams() {
        return this.dumpFrameParams;
    }

    public boolean getEffectAlgorithmAB() {
        return this.effectAlgorithmAB;
    }

    public String getEffectModePath() {
        return this.effectModePath;
    }

    public String getEffectPlatformConfig() {
        return this.effectPlatformConfig;
    }

    public Object getEffectResourceFinder() {
        return this.effectResourceFinder;
    }

    public String getLiveAuthString() {
        return this.encryptedLiveAuth;
    }

    public ILogUploader getLogUploader() {
        return this.mLogUploader;
    }

    public String getPushUrlPrefix() {
        return this.mPushUrlPrefix;
    }

    public int getRtmpPort() {
        return this.mRtmpPort;
    }

    public int getRtmpReconnectIntervalSeconds() {
        return this.rtmpReconnectIntervalSeconds;
    }

    public Intent getScreenCaptureIntent() {
        return this.screenCaptureIntent;
    }

    public JSONObject getSdkParams() {
        return this.mSdkParams;
    }

    public LiveSdkSetting getSdkSetting() {
        return this.mSdkSetting;
    }

    public int getVideoGop() {
        return this.videoGop;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoLevel() {
        return this.videoLevel;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getVsyncModuleMaxIntevalOnFrameMs() {
        return this.vsyncModuleMaxIntevalOnFrameMs;
    }

    public int getVsyncModuleMaxIntevalOnNowMs() {
        return this.vsyncModuleMaxIntevalOnNowMs;
    }

    public boolean isAllowMicCaptureOnBackground() {
        return this.mAllowMicCaptureOnBackground;
    }

    public boolean isEnableAudioEncodeAccelera() {
        return this.enableAudioEncodeAccelera;
    }

    public boolean isEnableKTV() {
        return this.mEnableKTV;
    }

    public boolean isUseNewEffectEngine() {
        return this.useNewEffectEngine;
    }

    public boolean isUseShareRecorder() {
        return this.mUseShareRecorder;
    }

    public boolean isUseTTFaceDetect() {
        return this.useTTFaceDetect;
    }

    public ILiveStream create() {
        return new LiveStream(this);
    }

    public ILiveStream createDummy() {
        return new DummyLiveCoreImpl(this);
    }

    public boolean enableKaraokeRegulator() {
        return getSdkSetting().enableKaraokeRegulator;
    }

    public boolean getAdjustStreamResolutionOnInteract() {
        return getPushBase().adjustStreamResolutionOnInteract;
    }

    public int getAudioBitrate() {
        return getPushBase().audioBitrate;
    }

    public int getAudioCaptureBitwidth() {
        return getAudioCaptureParams().audioCaptureBitwidth;
    }

    public int getAudioCaptureChannel() {
        return getAudioCaptureParams().channel;
    }

    public int getAudioCaptureChannelOnVoIP() {
        return getAudioCaptureParams().channelOnVoIP;
    }

    public int getAudioCaptureDevice() {
        return getAudioCaptureParams().device;
    }

    public CaptureBase.AudioCaptureParams getAudioCaptureParams() {
        return this.mSdkSetting.captureBase.audioCapture;
    }

    public int getAudioCaptureSampleHZ() {
        return getAudioCaptureParams().sample;
    }

    public int getAudioCaptureSampleHZOnVoIP() {
        return getAudioCaptureParams().sampleOnVoIP;
    }

    public int getAudioChannel() {
        return getPushBase().audioChannel;
    }

    public int getAudioEncoder() {
        return getPushBase().audioEncoder;
    }

    public int getAudioProfile() {
        return getPushBase().audioProfile;
    }

    public int getAudioSampleHZ() {
        return getAudioCaptureParams().sample;
    }

    public boolean getAutoGlRecycler() {
        return getPushBase().enableGlobalGLSharedContextRecycler;
    }

    public int getBgMode() {
        return getPushBase().bgMode;
    }

    public int getBitrateAdaptStrategy() {
        return getPushBase().bitrateStrategy;
    }

    public int getByteVC1MosaicIssueOptimize() {
        return getPushBase().byteVC1MosaicIssueOptimizeLevel;
    }

    public int getCameraFrameFormat() {
        return getVideoCaptureParams().cameraFrameFormat;
    }

    public int getCameraLogLevel() {
        return getVideoCaptureParams().cameraLogLevel;
    }

    public boolean getCameraOpenCloseSync() {
        return getVideoCaptureParams().isCameraOpenCloseSync;
    }

    public int getCameraOpenRetryCnt() {
        return getVideoCaptureParams().cameraOpenRetryCount;
    }

    public int getCameraRetryStartPreviewCnt() {
        return getVideoCaptureParams().cameraRetryStartPreviewCount;
    }

    public String getCameraTexMinFilter() {
        return getVideoCaptureParams().textureMinFilter;
    }

    public int getCaptureAdaptedHeight() {
        return getPushBase().capAdaptedHeight;
    }

    public int getCaptureAdaptedWidth() {
        return getPushBase().capAdaptedWidth;
    }

    public int getChangeEncodeFpsThreshold() {
        return getPushBase().changeEncodeFpsThreshold;
    }

    public int getCheckEncodeFpsInterval() {
        return getPushBase().checkEncodeFpsInterval;
    }

    public boolean getEdgeRender() {
        return getPushBase().enalbeEdgeRender;
    }

    public double getEnableMaxTimePeriodGopSec() {
        return getPushBase().enableMaxTimePeriodGopSec;
    }

    public boolean getEnableRtmpStopPoll() {
        return getPushBase().enableRtmpStopPoll;
    }

    public boolean getEncoderDowngradeOptimize() {
        return getPushBase().encoderDowngradeOptimize;
    }

    public int getFrameRateMode() {
        return getPushBase().frameRateMode;
    }

    public int getGlVersion() {
        return GLThreadManager.getConfigGLVersion();
    }

    public boolean getIsForceCloseCamera() {
        return getVideoCaptureParams().isForceCloseCamera;
    }

    public KcpParams getKcpParams() {
        return this.mSdkSetting.kcpParams;
    }

    public int getMaxChangeEncodeFpsTimes() {
        return getPushBase().maxChangeEncodeFpsTimes;
    }

    public NodeOptParams getNodeOptParams() {
        return this.mSdkSetting.nodeOpt;
    }

    public double getNoiseSuppress() {
        return getPushBase().noiseSuppress;
    }

    public List<String> getNtpServers() {
        return getPushBase().ntpServers;
    }

    public PushBase getPushBase() {
        return this.mSdkSetting.mPushBase;
    }

    public String getQosId() {
        return getPushBase().qosId;
    }

    public QuicParams getQuicParams() {
        return this.mSdkSetting.quicParams;
    }

    public int getResolutionAdaptedQuirks() {
        return getPushBase().capAdaptedQuirks;
    }

    public int getRmtpTimeRotation() {
        return getPushBase().rtmpTimeRotation;
    }

    public RtmpCacheConfig getRtmpCacheCfgParams() {
        return this.mSdkSetting.rtmpCacheConfig;
    }

    public int getRtmpReconnectCounts() {
        return getPushBase().retryConnectCount;
    }

    public SandboxParams getSandboxParams() {
        return this.mSdkSetting.sandboxParams;
    }

    public int getSoftwareEncoderMinMaxBitrateAdjust() {
        return getPushBase().softwareEncoderMinMaxBitrateAdjust;
    }

    public long getUploadLogInterval() {
        return (long) getPushBase().uploadLogInterval;
    }

    public int getVideoBitrate() {
        return getPushBase().defaultBitrate;
    }

    public int getVideoBitrateMode() {
        return getPushBase().videoBitrateMode;
    }

    public int getVideoCaptureDevice() {
        return getVideoCaptureParams().device;
    }

    public int getVideoCaptureFps() {
        return getVideoCaptureParams().fps;
    }

    public int getVideoCaptureHeight() {
        return getVideoCaptureParams().height;
    }

    public int getVideoCaptureMinFps() {
        return getVideoCaptureParams().minFps;
    }

    public CaptureBase.VideoCaptureParams getVideoCaptureParams() {
        return this.mSdkSetting.captureBase.videoCapture;
    }

    public int getVideoCaptureWidth() {
        return getVideoCaptureParams().width;
    }

    public int getVideoEncoder() {
        return getPushBase().videoEncoder;
    }

    public int getVideoFps() {
        return getPushBase().fps;
    }

    public float getVideoGopSec() {
        return getPushBase().gopSec;
    }

    public int getVideoMaxBitrate() {
        return getPushBase().maxBitrate;
    }

    public int getVideoMinBitrate() {
        return getPushBase().minBitrate;
    }

    public int getVideoProfile() {
        return getPushBase().videoProfile;
    }

    public boolean isAddCropSeiInfo() {
        return getPushBase().addCropSeiInfo;
    }

    public boolean isBgPushWithAdaptedResolution() {
        return getPushBase().bgPushWithAdaptedResolution;
    }

    public boolean isCameraEnableFaceAE() {
        return getVideoCaptureParams().cameraEnableFaceAE;
    }

    public boolean isCameraEnableFallback() {
        return getVideoCaptureParams().enableFallback;
    }

    public boolean isCameraEnableWideAngle() {
        return getVideoCaptureParams().enableWideAngle;
    }

    public boolean isCameraEnableWideFov() {
        return getVideoCaptureParams().enableWideFov;
    }

    public boolean isEnableAecAutoSwitch() {
        return getPushBase().aecAutoSwitch;
    }

    public boolean isEnableAudioHighQuality() {
        return getAudioCaptureParams().useHighQuality;
    }

    public boolean isEnableAutoVolume() {
        return getPushBase().enableAutoVolume;
    }

    public boolean isEnableConstantTimePeriodGop() {
        return getPushBase().enableConstantTimePeriodGop;
    }

    public boolean isEnableFindContour() {
        return getPushBase().enableFindContour;
    }

    public boolean isEnableFixHardwareEncodeDts() {
        return getPushBase().fixHardwareEncodeDts;
    }

    public boolean isEnableForceGlFinish() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public boolean isEnableGlobalGlContextMutex() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public boolean isEnablePitchShift() {
        return getPushBase().enablePitchShift;
    }

    public boolean isEnableResetFpsRange() {
        return getVideoCaptureParams().resetFpsRange;
    }

    /* access modifiers changed from: package-private */
    public boolean isEnableSeiShift() {
        return getPushBase().enableSeiCurrentShiftDiffTime;
    }

    public boolean isEnableSendContourInfoToRtc() {
        return getPushBase().enableSendContourInfoToRtc;
    }

    public boolean isEnableVideoBFrame() {
        return getPushBase().enableBFrame;
    }

    public boolean isEnableVideoEncodeAccelera() {
        return getPushBase().useHardwareEncode;
    }

    public boolean isEnableVideoFrameStatistics() {
        return getPushBase().videoFrameEllipse;
    }

    public boolean isGameOptTest() {
        return getPushBase().gameOptTest;
    }

    /* access modifiers changed from: package-private */
    public boolean isHWEncodeOesDirectly() {
        return getPushBase().hwEncodeOes;
    }

    public boolean isRenderOffInFMMode() {
        return getPushBase().renderOffInFm;
    }

    public boolean isSeiNeedSource() {
        return getPushBase().seiNeedSource;
    }

    public boolean isSelfInnovateSoftEncode() {
        return getPushBase().useSelfInnovateSoftEncode;
    }

    public boolean isSupportCameraSwitchInternal() {
        return getPushBase().cameraSwitchInternal;
    }

    public boolean isUseSelfDevelopedRtmp() {
        return getPushBase().useSelfDevelopedRtmp;
    }

    public boolean isVECamera2API() {
        return getVideoCaptureParams().useCamera2Api;
    }

    public boolean enableProtocolDegrade() {
        return getSdkSetting().commonParams.getEnableProtocolDegrade();
    }

    public String getSessionID() {
        return getSdkSetting().commonParams.getSessionId();
    }

    public int isEnableStabilization() {
        if (getVideoCaptureParams().enableCameraStabilization) {
            return 1;
        }
        return 0;
    }

    public boolean rtsAllowIgnoreBrAdjust() {
        return getSdkSetting().switchParams.getRtsAllowIgnoreBrAdjust();
    }

    public boolean rtsEnableDtls() {
        return getSdkSetting().switchParams.getRtsEnableDtls();
    }

    public int rtsStartNoBrAdjustMs() {
        return getSdkSetting().switchParams.getRtsStartNoBrAdjustMs();
    }

    public boolean rtsSupportVideoRtx() {
        return getSdkSetting().switchParams.getRtsSupportVideoRtx();
    }

    public int getPSNRPeriodSeconds() {
        if (getSdkSetting().psnrStatisics != null) {
            return getSdkSetting().psnrStatisics.getPsnrPeriodSeconds();
        }
        return 30;
    }

    public int getPSNRStatisticsFrames() {
        if (getSdkSetting().psnrStatisics != null) {
            return getSdkSetting().psnrStatisics.getPsnrCalcFrames();
        }
        return 20;
    }

    public int getRoiOn() {
        return getRoiOn(getPushBase().videoEncoder, getPushBase().useHardwareEncode, getPushBase().useSelfInnovateSoftEncode);
    }

    public TEBundle getRoiSettings() {
        return getRoiSettings(getPushBase().videoEncoder, getPushBase().useHardwareEncode, getPushBase().useSelfInnovateSoftEncode);
    }

    public boolean isAlignTo16() {
        if (getPushBase().forceAlignTo16 || !getPushBase().disableAlign16) {
            return true;
        }
        return false;
    }

    public boolean isEnablePSNR() {
        if (getSdkSetting().psnrStatisics == null || !getSdkSetting().psnrStatisics.getEnablePsnr()) {
            return false;
        }
        return true;
    }

    public boolean isEnableVideoNtp() {
        if (!getPushBase().enableNTP || getPushBase().ntpServers == null || getPushBase().ntpServers.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void releaseHandles() {
        this.mContext = null;
        this.assetManager = null;
        this.effectResourceFinder = null;
        this.mLogUploader = new ILogUploader() {
            /* class com.ss.avframework.livestreamv2.LiveStreamBuilder.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99940);
            }

            @Override // com.ss.avframework.livestreamv2.log.ILogUploader
            public void uploadLog(JSONObject jSONObject) {
            }
        };
        this.screenCaptureIntent = null;
    }

    private void parseUrlPrefixAndPort() {
        String str = this.mSdkSetting.suggestProtocol;
        str.hashCode();
        switch (str.hashCode()) {
            case 106008:
                if (str.equals("kcp")) {
                    this.mPushUrlPrefix = "rtmpk://";
                    this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("kcp").intValue();
                    return;
                }
                return;
            case 114657:
                if (str.equals("tcp")) {
                    this.mPushUrlPrefix = "rtmp://";
                    this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("tcp").intValue();
                    return;
                }
                return;
            case 114939:
                if (str.equals("tls")) {
                    this.mPushUrlPrefix = "rtmps://";
                    this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("tls").intValue();
                    return;
                }
                return;
            case 3482174:
                if (str.equals("quic")) {
                    this.mPushUrlPrefix = "rtmpq://";
                    this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("quic").intValue();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public LiveStreamBuilder setAllowMicCaptureOnBackground(boolean z) {
        this.mAllowMicCaptureOnBackground = z;
        return this;
    }

    public LiveStreamBuilder setAssetManager(Object obj) {
        this.assetManager = obj;
        return this;
    }

    public LiveStreamBuilder setAudioBitwidth(int i2) {
        this.audioBitwidth = i2;
        return this;
    }

    public LiveStreamBuilder setAudioQuantizeGapPeriod(int i2) {
        this.audioQuantizeGapPeriod = i2;
        return this;
    }

    public LiveStreamBuilder setEffectAlgorithmAB(boolean z) {
        this.effectAlgorithmAB = z;
        return this;
    }

    public LiveStreamBuilder setEffectModePath(String str) {
        this.effectModePath = str;
        return this;
    }

    public LiveStreamBuilder setEffectPlatformConfig(String str) {
        this.effectPlatformConfig = str;
        return this;
    }

    public LiveStreamBuilder setEffectResourceFinder(Object obj) {
        this.effectResourceFinder = obj;
        return this;
    }

    public LiveStreamBuilder setEnableAudioEncodeAccelera(boolean z) {
        this.enableAudioEncodeAccelera = z;
        return this;
    }

    public void setEnableForceGlFinish(boolean z) {
        GLThreadManager.enableForceGLFinish(z);
    }

    public void setEnableGlobalGlContextMutex(boolean z) {
        GLThreadManager.enableGlobalGlContextMutex(z);
    }

    public void setEnableKTV(boolean z) {
        this.mEnableKTV = z;
    }

    public void setGlVersion(int i2) {
        GLThreadManager.setGLVersion(i2);
    }

    public LiveStreamBuilder setLiveAuthString(String str) {
        this.encryptedLiveAuth = str;
        return this;
    }

    public LiveStreamBuilder setLogUploader(ILogUploader iLogUploader) {
        this.mLogUploader = iLogUploader;
        return this;
    }

    public LiveStreamBuilder setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public LiveStreamBuilder setRtmpReconnectIntervalSeconds(int i2) {
        this.rtmpReconnectIntervalSeconds = i2;
        return this;
    }

    public LiveStreamBuilder setScreenCaptureIntent(Intent intent) {
        this.screenCaptureIntent = intent;
        return this;
    }

    public LiveStreamBuilder setUseNewEffectEngine(boolean z) {
        this.useNewEffectEngine = z;
        return this;
    }

    public void setUseShareRecorder(boolean z) {
        this.mUseShareRecorder = z;
    }

    public LiveStreamBuilder setUseTTFaceDetect(boolean z) {
        this.useTTFaceDetect = z;
        return this;
    }

    public LiveStreamBuilder setVideoGop(int i2) {
        this.videoGop = i2;
        return this;
    }

    public LiveStreamBuilder setVideoHeight(int i2) {
        this.videoHeight = i2;
        return this;
    }

    public LiveStreamBuilder setVideoLevel(int i2) {
        this.videoLevel = i2;
        return this;
    }

    public LiveStreamBuilder setVideoWidth(int i2) {
        this.videoWidth = i2;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnFrameMs(int i2) {
        this.vsyncModuleMaxIntevalOnFrameMs = i2;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnNowMs(int i2) {
        this.vsyncModuleMaxIntevalOnNowMs = i2;
        return this;
    }

    public void enableAecAutoSwitchMode(boolean z) {
        getPushBase().aecAutoSwitch = z;
    }

    public void enableAudioHighQualityMode(boolean z) {
        getAudioCaptureParams().useHighQuality = z;
    }

    public int getRoiOn(boolean z) {
        return getRoiOn(1, z, false);
    }

    public void setAddCropSeiInfo(boolean z) {
        getPushBase().addCropSeiInfo = z;
    }

    public LiveStreamBuilder setAlignTo16(boolean z) {
        getPushBase().forceAlignTo16 = z;
        return this;
    }

    public LiveStreamBuilder setAudioBitrate(int i2) {
        getPushBase().audioBitrate = i2;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureBitwidth(int i2) {
        getAudioCaptureParams().audioCaptureBitwidth = i2;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureChannel(int i2) {
        getAudioCaptureParams().channel = i2;
        return this;
    }

    public void setAudioCaptureChannelOnVoIP(int i2) {
        getAudioCaptureParams().channelOnVoIP = i2;
    }

    public LiveStreamBuilder setAudioCaptureDevice(int i2) {
        getAudioCaptureParams().device = i2;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureSampleHZ(int i2) {
        getAudioCaptureParams().sample = i2;
        return this;
    }

    public void setAudioCaptureSampleHZOnVoIP(int i2) {
        getAudioCaptureParams().sampleOnVoIP = i2;
    }

    public LiveStreamBuilder setAudioChannel(int i2) {
        getPushBase().audioChannel = i2;
        return this;
    }

    public LiveStreamBuilder setAudioEncoder(int i2) {
        getPushBase().audioEncoder = i2;
        return this;
    }

    public LiveStreamBuilder setAudioProfile(int i2) {
        getPushBase().audioProfile = i2;
        return this;
    }

    public LiveStreamBuilder setAudioSampleHZ(int i2) {
        getAudioCaptureParams().sample = i2;
        return this;
    }

    public void setAutoGlRecycler(boolean z) {
        getPushBase().enableGlobalGLSharedContextRecycler = z;
    }

    public LiveStreamBuilder setBgMode(int i2) {
        getPushBase().bgMode = i2;
        return this;
    }

    public void setBgPushWithAdaptedResolution(boolean z) {
        getPushBase().bgPushWithAdaptedResolution = z;
    }

    public void setCameraEnableFaceAE(boolean z) {
        getVideoCaptureParams().cameraEnableFaceAE = z;
    }

    public void setCameraEnableFallback(boolean z) {
        getVideoCaptureParams().enableFallback = z;
    }

    public void setCameraEnableWideAngle(boolean z) {
        getVideoCaptureParams().enableWideAngle = z;
    }

    public void setCameraEnableWideFov(boolean z) {
        getVideoCaptureParams().enableWideFov = z;
    }

    public void setCameraLogLevel(int i2) {
        getVideoCaptureParams().cameraLogLevel = i2;
    }

    public void setCameraOpenCloseSync(boolean z) {
        getVideoCaptureParams().isCameraOpenCloseSync = z;
    }

    public void setCameraOpenRetryCnt(int i2) {
        getVideoCaptureParams().cameraOpenRetryCount = i2;
    }

    public void setCameraRetryStartPreviewCnt(int i2) {
        getVideoCaptureParams().cameraRetryStartPreviewCount = i2;
    }

    public void setCameraTexMinFilter(String str) {
        getVideoCaptureParams().textureMinFilter = str;
    }

    public void setCaptureAdaptedHeight(int i2) {
        getPushBase().capAdaptedHeight = i2;
    }

    public void setCaptureAdaptedWidth(int i2) {
        getPushBase().capAdaptedWidth = i2;
    }

    public LiveStreamBuilder setEdgeRender(boolean z) {
        getPushBase().enalbeEdgeRender = z;
        return this;
    }

    public void setEnableAutoVolume(boolean z) {
        getPushBase().enableAutoVolume = z;
    }

    public void setEnableConstantTimePeriodGop(boolean z) {
        getPushBase().enableConstantTimePeriodGop = z;
    }

    public void setEnableFindContour(boolean z) {
        getPushBase().enableFindContour = z;
    }

    public void setEnableKaraokeRegulator(boolean z) {
        getSdkSetting().enableKaraokeRegulator = z;
    }

    public void setEnableMaxTimePeriodGopSec(double d2) {
        getPushBase().enableMaxTimePeriodGopSec = d2;
    }

    public void setEnablePitchShift(boolean z) {
        getPushBase().enablePitchShift = z;
    }

    public void setEnableSendContourInfoToRtc(boolean z) {
        getPushBase().enableSendContourInfoToRtc = z;
    }

    public void setEnableStabilization(boolean z) {
        getVideoCaptureParams().enableCameraStabilization = z;
    }

    public void setEnableStopPoll(boolean z) {
        getPushBase().enableRtmpStopPoll = z;
    }

    public LiveStreamBuilder setEnableVideoBFrame(boolean z) {
        getPushBase().enableBFrame = z;
        return this;
    }

    public LiveStreamBuilder setEnableVideoEncodeAccelera(boolean z) {
        getPushBase().useHardwareEncode = z;
        return this;
    }

    public void setFrameRateMode(int i2) {
        getPushBase().frameRateMode = i2;
    }

    public void setGameOptTest(boolean z) {
        getPushBase().gameOptTest = z;
    }

    public void setHWEncodeOesDirectly(boolean z) {
        getPushBase().hwEncodeOes = z;
    }

    public void setIsForceCloseCamera(boolean z) {
        getVideoCaptureParams().isForceCloseCamera = z;
    }

    public void setNoiseSuppress(double d2) {
        getPushBase().noiseSuppress = d2;
    }

    public void setRenderOffInFMMode(boolean z) {
        getPushBase().renderOffInFm = z;
    }

    public void setResolutionAdaptedQuirks(int i2) {
        getPushBase().capAdaptedQuirks = i2;
    }

    public void setRmtpTimeRotation(int i2) {
        getPushBase().rtmpTimeRotation = i2;
    }

    public LiveStreamBuilder setRoiAssetDir(String str) {
        return setRoiAssetDir(str, 1, false, false);
    }

    public LiveStreamBuilder setRtmpReconnectCounts(int i2) {
        getPushBase().retryConnectCount = i2;
        return this;
    }

    public void setSeiNeedSource(boolean z) {
        getPushBase().seiNeedSource = z;
    }

    public void setSoftwareEncoderMinMaxBitrateAdjust(int i2) {
        getPushBase().softwareEncoderMinMaxBitrateAdjust = i2;
    }

    public void setSupportCameraSwitchInternal(boolean z) {
        getPushBase().cameraSwitchInternal = z;
    }

    public LiveStreamBuilder setUploadLogInterval(long j2) {
        getPushBase().uploadLogInterval = (int) j2;
        return this;
    }

    public LiveStreamBuilder setUseSelfDevelopedRtmp(boolean z) {
        getPushBase().useSelfDevelopedRtmp = z;
        return this;
    }

    public LiveStreamBuilder setUseSelfInnovateSoftEncode(boolean z) {
        getPushBase().useSelfInnovateSoftEncode = z;
        return this;
    }

    public void setUsingVECamera2API(boolean z) {
        getVideoCaptureParams().useCamera2Api = z;
    }

    public LiveStreamBuilder setVideoBitrate(int i2) {
        getPushBase().defaultBitrate = i2;
        return this;
    }

    public void setVideoBitrateMode(int i2) {
        getPushBase().videoBitrateMode = i2;
    }

    public LiveStreamBuilder setVideoCaptureDevice(int i2) {
        getVideoCaptureParams().device = i2;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureFps(int i2) {
        getVideoCaptureParams().fps = i2;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureHeight(int i2) {
        getVideoCaptureParams().height = i2;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureMinFps(int i2) {
        getVideoCaptureParams().minFps = i2;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureWidth(int i2) {
        getVideoCaptureParams().width = i2;
        return this;
    }

    public LiveStreamBuilder setVideoEncoder(int i2) {
        getPushBase().videoEncoder = i2;
        return this;
    }

    public LiveStreamBuilder setVideoFps(int i2) {
        getPushBase().fps = i2;
        return this;
    }

    public LiveStreamBuilder setVideoGopSec(float f2) {
        getPushBase().gopSec = f2;
        return this;
    }

    public LiveStreamBuilder setVideoMaxBitrate(int i2) {
        getPushBase().maxBitrate = i2;
        return this;
    }

    public LiveStreamBuilder setVideoMinBitrate(int i2) {
        getPushBase().minBitrate = i2;
        return this;
    }

    public LiveStreamBuilder setVideoProfile(int i2) {
        getPushBase().videoProfile = i2;
        return this;
    }

    public static Context com_ss_avframework_livestreamv2_LiveStreamBuilder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public LiveStreamBuilder setBitrateAdaptStrategy(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            getPushBase().bitrateStrategy = i2;
        }
        return this;
    }

    public LiveStreamBuilder setContext(Context context) {
        Context context2;
        if (context != null) {
            context2 = com_ss_avframework_livestreamv2_LiveStreamBuilder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        } else {
            context2 = null;
        }
        this.mContext = context2;
        ContextUtils.initApplicationContext(com_ss_avframework_livestreamv2_LiveStreamBuilder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
        JNIUtils.setClassLoader(this.mContext.getClassLoader());
        return this;
    }

    public void setEnablePSNR(boolean z) {
        if (getSdkSetting().psnrStatisics == null) {
            getSdkSetting().psnrStatisics = new PsnrStatisics();
        }
        getSdkSetting().psnrStatisics.setEnablePsnr(z);
    }

    public LiveStreamBuilder setKcpParams(JSONObject jSONObject) {
        try {
            LiveSdkSetting liveSdkSetting = this.mSdkSetting;
            liveSdkSetting.kcpParams = (KcpParams) TinyJson.fromJson(jSONObject, KcpParams.class, liveSdkSetting.kcpParams);
        } catch (Exception e2) {
            e2.printStackTrace();
            AVLog.logKibana(6, "TinyJson", "parse kcp json failed", null);
        }
        return this;
    }

    public LiveStreamBuilder setQuicParams(JSONObject jSONObject) {
        try {
            LiveSdkSetting liveSdkSetting = this.mSdkSetting;
            liveSdkSetting.quicParams = (QuicParams) TinyJson.fromJson(jSONObject, QuicParams.class, liveSdkSetting.quicParams);
        } catch (Exception e2) {
            e2.printStackTrace();
            AVLog.logKibana(6, "TinyJson", "parse quic json failed", null);
        }
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i2) {
        return setRoiOn(i2, getPushBase().videoEncoder, getPushBase().useHardwareEncode, getPushBase().useSelfInnovateSoftEncode);
    }

    /* access modifiers changed from: package-private */
    public boolean checkParamsForUpdate(TEBundle tEBundle) {
        PushBase pushBase = getPushBase();
        Boolean[] boolArr = {false};
        Boolean[] boolArr2 = {false};
        this.videoWidth = checkParamsForUpdateInner(tEBundle, "width", this.videoWidth, boolArr);
        this.videoHeight = checkParamsForUpdateInner(tEBundle, "height", this.videoHeight, boolArr);
        pushBase.capAdaptedWidth = checkParamsForUpdateInner(tEBundle, "cap_adapted_width", pushBase.capAdaptedWidth, boolArr2);
        pushBase.capAdaptedHeight = checkParamsForUpdateInner(tEBundle, "cap_adapted_height", pushBase.capAdaptedHeight, boolArr2);
        pushBase.capAdaptedQuirks = checkParamsForUpdateInner(tEBundle, "cap_adapted_quirks", pushBase.capAdaptedQuirks, boolArr2);
        pushBase.fps = checkParamsForUpdateInner(tEBundle, "fps", pushBase.fps, boolArr);
        pushBase.defaultBitrate = checkParamsForUpdateInner(tEBundle, "defaultBitrate", pushBase.defaultBitrate, boolArr);
        pushBase.minBitrate = checkParamsForUpdateInner(tEBundle, "minBitrate", pushBase.minBitrate, boolArr);
        pushBase.maxBitrate = checkParamsForUpdateInner(tEBundle, "maxBitrate", pushBase.maxBitrate, boolArr);
        return boolArr[0].booleanValue();
    }

    public LiveStreamBuilder setupSdkParams(String str) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                TinyJson.fromJson(jSONObject, LiveSdkSetting.class, this.mSdkSetting);
                this.mSdkParams = jSONObject;
                parseUrlPrefixAndPort();
                PushBase pushBase = this.mSdkSetting.mPushBase;
                if (NumberInitializer.isDefined(Integer.valueOf(pushBase.width)) && NumberInitializer.isDefined(Integer.valueOf(pushBase.height))) {
                    if (this.videoWidth > this.videoHeight) {
                        this.videoWidth = Math.max(pushBase.width, pushBase.height);
                        this.videoHeight = Math.min(pushBase.width, pushBase.height);
                    } else {
                        this.videoWidth = Math.min(pushBase.width, pushBase.height);
                        this.videoHeight = Math.max(pushBase.width, pushBase.height);
                    }
                }
                int i4 = pushBase.yuvConverterColorRange;
                if (i4 == 0 || i4 == 1) {
                    YuvConverter.setConvertColorRange(i4);
                }
                if (!TextUtils.isNullOrEmpty(pushBase.vCodec)) {
                    if (TextUtils.equals(pushBase.vCodec, "bytevc1")) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    pushBase.videoEncoder = i3;
                }
                int i5 = 0;
                if (!(pushBase.useByte264 == null && pushBase.useByteVC0 == null)) {
                    if (pushBase.useByteVC0 == null || !pushBase.useByteVC0.booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (pushBase.useByte264 == null || !pushBase.useByte264.booleanValue()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z || z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    pushBase.useSelfInnovateSoftEncode = z3;
                }
                if (TextUtils.equals(pushBase.hwBitrateMode, "CQ")) {
                    pushBase.videoBitrateMode = 0;
                } else if (TextUtils.equals(pushBase.hwBitrateMode, "VBR")) {
                    pushBase.videoBitrateMode = 1;
                } else if (TextUtils.equals(pushBase.hwBitrateMode, "CBR")) {
                    pushBase.videoBitrateMode = 2;
                }
                if (TextUtils.equals(pushBase.videoProfileStr, "baseline")) {
                    pushBase.videoProfile = 1;
                } else if (TextUtils.equals(pushBase.videoProfileStr, "high")) {
                    pushBase.videoProfile = 3;
                } else if (TextUtils.equals(pushBase.videoProfileStr, "main")) {
                    pushBase.videoProfile = 2;
                }
                if (TextUtils.equalsIgnoreCase(pushBase.aCodec, "MediaCodec")) {
                    pushBase.audioEncoder = 1;
                } else if (TextUtils.equalsIgnoreCase(pushBase.aCodec, "ffmpeg")) {
                    pushBase.audioEncoder = 3;
                } else if (TextUtils.equalsIgnoreCase(pushBase.aCodec, "fdk-aac")) {
                    pushBase.audioEncoder = 2;
                }
                if (!TextUtils.isNullOrEmpty(pushBase.audioProfileStr)) {
                    if (TextUtils.equalsIgnoreCase(pushBase.audioProfileStr, "AAC-HEv2")) {
                        pushBase.audioProfile = 3;
                    } else if (TextUtils.equalsIgnoreCase(pushBase.audioProfileStr, "AAC-HE")) {
                        pushBase.audioProfile = 2;
                    } else {
                        pushBase.audioProfile = 1;
                    }
                }
                if (pushBase.swRoi != null) {
                    if (pushBase.swRoi.booleanValue()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    setRoiOn(i2, false);
                }
                if (pushBase.hwRoi != null) {
                    if (pushBase.hwRoi.booleanValue()) {
                        i5 = 1;
                    }
                    setRoiOn(i5, true);
                }
                if (pushBase.uploadLogInterval > 0 && pushBase.uploadLogInterval < 180) {
                    pushBase.uploadLogInterval *= 1000;
                }
                GLThreadManager.enableForceGLFinish(pushBase.forceGlFinish);
                GlobalControler.setYuvConverterUseBufferPool(pushBase.yuvConverterUseBufferPool);
                SafeHandlerThreadPoolExecutor.setThreadPoolMode(pushBase.TPEnableThreadPoolMode, (long) pushBase.TPThreadAliveTimeMs, pushBase.TPCrashLooperWhiteList, pushBase.TPCheckLeakWhenRef0);
            } catch (Exception e2) {
                e2.printStackTrace();
                AVLog.logKibana(6, "TinyJson", "parse kcp json", null);
            }
        }
        return this;
    }

    public ILiveStream create(Handler handler, Handler handler2) {
        return create(handler, handler2, null, null);
    }

    public LiveStreamBuilder setEnableVideoNtp(boolean z, List<String> list) {
        if (!z || list == null || list.isEmpty()) {
            getPushBase().enableNTP = false;
            getPushBase().ntpServers = null;
        } else {
            getPushBase().enableNTP = z;
            getPushBase().ntpServers = list;
        }
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i2, boolean z) {
        if (z) {
            setRoiOn(i2, 1, true, false);
            setRoiOn(i2, 2, true, false);
        } else {
            setRoiOn(i2, 1, false, false);
            setRoiOn(i2, 1, false, true);
            setRoiOn(i2, 2, false, false);
        }
        return this;
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        return create(handler, handler2, audioDeviceModule, null);
    }

    public int getRoiOn(int i2, boolean z, boolean z2) {
        MethodCollector.i(14390);
        synchronized (getPushBase().roi) {
            try {
                PushBase.Roi roi = getPushBase().roi.get(i2, z, z2);
                if (roi != null) {
                    return roi.roiOn;
                }
                MethodCollector.o(14390);
                return 0;
            } finally {
                MethodCollector.o(14390);
            }
        }
    }

    private TEBundle getRoiSettings(int i2, boolean z, boolean z2) {
        MethodCollector.i(14371);
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("roi_on", 0);
        synchronized (getPushBase().roi) {
            try {
                PushBase.Roi roi = getPushBase().roi.get(i2, z, z2);
                if (roi != null) {
                    tEBundle.setInt("roi_on", roi.roiOn);
                    tEBundle.setInt("roi_qp", roi.roiQp);
                    if (roi.roiAssetDir != null) {
                        tEBundle.setString("roi_asset_dir", roi.roiAssetDir);
                    }
                    if (NumberInitializer.isDefined(Double.valueOf(roi.roiBitrateRatio))) {
                        tEBundle.setDouble("roi_bitrate_ratio", roi.roiBitrateRatio);
                    }
                    tEBundle.setBool("roi_stretch", getPushBase().roi.roiStretch);
                }
            } finally {
                MethodCollector.o(14371);
            }
        }
        return tEBundle;
    }

    private int checkParamsForUpdateInner(TEBundle tEBundle, String str, int i2, Boolean[] boolArr) {
        int i3;
        if (!tEBundle.contains(str) || i2 == (i3 = tEBundle.getInt(str))) {
            return i2;
        }
        boolArr[0] = Boolean.TRUE;
        return i3;
    }

    private boolean checkParamsForUpdateInner(TEBundle tEBundle, String str, boolean z, Boolean[] boolArr) {
        boolean bool;
        if (!tEBundle.contains(str) || z == (bool = tEBundle.getBool(str))) {
            return z;
        }
        boolArr[0] = Boolean.TRUE;
        return bool;
    }

    private LiveStreamBuilder setRoiAssetDir(String str, int i2, boolean z, boolean z2) {
        MethodCollector.i(14117);
        synchronized (getPushBase().roi) {
            try {
                PushBase.Roi roi = getPushBase().roi.get(i2, z, z2);
                if (roi == null) {
                    roi = new PushBase.Roi();
                }
                roi.roiAssetDir = str;
                getPushBase().roi.put(i2, z, z2, roi);
            } finally {
                MethodCollector.o(14117);
            }
        }
        return this;
    }

    private LiveStreamBuilder setRoiOn(int i2, int i3, boolean z, boolean z2) {
        MethodCollector.i(14042);
        synchronized (getPushBase().roi) {
            try {
                PushBase.Roi roi = getPushBase().roi.get(i3, z, z2);
                if (roi == null) {
                    roi = new PushBase.Roi();
                }
                roi.roiOn = i2;
                getPushBase().roi.put(i3, z, z2, roi);
            } finally {
                MethodCollector.o(14042);
            }
        }
        return this;
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        return new LiveStream(this, handler, handler2, audioDeviceModule, iVideoEffectProcessor);
    }
}
