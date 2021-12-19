package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.sec.f;

public final class j extends c {
    static {
        Covode.recordClassIndex(68622);
    }

    public j() {
        super(null);
    }

    public static final class a extends f<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        private Request f107273g;

        static {
            Covode.recordClassIndex(68623);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public Boolean b() {
            if (this.f107273g.getUrl().contains("/passport/user/check_email_registered") || this.f107273g.getUrl().contains("/passport/email/register/v2/")) {
                r.a("slide_verification_response", new d().a("enter_method", b.b().getLoginMobEnterMethod()).a("status", "1").f66730a);
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public Boolean a() {
            if (this.f107273g.getUrl().contains("/passport/user/check_email_registered") || this.f107273g.getUrl().contains("/passport/email/register/v2/")) {
                r.a("slide_verification_response", new d().a("enter_method", b.b().getLoginMobEnterMethod()).a("status", "2").f66730a);
            }
            return false;
        }

        public a(Request request) {
            this.f107273g = request;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.lancet.ssretrofitchain.c
    public final c.a a(g gVar, Request request, u uVar) {
        a aVar = new a(request);
        try {
            if (aVar.a(gVar.f107266a.f107271d) && ((Boolean) aVar.c()).booleanValue()) {
                return new c.a(true, true);
            }
            if (aVar.a(gVar.f107266a.f107268a) && ((Boolean) aVar.c()).booleanValue()) {
                return new c.a(true, true);
            }
            return b.f107258a;
        } catch (Throwable unused) {
        }
    }
}
