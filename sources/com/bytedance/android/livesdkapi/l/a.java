package com.bytedance.android.livesdkapi.l;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23252a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23253b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23254c;

    static {
        Covode.recordClassIndex(13826);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23252a == aVar.f23252a && this.f23253b == aVar.f23253b && this.f23254c == aVar.f23254c;
    }

    public final int hashCode() {
        boolean z = this.f23252a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f23253b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f23254c) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "ApplyLivePermission(videoApplyPermission=" + this.f23252a + ", screenApplyPermission=" + this.f23253b + ", obsApplyPermission=" + this.f23254c + ")";
    }

    private /* synthetic */ a() {
        this(false, false, false);
    }

    public a(boolean z, boolean z2, boolean z3) {
        this.f23252a = z;
        this.f23253b = z2;
        this.f23254c = z3;
    }
}
