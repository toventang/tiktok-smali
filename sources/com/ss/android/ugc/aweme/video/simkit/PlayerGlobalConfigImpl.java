package com.ss.android.ugc.aweme.video.simkit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.lancet.o;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.b.ac;
import com.ss.android.ugc.aweme.video.b.af;
import com.ss.android.ugc.aweme.video.b.e;
import com.ss.android.ugc.aweme.video.b.h;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.b.s;
import com.ss.android.ugc.aweme.video.b.v;
import com.ss.android.ugc.aweme.video.local.f;
import com.ss.android.ugc.aweme.video.x;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.model.g;
import com.ss.android.ugc.playerkit.model.i;
import com.ss.android.ugc.playerkit.model.m;

public class PlayerGlobalConfigImpl implements PlayerGlobalConfig {
    private static int isEnableSurfaceLifeCycleExpCachedVal = -1;
    private static boolean sForceHttps;
    private static m.e sPlayerType;

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    public String getPredictLabelResult() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public g getVideoEffectInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isCallbackCompletionFix() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDebug() {
        return false;
    }

    public boolean isEnableByteVC1AutoRetry() {
        return false;
    }

    public boolean isPowerModeHandlerEnable() {
        return false;
    }

    public boolean isPrepareAhead() {
        return false;
    }

    public boolean isSurfaceControlClearSurface() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceControl() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getRenderType() {
        return ac.f143271a;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1() {
        return e.f143286a;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceView() {
        return f.f143475a;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseVideoTextureRenderer() {
        return v.f143332a;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public i prepareConfig() {
        return x.Normal;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public Context context() {
        return d.a();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPreloadType() {
        return q.b();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDynamicBitrateEnable() {
        return VideoBitRateABManager.f143220a.d();
    }

    public boolean isPlayLinkSelectEnabled() {
        return h.a();
    }

    static {
        Covode.recordClassIndex(94079);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean forceHttps() {
        if (o.f107240a || sForceHttps) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public double getBitrateModelThreshold() {
        return b.a().a(true, "video_auto_model_threshold", -1.0d);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlayerFramesWait() {
        return b.a().a(true, "player_framews_wait", 1);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public m.e getPlayerType() {
        if (sPlayerType == null) {
            sPlayerType = com.ss.android.ugc.aweme.video.o.b();
        }
        return sPlayerType;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isAsyncInit() {
        return b.a().a(true, "is_ttplayer_async_init", true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1BlackList() {
        return b.a().a(true, "enable_bytevc1_black_list", false);
    }

    public boolean isEnableLocalVideoPlay() {
        return b.a().a(true, "is_local_video_play_enable", true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnablePlayerLogV2() {
        return b.a().a(true, "player_event_log_v2_open", true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isMultiPlayer() {
        return b.a().a(true, "enable_multi_player", false);
    }

    public boolean isUseVideoCacheHttpDns() {
        return b.a().a(true, "use_video_cache_http_dns", false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean shouldForceToKeepSurfaceBelowKITKAT() {
        return b.a().a(true, "should_force_to_keep_surface_below_kitkat", false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableSurfaceLifeCycleNotification() {
        if (-1 == isEnableSurfaceLifeCycleExpCachedVal) {
            isEnableSurfaceLifeCycleExpCachedVal = b.a().a(true, "surface_lifecycle_notification_enabled", 0);
        }
        if (1 == isEnableSurfaceLifeCycleExpCachedVal) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isPrerenderSurfaceSlowSetFix() {
        if (cn.f89703a) {
            return ((Boolean) s.f143324a.getValue()).booleanValue();
        }
        return b.a().a(true, "player_prerender_surface_slow_set_fix", false);
    }

    public boolean isUseTTNet() {
        if (b.a().a(true, "use_ttnet", 1) == af.f143276a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public void setForceHttps(boolean z) {
        sForceHttps = z;
    }
}
