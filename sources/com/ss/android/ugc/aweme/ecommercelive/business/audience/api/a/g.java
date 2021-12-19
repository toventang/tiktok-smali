package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class g {
    @c(a = "products")

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f87777a;

    static {
        Covode.recordClassIndex(55204);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f87777a, ((g) obj).f87777a);
        }
        return true;
    }

    public final int hashCode() {
        List<a> list = this.f87777a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductListDTO(products=" + this.f87777a + ")";
    }
}
