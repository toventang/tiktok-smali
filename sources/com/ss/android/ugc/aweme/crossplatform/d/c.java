package com.ss.android.ugc.aweme.crossplatform.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f78772a;

    /* renamed from: b  reason: collision with root package name */
    public String f78773b;

    /* renamed from: c  reason: collision with root package name */
    public String f78774c;

    /* renamed from: d  reason: collision with root package name */
    public String f78775d;

    /* renamed from: e  reason: collision with root package name */
    public String f78776e;

    /* renamed from: f  reason: collision with root package name */
    public long f78777f;

    /* renamed from: g  reason: collision with root package name */
    public String f78778g;

    static {
        Covode.recordClassIndex(48885);
    }

    public c(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f78772a, cVar.f78772a) && l.a(this.f78773b, cVar.f78773b) && l.a(this.f78774c, cVar.f78774c) && l.a(this.f78775d, cVar.f78775d) && l.a(this.f78776e, cVar.f78776e) && this.f78777f == cVar.f78777f && l.a(this.f78778g, cVar.f78778g);
    }

    public final String toString() {
        return "CommerceInfoFromAweme(creativeId=" + this.f78772a + ", adId=" + this.f78773b + ", itemId=" + this.f78774c + ", advId=" + this.f78775d + ", desc=" + this.f78776e + ", viewTime=" + this.f78777f + ", coverUrl=" + this.f78778g + ")";
    }

    private c() {
        this.f78772a = null;
        this.f78773b = null;
        this.f78774c = null;
        this.f78775d = null;
        this.f78776e = null;
        this.f78777f = 0;
        this.f78778g = null;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f78772a;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        String str2 = this.f78773b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.f78774c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str4 = this.f78775d;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str5 = this.f78776e;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        long j2 = this.f78777f;
        int i12 = (((i11 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str6 = this.f78778g;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        return i12 + i7;
    }

    private /* synthetic */ c(byte b2) {
        this();
    }
}
