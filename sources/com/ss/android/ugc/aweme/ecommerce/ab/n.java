package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class n {
    @c(a = "sku_prefetch")

    /* renamed from: a  reason: collision with root package name */
    public final p f84238a = null;

    static {
        Covode.recordClassIndex(52530);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && l.a(this.f84238a, ((n) obj).f84238a);
        }
        return true;
    }

    public final int hashCode() {
        p pVar = this.f84238a;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PrefetchSchemaConfig(skuPrefetch=" + this.f84238a + ")";
    }

    private n() {
    }
}
