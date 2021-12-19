package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.settings.aa;
import com.ss.android.ugc.aweme.settings.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e implements com.ss.android.ugc.aweme.ad.b.e {
    static {
        Covode.recordClassIndex(45418);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final boolean j() {
        try {
            if (aa.a() != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final Integer k() {
        try {
            z a2 = aa.a();
            if (a2 != null) {
                return Integer.valueOf(a2.f123148a);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final String[] l() {
        try {
            z a2 = aa.a();
            if (a2 != null) {
                return a2.f123149b;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final boolean o() {
        try {
            return SettingsManager.a().a("enable_audio_auto_play", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final String a() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            return adLandingPageConfig.getAnalytics();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final boolean b() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Boolean adLandingPagePreloadEnabled = adLandingPageConfig.getAdLandingPagePreloadEnabled();
            l.b(adLandingPagePreloadEnabled, "");
            return adLandingPagePreloadEnabled.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final List<String> c() {
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
        l.b(adLandingPageConfig, "");
        return adLandingPageConfig.getAdCardPreloadCommonPrefix();
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final boolean d() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Boolean enableDynamicNavbar = adLandingPageConfig.getEnableDynamicNavbar();
            l.b(enableDynamicNavbar, "");
            return enableDynamicNavbar.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final boolean e() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Boolean adLandingPageReportWifiOnlyEnable = adLandingPageConfig.getAdLandingPageReportWifiOnlyEnable();
            l.b(adLandingPageReportWifiOnlyEnable, "");
            return adLandingPageReportWifiOnlyEnable.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final int f() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Integer adLandingPageReportPageCount = adLandingPageConfig.getAdLandingPageReportPageCount();
            l.b(adLandingPageReportPageCount, "");
            return adLandingPageReportPageCount.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final int g() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Integer adLandingPageReportLimitTimes = adLandingPageConfig.getAdLandingPageReportLimitTimes();
            l.b(adLandingPageReportLimitTimes, "");
            return adLandingPageReportLimitTimes.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final String h() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            return adLandingPageConfig.getAdLandingPageReportUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final String i() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            return adLandingPageConfig.getAdLandingPageReportPacketKey();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final String m() {
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> adLandingPageConfig = inst.getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            return adLandingPageConfig.c();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final String n() {
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> jsActlogUrl = inst.getJsActlogUrl();
        l.b(jsActlogUrl, "");
        return jsActlogUrl.c();
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final int q() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            return adLandingPageConfig.getAdLandingPageReportDelay();
        } catch (Throwable unused) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final int r() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Integer adLandingPagePreloadCacheCount = adLandingPageConfig.getAdLandingPagePreloadCacheCount();
            if (adLandingPagePreloadCacheCount != null) {
                return adLandingPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable unused) {
            return 40;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final int s() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            Integer adLynxPagePreloadCacheCount = adLandingPageConfig.getAdLynxPagePreloadCacheCount();
            if (adLynxPagePreloadCacheCount != null) {
                return adLynxPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable unused) {
            return 40;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.e
    public final List<String> p() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            l.b(adLandingPageConfig, "");
            List<String> adCardPreloadCommonChannel = adLandingPageConfig.getAdCardPreloadCommonChannel();
            if (adCardPreloadCommonChannel == null) {
                return new ArrayList();
            }
            return adCardPreloadCommonChannel;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }
}
