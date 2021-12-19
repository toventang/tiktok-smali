package com.bytedance.android.livesdkapi.l;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23255a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23256b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23257c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23258d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f23259e;

    static {
        Covode.recordClassIndex(13827);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23255a == bVar.f23255a && this.f23256b == bVar.f23256b && this.f23257c == bVar.f23257c && this.f23258d == bVar.f23258d && this.f23259e == bVar.f23259e;
    }

    public final int hashCode() {
        boolean z = this.f23255a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f23256b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f23257c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f23258d;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        if (!this.f23259e) {
            i2 = 0;
        }
        return i18 + i2;
    }

    public final String toString() {
        return "DetailLivePermission(socialPermission=" + this.f23255a + ", videoPermission=" + this.f23256b + ", screenPermission=" + this.f23257c + ", obsPermission=" + this.f23258d + ", enableLiveStudio=" + this.f23259e + ")";
    }

    private /* synthetic */ b() {
        this(false, false, false, false, false);
    }

    public b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f23255a = z;
        this.f23256b = z2;
        this.f23257c = z3;
        this.f23258d = z4;
        this.f23259e = z5;
    }
}
