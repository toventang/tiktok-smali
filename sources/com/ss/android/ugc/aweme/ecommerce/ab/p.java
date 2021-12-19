package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class p {
    @c(a = "enable")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f84241a = null;
    @c(a = "duration")

    /* renamed from: b  reason: collision with root package name */
    public final int f84242b = 0;

    static {
        Covode.recordClassIndex(52532);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.f84241a, pVar.f84241a) && this.f84242b == pVar.f84242b;
    }

    public final int hashCode() {
        Boolean bool = this.f84241a;
        return ((bool != null ? bool.hashCode() : 0) * 31) + this.f84242b;
    }

    public final String toString() {
        return "SkuPrefetchConfig(enable=" + this.f84241a + ", duration=" + this.f84242b + ")";
    }

    private p() {
    }
}
