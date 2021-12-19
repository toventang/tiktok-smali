package com.ss.android.ugc.aweme.ecommerce.pdp;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f86324a;

    /* renamed from: b  reason: collision with root package name */
    public final long f86325b;

    static {
        Covode.recordClassIndex(54050);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f86324a, aVar.f86324a) && this.f86325b == aVar.f86325b;
    }

    public final int hashCode() {
        String str = this.f86324a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f86325b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "CartTipData(message=" + this.f86324a + ", time=" + this.f86325b + ")";
    }

    public a(String str, long j2) {
        l.d(str, "");
        this.f86324a = str;
        this.f86325b = j2;
    }
}
