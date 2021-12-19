package com.ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.ss.android.ugc.aweme.setting.api.DoBStatusApi;
import f.a.h.a;

final /* synthetic */ class aw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122082a;

    static {
        Covode.recordClassIndex(80040);
    }

    aw(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122082a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122082a;
        o oVar = new o(i18nSettingManageMyAccountActivity);
        oVar.show();
        DoBStatusApi.a.a().b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ac(i18nSettingManageMyAccountActivity, oVar), new ad(i18nSettingManageMyAccountActivity, oVar));
    }
}
