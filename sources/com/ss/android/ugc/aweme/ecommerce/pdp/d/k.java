package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f86475a;

    static {
        Covode.recordClassIndex(54158);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.d.h
    public final String a() {
        return "sku";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f86475a, ((k) obj).f86475a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f86475a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectSkuVO(selectSkuStr=" + this.f86475a + ")";
    }

    public k(String str) {
        l.d(str, "");
        this.f86475a = str;
    }
}
