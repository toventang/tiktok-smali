package com.bytedance.tux.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f44693a;

    /* renamed from: b  reason: collision with root package name */
    public final c<?> f44694b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f44695c;

    static {
        Covode.recordClassIndex(27323);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f44693a == iVar.f44693a && l.a(this.f44694b, iVar.f44694b) && this.f44695c == iVar.f44695c;
    }

    public final int hashCode() {
        int i2 = this.f44693a * 31;
        c<?> cVar = this.f44694b;
        int hashCode = (i2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z = this.f44695c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return hashCode + i3;
    }

    public final String toString() {
        return "TuxStateValueContainer(variant=" + this.f44693a + ", iconClass=" + this.f44694b + ", rtl=" + this.f44695c + ")";
    }

    public i(int i2, c<?> cVar, boolean z) {
        this.f44693a = i2;
        this.f44694b = cVar;
        this.f44695c = z;
    }
}
