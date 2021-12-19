package com.ss.android.ugc.tiktok.deeplink;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f148973a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f148974b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f148975c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f148976d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f148977e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f148978f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f148979g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f148980h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f148981i;

    static {
        Covode.recordClassIndex(98107);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f148973a == bVar.f148973a && this.f148974b == bVar.f148974b && this.f148975c == bVar.f148975c && this.f148976d == bVar.f148976d && this.f148977e == bVar.f148977e && this.f148978f == bVar.f148978f && this.f148979g == bVar.f148979g && this.f148980h == bVar.f148980h && this.f148981i == bVar.f148981i;
    }

    public final int hashCode() {
        boolean z = this.f148973a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f148974b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f148975c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f148976d;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.f148977e;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z6 = this.f148978f;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z7 = this.f148979g;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z8 = this.f148980h;
        if (z8) {
            z8 = true;
        }
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        if (!this.f148981i) {
            i2 = 0;
        }
        return i34 + i2;
    }

    public final String toString() {
        return "Output(isPublicJump=" + this.f148973a + ", isSecurity=" + this.f148974b + ", isAllowJump=" + this.f148975c + ", isDefaultConfig=" + this.f148976d + ", isNotIncludeParam=" + this.f148977e + ", isContainExcludeParam=" + this.f148978f + ", isParamValueInvalid=" + this.f148979g + ", isEnableInterceptor=" + this.f148980h + ", isDeepLinkAllow=" + this.f148981i + ")";
    }

    private b() {
        this.f148973a = false;
        this.f148974b = false;
        this.f148975c = false;
        this.f148976d = true;
        this.f148977e = false;
        this.f148978f = false;
        this.f148979g = false;
        this.f148980h = false;
        this.f148981i = true;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
