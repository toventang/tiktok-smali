package com.ss.android.ugc.aweme.sticker.panel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f135213a;

    /* renamed from: b  reason: collision with root package name */
    public int f135214b;

    /* renamed from: c  reason: collision with root package name */
    public e f135215c;

    /* renamed from: d  reason: collision with root package name */
    public int f135216d;

    /* renamed from: e  reason: collision with root package name */
    public int f135217e;

    /* renamed from: f  reason: collision with root package name */
    public int f135218f;

    /* renamed from: g  reason: collision with root package name */
    public int f135219g;

    /* renamed from: h  reason: collision with root package name */
    public int f135220h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f135221i;

    /* renamed from: j  reason: collision with root package name */
    public long f135222j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f135223k;

    /* renamed from: l  reason: collision with root package name */
    public g f135224l;

    /* renamed from: m  reason: collision with root package name */
    public h f135225m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    static {
        Covode.recordClassIndex(88384);
    }

    public j() {
        this(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f135213a == jVar.f135213a && this.f135214b == jVar.f135214b && l.a(this.f135215c, jVar.f135215c) && this.f135216d == jVar.f135216d && this.f135217e == jVar.f135217e && this.f135218f == jVar.f135218f && this.f135219g == jVar.f135219g && this.f135220h == jVar.f135220h && this.f135221i == jVar.f135221i && this.f135222j == jVar.f135222j && this.f135223k == jVar.f135223k && l.a(this.f135224l, jVar.f135224l) && l.a(this.f135225m, jVar.f135225m) && this.n == jVar.n && this.o == jVar.o && this.p == jVar.p && this.q == jVar.q;
    }

    public final int hashCode() {
        int i2 = ((this.f135213a * 31) + this.f135214b) * 31;
        e eVar = this.f135215c;
        int i3 = 0;
        int hashCode = (((((((((((i2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f135216d) * 31) + this.f135217e) * 31) + this.f135218f) * 31) + this.f135219g) * 31) + this.f135220h) * 31;
        boolean z = this.f135221i;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        long j2 = this.f135222j;
        int i8 = (((hashCode + i5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z2 = this.f135223k;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        g gVar = this.f135224l;
        int hashCode2 = (i12 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        h hVar = this.f135225m;
        if (hVar != null) {
            i3 = hVar.hashCode();
        }
        int i13 = (hashCode2 + i3) * 31;
        boolean z3 = this.n;
        if (z3) {
            z3 = true;
        }
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = z3 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z4 = this.o;
        if (z4) {
            z4 = true;
        }
        int i18 = z4 ? 1 : 0;
        int i19 = z4 ? 1 : 0;
        int i20 = z4 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z5 = this.p;
        if (z5) {
            z5 = true;
        }
        int i22 = z5 ? 1 : 0;
        int i23 = z5 ? 1 : 0;
        int i24 = z5 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        if (!this.q) {
            i4 = 0;
        }
        return i25 + i4;
    }

    public final String toString() {
        return "StickerViewConfigure(tabBackgroundDrawableRes=" + this.f135213a + ", panelBackgroundDrawableRes=" + this.f135214b + ", reverseCameraConfigure=" + this.f135215c + ", tagLayoutTopMargin=" + this.f135216d + ", stickerViewHeight=" + this.f135217e + ", favoriteTintColor=" + this.f135218f + ", searchEffectType=" + this.f135219g + ", searchTypeTT=" + this.f135220h + ", isLockStickerEnable=" + this.f135221i + ", stickerTransitionStartDuration=" + this.f135222j + ", isTabModeRelatedToTabCount=" + this.f135223k + ", stickerContentViewConfig=" + this.f135224l + ", stickerListViewConfigure=" + this.f135225m + ", enableText=" + this.n + ", isTextMarquee=" + this.o + ", enableStyleRecommend=" + this.p + ", propSearchOptimized=" + this.q + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, int i3, e eVar, int i4, int i5, int i6, boolean z, long j2, boolean z2, g gVar, h hVar, boolean z3, boolean z4, boolean z5, int i7) {
        this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) != 0 ? null : eVar, 0, 0, (i7 & 32) != 0 ? -1 : i4, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6, (i7 & 256) != 0 ? false : z, (i7 & 512) != 0 ? 490 : j2, (i7 & 1024) != 0 ? true : z2, (i7 & 2048) != 0 ? new g() : gVar, (i7 & 4096) != 0 ? new h(0, 0, null, false, false, false, 4095) : hVar, false, (i7 & 16384) != 0 ? false : z4, (i7 & 32768) != 0 ? true : z5, false);
    }

    public j(int i2, int i3, e eVar, int i4, int i5, int i6, int i7, int i8, boolean z, long j2, boolean z2, g gVar, h hVar, boolean z3, boolean z4, boolean z5, boolean z6) {
        l.d(gVar, "");
        l.d(hVar, "");
        this.f135213a = i2;
        this.f135214b = i3;
        this.f135215c = eVar;
        this.f135216d = i4;
        this.f135217e = i5;
        this.f135218f = i6;
        this.f135219g = i7;
        this.f135220h = i8;
        this.f135221i = z;
        this.f135222j = j2;
        this.f135223k = z2;
        this.f135224l = gVar;
        this.f135225m = hVar;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }
}
