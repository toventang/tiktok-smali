package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f81949a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f81950b;

    /* renamed from: c  reason: collision with root package name */
    public final String f81951c;

    /* renamed from: d  reason: collision with root package name */
    public final long f81952d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f81953e;

    /* renamed from: f  reason: collision with root package name */
    public final String f81954f;

    /* renamed from: g  reason: collision with root package name */
    public final String f81955g;

    /* renamed from: h  reason: collision with root package name */
    public final long f81956h;

    static {
        Covode.recordClassIndex(50865);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f81949a, rVar.f81949a) && l.a(this.f81950b, rVar.f81950b) && l.a(this.f81951c, rVar.f81951c) && this.f81952d == rVar.f81952d && this.f81953e == rVar.f81953e && l.a(this.f81954f, rVar.f81954f) && l.a(this.f81955g, rVar.f81955g) && this.f81956h == rVar.f81956h;
    }

    public final String toString() {
        return "SearchVideoParams(event=" + this.f81949a + ", aweme=" + this.f81950b + ", enterFrom=" + this.f81951c + ", duration=" + this.f81952d + ", fromSearchResult=" + this.f81953e + ", previousPage=" + this.f81954f + ", previousPagePosition=" + this.f81955g + ", rank=" + this.f81956h + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f81949a;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        Aweme aweme = this.f81950b;
        if (aweme != null) {
            i3 = aweme.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.f81951c;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        long j2 = this.f81952d;
        int i9 = (((i8 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f81953e;
        if (z) {
            z = true;
        }
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        String str3 = this.f81954f;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        String str4 = this.f81955g;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        long j3 = this.f81956h;
        return ((i14 + i6) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public /* synthetic */ r(String str, Aweme aweme, String str2, boolean z, String str3, long j2) {
        this(str, aweme, str2, -1, z, str3, "", j2);
    }

    public r(String str, Aweme aweme, String str2, long j2, boolean z, String str3, String str4, long j3) {
        l.d(str, "");
        l.d(str2, "");
        this.f81949a = str;
        this.f81950b = aweme;
        this.f81951c = str2;
        this.f81952d = j2;
        this.f81953e = z;
        this.f81954f = str3;
        this.f81955g = str4;
        this.f81956h = j3;
    }
}
