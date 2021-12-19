package com.ss.android.ugc.aweme.api.resp;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.multi.m;
import h.f.b.l;
import java.util.List;

public final class e {
    @c(a = "products")

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f66476a;

    static {
        Covode.recordClassIndex(40855);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f66476a, ((e) obj).f66476a);
        }
        return true;
    }

    public final int hashCode() {
        List<m> list = this.f66476a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GetItemProductInfoResponseData(products=" + this.f66476a + ")";
    }
}
