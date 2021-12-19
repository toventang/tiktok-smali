package com.ss.android.ugc.aweme.miniapp.a;

import com.bytedance.covode.number.Covode;

public final class c {
    @com.google.gson.a.c(a = "lifetime_finished_count")

    /* renamed from: a  reason: collision with root package name */
    public final int f109636a;
    @com.google.gson.a.c(a = "last_finished_time")

    /* renamed from: b  reason: collision with root package name */
    public final long f109637b;

    static {
        Covode.recordClassIndex(70161);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f109636a == cVar.f109636a && this.f109637b == cVar.f109637b;
    }

    public final int hashCode() {
        long j2 = this.f109637b;
        return (this.f109636a * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "RessoPlayRecord(lifetimeFinishedCount=" + this.f109636a + ", lastFinishedTime=" + this.f109637b + ")";
    }

    public c(int i2, long j2) {
        this.f109636a = i2;
        this.f109637b = j2;
    }
}
