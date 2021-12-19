package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class f {
    @c(a = "sku_infos")

    /* renamed from: a  reason: collision with root package name */
    public final List<r> f84961a;

    static {
        Covode.recordClassIndex(53125);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f84961a, ((f) obj).f84961a);
        }
        return true;
    }

    public final int hashCode() {
        List<r> list = this.f84961a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ExtraInfo(skuInfos=" + this.f84961a + ")";
    }

    public f(List<r> list) {
        l.d(list, "");
        this.f84961a = list;
    }
}
