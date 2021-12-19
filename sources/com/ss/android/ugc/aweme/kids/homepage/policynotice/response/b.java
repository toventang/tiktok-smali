package com.ss.android.ugc.aweme.kids.homepage.policynotice.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "text")

    /* renamed from: a  reason: collision with root package name */
    public final String f106622a;
    @c(a = "is_bold")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f106623b;
    @c(a = "link_type")

    /* renamed from: c  reason: collision with root package name */
    public final String f106624c;
    @c(a = "link")

    /* renamed from: d  reason: collision with root package name */
    public final String f106625d;
    @c(a = "extra")

    /* renamed from: e  reason: collision with root package name */
    public final String f106626e;
    @c(a = "approve")

    /* renamed from: f  reason: collision with root package name */
    public final boolean f106627f;
    @c(a = "operation")

    /* renamed from: g  reason: collision with root package name */
    public final Integer f106628g;
    @c(a = "next_pop_up")

    /* renamed from: h  reason: collision with root package name */
    public final String f106629h;
    @c(a = "dismiss")

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f106630i;
    @c(a = "dismiss_all")

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f106631j;
    @c(a = "re_get_settings")

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f106632k;

    static {
        Covode.recordClassIndex(68131);
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f106622a, bVar.f106622a) && this.f106623b == bVar.f106623b && l.a(this.f106624c, bVar.f106624c) && l.a(this.f106625d, bVar.f106625d) && l.a(this.f106626e, bVar.f106626e) && this.f106627f == bVar.f106627f && l.a(this.f106628g, bVar.f106628g) && l.a(this.f106629h, bVar.f106629h) && l.a(this.f106630i, bVar.f106630i) && l.a(this.f106631j, bVar.f106631j) && l.a(this.f106632k, bVar.f106632k);
    }

    public final int hashCode() {
        String str = this.f106622a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f106623b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        String str2 = this.f106624c;
        int hashCode2 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f106625d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f106626e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        if (!this.f106627f) {
            i3 = 0;
        }
        int i8 = (hashCode4 + i3) * 31;
        Integer num = this.f106628g;
        int hashCode5 = (i8 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f106629h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f106630i;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f106631j;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f106632k;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "PolicyNoticeAction(text=" + this.f106622a + ", isBold=" + this.f106623b + ", linkType=" + this.f106624c + ", link=" + this.f106625d + ", extra=" + this.f106626e + ", approve=" + this.f106627f + ", operation=" + this.f106628g + ", nextPopUp=" + this.f106629h + ", dismiss=" + this.f106630i + ", dismissAll=" + this.f106631j + ", reGetSettings=" + this.f106632k + ")";
    }

    private b(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f106622a = str;
        this.f106623b = false;
        this.f106624c = str2;
        this.f106625d = str3;
        this.f106626e = str4;
        this.f106627f = false;
        this.f106628g = num;
        this.f106629h = str5;
        this.f106630i = bool;
        this.f106631j = bool2;
        this.f106632k = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, int r22) {
        /*
            r12 = this;
            r2 = r22
            r11 = r21
            r10 = r20
            r9 = r19
            r7 = r17
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0 = r2 & 1
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0016
            r3 = r8
        L_0x0016:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x001b
            r4 = r8
        L_0x001b:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0020
            r5 = r8
        L_0x0020:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0025
            r6 = r8
        L_0x0025:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x002a
            r7 = 0
        L_0x002a:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004c
        L_0x002e:
            r0 = r2 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
        L_0x0037:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x003f
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
        L_0x003f:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0047
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
        L_0x0047:
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x004c:
            r8 = r18
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
