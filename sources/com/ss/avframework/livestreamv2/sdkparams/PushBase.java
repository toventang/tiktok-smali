package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.NumberInitializer;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;
import java.util.List;
import org.json.JSONObject;

public class PushBase {
    @Serialized(name = "TPCheckLeakWhenRef0")
    public boolean TPCheckLeakWhenRef0 = true;
    @Serialized(name = "TPCrashLooperWhiteList")
    public JSONObject TPCrashLooperWhiteList = null;
    @Serialized(name = "TPEnableThreadPoolMode")
    public boolean TPEnableThreadPoolMode = false;
    @Serialized(name = "TPThreadAliveTimeMs")
    public int TPThreadAliveTimeMs = 0;
    @Serialized(name = "aCodec")
    public String aCodec;
    @Serialized(name = "addCropSeiInfo")
    public boolean addCropSeiInfo = true;
    @Serialized(name = "AdjustStreamResolutionOnInteract")
    public boolean adjustStreamResolutionOnInteract = true;
    @Serialized(name = "adm_hardware_audio_effect_table")
    public JSONObject admHardwareAudioEffectTable = null;
    @Serialized(name = "adm_server_cfg")
    public JSONObject admServerConfig = null;
    @Serialized(name = "adm_type")
    public int admType = 0;
    @Serialized(name = "aecAutoSwitch")
    public boolean aecAutoSwitch;
    @Serialized(name = "audioBitrate")
    public int audioBitrate = 32000;
    @Serialized(name = "audioChannel")
    public int audioChannel = 2;
    public int audioEncoder = 1;
    @Serialized(name = "audioFilterAsyncReportError")
    public boolean audioFilterAsyncReportError = false;
    public int audioProfile = 1;
    @Serialized(name = "audioProfile")
    public String audioProfileStr;
    @Serialized(name = "audioSample")
    public int audioSample = 44100;
    @Serialized(name = "bgMode")
    public int bgMode = 1;
    @Serialized(name = "BgPushWithAdaptedResolution")
    public boolean bgPushWithAdaptedResolution = true;
    @Serialized(name = "bitrateAdaptStrategy")
    public int bitrateAdaptStrategy;
    @Serialized(name = "bitrate_strategy")
    public int bitrateStrategy;
    @Serialized(name = "byteaudio_internal_auto_volume")
    public boolean byteAudioInternalAutoVolume = true;
    @Serialized(name = "byteaudio_internal_mix_bgm")
    public boolean byteAudioInternalMixBgm = true;
    @Serialized(name = "byteVC1MosaicIssueOptimizeLevel")
    public int byteVC1MosaicIssueOptimizeLevel;
    @Serialized(name = "cameraSwitchInternal")
    public boolean cameraSwitchInternal = true;
    @Serialized(name = "cap_adapted_height")
    public int capAdaptedHeight;
    @Serialized(name = "cap_adapted_quirks")
    public int capAdaptedQuirks = 1;
    @Serialized(name = "cap_adapted_width")
    public int capAdaptedWidth;
    @Serialized(name = "changeEncodeFpsThreshold")
    public int changeEncodeFpsThreshold;
    @Serialized(name = "checkEncodeFpsInterval")
    public int checkEncodeFpsInterval;
    @Serialized(name = "defaultBitrate")
    public int defaultBitrate = 800000;
    @Serialized(name = "disable2DTrans")
    public boolean disable2DTrans = false;
    @Serialized(name = "disableAlign16")
    public boolean disableAlign16;
    @Serialized(name = "disableCropScale")
    public boolean disableCropScale = false;
    @Serialized(name = "disableDropFrames")
    public boolean disableDropFrames = false;
    @Serialized(name = "disableEffect")
    public boolean disableEffect = false;
    @Serialized(name = "dumpEffectInOut")
    public JSONObject dumpEffectInOut;
    @Serialized(name = "dumpEncodeFrames")
    public JSONObject dumpEncodeFrames;
    @Serialized(name = "dumpOesTo2D")
    public JSONObject dumpOesTo2D;
    @Serialized(name = "dumpRtcIn")
    public JSONObject dumpRtcIn;
    @Serialized(name = "dumpRtcOut")
    public JSONObject dumpRtcOut;
    @Serialized(name = "dumpScreen")
    public JSONObject dumpScreen;
    @Serialized(name = "adm_enable_aec_on_headset_mode")
    public boolean enableAecOnHeadsetMode = true;
    @Serialized(name = "enable_auto_volume")
    public boolean enableAutoVolume;
    @Serialized(name = "enableBFrame")
    public boolean enableBFrame;
    @Serialized(name = "enableConstantTimePeriodGop")
    public boolean enableConstantTimePeriodGop;
    @Serialized(name = "EnableFindContour")
    public boolean enableFindContour = true;
    @Serialized(name = "enable_global_gl_shared_context_recycler")
    public boolean enableGlobalGLSharedContextRecycler = false;
    @Serialized(name = "enableMaxTimePeriodGopSec")
    public double enableMaxTimePeriodGopSec;
    @Serialized(name = "enableNTP")
    public boolean enableNTP;
    @Serialized(name = "pitchShift")
    public boolean enablePitchShift = true;
    @Serialized(name = "enable_push_stream_switch_after_server_mix_stream")
    public boolean enablePushStreamSwitchAfterServerMixStream = false;
    @Serialized(name = "enableRenderStallStats")
    public boolean enableRenderStallStats = true;
    @Serialized(name = "enableRtmpStopPoll")
    public boolean enableRtmpStopPoll = true;
    @Serialized(name = "enableSeiCurrentShiftDiffTime")
    public boolean enableSeiCurrentShiftDiffTime = true;
    @Serialized(name = "EnableSendContourInfoToRtc")
    public boolean enableSendContourInfoToRtc = false;
    @Serialized(name = "enable_tcp_cork")
    public boolean enableTcpCork;
    @Serialized(name = "enalbe_edge_render")
    public boolean enalbeEdgeRender;
    @Serialized(name = "encoderDowngradeOptimize")
    public boolean encoderDowngradeOptimize;
    @Serialized(name = "fixHardwareEncodeDts")
    public boolean fixHardwareEncodeDts;
    @Serialized(name = "forceAlignTo16")
    public boolean forceAlignTo16 = true;
    @Serialized(name = "ForceGlFinish")
    public boolean forceGlFinish = true;
    @Serialized(name = "fps")
    public int fps = 25;
    @Serialized(name = "frameRateMode")
    public int frameRateMode;
    @Serialized(name = "gameOptTest")
    public boolean gameOptTest = true;
    @Serialized(name = "getLiveStreamInfoSyncGetMicDB")
    public boolean getLiveStreamInfoSyncGetMicDB = true;
    @Serialized(name = "glFilter")
    public String glFilter;
    @Serialized(name = "gopSec")
    public float gopSec;
    @Serialized(name = "height")
    public int height = Integer.MAX_VALUE;
    @Serialized(name = "hwBitrateMode")
    public String hwBitrateMode;
    @Serialized(name = "hw_encode_oes")
    public boolean hwEncodeOes;
    @Serialized(name = "hwRoi")
    public Boolean hwRoi;
    @Serialized(name = "InteractVideoSinkUseGlFinish")
    public boolean interactVideoSinkUseGlFinish = true;
    @Serialized(name = "fixRemoteYuvProjection")
    public boolean isFixRemoteYuvProjection = true;
    @Serialized(name = "IsScreenRecordDisableMixer")
    public boolean isScreenRecordDisableMixer = true;
    @Serialized(name = "live_gl_version")
    public int liveGlVersion = Integer.MAX_VALUE;
    @Serialized(name = "maxBitrate")
    public int maxBitrate;
    @Serialized(name = "maxChangeEncodeFpsTimes")
    public int maxChangeEncodeFpsTimes;
    @Serialized(name = "minBitrate")
    public int minBitrate;
    @Serialized(name = "mixOnClient")
    public MixOnClient mixOnClient = null;
    @Serialized(name = "NeedChangeModeWhenTriggetEncoder")
    public boolean needChangeModeWhenTriggetEncoder = true;
    @Serialized(name = "NeedUpdateByteAudioConfig")
    public boolean needUpdateByteAudioConfig = true;
    @Serialized(name = "newSendCacheConfig")
    public boolean newSendCacheConfig = true;
    @Serialized(name = "noise_suppress")
    public double noiseSuppress = -15.0d;
    @Serialized(name = "ntpServers")
    public List<String> ntpServers;
    @Serialized(name = "PK_audience_set_up_connection_optimize")
    public boolean pkAudienceSetupConnectionOptimize;
    @Serialized(name = "qId")
    public String qosId = "";
    @Serialized(name = "renderoff_in_fm")
    public boolean renderOffInFm = true;
    @Serialized(name = "retryConnectCount")
    public int retryConnectCount = 10;
    @Serialized(name = "roi")
    public final RoiMap roi = new RoiMap();
    @Serialized(name = "RtcOnLoggerMessageLevel")
    public int rtconLoggerMessageLevel = 0;
    @Serialized(name = "rtmpTimeRotation")
    public int rtmpTimeRotation = 100;
    @Serialized(name = "seiNeedSource")
    public boolean seiNeedSource = true;
    @Serialized(name = "SettinsByteAudioConfigLevel")
    public boolean settinsByteAudioConfigLevel = true;
    @Serialized(name = "showRoiRegion")
    public boolean showRoiRegion;
    @Serialized(name = "softwareEncoderMinMaxBitrateAdjust")
    public int softwareEncoderMinMaxBitrateAdjust;
    @Serialized(name = "adm_support_hardware_ear_monitor")
    public int supportHardWareEarMonitor = 0;
    @Serialized(name = "swRoi")
    public Boolean swRoi;
    @Serialized(name = "transportAudioStallThres")
    public int transportAudioStallThres = 200;
    @Serialized(name = "transportVideoStallThres")
    public int transportVideoStallThres = 500;
    @Serialized(name = "uploadLogInterval")
    public int uploadLogInterval = 5000;
    @Serialized(name = "useByte264")
    public Boolean useByte264;
    @Serialized(name = "useByteVC0")
    public Boolean useByteVC0;
    @Serialized(name = "useHardware")
    public boolean useHardwareEncode = true;
    @Serialized(name = "useSelfDevelopedRtmp")
    public boolean useSelfDevelopedRtmp = true;
    public boolean useSelfInnovateSoftEncode = true;
    @Serialized(name = "vCodec")
    public String vCodec;
    public int videoBitrateMode = 1;
    public int videoEncoder = 1;
    @Serialized(name = "video_frame_elpse")
    public boolean videoFrameEllipse;
    public int videoProfile = 1;
    @Serialized(name = "videoProfile")
    public String videoProfileStr;
    @Serialized(name = "width")
    public int width = Integer.MAX_VALUE;
    @Serialized(name = "yuvConverterColorRange")
    public int yuvConverterColorRange = -1;
    @Serialized(name = "YuvConverterUseBufferPool")
    public boolean yuvConverterUseBufferPool = true;

