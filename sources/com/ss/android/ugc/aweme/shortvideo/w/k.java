package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a */
    public final long f132748a;

    /* renamed from: b */
    public final long f132749b;

    /* renamed from: c */
    public final String f132750c;

    static {
        Covode.recordClassIndex(86870);
    }

    private static k a(long j2, long j3, String str) {
        l.d(str, "");
        return new k(j2, j3, str);
    }

    public static /* synthetic */ k a(k kVar, long j2, long j3, String str, int i2) {
        if ((i2 & 1) != 0) {
            j2 = kVar.f132748a;
        }
        if ((i2 & 2) != 0) {
            j3 = kVar.f132749b;
        }
        if ((i2 & 4) != 0) {
            str = kVar.f132750c;
        }
        return a(j2, j3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f132748a == kVar.f132748a && this.f132749b == kVar.f132749b && l.a(this.f132750c, kVar.f132750c);
    }

    public final int hashCode() {
        long j2 = this.f132748a;
        long j3 = this.f132749b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f132750c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RecordLog(concatFinishTime=" + this.f132748a + ", enterEditTime=" + this.f132749b + ", goNextReason=" + this.f132750c + ")";
    }

    public /* synthetic */ k() {
        this(0, 0, "");
    }

    private k(long j2, long j3, String str) {
        l.d(str, "");
        this.f132748a = j2;
        this.f132749b = j3;
        this.f132750c = str;
    }
}
