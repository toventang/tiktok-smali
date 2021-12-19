package com.ss.android.ugc.aweme.cs.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import h.f.b.l;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c f79005a;

    /* renamed from: b  reason: collision with root package name */
    private final h f79006b = i.a(new b());

    static {
        Covode.recordClassIndex(49038);
    }

    private final b b() {
        return (b) this.f79006b.getValue();
    }

    public final long a() {
        c cVar = this.f79005a;
        if (cVar == null || !cVar.a()) {
            return 0;
        }
        b();
        return b.a(cVar).d();
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f79005a = cVar;
    }
}
