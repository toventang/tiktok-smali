package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f103893a = false;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f103894b = false;

    static {
        Covode.recordClassIndex(66563);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f103893a == cVar.f103893a && this.f103894b == cVar.f103894b;
    }

    public final int hashCode() {
        boolean z = this.f103893a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f103894b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "FollowWrapResult(isWrapped=" + this.f103893a + ", isLastWrapped=" + this.f103894b + ")";
    }
}
