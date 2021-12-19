package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f80949a;

    static {
        Covode.recordClassIndex(50324);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && this.f80949a == ((d) obj).f80949a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f80949a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "DiscoverSearchEvent(enter=" + this.f80949a + ")";
    }

    public d(boolean z) {
        this.f80949a = z;
    }
}
