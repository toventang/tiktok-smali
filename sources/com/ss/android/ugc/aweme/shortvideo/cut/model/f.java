package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f125507a;

    /* renamed from: b  reason: collision with root package name */
    public int f125508b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f125509c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final int f125510d;

    /* renamed from: e  reason: collision with root package name */
    public final int f125511e;

    /* renamed from: f  reason: collision with root package name */
    public final int f125512f;

    static {
        Covode.recordClassIndex(82365);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f125510d == fVar.f125510d && this.f125511e == fVar.f125511e && this.f125512f == fVar.f125512f;
    }

    public final int hashCode() {
        return (((this.f125510d * 31) + this.f125511e) * 31) + this.f125512f;
    }

    public final String toString() {
        return "SwapStateWrapper(state=" + this.f125510d + ", from=" + this.f125511e + ", to=" + this.f125512f + ")";
    }

    public f(int i2, int i3, int i4) {
        this.f125510d = i2;
        this.f125511e = i3;
        this.f125512f = i4;
    }
}
