package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f128115a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f128116b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f128117c;

    static {
        Covode.recordClassIndex(83983);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f128115a == bVar.f128115a && this.f128116b == bVar.f128116b && this.f128117c == bVar.f128117c;
    }

    public final int hashCode() {
        boolean z = this.f128115a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f128116b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f128117c) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "CutVideoListViewConfigure(enableStickPoint=" + this.f128115a + ", enableAdd=" + this.f128116b + ", isStickPointTab=" + this.f128117c + ")";
    }

    public b(boolean z, boolean z2, boolean z3) {
        this.f128115a = z;
        this.f128116b = z2;
        this.f128117c = z3;
    }
}
