package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f30647a;

    /* renamed from: b  reason: collision with root package name */
    public long f30648b;

    static {
        Covode.recordClassIndex(17805);
    }

    public b() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30647a == bVar.f30647a && this.f30648b == bVar.f30648b;
    }

    public final int hashCode() {
        long j2 = this.f30647a;
        long j3 = this.f30648b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "ClosureExtra(callCloseTime=" + this.f30647a + ", realCloseTime=" + this.f30648b + ")";
    }

    private b(long j2) {
        this.f30647a = j2;
        this.f30648b = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j2, int i2) {
        this((i2 & 1) != 0 ? 0 : j2);
    }
}
