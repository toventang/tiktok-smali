package com.ss.android.ugc.aweme.ecommercelive.business.audience.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f87782a;

    /* renamed from: b  reason: collision with root package name */
    public final long f87783b = 300;

    static {
        Covode.recordClassIndex(55207);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f87782a == aVar.f87782a && this.f87783b == aVar.f87783b;
    }

    public final int hashCode() {
        boolean z = this.f87782a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f87783b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ECPopCardChangeEvent(isShow=" + this.f87782a + ", popCardAnimDuration=" + this.f87783b + ")";
    }

    public a(boolean z) {
        this.f87782a = z;
    }
}
