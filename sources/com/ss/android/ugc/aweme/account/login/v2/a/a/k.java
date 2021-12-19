package com.ss.android.ugc.aweme.account.login.v2.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import h.f.b.l;

public final class k extends d {

    /* renamed from: b  reason: collision with root package name */
    private final c f64175b;

    /* renamed from: c  reason: collision with root package name */
    private final String f64176c;

    static {
        Covode.recordClassIndex(39543);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        a.C1412a b2 = e.b(this.f64175b);
        a.a(b2);
        c cVar = this.f64175b;
        String a2 = a.a(b2);
        l.b(a2, "");
        x.a(cVar, a2, this.f64176c, j.SIGN_UP, this.f64175b.V_()).c();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(c cVar, String str) {
        super(cVar);
        l.d(cVar, "");
        l.d(str, "");
        this.f64175b = cVar;
        this.f64176c = str;
    }
}
