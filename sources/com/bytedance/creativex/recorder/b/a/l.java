package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28196a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28197b;

    static {
        Covode.recordClassIndex(16526);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f28196a == lVar.f28196a && this.f28197b == lVar.f28197b;
    }

    public final int hashCode() {
        boolean z = this.f28196a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f28197b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "OnVisibilityChanged(tabOnly=" + this.f28196a + ", toVisible=" + this.f28197b + ")";
    }

    public l(boolean z, boolean z2) {
        this.f28196a = z;
        this.f28197b = z2;
    }
}
