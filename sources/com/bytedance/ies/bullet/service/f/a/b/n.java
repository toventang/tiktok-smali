package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.a.q;
import h.f.b.ad;
import h.f.b.l;
import h.r;
import java.util.LinkedHashMap;
import java.util.Map;

public final class n<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, m<?, String, ?>> f32713a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, q<?, String, ?, ?>> f32714b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Class<T> f32715c;

    static {
        Covode.recordClassIndex(19455);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.e
    public final <R> m<R, String, T> a(Class<R> cls) {
        Object obj;
        l.c(cls, "");
        m<R, String, T> mVar = null;
        try {
            m<?, String, ?> mVar2 = this.f32713a.get(cls);
            obj = h.q.m223constructorimpl(mVar2 != null ? (m) ad.b(mVar2, 2) : null);
        } catch (Throwable th) {
            obj = h.q.m223constructorimpl(r.a(th));
        }
        if (!h.q.m228isFailureimpl(obj)) {
            mVar = obj;
        }
        return mVar;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.e
    public final <R> q<R, String, T, R> b(Class<R> cls) {
        Object obj;
        l.c(cls, "");
        q<R, String, T, R> qVar = null;
        try {
            q<?, String, ?, ?> qVar2 = this.f32714b.get(cls);
            obj = h.q.m223constructorimpl(qVar2 != null ? (q) ad.b(qVar2, 3) : null);
        } catch (Throwable th) {
            obj = h.q.m223constructorimpl(r.a(th));
        }
        if (!h.q.m228isFailureimpl(obj)) {
            qVar = obj;
        }
        return qVar;
    }

    public final String toString() {
        return "ParamType: " + this.f32715c.getCanonicalName();
    }

    public n(Class<T> cls) {
        l.c(cls, "");
        this.f32715c = cls;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.e
    public final <R> void a(Class<R> cls, m<? super R, ? super String, ? extends T> mVar) {
        l.c(cls, "");
        l.c(mVar, "");
        this.f32713a.put(cls, mVar);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.e
    public final <R> void a(Class<R> cls, q<? super R, ? super String, ? super T, ? extends R> qVar) {
        l.c(cls, "");
        l.c(qVar, "");
        this.f32714b.put(cls, qVar);
    }
}
