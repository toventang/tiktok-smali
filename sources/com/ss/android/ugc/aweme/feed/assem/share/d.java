package com.ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a */
    public final boolean f92445a;

    /* renamed from: b */
    public final Float f92446b;

    /* renamed from: c */
    public final boolean f92447c;

    static {
        Covode.recordClassIndex(58523);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f92445a == dVar.f92445a && l.a(this.f92446b, dVar.f92446b) && this.f92447c == dVar.f92447c;
    }

    public final int hashCode() {
        boolean z = this.f92445a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        Float f2 = this.f92446b;
        int hashCode = (i6 + (f2 != null ? f2.hashCode() : 0)) * 31;
        if (!this.f92447c) {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShareContainerState(visible=" + this.f92445a + ", alpha=" + this.f92446b + ", enabled=" + this.f92447c + ")";
    }

    public /* synthetic */ d() {
        this(true, null, true);
    }

    public static /* synthetic */ d a(d dVar, Float f2) {
        return new d(dVar.f92445a, f2, dVar.f92447c);
    }

    public d(boolean z, Float f2, boolean z2) {
        this.f92445a = z;
        this.f92446b = f2;
        this.f92447c = z2;
    }
}
