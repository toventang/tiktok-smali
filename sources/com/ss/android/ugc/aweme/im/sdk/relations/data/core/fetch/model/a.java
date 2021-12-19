package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "max_time")

    /* renamed from: a  reason: collision with root package name */
    public final long f103133a;
    @c(a = "min_time")

    /* renamed from: b  reason: collision with root package name */
    public final long f103134b;

    static {
        Covode.recordClassIndex(66132);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f103133a == aVar.f103133a && this.f103134b == aVar.f103134b;
    }

    public final String toString() {
        return "RelationFetchMissingPage(toFetchMaxTime=" + this.f103133a + ", toFetchMinTime=" + this.f103134b + ")";
    }

    public final int hashCode() {
        long j2 = this.f103133a;
        long j3 = this.f103134b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public a(long j2, long j3) {
        this.f103133a = j2;
        this.f103134b = j3;
    }
}
