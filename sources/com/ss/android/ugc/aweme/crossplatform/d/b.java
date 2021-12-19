package com.ss.android.ugc.aweme.crossplatform.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class b {
    public boolean A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public String K;
    public String L;
    public long M;
    public boolean N;
    public boolean O;
    public String P;
    public String Q;
    public String R;
    public boolean S;

    /* renamed from: a  reason: collision with root package name */
    public long f78759a;

    /* renamed from: b  reason: collision with root package name */
    public String f78760b;

    /* renamed from: c  reason: collision with root package name */
    public int f78761c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78762d;

    /* renamed from: e  reason: collision with root package name */
    public String f78763e;

    /* renamed from: f  reason: collision with root package name */
    public String f78764f;

    /* renamed from: g  reason: collision with root package name */
    public String f78765g;

    /* renamed from: h  reason: collision with root package name */
    public String f78766h;

    /* renamed from: i  reason: collision with root package name */
    public String f78767i;

    /* renamed from: j  reason: collision with root package name */
    public String f78768j;

    /* renamed from: k  reason: collision with root package name */
    public String f78769k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f78770l;

    /* renamed from: m  reason: collision with root package name */
    public String f78771m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    static {
        Covode.recordClassIndex(48884);
    }

    public b(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f78759a == bVar.f78759a && l.a(this.f78760b, bVar.f78760b) && this.f78761c == bVar.f78761c && this.f78762d == bVar.f78762d && l.a(this.f78763e, bVar.f78763e) && l.a(this.f78764f, bVar.f78764f) && l.a(this.f78765g, bVar.f78765g) && l.a(this.f78766h, bVar.f78766h) && l.a(this.f78767i, bVar.f78767i) && l.a(this.f78768j, bVar.f78768j) && l.a(this.f78769k, bVar.f78769k) && this.f78770l == bVar.f78770l && l.a(this.f78771m, bVar.f78771m) && this.n == bVar.n && this.o == bVar.o && this.p == bVar.p && l.a(this.q, bVar.q) && l.a(this.r, bVar.r) && this.s == bVar.s && l.a(this.t, bVar.t) && l.a(this.u, bVar.u) && l.a(this.v, bVar.v) && this.w == bVar.w && this.x == bVar.x && this.y == bVar.y && this.z == bVar.z && this.A == bVar.A && this.B == bVar.B && l.a(this.C, bVar.C) && this.D == bVar.D && this.E == bVar.E && l.a(this.F, bVar.F) && l.a(this.G, bVar.G) && l.a(this.H, bVar.H) && this.I == bVar.I && this.J == bVar.J && l.a(this.K, bVar.K) && l.a(this.L, bVar.L) && this.M == bVar.M && this.N == bVar.N && this.O == bVar.O && l.a(this.P, bVar.P) && l.a(this.Q, bVar.Q) && l.a(this.R, bVar.R) && this.S == bVar.S;
    }

    public final String toString() {
        return "CommerceInfo(adId=" + this.f78759a + ", adType=" + this.f78760b + ", adSystemOrigin=" + this.f78761c + ", isFromAppAd=" + this.f78762d + ", downloadUrl=" + this.f78763e + ", downloadAppName=" + this.f78764f + ", downloadPkgName=" + this.f78765g + ", downloadAppExtra=" + this.f78766h + ", logExtra=" + this.f78767i + ", gdLabel=" + this.f78768j + ", gdExtJson=" + this.f78769k + ", disableDownloadDialog=" + this.f78770l + ", creativeId=" + this.f78771m + ", showDownloadStatusBar=" + this.n + ", forbidJump=" + this.o + ", canSendStat=" + this.p + ", adJsUrl=" + this.q + ", douPlusMonitorUrl=" + this.r + ", douPlusFullProcessMonitor=" + this.s + ", quickAppUrl=" + this.t + ", preloadChannel=" + this.u + ", preloadScene=" + this.v + ", preloadWeb=" + this.w + ", preloadWebNew=" + this.x + ", useWebUrl=" + this.y + ", forbidJsCalculate=" + this.z + ", interceptEPlatform=" + this.A + ", webType=" + this.B + ", quickShopEnterFrom=" + this.C + ", isFromCommentAppAd=" + this.D + ", enableWebReport=" + this.E + ", hasAdInfoJson=" + this.F + ", adInfoJson=" + this.G + ", commerceEnterFrom=" + this.H + ", openBrowserToDownloadApk=" + this.I + ", isEnableCardPreload=" + this.J + ", challengeId=" + this.K + ", stickerId=" + this.L + ", userClickTime=" + this.M + ", isHideWebButton=" + this.N + ", isFromLynxLandPage=" + this.O + ", secondPagePreloadChannelName=" + this.P + ", enterFrom=" + this.Q + ", landingPageInfo=" + this.R + ", enableGoogleLogin=" + this.S + ")";
    }

    private /* synthetic */ b() {
        this("");
    }

    public final JSONObject a() {
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f78759a);
            jSONObject.put("ad_type", this.f78761c);
            jSONObject.put("log_extra", this.f78767i);
            jSONObject.put("download_url", this.f78763e);
            jSONObject.put("package_name", this.f78765g);
            jSONObject.put("app_name", this.f78764f);
            if (this.f78759a == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject.put("code", i2);
        } catch (Throwable unused) {
        }
        return jSONObject;
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        long j2 = this.f78759a;
        int i24 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f78760b;
        int i25 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i26 = (((i24 + i2) * 31) + this.f78761c) * 31;
        boolean z2 = this.f78762d;
        int i27 = 1;
        if (z2) {
            z2 = true;
        }
        int i28 = z2 ? 1 : 0;
        int i29 = z2 ? 1 : 0;
        int i30 = z2 ? 1 : 0;
        int i31 = (i26 + i28) * 31;
        String str2 = this.f78763e;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i32 = (i31 + i3) * 31;
        String str3 = this.f78764f;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i33 = (i32 + i4) * 31;
        String str4 = this.f78765g;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i34 = (i33 + i5) * 31;
        String str5 = this.f78766h;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i35 = (i34 + i6) * 31;
        String str6 = this.f78767i;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i36 = (i35 + i7) * 31;
        String str7 = this.f78768j;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        int i37 = (i36 + i8) * 31;
        String str8 = this.f78769k;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        int i38 = (i37 + i9) * 31;
        boolean z3 = this.f78770l;
        if (z3) {
            z3 = true;
        }
        int i39 = z3 ? 1 : 0;
        int i40 = z3 ? 1 : 0;
        int i41 = z3 ? 1 : 0;
        int i42 = (i38 + i39) * 31;
        String str9 = this.f78771m;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        int i43 = (i42 + i10) * 31;
        boolean z4 = this.n;
        if (z4) {
            z4 = true;
        }
        int i44 = z4 ? 1 : 0;
        int i45 = z4 ? 1 : 0;
        int i46 = z4 ? 1 : 0;
        int i47 = (i43 + i44) * 31;
        boolean z5 = this.o;
        if (z5) {
            z5 = true;
        }
        int i48 = z5 ? 1 : 0;
        int i49 = z5 ? 1 : 0;
        int i50 = z5 ? 1 : 0;
        int i51 = (i47 + i48) * 31;
        boolean z6 = this.p;
        if (z6) {
            z6 = true;
        }
        int i52 = z6 ? 1 : 0;
        int i53 = z6 ? 1 : 0;
        int i54 = z6 ? 1 : 0;
        int i55 = (i51 + i52) * 31;
        String str10 = this.q;
        if (str10 != null) {
            i11 = str10.hashCode();
        } else {
            i11 = 0;
        }
        int i56 = (i55 + i11) * 31;
        String str11 = this.r;
        if (str11 != null) {
            i12 = str11.hashCode();
        } else {
            i12 = 0;
        }
        int i57 = (i56 + i12) * 31;
        boolean z7 = this.s;
        if (z7) {
            z7 = true;
        }
        int i58 = z7 ? 1 : 0;
        int i59 = z7 ? 1 : 0;
        int i60 = z7 ? 1 : 0;
        int i61 = (i57 + i58) * 31;
        String str12 = this.t;
        if (str12 != null) {
            i13 = str12.hashCode();
        } else {
            i13 = 0;
        }
        int i62 = (i61 + i13) * 31;
        String str13 = this.u;
        if (str13 != null) {
            i14 = str13.hashCode();
        } else {
            i14 = 0;
        }
        int i63 = (i62 + i14) * 31;
        String str14 = this.v;
        if (str14 != null) {
            i15 = str14.hashCode();
        } else {
            i15 = 0;
        }
        int i64 = (((((((i63 + i15) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31;
        boolean z8 = this.z;
        if (z8) {
            z8 = true;
        }
        int i65 = z8 ? 1 : 0;
        int i66 = z8 ? 1 : 0;
        int i67 = z8 ? 1 : 0;
        int i68 = (i64 + i65) * 31;
        boolean z9 = this.A;
        if (z9) {
            z9 = true;
        }
        int i69 = z9 ? 1 : 0;
        int i70 = z9 ? 1 : 0;
        int i71 = z9 ? 1 : 0;
        int i72 = (((i68 + i69) * 31) + this.B) * 31;
        String str15 = this.C;
        if (str15 != null) {
            i16 = str15.hashCode();
        } else {
            i16 = 0;
        }
        int i73 = (i72 + i16) * 31;
        boolean z10 = this.D;
        if (z10) {
            z10 = true;
        }
        int i74 = z10 ? 1 : 0;
        int i75 = z10 ? 1 : 0;
        int i76 = z10 ? 1 : 0;
        int i77 = (i73 + i74) * 31;
        boolean z11 = this.E;
        if (z11) {
            z11 = true;
        }
        int i78 = z11 ? 1 : 0;
        int i79 = z11 ? 1 : 0;
        int i80 = z11 ? 1 : 0;
        int i81 = (i77 + i78) * 31;
        String str16 = this.F;
        if (str16 != null) {
            i17 = str16.hashCode();
        } else {
            i17 = 0;
        }
        int i82 = (i81 + i17) * 31;
        String str17 = this.G;
        if (str17 != null) {
            i18 = str17.hashCode();
        } else {
            i18 = 0;
        }
        int i83 = (i82 + i18) * 31;
        String str18 = this.H;
        if (str18 != null) {
            i19 = str18.hashCode();
        } else {
            i19 = 0;
        }
        int i84 = (i83 + i19) * 31;
        boolean z12 = this.I;
        if (z12) {
            z12 = true;
        }
        int i85 = z12 ? 1 : 0;
        int i86 = z12 ? 1 : 0;
        int i87 = z12 ? 1 : 0;
        int i88 = (i84 + i85) * 31;
        boolean z13 = this.J;
        if (z13) {
            z13 = true;
        }
        int i89 = z13 ? 1 : 0;
        int i90 = z13 ? 1 : 0;
        int i91 = z13 ? 1 : 0;
        int i92 = (i88 + i89) * 31;
        String str19 = this.K;
        if (str19 != null) {
            i20 = str19.hashCode();
        } else {
            i20 = 0;
        }
        int i93 = (i92 + i20) * 31;
        String str20 = this.L;
        if (str20 != null) {
            i21 = str20.hashCode();
        } else {
            i21 = 0;
        }
        long j3 = this.M;
        int i94 = (((i93 + i21) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z14 = this.N;
        if (z14) {
            z14 = true;
        }
        int i95 = z14 ? 1 : 0;
        int i96 = z14 ? 1 : 0;
        int i97 = z14 ? 1 : 0;
        int i98 = (i94 + i95) * 31;
        boolean z15 = this.O;
        if (z15) {
            z15 = true;
        }
        int i99 = z15 ? 1 : 0;
        int i100 = z15 ? 1 : 0;
        int i101 = z15 ? 1 : 0;
        int i102 = (i98 + i99) * 31;
        String str21 = this.P;
        if (str21 != null) {
            i22 = str21.hashCode();
        } else {
            i22 = 0;
        }
        int i103 = (i102 + i22) * 31;
        String str22 = this.Q;
        if (str22 != null) {
            i23 = str22.hashCode();
        } else {
            i23 = 0;
        }
        int i104 = (i103 + i23) * 31;
        String str23 = this.R;
        if (str23 != null) {
            i25 = str23.hashCode();
        }
        int i105 = (i104 + i25) * 31;
        if (!this.S) {
            i27 = 0;
        }
        return i105 + i27;
    }

    private b(String str) {
        this.f78759a = 0;
        this.f78760b = str;
        this.f78761c = 0;
        this.f78762d = false;
        this.f78763e = null;
        this.f78764f = null;
        this.f78765g = null;
        this.f78766h = null;
        this.f78767i = null;
        this.f78768j = null;
        this.f78769k = null;
        this.f78770l = true;
        this.f78771m = null;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = null;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.J = true;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = false;
    }
}
