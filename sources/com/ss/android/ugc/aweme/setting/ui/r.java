package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.api.a.a;
import f.a.d.f;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122915a;

    /* renamed from: b  reason: collision with root package name */
    private final o f122916b;

    static {
        Covode.recordClassIndex(80697);
    }

    r(I18nSettingNewVersionActivity i18nSettingNewVersionActivity, o oVar) {
        this.f122915a = i18nSettingNewVersionActivity;
        this.f122916b = oVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122915a;
        o oVar = this.f122916b;
        Throwable th = (Throwable) obj;
        com.ss.android.ugc.aweme.base.o.a("compliance_api_status", new c().a("error_message", Integer.valueOf(th instanceof a ? ((a) th).getErrorCode() : 0)).a(StringSet.type, "/tiktok/v1/edibility/birthdate/").a("status", (Integer) 1).a());
        SmartRouter.buildRoute(i18nSettingNewVersionActivity, "//account/setting").open();
        oVar.dismiss();
    }
}
