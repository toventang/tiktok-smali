package com.bytedance.ies.bullet.service.popup;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c {
    public static final a E = new a((byte) 0);
    public int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;

    /* renamed from: a  reason: collision with root package name */
    public final String f32939a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32940b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f32941c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32942d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f32943e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f32944f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32945g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32946h;

    /* renamed from: i  reason: collision with root package name */
    public final int f32947i;

    /* renamed from: j  reason: collision with root package name */
    public final String f32948j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f32949k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f32950l;

    /* renamed from: m  reason: collision with root package name */
    public final JSONObject f32951m;
    public final JSONObject n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public Bundle r;
    public final Integer s;
    public final Integer t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final boolean y;
    public final boolean z;

    static {
        Covode.recordClassIndex(19658);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f32939a, cVar.f32939a) && this.f32940b == cVar.f32940b && l.a(this.f32941c, cVar.f32941c) && this.f32942d == cVar.f32942d && l.a(this.f32943e, cVar.f32943e) && l.a(this.f32944f, cVar.f32944f) && this.f32945g == cVar.f32945g && this.f32946h == cVar.f32946h && this.f32947i == cVar.f32947i && l.a(this.f32948j, cVar.f32948j) && this.f32949k == cVar.f32949k && this.f32950l == cVar.f32950l && l.a(this.f32951m, cVar.f32951m) && l.a(this.n, cVar.n) && this.o == cVar.o && this.p == cVar.p && l.a(this.q, cVar.q) && l.a(this.r, cVar.r) && l.a(this.s, cVar.s) && l.a(this.t, cVar.t) && this.u == cVar.u && this.v == cVar.v && this.w == cVar.w && this.x == cVar.x && this.y == cVar.y && this.z == cVar.z && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C && this.D == cVar.D;
    }

    public final int hashCode() {
        String str = this.f32939a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f32940b) * 31;
        JSONObject jSONObject = this.f32941c;
        int hashCode2 = (((hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + this.f32942d) * 31;
        Uri uri = this.f32943e;
        int hashCode3 = (hashCode2 + (uri != null ? uri.hashCode() : 0)) * 31;
        Bundle bundle = this.f32944f;
        int hashCode4 = (((((((hashCode3 + (bundle != null ? bundle.hashCode() : 0)) * 31) + this.f32945g) * 31) + this.f32946h) * 31) + this.f32947i) * 31;
        String str2 = this.f32948j;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.f32949k;
        int i3 = 1;
        if (z2) {
            z2 = true;
        }
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (hashCode5 + i4) * 31;
        boolean z3 = this.f32950l;
        if (z3) {
            z3 = true;
        }
        int i8 = z3 ? 1 : 0;
        int i9 = z3 ? 1 : 0;
        int i10 = z3 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        JSONObject jSONObject2 = this.f32951m;
        int hashCode6 = (i11 + (jSONObject2 != null ? jSONObject2.hashCode() : 0)) * 31;
        JSONObject jSONObject3 = this.n;
        int hashCode7 = (hashCode6 + (jSONObject3 != null ? jSONObject3.hashCode() : 0)) * 31;
        boolean z4 = this.o;
        if (z4) {
            z4 = true;
        }
        int i12 = z4 ? 1 : 0;
        int i13 = z4 ? 1 : 0;
        int i14 = z4 ? 1 : 0;
        int i15 = (hashCode7 + i12) * 31;
        boolean z5 = this.p;
        if (z5) {
            z5 = true;
        }
        int i16 = z5 ? 1 : 0;
        int i17 = z5 ? 1 : 0;
        int i18 = z5 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        String str3 = this.q;
        int hashCode8 = (i19 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Bundle bundle2 = this.r;
        int hashCode9 = (hashCode8 + (bundle2 != null ? bundle2.hashCode() : 0)) * 31;
        Integer num = this.s;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.t;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i20 = (hashCode10 + i2) * 31;
        boolean z6 = this.u;
        if (z6) {
            z6 = true;
        }
        int i21 = z6 ? 1 : 0;
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = (i20 + i21) * 31;
        boolean z7 = this.v;
        if (z7) {
            z7 = true;
        }
        int i25 = z7 ? 1 : 0;
        int i26 = z7 ? 1 : 0;
        int i27 = z7 ? 1 : 0;
        int i28 = (i24 + i25) * 31;
        boolean z8 = this.w;
        if (z8) {
            z8 = true;
        }
        int i29 = z8 ? 1 : 0;
        int i30 = z8 ? 1 : 0;
        int i31 = z8 ? 1 : 0;
        int i32 = (((i28 + i29) * 31) + this.x) * 31;
        boolean z9 = this.y;
        if (z9) {
            z9 = true;
        }
        int i33 = z9 ? 1 : 0;
        int i34 = z9 ? 1 : 0;
        int i35 = z9 ? 1 : 0;
        int i36 = (i32 + i33) * 31;
        boolean z10 = this.z;
        if (z10) {
            z10 = true;
        }
        int i37 = z10 ? 1 : 0;
        int i38 = z10 ? 1 : 0;
        int i39 = z10 ? 1 : 0;
        int i40 = (((i36 + i37) * 31) + this.A) * 31;
        boolean z11 = this.B;
        if (z11) {
            z11 = true;
        }
        int i41 = z11 ? 1 : 0;
        int i42 = z11 ? 1 : 0;
        int i43 = z11 ? 1 : 0;
        int i44 = (i40 + i41) * 31;
        boolean z12 = this.C;
        if (z12) {
            z12 = true;
        }
        int i45 = z12 ? 1 : 0;
        int i46 = z12 ? 1 : 0;
        int i47 = z12 ? 1 : 0;
        int i48 = (i44 + i45) * 31;
        if (!this.D) {
            i3 = 0;
        }
        return i48 + i3;
    }

    public final String toString() {
        return "BulletPopUpConfig(sessionId=" + this.f32939a + ", mode=" + this.f32940b + ", extras=" + this.f32941c + ", triggerOrigin=" + this.f32942d + ", schema=" + this.f32943e + ", bundle=" + this.f32944f + ", width=" + this.f32945g + ", height=" + this.f32946h + ", touchLimit=" + this.f32947i + ", maskColor=" + this.f32948j + ", closeByMask=" + this.f32949k + ", closeByGesture=" + this.f32950l + ", keyboardStyle=" + this.f32951m + ", style=" + this.n + ", blockBackPress=" + this.o + ", listenKeyboard=" + this.p + ", lastContainerID=" + this.q + ", extraBundle=" + this.r + ", screenWidth=" + this.s + ", screenHeight=" + this.t + ", ensureShowOnForeground=" + this.u + ", showLoading=" + this.v + ", showError=" + this.w + ", radius=" + this.x + ", closeByMaskUntilLoaded=" + this.y + ", allowClosed=" + this.z + ", dragMaxHeight=" + this.A + ", dragByGesture=" + this.B + ", dragFollowGesture=" + this.C + ", dragBack=" + this.D + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19659);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c(String str, int i2, JSONObject jSONObject, int i3, Uri uri, Bundle bundle, int i4, int i5, int i6, String str2, boolean z2, boolean z3, JSONObject jSONObject2, JSONObject jSONObject3, boolean z4, boolean z5, String str3, Integer num, Integer num2, boolean z6, boolean z7, boolean z8, int i7, boolean z9, boolean z10, int i8, boolean z11, boolean z12, boolean z13) {
        l.c(str, "");
        l.c(jSONObject, "");
        l.c(uri, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f32939a = str;
        this.f32940b = i2;
        this.f32941c = jSONObject;
        this.f32942d = i3;
        this.f32943e = uri;
        this.f32944f = bundle;
        this.f32945g = i4;
        this.f32946h = i5;
        this.f32947i = i6;
        this.f32948j = str2;
        this.f32949k = z2;
        this.f32950l = z3;
        this.f32951m = jSONObject2;
        this.n = jSONObject3;
        this.o = z4;
        this.p = z5;
        this.q = str3;
        this.r = null;
        this.s = num;
        this.t = num2;
        this.u = z6;
        this.v = z7;
        this.w = z8;
        this.x = i7;
        this.y = z9;
        this.z = z10;
        this.A = i8;
        this.B = z11;
        this.C = z12;
        this.D = z13;
    }

    public /* synthetic */ c(String str, int i2, JSONObject jSONObject, int i3, Uri uri, Bundle bundle, int i4, int i5, int i6, String str2, boolean z2, boolean z3, JSONObject jSONObject2, JSONObject jSONObject3, boolean z4, boolean z5, String str3, Integer num, Integer num2, boolean z6, boolean z7, boolean z8, int i7, boolean z9, boolean z10, int i8, boolean z11, boolean z12, boolean z13, byte b2) {
        this(str, i2, jSONObject, i3, uri, bundle, i4, i5, i6, str2, z2, z3, jSONObject2, jSONObject3, z4, z5, str3, num, num2, z6, z7, z8, i7, z9, z10, i8, z11, z12, z13);
    }
}
