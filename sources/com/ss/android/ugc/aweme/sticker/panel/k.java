package com.ss.android.ugc.aweme.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f135226a;

    /* renamed from: b  reason: collision with root package name */
    public int f135227b;

    /* renamed from: c  reason: collision with root package name */
    public float f135228c;

    /* renamed from: d  reason: collision with root package name */
    public int f135229d;

    /* renamed from: e  reason: collision with root package name */
    public float f135230e;

    /* renamed from: f  reason: collision with root package name */
    public float f135231f;

    /* renamed from: g  reason: collision with root package name */
    public float f135232g;

    /* renamed from: h  reason: collision with root package name */
    public float f135233h;

    /* renamed from: i  reason: collision with root package name */
    public float f135234i;

    /* renamed from: j  reason: collision with root package name */
    public float f135235j;

    /* renamed from: k  reason: collision with root package name */
    public int f135236k;

    /* renamed from: l  reason: collision with root package name */
    public int f135237l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f135238m;
    public b<? super a.C4052a, z> n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;

    static {
        Covode.recordClassIndex(88385);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f135226a == kVar.f135226a && this.f135227b == kVar.f135227b && Float.compare(this.f135228c, kVar.f135228c) == 0 && this.f135229d == kVar.f135229d && Float.compare(this.f135230e, kVar.f135230e) == 0 && Float.compare(this.f135231f, kVar.f135231f) == 0 && Float.compare(this.f135232g, kVar.f135232g) == 0 && Float.compare(this.f135233h, kVar.f135233h) == 0 && Float.compare(this.f135234i, kVar.f135234i) == 0 && Float.compare(this.f135235j, kVar.f135235j) == 0 && this.f135236k == kVar.f135236k && this.f135237l == kVar.f135237l && this.f135238m == kVar.f135238m && l.a(this.n, kVar.n) && this.o == kVar.o && this.p == kVar.p && this.q == kVar.q && this.r == kVar.r && this.s == kVar.s && this.t == kVar.t;
    }

    public final int hashCode() {
        boolean z = this.f135226a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int floatToIntBits = ((((((((((((((((((((((i3 * 31) + this.f135227b) * 31) + Float.floatToIntBits(this.f135228c)) * 31) + this.f135229d) * 31) + Float.floatToIntBits(this.f135230e)) * 31) + Float.floatToIntBits(this.f135231f)) * 31) + Float.floatToIntBits(this.f135232g)) * 31) + Float.floatToIntBits(this.f135233h)) * 31) + Float.floatToIntBits(this.f135234i)) * 31) + Float.floatToIntBits(this.f135235j)) * 31) + this.f135236k) * 31) + this.f135237l) * 31;
        boolean z2 = this.f135238m;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (floatToIntBits + i6) * 31;
        b<? super a.C4052a, z> bVar = this.n;
        int hashCode = (i9 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z3 = this.o;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (hashCode + i10) * 31;
        boolean z4 = this.p;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (((((i13 + i14) * 31) + this.q) * 31) + this.r) * 31;
        boolean z5 = this.s;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        if (!this.t) {
            i2 = 0;
        }
        return i21 + i2;
    }

    public final String toString() {
        return "StickerViewHolderConfigure(isCircle=" + this.f135226a + ", borderColorRes=" + this.f135227b + ", roundRadius=" + this.f135228c + ", borderWidth=" + this.f135229d + ", imageWidth=" + this.f135230e + ", imageHeight=" + this.f135231f + ", stickerViewWidth=" + this.f135232g + ", stickerViewHeight=" + this.f135233h + ", containerWidth=" + this.f135234i + ", containerHeight=" + this.f135235j + ", downloadIconRes=" + this.f135236k + ", loadingIconRes=" + this.f135237l + ", enableItemScale=" + this.f135238m + ", stickerViewBuilder=" + this.n + ", enableText=" + this.o + ", isTextMarquee=" + this.p + ", textMarinTop=" + this.q + ", textMarinBottom=" + this.r + ", enableDotView=" + this.s + ", enableDynamicIcon=" + this.t + ")";
    }

    private k() {
        this.f135226a = false;
        this.f135227b = R.color.pw;
        this.f135228c = 8.0f;
        this.f135229d = 2;
        this.f135230e = 54.0f;
        this.f135231f = 54.0f;
        this.f135232g = -2.0f;
        this.f135233h = -2.0f;
        this.f135234i = -1.0f;
        this.f135235j = -2.0f;
        this.f135236k = R.drawable.bn1;
        this.f135237l = R.drawable.bn2;
        this.f135238m = true;
        this.n = null;
        this.o = false;
        this.p = false;
        this.q = 4;
        this.r = 0;
        this.s = true;
        this.t = false;
    }

    public /* synthetic */ k(byte b2) {
        this();
    }
}
