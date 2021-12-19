package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f64231a = null;
    @com.google.gson.a.c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final b f64232b = null;

    static {
        Covode.recordClassIndex(39572);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f64231a, cVar.f64231a) && l.a(this.f64232b, cVar.f64232b);
    }

    public final int hashCode() {
        String str = this.f64231a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        b bVar = this.f64232b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Check2SvPushClickResponseWrap(message=" + this.f64231a + ", data=" + this.f64232b + ")";
    }

    private c() {
    }
}
