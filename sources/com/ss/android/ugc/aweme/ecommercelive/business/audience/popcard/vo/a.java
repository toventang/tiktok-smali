package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f87944a;

    /* renamed from: b  reason: collision with root package name */
    public final long f87945b;

    static {
        Covode.recordClassIndex(55299);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f87944a == aVar.f87944a && this.f87945b == aVar.f87945b;
    }

    public final String toString() {
        return "FlashSaleInfo(startTime=" + this.f87944a + ", endTime=" + this.f87945b + ")";
    }

    public final int hashCode() {
        long j2 = this.f87944a;
        long j3 = this.f87945b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public a(long j2, long j3) {
        this.f87944a = j2;
        this.f87945b = j3;
    }
}
