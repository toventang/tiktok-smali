package com.ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122016a;

    static {
        Covode.recordClassIndex(79985);
    }

    ab(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122016a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122016a.finish();
    }
}
