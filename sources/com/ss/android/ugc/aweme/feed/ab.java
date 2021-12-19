package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class ab implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f91459a;

    static {
        Covode.recordClassIndex(57548);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ab) && this.f91459a == ((ab) obj).f91459a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f91459a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "LiveCleanEvent(show=" + this.f91459a + ")";
    }

    public ab(boolean z) {
        this.f91459a = z;
    }
}
