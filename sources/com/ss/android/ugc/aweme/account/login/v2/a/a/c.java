package com.ss.android.ugc.aweme.account.login.v2.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.tux.a.i.a;
import h.f.b.l;

public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.account.login.v2.base.c f64152b;

    /* renamed from: c  reason: collision with root package name */
    private final String f64153c;

    static {
        Covode.recordClassIndex(39530);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        new a(com.bytedance.ies.ugc.appcontext.d.a()).a(this.f64153c).a();
        this.f64152b.requireActivity().finish();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
        super(cVar);
        l.d(cVar, "");
        l.d(str, "");
        this.f64152b = cVar;
        this.f64153c = str;
    }
}
