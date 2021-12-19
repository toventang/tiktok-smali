package com.ss.android.ugc.aweme.ecommercelive.business.audience.b;

import com.bytedance.covode.number.Covode;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f87784a;

    /* renamed from: b  reason: collision with root package name */
    public final long f87785b;

    static {
        Covode.recordClassIndex(55208);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87784a == bVar.f87784a && this.f87785b == bVar.f87785b;
    }

    public final int hashCode() {
        boolean z = this.f87784a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f87785b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ECShopCartAnimChangeEvent(isShow=" + this.f87784a + ", shopCardDelayTime=" + this.f87785b + ")";
    }

    public b(boolean z, long j2) {
        this.f87784a = z;
        this.f87785b = j2;
    }
}
