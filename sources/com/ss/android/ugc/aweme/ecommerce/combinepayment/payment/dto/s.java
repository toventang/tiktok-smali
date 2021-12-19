package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;

public final class s {
    @c(a = "payment_method_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f85360a;
    @c(a = "payment_price")

    /* renamed from: b  reason: collision with root package name */
    public final Price f85361b;

    static {
        Covode.recordClassIndex(53391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f85360a, sVar.f85360a) && l.a(this.f85361b, sVar.f85361b);
    }

    public final int hashCode() {
        String str = this.f85360a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Price price = this.f85361b;
        if (price != null) {
            i2 = price.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PaymentPrice(paymentMethodId=" + this.f85360a + ", price=" + this.f85361b + ")";
    }
}
