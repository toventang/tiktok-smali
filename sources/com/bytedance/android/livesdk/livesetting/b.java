package com.bytedance.android.livesdk.livesetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "cpu_load_rate")

    /* renamed from: a  reason: collision with root package name */
    public final long f18702a;
    @c(a = "cpu_cycle")

    /* renamed from: b  reason: collision with root package name */
    public final long f18703b;
    @c(a = "is_anchor")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18704c;

    static {
        Covode.recordClassIndex(10498);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18702a == bVar.f18702a && this.f18703b == bVar.f18703b && this.f18704c == bVar.f18704c;
    }

    public final String toString() {
        return "NegativeTestSettings(cpuLoadRate=" + this.f18702a + ", cpuCycle=" + this.f18703b + ", isAnchor=" + this.f18704c + ")";
    }

    private b() {
        this.f18702a = 0;
        this.f18703b = 0;
        this.f18704c = false;
    }

    public final int hashCode() {
        long j2 = this.f18702a;
        long j3 = this.f18703b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z = this.f18704c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
