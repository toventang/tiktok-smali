package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f118606a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<float[]> f118607b;

    static {
        Covode.recordClassIndex(77025);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f118606a == aVar.f118606a && l.a(this.f118607b, aVar.f118607b);
    }

    public final int hashCode() {
        boolean z = this.f118606a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        h.f.a.a<float[]> aVar = this.f118607b;
        return i5 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorVieConfig(needAnimate=" + this.f118606a + ", getAnchorPosition=" + this.f118607b + ")";
    }

    public a(boolean z, h.f.a.a<float[]> aVar) {
        l.d(aVar, "");
        this.f118606a = z;
        this.f118607b = aVar;
    }
}
