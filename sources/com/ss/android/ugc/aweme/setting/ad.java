package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.tux.g.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.api.a.a;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class ad implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122019a;

    /* renamed from: b  reason: collision with root package name */
    private final o f122020b;

    static {
        Covode.recordClassIndex(79987);
    }

    ad(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, o oVar) {
        this.f122019a = i18nSettingManageMyAccountActivity;
        this.f122020b = oVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122019a;
        o oVar = this.f122020b;
        Throwable th = (Throwable) obj;
        com.ss.android.ugc.aweme.base.o.a("compliance_api_status", new c().a("error_message", Integer.valueOf(th instanceof a ? ((a) th).getErrorCode() : 0)).a(StringSet.type, "/tiktok/v1/edibility/birthdate/").a("status", (Integer) 1).a());
        i18nSettingManageMyAccountActivity.a();
        new b(i18nSettingManageMyAccountActivity).e(R.string.g21).b();
        oVar.dismiss();
    }
}
