package com.ss.android.ugc.aweme.al;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f66364a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f66365b;

    static {
        Covode.recordClassIndex(40780);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f66364a == dVar.f66364a && this.f66365b == dVar.f66365b;
    }

    public final int hashCode() {
        boolean z = this.f66364a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f66365b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "LoopCurrentStoryVideoEvent(loop=" + this.f66364a + ", useCount=" + this.f66365b + ")";
    }

    public /* synthetic */ d(boolean z) {
        this(z, true);
    }

    public d(boolean z, boolean z2) {
        this.f66364a = z;
        this.f66365b = z2;
    }
}
