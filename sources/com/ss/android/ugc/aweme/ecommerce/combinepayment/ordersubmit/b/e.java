package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f84824a;

    static {
        Covode.recordClassIndex(53000);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && this.f84824a == ((e) obj).f84824a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f84824a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "PolicyVO(reachable=" + this.f84824a + ")";
    }

    public e(boolean z) {
        this.f84824a = z;
    }
}
