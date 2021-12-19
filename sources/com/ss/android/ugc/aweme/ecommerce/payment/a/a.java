package com.ss.android.ugc.aweme.ecommerce.payment.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "billing_country_region")

    /* renamed from: a  reason: collision with root package name */
    public final String f86263a;
    @c(a = "billing_state")

    /* renamed from: b  reason: collision with root package name */
    public final String f86264b;
    @c(a = "billing_city")

    /* renamed from: c  reason: collision with root package name */
    public final String f86265c;
    @c(a = "billing_street")

    /* renamed from: d  reason: collision with root package name */
    public final String f86266d;
    @c(a = "billing_postal_code")

    /* renamed from: e  reason: collision with root package name */
    public final String f86267e;

    static {
        Covode.recordClassIndex(53995);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f86263a, aVar.f86263a) && l.a(this.f86264b, aVar.f86264b) && l.a(this.f86265c, aVar.f86265c) && l.a(this.f86266d, aVar.f86266d) && l.a(this.f86267e, aVar.f86267e);
    }

    public final int hashCode() {
        String str = this.f86263a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86264b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86265c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86266d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86267e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AddressForPay(region=" + this.f86263a + ", state=" + this.f86264b + ", city=" + this.f86265c + ", street=" + this.f86266d + ", postalCode=" + this.f86267e + ")";
    }
}
