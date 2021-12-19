package com.ss.android.ugc.aweme.effect.c;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f88917a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f88918b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f88919c;

    static {
        Covode.recordClassIndex(55924);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f88917a == bVar.f88917a && this.f88918b == bVar.f88918b && this.f88919c == bVar.f88919c;
    }

    public final int hashCode() {
        int i2 = this.f88917a * 31;
        boolean z = this.f88918b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f88919c) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "MotionConfig(messageCount=" + this.f88917a + ", isNeedregisted=" + this.f88918b + ", isShowed=" + this.f88919c + ")";
    }

    private /* synthetic */ b() {
        this(false);
    }

    public b(boolean z) {
        this.f88917a = 0;
        this.f88918b = z;
        this.f88919c = false;
    }
}
