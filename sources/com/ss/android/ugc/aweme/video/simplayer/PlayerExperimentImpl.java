package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.player.ab.abs.f;
import com.ss.android.ugc.aweme.simkit.config.b.a;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.b.ab;
import com.ss.android.ugc.aweme.video.b.n;
import com.ss.android.ugc.aweme.video.b.p;
import com.ss.android.ugc.aweme.video.b.r;

public class PlayerExperimentImpl extends a {
    private static Boolean sDashABREnabled;

    static {
        Covode.recordClassIndex(94126);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int enableIntertrust() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int enableIntertrustDemotion() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.simkit.config.b.a
    public int getSuperResolutionStrategyConstDash() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean Bytevc1PlayAddrPolicyUnifyExperiment() {
        return com.ss.android.ugc.aweme.video.preload.a.a.f143571a;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int frameWait() {
        return r.f143322d;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int get265DecodeType() {
        return n.f143302b;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public float getVolLoudUnity() {
        return f.f115043a;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean isAsyncInit() {
        return ab.f143269b;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean videoBitRateEnabled() {
        return VideoBitRateABManager.f143220a.d();
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int ABR4GMaxResolutionIndex() {
        return b.a().a(true, "player_abr_4g_max_res_index", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int ABRFixedLevel() {
        return b.a().a(true, "player_abr_fixed_level", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayeAbDashHijackRetryEnableExp() {
        return b.a().a(true, "player_dash_enable_hijack_retry", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayeAbFixPrepareSeqTmpEnableExp() {
        return ((Number) com.ss.android.ugc.aweme.player.ab.abs.a.f115012a.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayeAbVIDDashHijackRetryEnableExp() {
        return b.a().a(true, "player_vid_dash_enable_hijack_retry", 1);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public float PlayerAbABRBandwidthParamExp() {
        return b.a().a(true, "player_abr_bandwidth_param", 1.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public float PlayerAbABRStallPenaltyParamExp() {
        return b.a().a(true, "player_abr_stall_penalty_param", 9.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayerAbABRStartUpModelExp() {
        return b.a().a(true, "player_abr_startup_model", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayerAbABRSwitchCsModelExp() {
        return b.a().a(true, "player_abr_cs_model", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public float PlayerAbABRSwitchPenaltyParamExp() {
        return b.a().a(true, "player_abr_switch_penalty_param", 2.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayerAbABRSwitchSensitivityExp() {
        return b.a().a(true, "player_abr_switch_sensitivity", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int PlayerAbABRTimerIntervalMillExp() {
        return b.a().a(true, "player_abr_time_interval_mill", 500);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean PreloadProcessDataExperiment() {
        return b.a().a(true, "is_preload_process_data", false);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean enableCdnUrlExpiredExperiment() {
        if (b.a().a(true, "enable_video_cdn_url_expired_tt", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public int enableSplitVideoAudioPlayback() {
        return b.a().a(true, "enable_engine_split_mode", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean playEventLogEnabled() {
        return ((Boolean) p.f143313b.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment, com.ss.android.ugc.aweme.simkit.config.b.a
    public boolean isDashABREnabled() {
        if (sDashABREnabled == null) {
            boolean z = true;
            if (b.a().a(true, "player_abr_enable", 0) != 1) {
                z = false;
            }
            sDashABREnabled = Boolean.valueOf(z);
        }
        return sDashABREnabled.booleanValue();
    }
}
