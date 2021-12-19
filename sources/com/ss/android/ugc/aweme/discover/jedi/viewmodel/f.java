package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.g.b;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f81387a;

    /* renamed from: b  reason: collision with root package name */
    public final int f81388b;

    /* renamed from: c  reason: collision with root package name */
    public final String f81389c;

    /* renamed from: d  reason: collision with root package name */
    public final String f81390d;

    /* renamed from: e  reason: collision with root package name */
    public final int f81391e;

    /* renamed from: f  reason: collision with root package name */
    public final int f81392f;

    /* renamed from: g  reason: collision with root package name */
    public String f81393g;

    /* renamed from: h  reason: collision with root package name */
    public String f81394h;

    /* renamed from: i  reason: collision with root package name */
    public final long f81395i;

    /* renamed from: j  reason: collision with root package name */
    public final int f81396j;

    /* renamed from: k  reason: collision with root package name */
    public final String f81397k;

    /* renamed from: l  reason: collision with root package name */
    public final b f81398l;

    /* renamed from: m  reason: collision with root package name */
    public final String f81399m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final d r;
    public final String s;
    public String t;

    static {
        Covode.recordClassIndex(50586);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f81387a, fVar.f81387a) && this.f81388b == fVar.f81388b && l.a(this.f81389c, fVar.f81389c) && l.a(this.f81390d, fVar.f81390d) && this.f81391e == fVar.f81391e && this.f81392f == fVar.f81392f && l.a(this.f81393g, fVar.f81393g) && l.a(this.f81394h, fVar.f81394h) && this.f81395i == fVar.f81395i && this.f81396j == fVar.f81396j && l.a(this.f81397k, fVar.f81397k) && l.a(this.f81398l, fVar.f81398l) && l.a(this.f81399m, fVar.f81399m) && l.a(this.n, fVar.n) && l.a(this.o, fVar.o) && l.a(this.p, fVar.p) && this.q == fVar.q && l.a(this.r, fVar.r) && l.a(this.s, fVar.s) && l.a(this.t, fVar.t);
    }

    public final String toString() {
        return "SearchRequestParam(keyword=" + this.f81387a + ", refreshType=" + this.f81388b + ", searchSource=" + this.f81389c + ", source=" + this.f81390d + ", hotSearch=" + this.f81391e + ", correctType=" + this.f81392f + ", searchId=" + this.f81393g + ", lastSearchId=" + this.f81394h + ", cursor=" + this.f81395i + ", count=" + this.f81396j + ", enterFrom=" + this.f81397k + ", filterOption=" + this.f81398l + ", channel=" + this.f81399m + ", showResultsSource=" + this.n + ", sugUserId=" + this.o + ", isRichSug=" + this.p + ", isAuthorSearch=" + this.q + ", searchParam=" + this.r + ", roomIdList=" + this.s + ", searchContext=" + this.t + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = this.f81387a;
        int i15 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = ((i2 * 31) + this.f81388b) * 31;
        String str2 = this.f81389c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str3 = this.f81390d;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (((((i17 + i4) * 31) + this.f81391e) * 31) + this.f81392f) * 31;
        String str4 = this.f81393g;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        String str5 = this.f81394h;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        long j2 = this.f81395i;
        int i20 = (((((i19 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f81396j) * 31;
        String str6 = this.f81397k;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        b bVar = this.f81398l;
        if (bVar != null) {
            i8 = bVar.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        String str7 = this.f81399m;
        if (str7 != null) {
            i9 = str7.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        String str8 = this.n;
        if (str8 != null) {
            i10 = str8.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        String str9 = this.o;
        if (str9 != null) {
            i11 = str9.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        String str10 = this.p;
        if (str10 != null) {
            i12 = str10.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (((i25 + i12) * 31) + this.q) * 31;
        d dVar = this.r;
        if (dVar != null) {
            i13 = dVar.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 31;
        String str11 = this.s;
        if (str11 != null) {
            i14 = str11.hashCode();
        } else {
            i14 = 0;
        }
        int i28 = (i27 + i14) * 31;
        String str12 = this.t;
        if (str12 != null) {
            i15 = str12.hashCode();
        }
        return i28 + i15;
    }

    private f(String str, int i2, String str2, String str3, int i3, int i4, String str4, String str5, long j2, int i5, String str6, b bVar, String str7, String str8, String str9, String str10, int i6, String str11, String str12) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str6, "");
        this.f81387a = str;
        this.f81388b = i2;
        this.f81389c = str2;
        this.f81390d = str3;
        this.f81391e = i3;
        this.f81392f = i4;
        this.f81393g = str4;
        this.f81394h = str5;
        this.f81395i = j2;
        this.f81396j = i5;
        this.f81397k = str6;
        this.f81398l = bVar;
        this.f81399m = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = i6;
        this.r = null;
        this.s = str11;
        this.t = str12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, int r27, int r28, java.lang.String r29, java.lang.String r30, long r31, int r33, java.lang.String r34, com.ss.android.ugc.aweme.search.g.b r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, java.lang.String r42, int r43) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.jedi.viewmodel.f.<init>(java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, long, int, java.lang.String, com.ss.android.ugc.aweme.search.g.b, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int):void");
    }
}
