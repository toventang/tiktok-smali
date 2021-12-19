package com.ss.android.ugc.aweme.mediachoose;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f109383a;

    /* renamed from: b  reason: collision with root package name */
    public final String f109384b;

    /* renamed from: c  reason: collision with root package name */
    public final long f109385c;

    /* renamed from: d  reason: collision with root package name */
    public final String f109386d;

    /* renamed from: e  reason: collision with root package name */
    public final int f109387e;

    /* renamed from: f  reason: collision with root package name */
    public final String f109388f;

    static {
        Covode.recordClassIndex(70065);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f109383a == fVar.f109383a && l.a(this.f109384b, fVar.f109384b) && this.f109385c == fVar.f109385c && l.a(this.f109386d, fVar.f109386d) && this.f109387e == fVar.f109387e && l.a(this.f109388f, fVar.f109388f);
    }

    public final int hashCode() {
        boolean z = this.f109383a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f109384b;
        int i6 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f109385c;
        int i7 = (((i5 + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f109386d;
        int hashCode2 = (((i7 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f109387e) * 31;
        String str3 = this.f109388f;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "VideoCheckInfo(success=" + this.f109383a + ", checkerType=" + this.f109384b + ", costTime=" + this.f109385c + ", fileSuffix=" + this.f109386d + ", errorCode=" + this.f109387e + ", errorMsg=" + this.f109388f + ")";
    }

    public f(boolean z, String str, long j2, String str2, int i2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f109383a = z;
        this.f109384b = str;
        this.f109385c = j2;
        this.f109386d = str2;
        this.f109387e = i2;
        this.f109388f = str3;
    }
}
