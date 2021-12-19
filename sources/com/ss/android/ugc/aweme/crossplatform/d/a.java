package com.ss.android.ugc.aweme.crossplatform.d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Integer f78728a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f78729b;

    /* renamed from: c  reason: collision with root package name */
    public String f78730c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78731d;

    /* renamed from: e  reason: collision with root package name */
    public String f78732e;

    /* renamed from: f  reason: collision with root package name */
    public String f78733f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f78734g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f78735h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f78736i;

    /* renamed from: j  reason: collision with root package name */
    public String f78737j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f78738k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f78739l;

    /* renamed from: m  reason: collision with root package name */
    public String f78740m;
    public boolean n;
    public String o;
    public int p;

    static {
        Covode.recordClassIndex(48873);
    }

    public a(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f78728a, aVar.f78728a) && l.a(this.f78729b, aVar.f78729b) && l.a(this.f78730c, aVar.f78730c) && this.f78731d == aVar.f78731d && l.a(this.f78732e, aVar.f78732e) && l.a(this.f78733f, aVar.f78733f) && this.f78734g == aVar.f78734g && this.f78735h == aVar.f78735h && this.f78736i == aVar.f78736i && l.a(this.f78737j, aVar.f78737j) && this.f78738k == aVar.f78738k && this.f78739l == aVar.f78739l && l.a(this.f78740m, aVar.f78740m) && this.n == aVar.n && l.a(this.o, aVar.o) && this.p == aVar.p;
    }

    public final int hashCode() {
        Integer num = this.f78728a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Bundle bundle = this.f78729b;
        int hashCode2 = (hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str = this.f78730c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f78731d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode3 + i4) * 31;
        String str2 = this.f78732e;
        int hashCode4 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f78733f;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.f78734g;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode5 + i8) * 31;
        boolean z3 = this.f78735h;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f78736i;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        String str4 = this.f78737j;
        int hashCode6 = (i19 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z5 = this.f78738k;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (hashCode6 + i20) * 31;
        boolean z6 = this.f78739l;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        String str5 = this.f78740m;
        int hashCode7 = (i27 + (str5 != null ? str5.hashCode() : 0)) * 31;
        if (!this.n) {
            i3 = 0;
        }
        int i28 = (hashCode7 + i3) * 31;
        String str6 = this.o;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return ((i28 + i2) * 31) + this.p;
    }

    public final String toString() {
        return "BaseInfo(platform=" + this.f78728a + ", rawBundle=" + this.f78729b + ", url=" + this.f78730c + ", safeTemplate=" + this.f78731d + ", groupId=" + this.f78732e + ", enterFrom=" + this.f78733f + ", autoPlayAudio=" + this.f78734g + ", forbidJump=" + this.f78735h + ", fromNotification=" + this.f78736i + ", awemeId=" + this.f78737j + ", controlRequestUrl=" + this.f78738k + ", noHardware=" + this.f78739l + ", ownerId=" + this.f78740m + ", hideSystemVideoPoster=" + this.n + ", reportType=" + this.o + ", pageDepthOfReportShow=" + this.p + ")";
    }

    private /* synthetic */ a() {
        this("");
    }

    public final void a(String str) {
        l.d(str, "");
        this.f78740m = str;
    }

    private a(String str) {
        l.d(str, "");
        this.f78728a = null;
        this.f78729b = null;
        this.f78730c = null;
        this.f78731d = false;
        this.f78732e = null;
        this.f78733f = null;
        this.f78734g = false;
        this.f78735h = false;
        this.f78736i = false;
        this.f78737j = null;
        this.f78738k = false;
        this.f78739l = false;
        this.f78740m = str;
        this.n = false;
        this.o = null;
        this.p = 0;
    }
}
