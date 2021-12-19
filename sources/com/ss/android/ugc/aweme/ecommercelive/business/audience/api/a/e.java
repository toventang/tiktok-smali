package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Map;

public final class e {
    @c(a = "product_data")

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f87774a;

    static {
        Covode.recordClassIndex(55202);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f87774a, ((e) obj).f87774a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, c> map = this.f87774a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FansPopUpDatas(productData=" + this.f87774a + ")";
    }
}
