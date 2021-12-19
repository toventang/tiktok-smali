package com.ss.android.ugc.aweme.ad.preload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f66138a;

    /* renamed from: b  reason: collision with root package name */
    public final long f66139b;

    static {
        Covode.recordClassIndex(40656);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f66138a, gVar.f66138a) && this.f66139b == gVar.f66139b;
    }

    public final int hashCode() {
        String str = this.f66138a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f66139b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PreloadAdWebStateMsg(channel=" + this.f66138a + ", clickTime=" + this.f66139b + ")";
    }

    public g(String str, long j2) {
        this.f66138a = str;
        this.f66139b = j2;
    }
}
