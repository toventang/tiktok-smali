package com.bytedance.ext_power_list;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28711a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28712b;

    static {
        Covode.recordClassIndex(16891);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f28711a == lVar.f28711a && this.f28712b == lVar.f28712b;
    }

    public final int hashCode() {
        boolean z = this.f28711a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f28712b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "LoadingState(prevHasMore=" + this.f28711a + ", nextHasMore=" + this.f28712b + ")";
    }

    private /* synthetic */ l() {
        this(false, false);
    }

    public l(boolean z, boolean z2) {
        this.f28711a = z;
        this.f28712b = z2;
    }
}
