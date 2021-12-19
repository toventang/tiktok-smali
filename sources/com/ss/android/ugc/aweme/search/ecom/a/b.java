package com.ss.android.ugc.aweme.search.ecom.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "has_more")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f121049a = null;
    @c(a = "product_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f121050b = null;

    static {
        Covode.recordClassIndex(78856);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f121049a, bVar.f121049a) && l.a(this.f121050b, bVar.f121050b);
    }

    public final int hashCode() {
        Boolean bool = this.f121049a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<a> list = this.f121050b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProductGroup(hasMore=" + this.f121049a + ", productList=" + this.f121050b + ")";
    }

    private b() {
    }
}
