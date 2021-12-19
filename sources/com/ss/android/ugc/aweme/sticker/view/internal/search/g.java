package com.ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f136541a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f136542b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f136543c;

    /* renamed from: d  reason: collision with root package name */
    public final int f136544d;

    static {
        Covode.recordClassIndex(89184);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f136541a == gVar.f136541a && this.f136542b == gVar.f136542b && this.f136543c == gVar.f136543c && this.f136544d == gVar.f136544d;
    }

    public final int hashCode() {
        boolean z = this.f136541a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f136542b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f136543c) {
            i2 = 0;
        }
        return ((i10 + i2) * 31) + this.f136544d;
    }

    public final String toString() {
        return "SearchShowHideEvent(showSearchPanel=" + this.f136541a + ", usingSameEffect=" + this.f136542b + ", clickCancel=" + this.f136543c + ", panelHeight=" + this.f136544d + ")";
    }

    public g(boolean z, boolean z2, boolean z3, int i2) {
        this.f136541a = z;
        this.f136542b = z2;
        this.f136543c = z3;
        this.f136544d = i2;
    }
}
