package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class d {
    @c(a = "level")

    /* renamed from: a  reason: collision with root package name */
    public long f19049a;

    static {
        Covode.recordClassIndex(11375);
    }

    public int hashCode() {
        long j2 = this.f19049a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f19049a == ((d) obj).f19049a) {
            return true;
        }
        return false;
    }
}
