package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.h.a.i;
import h.f.b.l;

public final class n extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String f64248a;

    /* renamed from: b  reason: collision with root package name */
    public final String f64249b;

    /* renamed from: c  reason: collision with root package name */
    public final String f64250c;

    static {
        Covode.recordClassIndex(39585);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f64248a, nVar.f64248a) && l.a(this.f64249b, nVar.f64249b) && l.a(this.f64250c, nVar.f64250c);
    }

    public final int hashCode() {
        String str = this.f64248a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64249b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64250c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EmailChangeQueryObj(code=" + this.f64248a + ", email=" + this.f64249b + ", ticket=" + this.f64250c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, String str3) {
        super(22);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f64248a = str;
        this.f64249b = str2;
        this.f64250c = str3;
    }
}
