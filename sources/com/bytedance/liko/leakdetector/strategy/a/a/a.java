package com.bytedance.liko.leakdetector.strategy.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "event_type")

    /* renamed from: a  reason: collision with root package name */
    public final String f40117a;
    @c(a = "timestamp")

    /* renamed from: b  reason: collision with root package name */
    public final long f40118b;

    static {
        Covode.recordClassIndex(24728);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!l.a((Object) this.f40117a, (Object) aVar.f40117a) || this.f40118b != aVar.f40118b) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f40117a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f40118b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "DataBean(eventType=" + this.f40117a + ", timestamp=" + this.f40118b + ")";
    }

    public a(String str, long j2) {
        l.c(str, "");
        this.f40117a = str;
        this.f40118b = j2;
    }
}
