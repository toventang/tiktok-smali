package com.ss.android.ugc.aweme.be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.bytedance.tux.table.cell.b;
import h.f.b.l;

public final class f extends i {

    /* renamed from: c  reason: collision with root package name */
    public final String f68577c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f68578d;

    /* renamed from: e  reason: collision with root package name */
    public final String f68579e;

    /* renamed from: f  reason: collision with root package name */
    public final String f68580f;

    /* renamed from: g  reason: collision with root package name */
    public final a f68581g;

    /* renamed from: h  reason: collision with root package name */
    public final String f68582h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f68583i;

    /* renamed from: j  reason: collision with root package name */
    public final View.OnClickListener f68584j;

    /* renamed from: k  reason: collision with root package name */
    public final View.OnClickListener f68585k;

    /* renamed from: l  reason: collision with root package name */
    private final b f68586l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f68587m;
    private final boolean n;
    private final boolean o;

    static {
        Covode.recordClassIndex(42214);
    }

    private static f a(String str, boolean z, String str2, String str3, b bVar, a aVar, boolean z2, boolean z3, String str4, boolean z4, boolean z5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        l.d(str, "");
        l.d(str3, "");
        l.d(bVar, "");
        return new f(str, z, str2, str3, bVar, aVar, z2, z3, str4, z4, z5, onClickListener, onClickListener2);
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean a() {
        return this.f68587m;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean b() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String d() {
        return this.f68580f;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final b e() {
        return this.f68586l;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final a f() {
        return this.f68581g;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String g() {
        return this.f68582h;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean h() {
        return this.f68583i;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean i() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final View.OnClickListener j() {
        return this.f68585k;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.f68577c;
        int i9 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = i2 * 31;
        boolean z = this.f68578d;
        int i11 = 1;
        if (z) {
            z = true;
        }
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = (i10 + i12) * 31;
        String str2 = this.f68579e;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        String str3 = this.f68580f;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        b bVar = this.f68586l;
        if (bVar != null) {
            i5 = bVar.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        a aVar = this.f68581g;
        if (aVar != null) {
            i6 = aVar.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        boolean z2 = this.f68587m;
        if (z2) {
            z2 = true;
        }
        int i20 = z2 ? 1 : 0;
        int i21 = z2 ? 1 : 0;
        int i22 = z2 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z3 = this.n;
        if (z3) {
            z3 = true;
        }
        int i24 = z3 ? 1 : 0;
        int i25 = z3 ? 1 : 0;
        int i26 = z3 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        String str4 = this.f68582h;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 31;
        boolean z4 = this.f68583i;
        if (z4) {
            z4 = true;
        }
        int i29 = z4 ? 1 : 0;
        int i30 = z4 ? 1 : 0;
        int i31 = z4 ? 1 : 0;
        int i32 = (i28 + i29) * 31;
        if (!this.o) {
            i11 = 0;
        }
        int i33 = (i32 + i11) * 31;
        View.OnClickListener onClickListener = this.f68584j;
        if (onClickListener != null) {
            i8 = onClickListener.hashCode();
        } else {
            i8 = 0;
        }
        int i34 = (i33 + i8) * 31;
        View.OnClickListener onClickListener2 = this.f68585k;
        if (onClickListener2 != null) {
            i9 = onClickListener2.hashCode();
        }
        return i34 + i9;
    }

    public final String toString() {
        return "LabelItem(text=" + this.f68577c + ", yellowDot=" + this.f68578d + ", imageUrl=" + this.f68579e + ", title=" + this.f68580f + ", cellVariant=" + this.f68586l + ", icon=" + this.f68581g + ", divider=" + this.f68587m + ", visibility=" + this.n + ", subTitle=" + this.f68582h + ", enable=" + this.f68583i + ", loading=" + this.o + ", onClickListener=" + this.f68584j + ", disableClickListener=" + this.f68585k + ")";
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, boolean z, String str2, String str3, b bVar, a aVar, boolean z2, boolean z3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str2, str3, (i2 & 16) != 0 ? b.NORMAL : bVar, (i2 & 32) != 0 ? null : aVar, false, (i2 & 128) != 0 ? true : z2, null, (i2 & 512) != 0 ? true : z3, false, (i2 & 2048) != 0 ? null : onClickListener, (i2 & 4096) == 0 ? onClickListener2 : null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(String str, boolean z, String str2, String str3, b bVar, a aVar, boolean z2, boolean z3, String str4, boolean z4, boolean z5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        super(str3, bVar, aVar, z3, z2, str4, z4, z5, onClickListener, onClickListener2, 1024);
        l.d(str, "");
        l.d(str3, "");
        l.d(bVar, "");
        this.f68577c = str;
        this.f68578d = z;
        this.f68579e = str2;
        this.f68580f = str3;
        this.f68586l = bVar;
        this.f68581g = aVar;
        this.f68587m = z2;
        this.n = z3;
        this.f68582h = str4;
        this.f68583i = z4;
        this.o = z5;
        this.f68584j = onClickListener;
        this.f68585k = onClickListener2;
    }

    public static /* synthetic */ f a(f fVar, String str, boolean z, String str2, String str3, b bVar, a aVar, boolean z2, boolean z3, String str4, boolean z4, boolean z5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2) {
        View.OnClickListener onClickListener3 = onClickListener2;
        View.OnClickListener onClickListener4 = onClickListener;
        boolean z6 = z5;
        String str5 = str3;
        String str6 = str2;
        boolean z7 = z;
        String str7 = str;
        b bVar2 = bVar;
        a aVar2 = aVar;
        boolean z8 = z2;
        boolean z9 = z3;
        String str8 = str4;
        boolean z10 = z4;
        if ((i2 & 1) != 0) {
            str7 = fVar.f68577c;
        }
        if ((i2 & 2) != 0) {
            z7 = fVar.f68578d;
        }
        if ((i2 & 4) != 0) {
            str6 = fVar.f68579e;
        }
        if ((i2 & 8) != 0) {
            str5 = fVar.f68580f;
        }
        if ((i2 & 16) != 0) {
            bVar2 = fVar.f68586l;
        }
        if ((i2 & 32) != 0) {
            aVar2 = fVar.f68581g;
        }
        if ((i2 & 64) != 0) {
            z8 = fVar.f68587m;
        }
        if ((i2 & 128) != 0) {
            z9 = fVar.n;
        }
        if ((i2 & 256) != 0) {
            str8 = fVar.f68582h;
        }
        if ((i2 & 512) != 0) {
            z10 = fVar.f68583i;
        }
        if ((i2 & 1024) != 0) {
            z6 = fVar.o;
        }
        if ((i2 & 2048) != 0) {
            onClickListener4 = fVar.f68584j;
        }
        if ((i2 & 4096) != 0) {
            onClickListener3 = fVar.f68585k;
        }
        return a(str7, z7, str6, str5, bVar2, aVar2, z8, z9, str8, z10, z6, onClickListener4, onClickListener3);
    }
}
