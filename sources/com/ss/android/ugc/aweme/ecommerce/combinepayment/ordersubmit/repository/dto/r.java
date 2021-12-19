package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class r {
    @c(a = "product_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f85001a;
    @c(a = "sku_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f85002b;

    static {
        Covode.recordClassIndex(53137);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f85001a, rVar.f85001a) && l.a(this.f85002b, rVar.f85002b);
    }

    public final int hashCode() {
        String str = this.f85001a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85002b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SkuInfo(productId=" + this.f85001a + ", skuId=" + this.f85002b + ")";
    }

    public r(String str, String str2) {
        this.f85001a = str;
        this.f85002b = str2;
    }
}
