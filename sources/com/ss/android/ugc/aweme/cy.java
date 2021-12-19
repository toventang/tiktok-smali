package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;

public final class cy {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f79190a;

    /* renamed from: b  reason: collision with root package name */
    public final int f79191b;

    static {
        Covode.recordClassIndex(49143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return this.f79190a == cyVar.f79190a && this.f79191b == cyVar.f79191b;
    }

    public final int hashCode() {
        boolean z = this.f79190a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f79191b;
    }

    public final String toString() {
        return "PercentAllocation(ignorePercentAllocation=" + this.f79190a + ", value=" + this.f79191b + ")";
    }

    public cy(boolean z, int i2) {
        this.f79190a = z;
        this.f79191b = i2;
    }
}
