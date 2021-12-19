package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final m f32003a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32004b = false;

    static {
        Covode.recordClassIndex(18727);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f32003a, dVar.f32003a) && this.f32004b == dVar.f32004b;
    }

    public final int hashCode() {
        m mVar = this.f32003a;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        boolean z = this.f32004b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "BridgeMergeOperation(otherRegistry=" + this.f32003a + ", useOthersOnConflict=" + this.f32004b + ")";
    }

    public d(m mVar) {
        l.c(mVar, "");
        this.f32003a = mVar;
    }
}
