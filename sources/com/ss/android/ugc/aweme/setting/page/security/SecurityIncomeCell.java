package com.ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.language.a;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import h.f.b.l;

public final class SecurityIncomeCell extends RightTextCell<c> {
    static {
        Covode.recordClassIndex(80378);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        l.d(view, "");
        super.onClick(view);
        r.a("click_income_plus_verification", new d().a("enter_from", "setting_security").f66730a);
        g gVar = new g("https://www.tiktok.com/inapp/reauth/settings");
        gVar.a("locale", a.b());
        gVar.a("aid", com.bytedance.ies.ugc.appcontext.d.n);
        gVar.a("enter_from", "account_security_settings");
        SmartRouter.buildRoute(((RightTextCell) this).f122434a, "aweme://webview").withParam("url", gVar.a()).withParam("hide_nav_bar", true).open();
    }
}
