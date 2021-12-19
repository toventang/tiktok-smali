package com.ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.util.g;
import com.ss.android.ugc.aweme.metrics.ab;

final /* synthetic */ class bb implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122088a;

    static {
        Covode.recordClassIndex(80048);
    }

    bb(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122088a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122088a;
        ab.a("enter_delete_account").b("previous_page", "account_security_settings").b("enter_method", "click_button").f();
        g.a(i18nSettingManageMyAccountActivity);
    }
}
