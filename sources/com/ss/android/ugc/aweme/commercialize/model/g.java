package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f74888a;

    /* renamed from: b  reason: collision with root package name */
    public int f74889b;

    /* renamed from: c  reason: collision with root package name */
    public int f74890c;

    static {
        Covode.recordClassIndex(46171);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f74888a == gVar.f74888a && this.f74889b == gVar.f74889b && this.f74890c == gVar.f74890c;
    }

    public final int hashCode() {
        return (((this.f74888a * 31) + this.f74889b) * 31) + this.f74890c;
    }

    public final String toString() {
        return "AdHalfWebPageRealSecondsParams(originalSeconds=" + this.f74888a + ", realSeconds=" + this.f74889b + ", isAdjusted=" + this.f74890c + ")";
    }

    public g(int i2, int i3, int i4) {
        this.f74888a = i2;
        this.f74889b = i3;
        this.f74890c = i4;
    }
}
