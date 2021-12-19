package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;
import java.util.HashMap;
import java.util.Map;

public class LiveSdkSetting {
    @Serialized(name = "adm_player_type")
    public String admPlayerType = "opensles";
    @Serialized(name = "adm_recording_type")
    public String admRecordingType = "opensles";
    @Serialized(name = "adm_render_mix_enable_read_mode")
    public boolean admRenderMode = true;
    @Serialized(name = "adm_enable_agc")
    public boolean agcEnableOnAecV2Mode = false;
    @Serialized(name = "CaptureBase")
    public CaptureBase captureBase = new CaptureBase();
    @Serialized(name = "Common")
    public CommonParams commonParams = new CommonParams();
    @Serialized(name = "enable_aec_v2")
    public boolean enableAecV2Algorithm = true;
    @Serialized(name = "enable_gl_tracer")
    public boolean enableGLTracer = false;
    @Serialized(name = "enable_global_gl_shared_context_mutex")
    public boolean enableGlobalGlSharedContextMutex = false;
    @Serialized(name = "live_enable_karaoke_regulator")
    public boolean enableKaraokeRegulator = true;
    @Serialized(name = "enable_rtc_push_frame_statics")
    public boolean enableRtcPushStreamStatics = true;
    @Serialized(name = "enable_siti")
    public boolean enableSiti;
    @Serialized(name = "enc_strategy_config")
    public EncStrategyConfig encStrategyConfig = new EncStrategyConfig();
    @Serialized(name = "rtmpk")
    public KcpParams kcpParams = new KcpParams();
    @Serialized(name = "logLevel")
    public int logLevel = Integer.MAX_VALUE;
    @Serialized(name = "PushBase")
    public PushBase mPushBase = new PushBase();
    @Serialized(name = "node_opt")
    public NodeOptParams nodeOpt = new NodeOptParams();
    @Serialized(name = "adm_enable_ns")
    public int nsModeOnAecV2 = 0;
    @Serialized(name = "psnr_statistics")
    public PsnrStatisics psnrStatisics = new PsnrStatisics();
    @Serialized(name = "rtmpq")
    public QuicParams quicParams = new QuicParams();
    @Serialized(name = "rtmp_cache_cfg")
    public RtmpCacheConfig rtmpCacheConfig = new RtmpCacheConfig();
    @Serialized(name = "RtmpPorts")
    public Map<String, Integer> rtmpPorts = new HashMap();
    @Serialized(name = "sandbox")
    public SandboxParams sandboxParams = new SandboxParams();
    @Serialized(name = "siti_config")
    public SitiConfig sitiConfig = new SitiConfig();
    @Serialized(name = "SuggestProtocol")
    public String suggestProtocol = "";
    @Serialized(name = "Switch")
    public SwitchParams switchParams = new SwitchParams();
    @Serialized(name = "videoRangeModeInRtc")
    public boolean videoRangeModeInRtc = true;

    static {
        Covode.recordClassIndex(100458);
    }
}
