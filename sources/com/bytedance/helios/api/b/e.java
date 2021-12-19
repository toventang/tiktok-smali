package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30656a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30657b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30658c;

    static {
        Covode.recordClassIndex(17808);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f30656a == eVar.f30656a && this.f30657b == eVar.f30657b && this.f30658c == eVar.f30658c;
    }

    public final int hashCode() {
        boolean z = this.f30656a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f30657b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f30658c) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "DefaultSampleRateModel(monitorNormal=" + this.f30656a + ", monitorError=" + this.f30657b + ", interceptError=" + this.f30658c + ")";
    }

    public e(boolean z, boolean z2, boolean z3) {
        this.f30656a = z;
        this.f30657b = z2;
        this.f30658c = z3;
    }
}
