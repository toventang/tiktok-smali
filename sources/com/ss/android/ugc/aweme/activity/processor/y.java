package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.a;

public final class y implements a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f65564a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f65565b;

    static {
        Covode.recordClassIndex(40343);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f65564a == yVar.f65564a && this.f65565b == yVar.f65565b;
    }

    public final int hashCode() {
        boolean z = this.f65564a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f65565b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "InitHookConfig(enableInitHook=" + this.f65564a + ", mDisableOptimizeViewHierarchy=" + this.f65565b + ")";
    }

    private /* synthetic */ y() {
        this(true, false);
    }

    public y(boolean z, boolean z2) {
        this.f65564a = z;
        this.f65565b = z2;
    }
}
