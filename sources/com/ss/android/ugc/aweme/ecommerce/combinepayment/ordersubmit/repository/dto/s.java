package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class s {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public final String f85003a;
    @c(a = "value")

    /* renamed from: b  reason: collision with root package name */
    public final String f85004b;

    static {
        Covode.recordClassIndex(53138);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f85003a, sVar.f85003a) && l.a(this.f85004b, sVar.f85004b);
    }

    public final int hashCode() {
        String str = this.f85003a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85004b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StarlingKeyValue(key=" + this.f85003a + ", value=" + this.f85004b + ")";
    }
}
