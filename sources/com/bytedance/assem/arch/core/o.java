package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f25591a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25592b;

    static {
        Covode.recordClassIndex(14895);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f25591a, oVar.f25591a) && l.a(this.f25592b, oVar.f25592b);
    }

    public final int hashCode() {
        Class<?> cls = this.f25591a;
        int i2 = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.f25592b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ServiceIdentifier(serviceClazz=" + this.f25591a + ", serviceKey=" + this.f25592b + ")";
    }

    public o(Class<?> cls, String str) {
        l.c(cls, "");
        this.f25591a = cls;
        this.f25592b = str;
    }
}
