package com.ss.android.ugc.aweme.filter.repository.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final f f95539a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f95540b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f95541c;

    static {
        Covode.recordClassIndex(60546);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f95539a, bVar.f95539a) && this.f95540b == bVar.f95540b && this.f95541c == bVar.f95541c;
    }

    public final int hashCode() {
        f fVar = this.f95539a;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        boolean z = this.f95540b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f95541c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "FilterBoxMeta(filterMeta=" + this.f95539a + ", checked=" + this.f95540b + ", builtin=" + this.f95541c + ")";
    }

    public b(f fVar, boolean z, boolean z2) {
        l.d(fVar, "");
        this.f95539a = fVar;
        this.f95540b = z;
        this.f95541c = z2;
    }
}
