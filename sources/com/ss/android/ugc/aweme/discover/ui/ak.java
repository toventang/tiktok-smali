package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ak {
    @c(a = "duration")

    /* renamed from: a  reason: collision with root package name */
    public final long f82289a;

    static {
        Covode.recordClassIndex(51213);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ak) && this.f82289a == ((ak) obj).f82289a;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f82289a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "RequestInfo(duration=" + this.f82289a + ")";
    }

    public ak(long j2) {
        this.f82289a = j2;
    }
}
