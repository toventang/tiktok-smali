package com.ss.android.ugc.aweme.video.simpreloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.b.g;
import com.ss.android.ugc.aweme.video.b.o;
import com.ss.android.ugc.aweme.video.b.w;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.ss.android.ugc.aweme.video.preload.model.c;
import com.ss.android.ugc.aweme.video.preload.model.d;
import com.ss.android.ugc.playerkit.model.f;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PreloaderExperiment implements IPreloaderExperiment {
    public static final a Companion = new a((byte) 0);
    public static int videoNetworkSpeedAlgorithmExperimentValue = -1;
    private final h mPreloadExpModel$delegate = i.a(m.SYNCHRONIZED, b.f143962a);

    private final c getMPreloadExpModel() {
        return (c) this.mPreloadExpModel$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableDetailNotification() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EngineEnableMaxFileMemCacheNumExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EngineEnableMaxFileMemCacheSizeExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getBandWidthJsonString() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final double getBitrateSwitchThreshold() {
        return 0.75d;
    }

    public final com.ss.android.ugc.aweme.video.preload.model.a getBufferPreloadStrategyConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getDataLoaderMdlExtensionOpts() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getGearStrategyJsonString() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getModuleConfigJsonString() {
        return "";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94190);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableGetCDNLogExperiment() {
        return g.f143288a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Map getExCacheDirSizeConfig() {
        return new HashMap();
    }

    public final d getPreloadPromptConfig() {
        return new d((char) 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final c getPreloaderExpModel() {
        return getMPreloadExpModel();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int DisableVideocacheLocalServerExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "disable_videocache_local_server", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnableDownloaderLogExpErrorExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_engine_downloader_log_exp", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnableP2pStragetyControlExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_p2p_stragety_control", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableTTnetClientInject() {
        if (com.bytedance.ies.abmock.b.a().a(false, "player_enable_ttnet_inject", 1) == 1) {
            return true;
        }
        return false;
    }

    public final long EngineDataloaderDownloadMonitorMinLoadSizeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "dataloader_download_monitor_min_loadsize", 0L);
    }

    public final long EngineDataloaderDownloadMonitorTimeInternalExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "dataloader_download_monitor_time_internal", 0L);
    }

    public final int EnginePreloaderBlockHostErrIPCountExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "block_host_err_ip_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderConcurrentNumExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_concurrent_num", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderEnableNetworkChangedListenExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_enable_network_changed_listen", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_net_scheduler_block_all_net_error", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockDurationExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "net_scheduler_block_duration", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockErrorCountExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "net_scheduler_block_error_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerEnableExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_net_scheduler", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderOpenTimeoutExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_open_timeout", 10);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderPreloadStrategyExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_preload_strategy", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderRWTimeoutExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_rw_timeout", 10);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderStackOrQueueExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_queue_or_stack", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderTlsSessionTimeoutExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_tls_session_timeout", 3600);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyEnableSyndnsExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_p2p_stragety_enable_syndns", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyExpiredTimeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "p2p_stragety_expired_time", 120);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMaxBufferingTimeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "p2p_stragety_max_buffering_time", 300);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMaxLeaveWaitTimeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "p2p_stragety_max_leave_wait_time", 600);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMinNetSpeedExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "p2p_stragety_min_net_speed", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMinPlayNumberExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "p2p_stragety_min_play_num", 5);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyXyLibValueExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_p2p_stragety_xy_lib_value", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayUse2UrlExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_play_use_2_cdn_url", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayeAbUserHttp2Exp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_use_http2", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRAlgoExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_abr_algo", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRSpeedPredictAlgoExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_abr_speed_predict_algo", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRSpeedPredictTimeIntervalExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_abr_speed_predict_time_interval", 500);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbBackupDnsTypeExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_ab_backup_dns_type", 3);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbChecksumLevelExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "checksum_level", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbDashPreloadAudioFirstExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_dash_preload_audio_first", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbEnableDebugLogExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_enable_debug_log", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMainDnsDelayTimeExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_ab_main_dns_timeout", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMainDnsTypeExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_ab_main_dns_type", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMediaLoaderCheckPreloadLevelExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_check_preload_level", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderAccessCheckLevelExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_access_check_level", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableBackupDnsIPExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_dns_backup_ip", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableBenchmarkExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_benchmark_io", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsLogExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_dns_log", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsParallelExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_dns_parallel", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsRefreshExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_dns_refresh", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableFileExtendBuffer() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_file_extend_buffer", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableFileRingBuffer() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_file_ring_buffer", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnablePreconneExp() {
        return ((Number) com.ss.android.ugc.aweme.player.ab.abs.a.a.f115014a.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableSpeedCoefficientExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_speed_coefficient", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableTLSSessionReuseExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_tls_session_reuse", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableTaskReuseExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_enable_task_reuse", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderHeaderDataMemCache() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_header_data_mem_cache", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderIpv4Num() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_ipv4_num", Integer.MAX_VALUE);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderIpv6Num() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_ipv6_num", Integer.MAX_VALUE);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderLazyBufferPoolEnableExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_mdl_enable_lazy_buffer_pool", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderPreconnectNumExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_preconnect_num", 3);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderTLSVersionExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_tls_version", 2);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_task_reuse_parallel_next_threshold", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbPreloadSizeOffsetThresholdExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_preload_size_offset_threshold", 0);
    }

    public final int PlayerAbSpeedSinkExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "speed_monitor_sink", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbTestSpeedVersionExp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_test_speed_version", 2);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerDataEncryptExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_data_encrpt", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerMdlLogEnableExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_player_mdl_log", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int RingBufferSizeMdlExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "ring_buffer_size", -1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int UseTTNetExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "use_ttnet", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheLoaderTypeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "videocache_loader_type", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheMaxCacheSizeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_cache_max_size", -1);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheP2pLevelExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "videocache_p2p_level", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheReadBuffersizeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "video_cache_read_buffersize", 8192);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheTTnetPreloadTimeoutExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "videocache_ttnet_preload_timeout", 30000);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheTTnetProxyTimeoutExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "videocache_ttnet_proxy_timeout", 10000);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoDownloadSpeedCostTimeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "video_download_speed_cost_time", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoSpeedQueueSizeExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "video_speed_queue_size", 10);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int enginePreloaderEnableTTnetLoader() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_ttnet_loader", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final List<f> engineStaticOptionList() {
        return (List) o.f143306c.getValue();
    }

    static {
        Covode.recordClassIndex(94189);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean CheckVideoCacheRequestHeaderExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "check_video_cache_request_header", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnablePreloaderPreConnect() {
        if (com.bytedance.ies.abmock.b.a().a(true, "engine_preloader_pre_connect", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final EnginePreloaderConfig EnginePreloaderConfigExperiment() {
        Object a2 = com.bytedance.ies.abmock.b.a().a(true, "engine_preload_config", EnginePreloaderConfig.class, com.ss.android.ugc.aweme.video.preload.a.b.f143572a);
        if (a2 == null) {
            l.b();
        }
        return (EnginePreloaderConfig) a2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String PlayerAbMedialoaderGoogleDnsHostExp() {
        String a2 = com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_google_dns_host", "dns.google.com");
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String PlayerAbMedialoaderOwnDnsHostExp() {
        String a2 = com.bytedance.ies.abmock.b.a().a(true, "player_medialoader_own_dns_host", "34.102.215.99");
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean PlayerAbUseLastIf403Exp() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_use_last_url_if_403", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean PlayerPreloadLazyGetUrlsExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_preload_lazy_get_urls", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean PreloadLocalCachePathVideoPlayExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "is_preload_local_cache_path_video_play_enable", false);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final i.a PreloadTypeExperiment() {
        if (com.bytedance.ies.abmock.b.a().a(true, "preloader_type", 2) == w.f143335c) {
            return i.a.MediaLoader;
        }
        return i.a.VideoCache;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean UseVideoCacheHttpDnsExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "use_video_cache_http_dns", false);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean VideoCacheAutoAdjustPreloadMaxExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "is_video_cache_auto_adust_preload_max", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean VideoCacheWriteAsynchronousExperiment() {
        return com.bytedance.ies.abmock.b.a().a(true, "video_cache_write_asynchronous", false);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoNetworkSpeedAlgorithmExperiment() {
        if (!com.ss.android.ugc.aweme.player.a.f114913a) {
            return com.bytedance.ies.abmock.b.a().a(true, "video_network_speed_algorithm", 0);
        }
        if (videoNetworkSpeedAlgorithmExperimentValue == -1) {
            videoNetworkSpeedAlgorithmExperimentValue = com.bytedance.ies.abmock.b.a().a(true, "video_network_speed_algorithm", 0);
        }
        return videoNetworkSpeedAlgorithmExperimentValue;
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143962a = new b();

        static {
            Covode.recordClassIndex(94191);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c();
            cVar.f143742a = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143573a.getValue()).intValue();
            cVar.f143747f = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143578f.getValue()).intValue();
            cVar.f143745d = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143576d.getValue()).intValue();
            cVar.f143746e = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143577e.getValue()).intValue();
            cVar.f143743b = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143574b.getValue()).intValue();
            cVar.f143744c = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143575c.getValue()).intValue();
            cVar.f143748g = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143579g.getValue()).intValue();
            cVar.f143749h = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143580h.getValue()).intValue();
            cVar.f143750i = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143581i.getValue()).intValue();
            boolean z = true;
            if (((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143582j.getValue()).intValue() != 1) {
                z = false;
            }
            cVar.f143751j = z;
            cVar.f143753l = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143583k.getValue()).intValue();
            cVar.f143754m = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143584l.getValue()).intValue();
            cVar.o = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.f143585m.getValue()).longValue();
            cVar.p = ((Number) com.ss.android.ugc.aweme.video.preload.a.c.n.getValue()).longValue();
            cVar.n = (HashMap) com.ss.android.ugc.aweme.video.preload.a.c.o.getValue();
            return cVar;
        }
    }
}
