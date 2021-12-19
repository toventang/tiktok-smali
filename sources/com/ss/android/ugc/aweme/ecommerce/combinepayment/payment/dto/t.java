package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class t {
    @c(a = "photos")

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f85362a;
    @c(a = "dark_photos")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f85363b;

    static {
        Covode.recordClassIndex(53392);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l.a(this.f85362a, tVar.f85362a) && l.a(this.f85363b, tVar.f85363b);
    }

    public final int hashCode() {
        List<String> list = this.f85362a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f85363b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Photos(lightPhotos=" + this.f85362a + ", darkPhotos=" + this.f85363b + ")";
    }
}
