package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f149334a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f149335b;

    static {
        Covode.recordClassIndex(98340);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f149334a == lVar.f149334a && this.f149335b == lVar.f149335b;
    }

    public final int hashCode() {
        int i2 = this.f149334a * 31;
        boolean z = this.f149335b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "EpProviderCursorData(cursor=" + this.f149334a + ", hasMore=" + this.f149335b + ")";
    }

    public l(int i2, boolean z) {
        this.f149334a = i2;
        this.f149335b = z;
    }
}
