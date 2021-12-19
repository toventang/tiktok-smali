package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g<R> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<R> f32699a;

    /* renamed from: b  reason: collision with root package name */
    public final R f32700b;

    static {
        Covode.recordClassIndex(19445);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f32699a, gVar.f32699a) && l.a(this.f32700b, gVar.f32700b);
    }

    public final int hashCode() {
        Class<R> cls = this.f32699a;
        int i2 = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        R r = this.f32700b;
        if (r != null) {
            i2 = r.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "InputInterceptorResult(type=" + this.f32699a + ", value=" + ((Object) this.f32700b) + ")";
    }

    public g(Class<R> cls, R r) {
        l.c(cls, "");
        this.f32699a = cls;
        this.f32700b = r;
    }
}
