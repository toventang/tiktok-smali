package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class j {
    @c(a = "original_price")

    /* renamed from: a  reason: collision with root package name */
    public final String f110911a = null;
    @c(a = "real_price")

    /* renamed from: b  reason: collision with root package name */
    public final String f110912b = null;

    static {
        Covode.recordClassIndex(71158);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f110911a, jVar.f110911a) && l.a(this.f110912b, jVar.f110912b);
    }

    public final int hashCode() {
        String str = this.f110911a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f110912b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProductPrice(originalPrice=" + this.f110911a + ", realPrice=" + this.f110912b + ")";
    }

    private j() {
    }
}
