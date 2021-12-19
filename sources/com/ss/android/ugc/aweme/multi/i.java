package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "price")

    /* renamed from: a  reason: collision with root package name */
    public final j f110910a = null;

    static {
        Covode.recordClassIndex(71157);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f110910a, ((i) obj).f110910a);
        }
        return true;
    }

    public final int hashCode() {
        j jVar = this.f110910a;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductBase(price=" + this.f110910a + ")";
    }

    private i() {
    }
}
