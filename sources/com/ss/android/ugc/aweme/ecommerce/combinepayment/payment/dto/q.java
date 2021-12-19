package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class q {
    @c(a = "raw_text")

    /* renamed from: a  reason: collision with root package name */
    public final String f85347a;
    @c(a = "link")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f85348b;

    static {
        Covode.recordClassIndex(53389);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f85347a, qVar.f85347a) && l.a(this.f85348b, qVar.f85348b);
    }

    public final int hashCode() {
        String str = this.f85347a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f85348b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PaymentMethodPolicy(rawText=" + this.f85347a + ", links=" + this.f85348b + ")";
    }
}
