package com.ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class av implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122081a;

    static {
        Covode.recordClassIndex(80039);
    }

    av(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122081a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122081a.k();
    }
}
