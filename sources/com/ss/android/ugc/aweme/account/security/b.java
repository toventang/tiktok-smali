package com.ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public final String f65308a;
    @c(a = "scheme")

    /* renamed from: b  reason: collision with root package name */
    public final String f65309b;

    static {
        Covode.recordClassIndex(40156);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f65308a, bVar.f65308a) && l.a(this.f65309b, bVar.f65309b);
    }

    public final int hashCode() {
        String str = this.f65308a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f65309b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SafeInfoNoticeMsgHighlight(content=" + this.f65308a + ", scheme=" + this.f65309b + ")";
    }

    private /* synthetic */ b() {
        this("", "");
    }

    private b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f65308a = str;
        this.f65309b = str2;
    }
}
