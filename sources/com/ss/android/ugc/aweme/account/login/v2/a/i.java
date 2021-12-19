package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i extends com.bytedance.sdk.a.h.a.i {

    /* renamed from: a  reason: collision with root package name */
    public final String f64242a;

    /* renamed from: b  reason: collision with root package name */
    public final String f64243b;

    static {
        Covode.recordClassIndex(39579);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f64242a, iVar.f64242a) && l.a(this.f64243b, iVar.f64243b);
    }

    public final int hashCode() {
        String str = this.f64242a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64243b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EmailBindQueryObj(email=" + this.f64242a + ", code=" + this.f64243b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, String str2) {
        super(8);
        l.d(str, "");
        l.d(str2, "");
        this.f64242a = str;
        this.f64243b = str2;
    }
}
