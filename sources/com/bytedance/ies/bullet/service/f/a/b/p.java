package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.p;
import com.bytedance.ies.bullet.service.f.a.b.q;
import h.f.b.l;
import java.util.Iterator;

public abstract class p<T extends p<T, S, R>, S extends q, R> {

    /* renamed from: b  reason: collision with root package name */
    public final R f32724b;

    static {
        Covode.recordClassIndex(19457);
    }

    /* access modifiers changed from: protected */
    public abstract S a();

    public p(R r) {
        this.f32724b = r;
    }

    public final R a(Class<R> cls) {
        l.c(cls, "");
        S a2 = a();
        R r = this.f32724b;
        l.c(cls, "");
        Iterator<T> it = a2.a().iterator();
        while (it.hasNext()) {
            r = (R) it.next().b(cls, r);
        }
        return r;
    }
}
