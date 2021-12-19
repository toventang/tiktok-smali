package com.ss.android.ugc.aweme.setting.ui.b;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.be.a {

    /* renamed from: c  reason: collision with root package name */
    public final int f122833c;

    /* renamed from: d  reason: collision with root package name */
    public final String f122834d;

    /* renamed from: e  reason: collision with root package name */
    public final View.OnClickListener f122835e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f122836f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f122837g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f122838h;

    /* renamed from: i  reason: collision with root package name */
    public final int f122839i;

    /* renamed from: j  reason: collision with root package name */
    public final String f122840j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f122841k;

    /* renamed from: l  reason: collision with root package name */
    public final int f122842l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f122843m;
    public final int n;
    public final boolean o;
    public final int p;
    public final Drawable q;
    public final boolean r;
    public final String s;
    public final CommonItemView.a t;
    public final boolean u;
    private final boolean v;

    static {
        Covode.recordClassIndex(80642);
    }

    public a(int i2, String str, View.OnClickListener onClickListener, Object obj) {
        this(i2, str, onClickListener, obj, false, 0, 1048544);
    }

    public a(int i2, String str, View.OnClickListener onClickListener, Object obj, byte b2) {
        this(i2, str, onClickListener, obj, false, 0, 1048560);
    }

    public a(String str, View.OnClickListener onClickListener) {
        this(2131233706, str, onClickListener, null, false, 0, 1048568);
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean a() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean b() {
        return this.f122837g;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final Object c() {
        return this.f122836f;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f122833c * 31;
        String str = this.f122834d;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i9 + i2) * 31;
        View.OnClickListener onClickListener = this.f122835e;
        if (onClickListener != null) {
            i3 = onClickListener.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        Object obj = this.f122836f;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        boolean z = this.f122837g;
        int i14 = 1;
        if (z) {
            z = true;
        }
        int i15 = z ? 1 : 0;
        int i16 = z ? 1 : 0;
        int i17 = z ? 1 : 0;
        int i18 = (i13 + i15) * 31;
        boolean z2 = this.f122838h;
        if (z2) {
            z2 = true;
        }
        int i19 = z2 ? 1 : 0;
        int i20 = z2 ? 1 : 0;
        int i21 = z2 ? 1 : 0;
        int i22 = (((i18 + i19) * 31) + this.f122839i) * 31;
        String str2 = this.f122840j;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 31;
        Drawable drawable = this.f122841k;
        if (drawable != null) {
            i6 = drawable.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (((i23 + i6) * 31) + this.f122842l) * 31;
        boolean z3 = this.v;
        if (z3) {
            z3 = true;
        }
        int i25 = z3 ? 1 : 0;
        int i26 = z3 ? 1 : 0;
        int i27 = z3 ? 1 : 0;
        int i28 = (i24 + i25) * 31;
        boolean z4 = this.f122843m;
        if (z4) {
            z4 = true;
        }
        int i29 = z4 ? 1 : 0;
        int i30 = z4 ? 1 : 0;
        int i31 = z4 ? 1 : 0;
        int i32 = (((i28 + i29) * 31) + this.n) * 31;
        boolean z5 = this.o;
        if (z5) {
            z5 = true;
        }
        int i33 = z5 ? 1 : 0;
        int i34 = z5 ? 1 : 0;
        int i35 = z5 ? 1 : 0;
        int i36 = (((i32 + i33) * 31) + this.p) * 31;
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            i7 = drawable2.hashCode();
        } else {
            i7 = 0;
        }
        int i37 = (i36 + i7) * 31;
        boolean z6 = this.r;
        if (z6) {
            z6 = true;
        }
        int i38 = z6 ? 1 : 0;
        int i39 = z6 ? 1 : 0;
        int i40 = z6 ? 1 : 0;
        int i41 = (i37 + i38) * 31;
        String str3 = this.s;
        if (str3 != null) {
            i8 = str3.hashCode();
        } else {
            i8 = 0;
        }
        int i42 = (i41 + i8) * 31;
        CommonItemView.a aVar = this.t;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        int i43 = (i42 + i10) * 31;
        if (!this.u) {
            i14 = 0;
        }
        return i43 + i14;
    }

    public final String toString() {
        return "CommonItemViewItem(left_icon=" + this.f122833c + ", left_title=" + this.f122834d + ", onClickListener=" + this.f122835e + ", tag=" + this.f122836f + ", visibility=" + this.f122837g + ", isShowYellowDot=" + this.f122838h + ", right_icon=" + this.f122839i + ", right_title=" + this.f122840j + ", background=" + this.f122841k + ", backgroundColor=" + this.f122842l + ", divider=" + this.v + ", isSetImageTintList=" + this.f122843m + ", colorRes=" + this.n + ", isSetIvwLeftVisibility=" + this.o + ", ivwLeft_visibility=" + this.p + ", ivwLeft_drawable=" + this.q + ", isSetRightImageUrl=" + this.r + ", rightImageUrl=" + this.s + ", rightCrop=" + this.t + ", isSetBackgroundColor=" + this.u + ")";
    }

    public final boolean equals(Object obj) {
        String str = this.f68539b;
        String str2 = null;
        if (!(obj instanceof a)) {
            obj = null;
        }
        com.ss.android.ugc.aweme.be.a aVar = (com.ss.android.ugc.aweme.be.a) obj;
        if (aVar != null) {
            str2 = aVar.f68539b;
        }
        return l.a((Object) str, (Object) str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ a(int i2, String str, View.OnClickListener onClickListener, Object obj, boolean z, int i3, int i4) {
        this(i2, str, (i4 & 4) != 0 ? null : onClickListener, (i4 & 8) == 0 ? obj : null, (i4 & 16) != 0 ? true : z, false, 0, null, null, 0, false, false, 0, false, (i4 & 16384) != 0 ? 8 : i3, null, false, null, null, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(int i2, String str, View.OnClickListener onClickListener, Object obj, boolean z, boolean z2, int i3, String str2, Drawable drawable, int i4, boolean z3, boolean z4, int i5, boolean z5, int i6, Drawable drawable2, boolean z6, String str3, CommonItemView.a aVar, boolean z7) {
        super(z3, z, obj, null, 8);
        l.d(str, "");
        this.f122833c = i2;
        this.f122834d = str;
        this.f122835e = onClickListener;
        this.f122836f = obj;
        this.f122837g = z;
        this.f122838h = z2;
        this.f122839i = i3;
        this.f122840j = str2;
        this.f122841k = drawable;
        this.f122842l = i4;
        this.v = z3;
        this.f122843m = z4;
        this.n = i5;
        this.o = z5;
        this.p = i6;
        this.q = drawable2;
        this.r = z6;
        this.s = str3;
        this.t = aVar;
        this.u = z7;
    }

    public static /* synthetic */ a a(a aVar, int i2, String str, View.OnClickListener onClickListener, Object obj, boolean z, boolean z2, int i3, String str2, Drawable drawable, int i4, boolean z3, boolean z4, int i5, boolean z5, int i6, Drawable drawable2, boolean z6, String str3, CommonItemView.a aVar2, boolean z7, int i7) {
        boolean z8 = z5;
        int i8 = i5;
        CommonItemView.a aVar3 = aVar2;
        boolean z9 = z4;
        boolean z10 = z3;
        int i9 = i6;
        Object obj2 = obj;
        View.OnClickListener onClickListener2 = onClickListener;
        boolean z11 = z7;
        String str4 = str;
        int i10 = i2;
        boolean z12 = z;
        Drawable drawable3 = drawable2;
        boolean z13 = z2;
        int i11 = i3;
        boolean z14 = z6;
        String str5 = str2;
        Drawable drawable4 = drawable;
        String str6 = str3;
        int i12 = i4;
        if ((i7 & 1) != 0) {
            i10 = aVar.f122833c;
        }
        if ((i7 & 2) != 0) {
            str4 = aVar.f122834d;
        }
        if ((i7 & 4) != 0) {
            onClickListener2 = aVar.f122835e;
        }
        if ((i7 & 8) != 0) {
            obj2 = aVar.f122836f;
        }
        if ((i7 & 16) != 0) {
            z12 = aVar.f122837g;
        }
        if ((i7 & 32) != 0) {
            z13 = aVar.f122838h;
        }
        if ((i7 & 64) != 0) {
            i11 = aVar.f122839i;
        }
        if ((i7 & 128) != 0) {
            str5 = aVar.f122840j;
        }
        if ((i7 & 256) != 0) {
            drawable4 = aVar.f122841k;
        }
        if ((i7 & 512) != 0) {
            i12 = aVar.f122842l;
        }
        if ((i7 & 1024) != 0) {
            z10 = aVar.v;
        }
        if ((i7 & 2048) != 0) {
            z9 = aVar.f122843m;
        }
        if ((i7 & 4096) != 0) {
            i8 = aVar.n;
        }
        if ((i7 & 8192) != 0) {
            z8 = aVar.o;
        }
        if ((i7 & 16384) != 0) {
            i9 = aVar.p;
        }
        if ((32768 & i7) != 0) {
            drawable3 = aVar.q;
        }
        if ((65536 & i7) != 0) {
            z14 = aVar.r;
        }
        if ((131072 & i7) != 0) {
            str6 = aVar.s;
        }
        if ((262144 & i7) != 0) {
            aVar3 = aVar.t;
        }
        if ((i7 & 524288) != 0) {
            z11 = aVar.u;
        }
        l.d(str4, "");
        return new a(i10, str4, onClickListener2, obj2, z12, z13, i11, str5, drawable4, i12, z10, z9, i8, z8, i9, drawable3, z14, str6, aVar3, z11);
    }
}
