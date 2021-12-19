package com.ss.android.ugc.aweme.ecommercelive.framework.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a;
import h.f.b.l;

public final class b {
    @c(a = "product")

    /* renamed from: a  reason: collision with root package name */
    public final a f88009a = null;
    @c(a = "server_time")

    /* renamed from: b  reason: collision with root package name */
    public final long f88010b = 0;
    @c(a = "schema")

    /* renamed from: c  reason: collision with root package name */
    public final String f88011c = null;
    @c(a = "bag_index")

    /* renamed from: d  reason: collision with root package name */
    public final int f88012d = 0;

    static {
        Covode.recordClassIndex(55328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f88009a, bVar.f88009a) && this.f88010b == bVar.f88010b && l.a(this.f88011c, bVar.f88011c) && this.f88012d == bVar.f88012d;
    }

    public final String toString() {
        return "PopProductResp(product=" + this.f88009a + ", serverTime=" + this.f88010b + ", schema=" + this.f88011c + ", bagIndex=" + this.f88012d + ")";
    }

    private b() {
    }

    public final int hashCode() {
        int i2;
        a aVar = this.f88009a;
        int i3 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f88010b;
        int i4 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f88011c;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((i4 + i3) * 31) + this.f88012d;
    }
}
