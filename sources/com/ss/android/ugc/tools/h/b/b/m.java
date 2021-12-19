package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f149336a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f149337b;

    static {
        Covode.recordClassIndex(98341);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f149336a == mVar.f149336a && this.f149337b == mVar.f149337b;
    }

    public final int hashCode() {
        int i2 = this.f149336a * 31;
        boolean z = this.f149337b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "EpSearchCursorData(cursor=" + this.f149336a + ", hasMore=" + this.f149337b + ")";
    }

    public m(int i2, boolean z) {
        this.f149336a = i2;
        this.f149337b = z;
    }
}
