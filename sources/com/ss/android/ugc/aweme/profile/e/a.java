package com.ss.android.ugc.aweme.profile.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f116064a;

    /* renamed from: b  reason: collision with root package name */
    public final String f116065b;

    static {
        Covode.recordClassIndex(74876);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f116064a, aVar.f116064a) && l.a(this.f116065b, aVar.f116065b);
    }

    public final int hashCode() {
        String str = this.f116064a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f116065b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AnalyticsMetadata(enterFrom=" + this.f116064a + ", enterMethod=" + this.f116065b + ")";
    }

    public a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f116064a = str;
        this.f116065b = str2;
    }
}
