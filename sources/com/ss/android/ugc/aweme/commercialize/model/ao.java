package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public final int f74868a;

    /* renamed from: b  reason: collision with root package name */
    public final int f74869b;

    static {
        Covode.recordClassIndex(46162);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.f74868a == aoVar.f74868a && this.f74869b == aoVar.f74869b;
    }

    public final int hashCode() {
        return (this.f74868a * 31) + this.f74869b;
    }

    public final String toString() {
        return "Size(width=" + this.f74868a + ", height=" + this.f74869b + ")";
    }

    public ao(int i2, int i3) {
        this.f74868a = i2;
        this.f74869b = i3;
    }
}