    public static class MixOnClient {
        @Serialized(name = "mixDefaultBitrate")
        public int mixDefaultBitrate = Integer.MAX_VALUE;
        @Serialized(name = "mixMaxBitrate")
        public int mixMaxBitrate = Integer.MAX_VALUE;
        @Serialized(name = "mixMinBitrate")
        public int mixMinBitRate = Integer.MAX_VALUE;
        public boolean needChangeBitrateWhenClientMixer;

        static {
            Covode.recordClassIndex(100462);
        }
    }

    public static class Roi {
        @Serialized(name = "roi_asset_dir")
        public String roiAssetDir;
        @Serialized(name = "roi_bitrate_ratio")
        public double roiBitrateRatio = NumberInitializer.UNDEFINED_DOUBLE_VALUE;
        @Serialized(name = "roi_on")
        public int roiOn;
        @Serialized(name = "roi_qp")
        public int roiQp = -100;

        static {
            Covode.recordClassIndex(100463);
        }
    }

    static {
        Covode.recordClassIndex(100461);
    }

    public static class RoiMap {
        @Serialized(name = "bytevc0")
        public Roi bytevc0Roi;
        @Serialized(name = "bytevc1")
        public Roi bytevc1Roi;
        @Serialized(name = "hardBytevc1")
        public Roi hardBytevc1Roi;
        @Serialized(name = "hardH264")
        public Roi hardH264Roi;
        @Serialized(name = "roi_stretch")
        public boolean roiStretch;
        @Serialized(name = "x264")
        public Roi x264Roi;

