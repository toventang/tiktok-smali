package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a;
import h.f.b.l;

public final class j {
    @c(a = "update")

    /* renamed from: a  reason: collision with root package name */
    public final long f102213a = 259200;
    @c(a = "coldup_update")

    /* renamed from: b  reason: collision with root package name */
    public final long f102214b = 0;
    @c(a = "frontier_update")

    /* renamed from: c  reason: collision with root package name */
    public final long f102215c = 0;
    @c(a = "font_update")

    /* renamed from: d  reason: collision with root package name */
    public final long f102216d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final long f102217e = 600;

    static {
        Covode.recordClassIndex(65405);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f102213a == jVar.f102213a && this.f102214b == jVar.f102214b && this.f102215c == jVar.f102215c && this.f102216d == jVar.f102216d;
    }

    public final String toString() {
        return "RelationFetchFrequencyConfig(fullUpdateFreq=" + this.f102213a + ", coldUpDiffUpdateFreq=" + this.f102214b + ", wsDiffUpdateFreq=" + this.f102215c + ", fontDiffFreq=" + this.f102216d + ")";
    }

    public final int hashCode() {
        long j2 = this.f102213a;
        long j3 = this.f102214b;
        long j4 = this.f102215c;
        long j5 = this.f102216d;
        return (((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final long a(a aVar) {
        l.d(aVar, "");
        int i2 = k.f102218a[aVar.ordinal()];
        if (i2 == 1) {
            return this.f102213a;
        }
        if (i2 == 2) {
            return this.f102214b;
        }
        if (i2 == 3) {
            return this.f102215c;
        }
        if (i2 == 4) {
            return this.f102216d;
        }
        if (i2 != 5) {
            return this.f102217e;
        }
        return this.f102217e;
    }
}
