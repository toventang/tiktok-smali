package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.m;

public final class SplashSettingServiceImpl implements ISplashSettingService {
    static {
        Covode.recordClassIndex(20851);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean d() {
        return m.f34848b;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean e() {
        return i.a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean f() {
        return a.a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean a() {
        return b.a().a(true, "cold_start_upload_topview_cid_enabled", false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final int b() {
        return b.a().a(true, "awesome_splash_ad_delay_millis", 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean c() {
        return b.a().a(true, "topview_feed_gap_optimize_enabled", false);
    }

    public static ISplashSettingService g() {
        MethodCollector.i(6069);
        Object a2 = com.ss.android.ugc.b.a(ISplashSettingService.class, false);
        if (a2 != null) {
            ISplashSettingService iSplashSettingService = (ISplashSettingService) a2;
            MethodCollector.o(6069);
            return iSplashSettingService;
        }
        if (com.ss.android.ugc.b.f145530e == null) {
            synchronized (ISplashSettingService.class) {
                try {
                    if (com.ss.android.ugc.b.f145530e == null) {
                        com.ss.android.ugc.b.f145530e = new SplashSettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6069);
                    throw th;
                }
            }
        }
        SplashSettingServiceImpl splashSettingServiceImpl = (SplashSettingServiceImpl) com.ss.android.ugc.b.f145530e;
        MethodCollector.o(6069);
        return splashSettingServiceImpl;
    }
}
