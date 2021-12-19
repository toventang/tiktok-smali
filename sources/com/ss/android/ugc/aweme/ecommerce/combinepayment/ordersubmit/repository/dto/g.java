package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "reason_key")

    /* renamed from: a  reason: collision with root package name */
    public final String f84962a;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public final String f84963b;

    static {
        Covode.recordClassIndex(53126);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f84962a, gVar.f84962a) && l.a(this.f84963b, gVar.f84963b);
    }

    public final int hashCode() {
        String str = this.f84962a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84963b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "InputReason(reasonKey=" + this.f84962a + ", content=" + this.f84963b + ")";
    }

    public g(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f84962a = str;
        this.f84963b = str2;
    }
}
