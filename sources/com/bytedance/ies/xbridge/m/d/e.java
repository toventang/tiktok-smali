package com.bytedance.ies.xbridge.m.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class e {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final String f36285a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f36286b;

    static {
        Covode.recordClassIndex(21710);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f36285a, eVar.f36285a) && l.a(this.f36286b, eVar.f36286b);
    }

    public final int hashCode() {
        String str = this.f36285a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36286b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StorageValue(type=" + this.f36285a + ", value=" + this.f36286b + ")";
    }

    public e(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f36285a = str;
        this.f36286b = str2;
    }
}
