package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class q {
    @c(a = "reason_key")

    /* renamed from: a  reason: collision with root package name */
    public final String f85000a;

    static {
        Covode.recordClassIndex(53136);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof q) && l.a(this.f85000a, ((q) obj).f85000a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f85000a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SelectReason(reasonKey=" + this.f85000a + ")";
    }

    public q(String str) {
        l.d(str, "");
        this.f85000a = str;
    }
}
