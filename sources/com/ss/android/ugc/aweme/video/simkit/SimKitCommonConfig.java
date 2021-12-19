package com.ss.android.ugc.aweme.video.simkit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.player.c;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.d;
import com.ss.android.ugc.aweme.simkit.api.e;
import com.ss.android.ugc.aweme.simkit.impl.a.b;
import com.ss.android.ugc.aweme.simkit.model.b.a;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.b.j;
import com.ss.android.ugc.aweme.video.b.w;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.h.g;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.n;
import java.util.ArrayList;
import java.util.List;

public class SimKitCommonConfig implements ICommonConfig {
    private static a superResolutionStrategyExperimentValue;
    public static boolean superResolutionStrategyExperimentValueInited;
    private com.ss.android.ugc.aweme.simkit.api.a mSrListener = new com.ss.android.ugc.aweme.simkit.api.a() {
        /* class com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig.AnonymousClass1 */

        static {
            Covode.recordClassIndex(94081);
        }

        @Override // com.ss.android.ugc.aweme.simkit.api.a
        public final boolean a(i iVar) {
            boolean a2;
            if (com.ss.android.ugc.aweme.player.a.f114913a) {
                a2 = ((Boolean) c.f115060i.getValue()).booleanValue();
            } else {
                a2 = b.a().a(true, "enable_force_close_self_publish_video_sr", false);
            }
            if (a2) {
                if (!TextUtils.isEmpty(LocalVideoPlayerManager.a().a(com.ss.android.ugc.aweme.video.simcommon.a.a(iVar)))) {
                    return true;
                }
            }
            return false;
        }
    };

    static {
        Covode.recordClassIndex(94080);
    }

    public static int com_ss_android_ugc_aweme_video_simkit_SimKitCommonConfig_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public List getColdBootVideoUrlHooks() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getDefaultCDNTimeoutTime() {
        return 2400000;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public com.ss.android.ugc.aweme.simkit.model.b.b getSuperResolutionStrategyConfigV2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public com.ss.android.ugc.aweme.bitrateselector.a.c getAutoBitrateSetStrategy() {
        return com.ss.android.ugc.aweme.video.simcommon.a.c.f143785a;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public com.ss.android.ugc.aweme.simkit.api.a getForceSuperResolutionListener() {
        return this.mSrListener;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public d getSuperResolutionStrategy() {
        return b.a.f133504a;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public com.ss.android.ugc.aweme.simkit.api.c getCommonParamsProcessor() {
        return new com.ss.android.ugc.aweme.simkit.api.c() {
            /* class com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig.AnonymousClass3 */

            static {
                Covode.recordClassIndex(94083);
            }

            @Override // com.ss.android.ugc.aweme.simkit.api.c
            public final String a(String str) {
                return com.ss.android.ugc.aweme.video.util.b.b(str).a();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getRateSettingsResponse() {
        return VideoBitRateABManager.f143220a.f143222b;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public a getSuperResolutionStrategyConfig() {
        return getSuperResolutionStrategyExperimentValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public e getVideoUrlHookHook() {
        return new e() {
            /* class com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig.AnonymousClass2 */

            static {
                Covode.recordClassIndex(94082);
            }

            @Override // com.ss.android.ugc.aweme.simkit.api.e
            public final String a(i iVar) {
                if (iVar == null) {
                    return null;
                }
                String a2 = com.ss.android.ugc.aweme.video.preload.b.a(iVar.getSourceId());
                if (com.ss.android.ugc.aweme.video.preload.b.b(a2)) {
                    return a2;
                }
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getBitrateBusinessType() {
        return com.bytedance.ies.abmock.b.a().a(true, "bitrate_modularization_experiment", 0);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public double getBitrateSwitchThreshold() {
        return com.bytedance.ies.abmock.b.a().a(true, "bitrate_switch_threshold", 0.75d);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getDefaultRateSettingsResponse() {
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.f143220a;
        if (videoBitRateABManager.f143225e == null) {
            videoBitRateABManager.b();
        }
        return videoBitRateABManager.f143225e;
    }

    public double getSpeedInBitPerSec() {
        return g.e().d();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isUseLastNetworkSpeed() {
        return com.bytedance.ies.abmock.b.a().a(true, "is_record_last_network_speed_enabled", true);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getLastNetworkSpeed() {
        return SharePrefCache.inst().getLastUsableNetworkSpeed().c().intValue();
    }

    public int getPreloaderType() {
        if (com.bytedance.ies.abmock.b.a().a(true, "preloader_type", 2) == w.f143333a) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public List<n> getVideoUrlHooks() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.ss.android.ugc.aweme.video.e.b());
        arrayList.add(new com.ss.android.ugc.aweme.video.e.c());
        arrayList.add(com.ss.android.ugc.aweme.video.e.a.f143372a);
        return arrayList;
    }

    public static a getSuperResolutionStrategyExperimentValue() {
        if (com.ss.android.ugc.aweme.player.a.f114913a) {
            if (!superResolutionStrategyExperimentValueInited) {
                try {
                    superResolutionStrategyExperimentValue = (a) com.bytedance.ies.abmock.b.a().a(true, "super_resolution_strategy", a.class);
                } catch (Throwable unused) {
                    superResolutionStrategyExperimentValue = null;
                }
                superResolutionStrategyExperimentValueInited = true;
            }
            return superResolutionStrategyExperimentValue;
        }
        try {
            return (a) com.bytedance.ies.abmock.b.a().a(true, "super_resolution_strategy", a.class);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void setInitialSpeed(double d2) {
        g.e().a(d2);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isSkipSelectBitrate(i iVar) {
        if (!j.f143293a || iVar == null || !com.ss.android.ugc.aweme.video.preload.b.b(com.ss.android.ugc.aweme.video.preload.b.a(iVar.getSourceId()))) {
            return false;
        }
        com_ss_android_ugc_aweme_video_simkit_SimKitCommonConfig_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "SimKitCommonConfig->isSkipSelectBitrate->hitLocal");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean onPreGetProperBitrate(i iVar) {
        if (!TextUtils.isEmpty(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(iVar.getSourceId()))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean checkIsBytevc1InCache(i iVar) {
        if (iVar == null) {
            return false;
        }
        com_ss_android_ugc_aweme_video_simkit_SimKitCommonConfig_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "SimKitCommonConfig->codecType->" + iVar.isBytevc1() + "->urlModel->" + iVar);
        return iVar.isBytevc1();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public String getLocalVideoPath(i iVar) {
        if (!j.f143293a || iVar == null) {
            return null;
        }
        String a2 = com.ss.android.ugc.aweme.video.preload.b.a(iVar.getSourceId());
        if (!com.ss.android.ugc.aweme.video.preload.b.b(a2)) {
            return null;
        }
        com_ss_android_ugc_aweme_video_simkit_SimKitCommonConfig_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "SimKitCommonConfig->getLocalVideoPath->hitLocal->path->".concat(String.valueOf(a2)));
        return a2;
    }
}
