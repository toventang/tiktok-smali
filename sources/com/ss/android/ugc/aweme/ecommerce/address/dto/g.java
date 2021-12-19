package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "text")

    /* renamed from: a  reason: collision with root package name */
    public final String f84340a;

    static {
        Covode.recordClassIndex(52583);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f84340a, ((g) obj).f84340a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f84340a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CandiHeader(text=" + this.f84340a + ")";
    }
}
