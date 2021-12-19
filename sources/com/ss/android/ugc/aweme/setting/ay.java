package com.ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import h.f.b.l;
import java.util.HashMap;

final /* synthetic */ class ay implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122084a;

    static {
        Covode.recordClassIndex(80042);
    }

    ay(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122084a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(this.f122084a, "");
        r.a("enter_request_verification", new HashMap());
        try {
            t a2 = t.a();
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
            l.b(mtcertSettings, "");
            t.a(a2, mtcertSettings.getCertUrlSchema());
        } catch (a unused) {
            SmartRouter.buildRoute(d.a(), "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2fmain%2fverification%2f%3fhide_nav_bar%3d1&hide_nav_bar=1").open();
        }
    }
}
