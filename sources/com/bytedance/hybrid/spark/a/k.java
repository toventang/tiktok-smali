package com.bytedance.hybrid.spark.a;

import com.bytedance.covode.number.Covode;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f31056a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31057b;

    static {
        Covode.recordClassIndex(18046);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f31056a == kVar.f31056a && this.f31057b == kVar.f31057b;
    }

    public final int hashCode() {
        return (this.f31056a * 31) + this.f31057b;
    }

    public final String toString() {
        return "PageAnimation(enterAnim=" + this.f31056a + ", exitAnim=" + this.f31057b + ")";
    }
}
