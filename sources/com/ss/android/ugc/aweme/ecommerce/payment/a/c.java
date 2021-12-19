package com.ss.android.ugc.aweme.ecommerce.payment.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "cashier")

    /* renamed from: a  reason: collision with root package name */
    public final o f86281a;
    @com.google.gson.a.c(a = "address")

    /* renamed from: b  reason: collision with root package name */
    public a f86282b;

    static {
        Covode.recordClassIndex(53997);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f86281a, cVar.f86281a) && l.a(this.f86282b, cVar.f86282b);
    }

    public final int hashCode() {
        o oVar = this.f86281a;
        int i2 = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        a aVar = this.f86282b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PaymentData(cashier=" + this.f86281a + ", address=" + this.f86282b + ")";
    }
}
