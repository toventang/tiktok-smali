package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.setting.model.h;
import f.a.d.f;

final /* synthetic */ class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122913a;

    /* renamed from: b  reason: collision with root package name */
    private final o f122914b;

    static {
        Covode.recordClassIndex(80696);
    }

    q(I18nSettingNewVersionActivity i18nSettingNewVersionActivity, o oVar) {
        this.f122913a = i18nSettingNewVersionActivity;
        this.f122914b = oVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122913a;
        o oVar = this.f122914b;
        com.ss.android.ugc.aweme.base.o.a("compliance_api_status", new c().a(StringSet.type, "/tiktok/v1/edibility/birthdate/").a("status", (Integer) 0).a());
        SmartRouter.buildRoute(i18nSettingNewVersionActivity, "//account/setting").withParam("dob_status", (h) obj).open();
        oVar.dismiss();
    }
}
