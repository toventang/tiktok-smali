package com.ss.android.ugc.aweme.ax.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f67713a;

    /* renamed from: b  reason: collision with root package name */
    public final long f67714b;

    static {
        Covode.recordClassIndex(41678);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f67713a, dVar.f67713a) && this.f67714b == dVar.f67714b;
    }

    public final int hashCode() {
        String str = this.f67713a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f67714b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "IntervalMetric(intervalName=" + this.f67713a + ", interval=" + this.f67714b + ")";
    }

    public d(String str, long j2) {
        l.d(str, "");
        this.f67713a = str;
        this.f67714b = j2;
    }
}
