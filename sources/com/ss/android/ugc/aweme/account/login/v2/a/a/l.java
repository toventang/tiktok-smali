package com.ss.android.ugc.aweme.account.login.v2.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;

public final class l extends d {

    /* renamed from: b  reason: collision with root package name */
    private final c f64177b;

    /* renamed from: c  reason: collision with root package name */
    private final int f64178c;

    /* renamed from: d  reason: collision with root package name */
    private final String f64179d;

    static {
        Covode.recordClassIndex(39544);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        if (!this.f64177b.ab_()) {
            return true;
        }
        c cVar = this.f64177b;
        int i2 = this.f64178c;
        cVar.a(i2, com.ss.android.ugc.aweme.account.util.l.a(Integer.valueOf(i2), this.f64179d));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(c cVar, int i2, String str) {
        super(cVar);
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        this.f64177b = cVar;
        this.f64178c = i2;
        this.f64179d = str;
    }
}
