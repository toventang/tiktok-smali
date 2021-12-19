package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.HashMap;

public final class h {
    @c(a = "template")

    /* renamed from: a  reason: collision with root package name */
    public final String f84964a;
    @c(a = "arguments")

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, i> f84965b;

    static {
        Covode.recordClassIndex(53127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f84964a, hVar.f84964a) && l.a(this.f84965b, hVar.f84965b);
    }

    public final int hashCode() {
        String str = this.f84964a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap<String, i> hashMap = this.f84965b;
        if (hashMap != null) {
            i2 = hashMap.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LinkRichText(template=" + this.f84964a + ", arguments=" + this.f84965b + ")";
    }
}
