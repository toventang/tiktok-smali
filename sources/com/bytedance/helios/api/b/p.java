package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30693a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30694b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30695c;

    /* renamed from: d  reason: collision with root package name */
    public final e f30696d;

    static {
        Covode.recordClassIndex(17823);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f30693a == pVar.f30693a && this.f30694b == pVar.f30694b && this.f30695c == pVar.f30695c && l.a(this.f30696d, pVar.f30696d);
    }

    public final int hashCode() {
        boolean z = this.f30693a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f30694b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f30695c) {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        e eVar = this.f30696d;
        return i11 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "SampleRateModel(appOpsConfig=" + this.f30693a + ", autoStartConfig=" + this.f30694b + ", exceptionConfig=" + this.f30695c + ", defaultLowPriorityConfig=" + this.f30696d + ")";
    }

    public p(boolean z, boolean z2, boolean z3, e eVar) {
        l.c(eVar, "");
        this.f30693a = z;
        this.f30694b = z2;
        this.f30695c = z3;
        this.f30696d = eVar;
    }
}
