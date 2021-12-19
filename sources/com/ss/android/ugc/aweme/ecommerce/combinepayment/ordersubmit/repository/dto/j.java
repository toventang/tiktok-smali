package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.HashMap;

public final class j {
    @c(a = "text")

    /* renamed from: a  reason: collision with root package name */
    public final String f84969a;
    @c(a = "arguments")

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, String> f84970b;

    static {
        Covode.recordClassIndex(53129);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f84969a, jVar.f84969a) && l.a(this.f84970b, jVar.f84970b);
    }

    public final int hashCode() {
        String str = this.f84969a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap<String, String> hashMap = this.f84970b;
        if (hashMap != null) {
            i2 = hashMap.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OSPBottomNotice(text=" + this.f84969a + ", arguments=" + this.f84970b + ")";
    }
}
