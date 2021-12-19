package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f30670a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30671b;

    static {
        Covode.recordClassIndex(17818);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f30670a, mVar.f30670a) && this.f30671b == mVar.f30671b;
    }

    public final int hashCode() {
        String str = this.f30670a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f30671b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PerfEvent(methodName=" + this.f30670a + ", methodTimeCost=" + this.f30671b + ")";
    }

    private /* synthetic */ m() {
        this("", 0);
    }

    public m(String str, long j2) {
        l.c(str, "");
        this.f30670a = str;
        this.f30671b = j2;
    }
}
