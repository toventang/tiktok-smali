package com.ss.android.ugc.aweme.ecommerce.payment.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "amount")

    /* renamed from: a  reason: collision with root package name */
    public final String f86283a;
    @c(a = "charge_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f86284b;
    @c(a = "currency")

    /* renamed from: c  reason: collision with root package name */
    public final String f86285c;
    @c(a = "payment_reference")

    /* renamed from: d  reason: collision with root package name */
    public final String f86286d;
    @c(a = "sub_merchant_id")

    /* renamed from: e  reason: collision with root package name */
    public final String f86287e;

    static {
        Covode.recordClassIndex(53998);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f86283a, dVar.f86283a) && l.a(this.f86284b, dVar.f86284b) && l.a(this.f86285c, dVar.f86285c) && l.a(this.f86286d, dVar.f86286d) && l.a(this.f86287e, dVar.f86287e);
    }

    public final int hashCode() {
        String str = this.f86283a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86284b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86285c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86286d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86287e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "PaymentParams(amount=" + this.f86283a + ", chargeId=" + this.f86284b + ", currency=" + this.f86285c + ", paymentReference=" + this.f86286d + ", subMerchantId=" + this.f86287e + ")";
    }
}
