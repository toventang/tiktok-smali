package com.bytedance.ies.xbridge.base.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class f {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final String f35778a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f35779b;

    static {
        Covode.recordClassIndex(21371);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f35778a, fVar.f35778a) && l.a(this.f35779b, fVar.f35779b);
    }

    public final int hashCode() {
        String str = this.f35778a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35779b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StorageValue(type=" + this.f35778a + ", value=" + this.f35779b + ")";
    }

    public f(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f35778a = str;
        this.f35779b = str2;
    }
}
