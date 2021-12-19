package com.ss.android.ugc.aweme.settingsrequest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.news.common.service.manager.c;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.setting.model.d;

public final class k extends d {
    static {
        Covode.recordClassIndex(80932);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.d, com.ss.android.ugc.aweme.setting.by.a
    public final void a(d dVar) {
        super.a(dVar);
        ISplashAdService iSplashAdService = (ISplashAdService) c.a(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.a(SettingsManager.a().a("awesome_splash_filter_enable", false));
        }
        SettingsRequestServiceImpl.i();
    }
}
