package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "is_available")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f85272a;
    @c(a = "unavailable_code")

    /* renamed from: b  reason: collision with root package name */
    public final String f85273b;
    @c(a = "unavailable_reason")

    /* renamed from: c  reason: collision with root package name */
    public final String f85274c;

    static {
        Covode.recordClassIndex(53372);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f85272a, aVar.f85272a) && l.a(this.f85273b, aVar.f85273b) && l.a(this.f85274c, aVar.f85274c);
    }

    public final int hashCode() {
        Boolean bool = this.f85272a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f85273b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85274c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Availability(isAvailable=" + this.f85272a + ", unavailableCode=" + this.f85273b + ", unavailableReason=" + this.f85274c + ")";
    }
}
