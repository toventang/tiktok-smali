package com.ss.android.ugc.aweme.account.login.a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.n.m;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class n extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f63305a;

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f63306h;

    /* renamed from: i  reason: collision with root package name */
    public final I18nSignUpActivity f63307i;

    static {
        Covode.recordClassIndex(39014);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(final String str, final Bundle bundle, final I18nSignUpActivity i18nSignUpActivity) {
        super(2131231062, new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.account.login.a.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(39015);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                r.a("click_login_button", new a().a("enter_from", str).f62575a);
                i18nSignUpActivity.b("click_platform");
                IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
                if (iFeed0VVManagerService != null) {
                    iFeed0VVManagerService.a("click_login");
                    iFeed0VVManagerService.b("LOGIN");
                }
                SmartRoute c2 = m.c(i18nSignUpActivity);
                Bundle bundle = bundle;
                if (bundle != null) {
                    c2.withParam(bundle);
                }
                c2.open();
            }
        }, (int) R.string.aos, "phone_email_show", 8);
        l.d(str, "");
        l.d(i18nSignUpActivity, "");
        this.f63305a = str;
        this.f63306h = bundle;
        this.f63307i = i18nSignUpActivity;
    }
}
