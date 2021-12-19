package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f64238a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final e f64239b;

    static {
        Covode.recordClassIndex(39575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f64238a, fVar.f64238a) && l.a(this.f64239b, fVar.f64239b);
    }

    public final int hashCode() {
        String str = this.f64238a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        e eVar = this.f64239b;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CommitUserNameResponse(message=" + this.f64238a + ", data=" + this.f64239b + ")";
    }
}
