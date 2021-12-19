package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class f {
    @c(a = "begin_time")

    /* renamed from: a  reason: collision with root package name */
    public final long f87775a = 0;
    @c(a = "end_time")

    /* renamed from: b  reason: collision with root package name */
    public final long f87776b = 0;

    static {
        Covode.recordClassIndex(55203);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f87775a == fVar.f87775a && this.f87776b == fVar.f87776b;
    }

    public final String toString() {
        return "FlashSaleDTO(beginTime=" + this.f87775a + ", endTime=" + this.f87776b + ")";
    }

    private f() {
    }

    public final int hashCode() {
        long j2 = this.f87775a;
        long j3 = this.f87776b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }
}
