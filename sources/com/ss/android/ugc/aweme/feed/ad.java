package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public final int f91486a;

    /* renamed from: b  reason: collision with root package name */
    public final int f91487b;

    static {
        Covode.recordClassIndex(57564);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f91486a == adVar.f91486a && this.f91487b == adVar.f91487b;
    }

    public final int hashCode() {
        return (this.f91486a * 31) + this.f91487b;
    }

    public final String toString() {
        return "NumberResult(video=" + this.f91486a + ", image=" + this.f91487b + ")";
    }

    public ad(int i2, int i3) {
        this.f91486a = i2;
        this.f91487b = i3;
    }
}
