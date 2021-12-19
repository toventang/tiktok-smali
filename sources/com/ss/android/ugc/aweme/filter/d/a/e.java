package com.ss.android.ugc.aweme.filter.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.d.c;
import com.ss.android.ugc.aweme.filter.repository.a.a.a;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import h.f.b.l;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final o f95527a;

    static {
        Covode.recordClassIndex(60531);
    }

    @Override // com.ss.android.ugc.aweme.filter.d.c
    public final void a() {
        this.f95527a.a();
    }

    public e(o oVar) {
        l.d(oVar, "");
        this.f95527a = oVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.d.c
    public final FilterBean a(int i2) {
        return com.ss.android.ugc.aweme.filter.repository.a.a.c.a(this.f95527a.f(), i2);
    }

    @Override // com.ss.android.ugc.aweme.filter.d.c
    public final String b(int i2) {
        return a.b(com.ss.android.ugc.aweme.filter.repository.a.a.c.a(this.f95527a.f(), i2));
    }

    @Override // com.ss.android.ugc.aweme.filter.d.c
    public final String c(int i2) {
        return a.a(com.ss.android.ugc.aweme.filter.repository.a.a.c.a(this.f95527a.f(), i2));
    }

    @Override // com.ss.android.ugc.aweme.filter.d.c
    public final String d(int i2) {
        return this.f95527a.g().c(i2);
    }
}
