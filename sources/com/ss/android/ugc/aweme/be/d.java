package com.ss.android.ugc.aweme.be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.bytedance.tux.table.cell.b;
import h.f.b.l;

public final class d extends i {

    /* renamed from: c  reason: collision with root package name */
    public final View.OnClickListener f68562c;

    /* renamed from: d  reason: collision with root package name */
    public final View f68563d;

    /* renamed from: e  reason: collision with root package name */
    public final View f68564e;

    /* renamed from: f  reason: collision with root package name */
    public final String f68565f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f68566g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f68567h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f68568i;

    /* renamed from: j  reason: collision with root package name */
    public final int f68569j;

    /* renamed from: k  reason: collision with root package name */
    private final String f68570k;

    /* renamed from: l  reason: collision with root package name */
    private final a f68571l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f68572m;
    private final boolean n;
    private final b o;
    private final boolean p;
    private final String q;
    private final boolean r;
    private final View.OnClickListener s;

    static {
        Covode.recordClassIndex(42212);
    }

    public d(String str, a aVar, View.OnClickListener onClickListener, Object obj) {
        this(str, aVar, onClickListener, obj, false, null, null, false, null, false, null, false, null, 131056);
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean a() {
        return this.p;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean b() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final Object c() {
        return this.f68572m;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String d() {
        return this.f68570k;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final b e() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final a f() {
        return this.f68571l;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String g() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean h() {
        return this.r;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean i() {
        return this.f68567h;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final View.OnClickListener j() {
        return this.s;
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
        String str = this.f68570k;
        int i11 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = i2 * 31;
        a aVar = this.f68571l;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        View.OnClickListener onClickListener = this.f68562c;
        if (onClickListener != null) {
            i4 = onClickListener.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        Object obj = this.f68572m;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        boolean z = this.n;
        int i16 = 1;
        if (z) {
            z = true;
        }
        int i17 = z ? 1 : 0;
        int i18 = z ? 1 : 0;
        int i19 = z ? 1 : 0;
        int i20 = (i15 + i17) * 31;
        View view = this.f68563d;
        if (view != null) {
            i6 = view.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 31;
        View view2 = this.f68564e;
        if (view2 != null) {
            i7 = view2.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 31;
        String str2 = this.f68565f;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        boolean z2 = this.f68566g;
        if (z2) {
            z2 = true;
        }
        int i24 = z2 ? 1 : 0;
        int i25 = z2 ? 1 : 0;
        int i26 = z2 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        b bVar = this.o;
        if (bVar != null) {
            i9 = bVar.hashCode();
        } else {
            i9 = 0;
        }
        int i28 = (i27 + i9) * 31;
        boolean z3 = this.p;
        if (z3) {
            z3 = true;
        }
        int i29 = z3 ? 1 : 0;
        int i30 = z3 ? 1 : 0;
        int i31 = z3 ? 1 : 0;
        int i32 = (i28 + i29) * 31;
        String str3 = this.q;
        if (str3 != null) {
            i10 = str3.hashCode();
        } else {
            i10 = 0;
        }
        int i33 = (i32 + i10) * 31;
        boolean z4 = this.r;
        if (z4) {
            z4 = true;
        }
        int i34 = z4 ? 1 : 0;
        int i35 = z4 ? 1 : 0;
        int i36 = z4 ? 1 : 0;
        int i37 = (i33 + i34) * 31;
        boolean z5 = this.f68567h;
        if (z5) {
            z5 = true;
        }
        int i38 = z5 ? 1 : 0;
        int i39 = z5 ? 1 : 0;
        int i40 = z5 ? 1 : 0;
        int i41 = (i37 + i38) * 31;
        View.OnClickListener onClickListener2 = this.s;
        if (onClickListener2 != null) {
            i11 = onClickListener2.hashCode();
        }
        int i42 = (i41 + i11) * 31;
        if (!this.f68568i) {
            i16 = 0;
        }
        return ((i42 + i16) * 31) + this.f68569j;
    }

    public final String toString() {
        return "DisclosureItem(title=" + this.f68570k + ", icon=" + this.f68571l + ", onClickListener=" + this.f68562c + ", tag=" + this.f68572m + ", visibility=" + this.n + ", customView=" + this.f68563d + ", loadingView=" + this.f68564e + ", label=" + this.f68565f + ", showArrow=" + this.f68566g + ", cellVariant=" + this.o + ", divider=" + this.p + ", subTitle=" + this.q + ", enable=" + this.r + ", loading=" + this.f68567h + ", disableClickListener=" + this.s + ", setIvIconVisibility=" + this.f68568i + ", ivIconVisibility=" + this.f68569j + ")";
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, a aVar, View.OnClickListener onClickListener, Object obj, boolean z, View view, View view2, boolean z2, b bVar, boolean z3, String str2, boolean z4, View.OnClickListener onClickListener2, int i2) {
        this(str, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : onClickListener, (i2 & 8) != 0 ? null : obj, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? null : view, (i2 & 64) != 0 ? null : view2, null, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? b.NORMAL : bVar, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? null : str2, (i2 & 4096) != 0 ? true : z4, false, (i2 & 16384) == 0 ? onClickListener2 : null, false, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(String str, a aVar, View.OnClickListener onClickListener, Object obj, boolean z, View view, View view2, String str2, boolean z2, b bVar, boolean z3, String str3, boolean z4, boolean z5, View.OnClickListener onClickListener2, boolean z6, int i2) {
        super(str, bVar, aVar, z, z3, str3, z4, z5, onClickListener, onClickListener2, 1024);
        l.d(str, "");
        l.d(bVar, "");
        this.f68570k = str;
        this.f68571l = aVar;
        this.f68562c = onClickListener;
        this.f68572m = obj;
        this.n = z;
        this.f68563d = view;
        this.f68564e = view2;
        this.f68565f = str2;
        this.f68566g = z2;
        this.o = bVar;
        this.p = z3;
        this.q = str3;
        this.r = z4;
        this.f68567h = z5;
        this.s = onClickListener2;
        this.f68568i = z6;
        this.f68569j = i2;
    }

    public static /* synthetic */ d a(d dVar, String str, a aVar, View.OnClickListener onClickListener, Object obj, boolean z, View view, View view2, String str2, boolean z2, b bVar, boolean z3, String str3, boolean z4, boolean z5, View.OnClickListener onClickListener2, boolean z6, int i2, int i3) {
        int i4 = i2;
        boolean z7 = z5;
        boolean z8 = z4;
        String str4 = str3;
        boolean z9 = z3;
        View.OnClickListener onClickListener3 = onClickListener2;
        Object obj2 = obj;
        View.OnClickListener onClickListener4 = onClickListener;
        a aVar2 = aVar;
        String str5 = str;
        boolean z10 = z;
        boolean z11 = z6;
        View view3 = view;
        View view4 = view2;
        String str6 = str2;
        boolean z12 = z2;
        b bVar2 = bVar;
        if ((i3 & 1) != 0) {
            str5 = dVar.f68570k;
        }
        if ((i3 & 2) != 0) {
            aVar2 = dVar.f68571l;
        }
        if ((i3 & 4) != 0) {
            onClickListener4 = dVar.f68562c;
        }
        if ((i3 & 8) != 0) {
            obj2 = dVar.f68572m;
        }
        if ((i3 & 16) != 0) {
            z10 = dVar.n;
        }
        if ((i3 & 32) != 0) {
            view3 = dVar.f68563d;
        }
        if ((i3 & 64) != 0) {
            view4 = dVar.f68564e;
        }
        if ((i3 & 128) != 0) {
            str6 = dVar.f68565f;
        }
        if ((i3 & 256) != 0) {
            z12 = dVar.f68566g;
        }
        if ((i3 & 512) != 0) {
            bVar2 = dVar.o;
        }
        if ((i3 & 1024) != 0) {
            z9 = dVar.p;
        }
        if ((i3 & 2048) != 0) {
            str4 = dVar.q;
        }
        if ((i3 & 4096) != 0) {
            z8 = dVar.r;
        }
        if ((i3 & 8192) != 0) {
            z7 = dVar.f68567h;
        }
        if ((i3 & 16384) != 0) {
            onClickListener3 = dVar.s;
        }
        if ((32768 & i3) != 0) {
            z11 = dVar.f68568i;
        }
        if ((i3 & 65536) != 0) {
            i4 = dVar.f68569j;
        }
        l.d(str5, "");
        l.d(bVar2, "");
        return new d(str5, aVar2, onClickListener4, obj2, z10, view3, view4, str6, z12, bVar2, z9, str4, z8, z7, onClickListener3, z11, i4);
    }
}
