package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28172a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28173b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28174c;

    static {
        Covode.recordClassIndex(16504);
    }

    public ac(boolean z) {
        this(z, true, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f28172a == acVar.f28172a && this.f28173b == acVar.f28173b && this.f28174c == acVar.f28174c;
    }

    public final int hashCode() {
        boolean z = this.f28172a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f28173b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f28174c) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "VisibilityEvent(toVisible=" + this.f28172a + ", withAnim=" + this.f28173b + ", tabOnly=" + this.f28174c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(boolean z, boolean z2, int i2) {
        this(z, (i2 & 2) != 0 ? false : z2, false);
    }

    public ac(boolean z, boolean z2, boolean z3) {
        this.f28172a = z;
        this.f28173b = z2;
        this.f28174c = z3;
    }
}
