package com.ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.p;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f135201a;

    /* renamed from: b  reason: collision with root package name */
    public int f135202b;

    /* renamed from: c  reason: collision with root package name */
    public b<? super ViewGroup, ? extends View> f135203c;

    /* renamed from: d  reason: collision with root package name */
    public b<? super ViewGroup, ? extends View> f135204d;

    /* renamed from: e  reason: collision with root package name */
    public b<? super ViewGroup, ? extends View> f135205e;

    /* renamed from: f  reason: collision with root package name */
    public b<? super ViewGroup, ? extends p<? extends View, ? extends View>> f135206f;

    /* renamed from: g  reason: collision with root package name */
    public k f135207g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f135208h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f135209i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f135210j;

    /* renamed from: k  reason: collision with root package name */
    public b<? super ViewGroup, ? extends View> f135211k;

    /* renamed from: l  reason: collision with root package name */
    public b<? super ViewGroup, ? extends View> f135212l;

    static {
        Covode.recordClassIndex(88382);
    }

    public h() {
        this(0, 0, null, false, false, false, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f135201a == hVar.f135201a && this.f135202b == hVar.f135202b && l.a(this.f135203c, hVar.f135203c) && l.a(this.f135204d, hVar.f135204d) && l.a(this.f135205e, hVar.f135205e) && l.a(this.f135206f, hVar.f135206f) && l.a(this.f135207g, hVar.f135207g) && this.f135208h == hVar.f135208h && this.f135209i == hVar.f135209i && this.f135210j == hVar.f135210j && l.a(this.f135211k, hVar.f135211k) && l.a(this.f135212l, hVar.f135212l);
    }

    public final int hashCode() {
        int i2 = ((this.f135201a * 31) + this.f135202b) * 31;
        b<? super ViewGroup, ? extends View> bVar = this.f135203c;
        int i3 = 0;
        int hashCode = (i2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b<? super ViewGroup, ? extends View> bVar2 = this.f135204d;
        int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b<? super ViewGroup, ? extends View> bVar3 = this.f135205e;
        int hashCode3 = (hashCode2 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        b<? super ViewGroup, ? extends p<? extends View, ? extends View>> bVar4 = this.f135206f;
        int hashCode4 = (hashCode3 + (bVar4 != null ? bVar4.hashCode() : 0)) * 31;
        k kVar = this.f135207g;
        int hashCode5 = (hashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        boolean z = this.f135208h;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (hashCode5 + i5) * 31;
        boolean z2 = this.f135209i;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        if (!this.f135210j) {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        b<? super ViewGroup, ? extends View> bVar5 = this.f135211k;
        int hashCode6 = (i13 + (bVar5 != null ? bVar5.hashCode() : 0)) * 31;
        b<? super ViewGroup, ? extends View> bVar6 = this.f135212l;
        if (bVar6 != null) {
            i3 = bVar6.hashCode();
        }
        return hashCode6 + i3;
    }

    public final String toString() {
        return "StickerListViewConfigure(spanCount=" + this.f135201a + ", viewCacheSize=" + this.f135202b + ", loadingView=" + this.f135203c + ", emptyView=" + this.f135204d + ", favoriteEmptyView=" + this.f135205e + ", errorRetryView=" + this.f135206f + ", stickerViewHolderConfigure=" + this.f135207g + ", lazyRenderStickerData=" + this.f135208h + ", lazyLoadViewPager=" + this.f135209i + ", stopImageLoadWhenScroll=" + this.f135210j + ", headerViewProvider=" + this.f135211k + ", footerViewProvider=" + this.f135212l + ")";
    }

    private h(int i2, int i3, k kVar, boolean z, boolean z2, boolean z3) {
        l.d(kVar, "");
        this.f135201a = i2;
        this.f135202b = i3;
        this.f135203c = null;
        this.f135204d = null;
        this.f135205e = null;
        this.f135206f = null;
        this.f135207g = kVar;
        this.f135208h = z;
        this.f135209i = z2;
        this.f135210j = z3;
        this.f135211k = null;
        this.f135212l = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i2, int i3, k kVar, boolean z, boolean z2, boolean z3, int i4) {
        this((i4 & 1) != 0 ? 5 : i2, (i4 & 2) == 0 ? i3 : 5, (i4 & 64) != 0 ? new k((byte) 0) : kVar, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3);
    }
}