        static {
            Covode.recordClassIndex(100464);
        }

        private String getVideoEncoderName(int i2, boolean z, boolean z2) {
            return i2 != 2 ? z ? "hardH264" : z2 ? "bytevc0" : "x264" : z ? "hardBytevc1" : "bytevc1";
        }

        public Roi get(String str) {
            if (str.equals("hardH264")) {
                return this.hardH264Roi;
            }
            if (str.equals("x264")) {
                return this.x264Roi;
            }
            if (str.equals("bytevc0")) {
                return this.bytevc0Roi;
            }
            if (str.equals("hardBytevc1")) {
                return this.hardBytevc1Roi;
            }
            if (str.equals("bytevc1")) {
                return this.bytevc1Roi;
            }
            return null;
        }

        public void put(String str, Roi roi) {
            if (str.equals("hardH264")) {
                this.hardH264Roi = roi;
            }
            if (str.equals("x264")) {
                this.x264Roi = roi;
            }
            if (str.equals("bytevc0")) {
                this.bytevc0Roi = roi;
            }
            if (str.equals("hardBytevc1")) {
                this.hardBytevc1Roi = roi;
            }
            if (str.equals("bytevc1")) {
                this.bytevc1Roi = roi;
            }
        }

        public Roi get(int i2, boolean z, boolean z2) {
            return get(getVideoEncoderName(i2, z, z2));
        }

        public void put(int i2, boolean z, boolean z2, Roi roi) {
            put(getVideoEncoderName(i2, z, z2), roi);
        }
    }
}
