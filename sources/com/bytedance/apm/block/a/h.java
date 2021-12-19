package com.bytedance.apm.block.a;

import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f24622a;

    /* renamed from: b  reason: collision with root package name */
    public int f24623b;

    /* renamed from: c  reason: collision with root package name */
    public long f24624c;

    /* renamed from: d  reason: collision with root package name */
    public int f24625d;

    /* renamed from: e  reason: collision with root package name */
    public int f24626e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f24627f;

    static {
        Covode.recordClassIndex(14486);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return this.f24625d + "," + this.f24622a + "," + this.f24626e + "," + this.f24623b + "," + this.f24624c;
    }

    public final void a(long j2) {
        this.f24626e++;
        this.f24623b = (int) (((long) this.f24623b) + j2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar.f24622a == this.f24622a && hVar.f24625d == this.f24625d) {
            return true;
        }
        return false;
    }

    public h(int i2, int i3, long j2, int i4) {
        this.f24622a = i2;
        this.f24623b = i3;
        this.f24625d = i4;
        this.f24624c = j2;
    }
}
