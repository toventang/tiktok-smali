package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f25574a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25575b;

    static {
        Covode.recordClassIndex(14890);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f25574a, jVar.f25574a) && l.a(this.f25575b, jVar.f25575b);
    }

    public final int hashCode() {
        Class<?> cls = this.f25574a;
        int i2 = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.f25575b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "HierarchyDataIdentifier(clazz=" + this.f25574a + ", key=" + this.f25575b + ")";
    }

    public j(Class<?> cls, String str) {
        l.c(cls, "");
        this.f25574a = cls;
        this.f25575b = str;
    }
}
