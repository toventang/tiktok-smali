package com.ss.android.ugc.aweme.profile.a;

import com.bytedance.covode.number.Covode;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f115865a;

    /* renamed from: b  reason: collision with root package name */
    public final int f115866b;

    /* renamed from: c  reason: collision with root package name */
    public final int f115867c;

    /* renamed from: d  reason: collision with root package name */
    public final int f115868d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f115869e;

    static {
        Covode.recordClassIndex(74736);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f115865a == mVar.f115865a && this.f115866b == mVar.f115866b && this.f115867c == mVar.f115867c && this.f115868d == mVar.f115868d && this.f115869e == mVar.f115869e;
    }

    public final int hashCode() {
        int i2 = ((((((this.f115865a * 31) + this.f115866b) * 31) + this.f115867c) * 31) + this.f115868d) * 31;
        boolean z = this.f115869e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "GuideCardData(icon=" + this.f115865a + ", title=" + this.f115866b + ", doc=" + this.f115867c + ", button=" + this.f115868d + ", buttonState=" + this.f115869e + ")";
    }

    public m(int i2, int i3, int i4, int i5, boolean z) {
        this.f115865a = i2;
        this.f115866b = i3;
        this.f115867c = i4;
        this.f115868d = i5;
        this.f115869e = z;
    }
}
