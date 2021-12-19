package com.ss.android.ttve.common;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f61074a = 720;

    /* renamed from: b  reason: collision with root package name */
    public int f61075b = 1280;

    static {
        Covode.recordClassIndex(37611);
    }

    public f() {
    }

    public final int hashCode() {
        return (this.f61074a * 65537) + 1 + this.f61075b;
    }

    public final String toString() {
        return this.f61074a + "x" + this.f61075b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f61074a == fVar.f61074a && this.f61075b == fVar.f61075b) {
            return true;
        }
        return false;
    }

    public f(int i2, int i3) {
        this.f61074a = i2;
        this.f61075b = i3;
    }
}
