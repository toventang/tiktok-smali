package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.h;
import h.f.b.l;

public final class a<T extends h> {

    /* renamed from: a  reason: collision with root package name */
    public final String f41990a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f41991b;

    static {
        Covode.recordClassIndex(25668);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f41990a, aVar.f41990a) && l.a(this.f41991b, aVar.f41991b);
    }

    public final int hashCode() {
        String str = this.f41990a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Class<T> cls = this.f41991b;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SourceKey(tag=" + this.f41990a + ", target=" + this.f41991b + ")";
    }

    public a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        this.f41990a = str;
        this.f41991b = cls;
    }
}
