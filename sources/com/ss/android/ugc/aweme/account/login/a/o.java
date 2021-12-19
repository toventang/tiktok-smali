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

public abstract class o extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f63311a;

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f63312h;

    /* renamed from: i  reason: collision with root package name */
    public final I18nSignUpActivity f63313i;

    static {
        Covode.recordClassIndex(39016);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private o(final String str, final Bundle bundle, final I18nSignUpActivity i18nSignUpActivity) {
        super(2131231062, (View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.account.login.a.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(39017);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                r.a("click_sign_up", new a().a("enter_method", str).f62575a);
                i18nSignUpActivity.b("click_platform");
                IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
                if (iFeed0VVManagerService != null) {
                    iFeed0VVManagerService.a("click_sign_up");
                    iFeed0VVManagerService.b("SIGNUP");
                }
                if (com.ss.android.ugc.aweme.compliance.api.a.h().c()) {
                    SmartRoute a2 = m.a(i18nSignUpActivity);
                    Bundle bundle = bundle;
                    if (bundle != null) {
                        bundle.putBoolean("age_gate_block", true);
                        a2.withParam(bundle);
                    }
                    if (!i18nSignUpActivity.a(a2)) {
                        a2.open();
                        return;
                    }
                    return;
                }
                SmartRoute b2 = m.b(i18nSignUpActivity);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    b2.withParam(bundle2);
                }
                if (!i18nSignUpActivity.a(b2)) {
                    b2.open();
                }
            }
        }, (int) R.string.aqe, false, "phone_email_show");
        l.d(str, "");
        l.d(i18nSignUpActivity, "");
        this.f63311a = str;
        this.f63312h = bundle;
        this.f63313i = i18nSignUpActivity;
    }

    public /* synthetic */ o(String str, Bundle bundle, I18nSignUpActivity i18nSignUpActivity, byte b2) {
        this(str, bundle, i18nSignUpActivity);
    }
}
