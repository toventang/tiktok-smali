package com.ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.settings.c;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ba implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122087a;

    static {
        Covode.recordClassIndex(80047);
    }

    ba(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122087a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122087a;
        r.onEventV3("ttelite_click_Pro_button");
        if (b.g().getCurUser().isForcePrivateAccount()) {
            new com.bytedance.tux.g.b(i18nSettingManageMyAccountActivity).e(R.string.bup).b();
        } else {
            SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, c.a(0, "settings")).open();
        }
    }
}
