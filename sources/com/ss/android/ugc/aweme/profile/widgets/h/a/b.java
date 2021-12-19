package com.ss.android.ugc.aweme.profile.widgets.h.a;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f117881a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f117882b;

    /* renamed from: c  reason: collision with root package name */
    public final String f117883c;

    /* renamed from: d  reason: collision with root package name */
    public final String f117884d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f117885e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.profile.widgets.follow.b f117886f;

    /* renamed from: g  reason: collision with root package name */
    public final int f117887g;

    /* renamed from: h  reason: collision with root package name */
    public final String f117888h;

    static {
        Covode.recordClassIndex(76388);
    }

    public b() {
        this(null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f117881a, bVar.f117881a) && this.f117882b == bVar.f117882b && l.a(this.f117883c, bVar.f117883c) && l.a(this.f117884d, bVar.f117884d) && this.f117885e == bVar.f117885e && l.a(this.f117886f, bVar.f117886f) && this.f117887g == bVar.f117887g && l.a(this.f117888h, bVar.f117888h);
    }

    public final int hashCode() {
        String str = this.f117881a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f117882b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        String str2 = this.f117883c;
        int hashCode2 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f117884d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        if (!this.f117885e) {
            i3 = 0;
        }
        int i8 = (hashCode3 + i3) * 31;
        com.ss.android.ugc.aweme.profile.widgets.follow.b bVar = this.f117886f;
        int hashCode4 = (((i8 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f117887g) * 31;
        String str4 = this.f117888h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "UserProfileInitData(from=" + this.f117881a + ", isFromFeed=" + this.f117882b + ", enterFrom=" + this.f117883c + ", profileFrom=" + this.f117884d + ", fromMutual=" + this.f117885e + ", followLogEvenParams=" + this.f117886f + ", generalSearchCardType=" + this.f117887g + ", eventKeys=" + this.f117888h + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r3 = r11
            r1 = r10
            r0 = r14 & 1
            r4 = 0
            if (r0 == 0) goto L_0x0008
            r1 = r4
        L_0x0008:
            r0 = r14 & 4
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x000f
            r3 = r8
        L_0x000f:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0022
        L_0x0013:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0020
        L_0x0017:
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0020:
            r8 = r13
            goto L_0x0017
        L_0x0022:
            r4 = r12
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.h.a.b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public b(String str, boolean z, String str2, String str3, boolean z2, com.ss.android.ugc.aweme.profile.widgets.follow.b bVar, int i2, String str4) {
        l.d(str4, "");
        this.f117881a = str;
        this.f117882b = z;
        this.f117883c = str2;
        this.f117884d = str3;
        this.f117885e = z2;
        this.f117886f = bVar;
        this.f117887g = i2;
        this.f117888h = str4;
    }
}
