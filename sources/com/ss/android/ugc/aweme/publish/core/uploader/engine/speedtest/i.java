package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f118708a;

    /* renamed from: b  reason: collision with root package name */
    public final String f118709b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f118710c;

    /* renamed from: d  reason: collision with root package name */
    public final long f118711d;

    /* renamed from: e  reason: collision with root package name */
    public final long f118712e;

    static {
        Covode.recordClassIndex(77123);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f118708a == iVar.f118708a && l.a(this.f118709b, iVar.f118709b) && this.f118710c == iVar.f118710c && this.f118711d == iVar.f118711d && this.f118712e == iVar.f118712e;
    }

    public final String toString() {
        return "Result(probeSpeed=" + this.f118708a + ", uploadContext=" + this.f118709b + ", isComplete=" + this.f118710c + ", probeStartTime=" + this.f118711d + ", probeEndTime=" + this.f118712e + ")";
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f118708a;
        int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f118709b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (i3 + i2) * 31;
        boolean z = this.f118710c;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        long j3 = this.f118711d;
        long j4 = this.f118712e;
        return ((((i4 + i5) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public i(long j2, String str, boolean z, long j3, long j4) {
        l.d(str, "");
        this.f118708a = j2;
        this.f118709b = str;
        this.f118710c = z;
        this.f118711d = j3;
        this.f118712e = j4;
    }
}
