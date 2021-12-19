package com.ss.android.ugc.aweme.account.login.authorize;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.account.h.f;
import com.ss.android.ugc.aweme.account.login.g.a;
import com.ss.android.ugc.aweme.account.login.g.b;
import com.ss.android.ugc.aweme.account.login.g.c;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.n.m;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63359a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63360b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63361c;

    static {
        Covode.recordClassIndex(39049);
    }

    g(AuthorizeActivity authorizeActivity, int i2, boolean z) {
        this.f63359a = authorizeActivity;
        this.f63360b = i2;
        this.f63361c = z;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f63359a;
        int i2 = this.f63360b;
        boolean z = this.f63361c;
        if (authorizeActivity.isDestroyed()) {
            return;
        }
        if (i2 == 0) {
            r.a("tns_third_party_not_registered_age_gate_action", new a().a("register_age_gate_action", i2).a("show", 0).f62575a);
            if (c.a()) {
                com.ss.android.ugc.aweme.account.login.g.a aVar = new com.ss.android.ugc.aweme.account.login.g.a();
                AuthResult authResult = authorizeActivity.f63329i;
                b bVar = new b(authorizeActivity.f63329i, authorizeActivity);
                l.d(authorizeActivity, "");
                l.d(authResult, "");
                l.d(bVar, "");
                aVar.f63454a = bVar;
                if (!c.a()) {
                    a.b bVar2 = aVar.f63454a;
                    if (bVar2 != null) {
                        bVar2.a();
                        return;
                    }
                    return;
                }
                SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login").withParam("enter_type", "click_login").withParam("next_page", k.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue()).withParam("key_auth_result", authResult).open(10086, new a.d(new a.c(aVar)));
                return;
            }
            authorizeActivity.a(authorizeActivity.f63329i, false);
            return;
        }
        r.a("tns_third_party_not_registered_age_gate_action", new com.ss.android.ugc.aweme.account.a.b.a().a("register_age_gate_action", i2).a("show", 1).f62575a);
        com.ss.android.ugc.aweme.account.agegate.b bVar3 = new com.ss.android.ugc.aweme.account.agegate.b();
        AuthResult authResult2 = authorizeActivity.f63329i;
        com.ss.android.ugc.aweme.account.agegate.a aVar2 = new com.ss.android.ugc.aweme.account.agegate.a(authorizeActivity.f63329i, authorizeActivity);
        Boolean valueOf = Boolean.valueOf(z);
        Bundle a2 = AuthorizeActivity.a(authorizeActivity.getIntent());
        bVar3.f62629a = aVar2;
        String d2 = f.d(authResult2);
        int d3 = ((bf) com.ss.android.ugc.aweme.a.a(bf.class)).d();
        if (d3 == 0 || (d3 == 1 && (TextUtils.equals(d2, "facebook") || TextUtils.equals(d2, "google")))) {
            if (bVar3.f62629a != null) {
                bVar3.f62629a.a();
            }
        } else if (valueOf.booleanValue()) {
            m.a(authorizeActivity).withParam(a2).open();
            authorizeActivity.finish();
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login");
            buildRoute.withParam("enter_type", "click_login");
            buildRoute.withParam("key_auth_result", authResult2);
            buildRoute.withParam("platform", authResult2.f40150d);
            buildRoute.withParam("is_existing_user", false);
            buildRoute.withParam("enter_from", "3rd_party_auth");
            buildRoute.withParam("enter_method", "3rd_party_verified");
            if (d3 == 1) {
                buildRoute.withParam("next_page", k.THIRD_PARTY_FTC_AGE_GATE.getValue());
            } else {
                buildRoute.withParam("next_page", k.THIRD_PARTY_AGE_GATE.getValue());
            }
            buildRoute.open(998, new com.ss.android.ugc.aweme.account.agegate.c(bVar3));
        }
    }
}
