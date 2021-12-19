package com.ss.android.ugc.aweme.ecommercebase.view;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f87707a;

    /* renamed from: b  reason: collision with root package name */
    public int f87708b;

    /* renamed from: c  reason: collision with root package name */
    public int f87709c;

    /* renamed from: d  reason: collision with root package name */
    public int f87710d;

    /* renamed from: e  reason: collision with root package name */
    public int f87711e;

    /* renamed from: f  reason: collision with root package name */
    public int f87712f;

    /* renamed from: g  reason: collision with root package name */
    public int f87713g;

    /* renamed from: h  reason: collision with root package name */
    public int f87714h;

    /* renamed from: i  reason: collision with root package name */
    public int f87715i;

    /* renamed from: j  reason: collision with root package name */
    public int f87716j;

    /* renamed from: k  reason: collision with root package name */
    public int f87717k;

    /* renamed from: l  reason: collision with root package name */
    public int f87718l;

    static {
        Covode.recordClassIndex(55178);
    }

    public a() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f87707a == aVar.f87707a && this.f87708b == aVar.f87708b && this.f87709c == aVar.f87709c && this.f87710d == aVar.f87710d && this.f87711e == aVar.f87711e && this.f87712f == aVar.f87712f && this.f87713g == aVar.f87713g && this.f87714h == aVar.f87714h && this.f87715i == aVar.f87715i && this.f87716j == aVar.f87716j && this.f87717k == aVar.f87717k && this.f87718l == aVar.f87718l;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f87707a * 31) + this.f87708b) * 31) + this.f87709c) * 31) + this.f87710d) * 31) + this.f87711e) * 31) + this.f87712f) * 31) + this.f87713g) * 31) + this.f87714h) * 31) + this.f87715i) * 31) + this.f87716j) * 31) + this.f87717k) * 31) + this.f87718l;
    }

    public final String toString() {
        return "TagLayoutParams(bgStyle=" + this.f87707a + ", width=" + this.f87708b + ", height=" + this.f87709c + ", marginStart=" + this.f87710d + ", marginTop=" + this.f87711e + ", marginEnd=" + this.f87712f + ", marginBottom=" + this.f87713g + ", paddingStart=" + this.f87714h + ", paddingTop=" + this.f87715i + ", paddingEnd=" + this.f87716j + ", paddingBottom=" + this.f87717k + ", gravity=" + this.f87718l + ")";
    }

    private a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f87707a = i2;
        this.f87708b = i3;
        this.f87709c = i4;
        this.f87710d = 0;
        this.f87711e = 0;
        this.f87712f = i5;
        this.f87713g = 0;
        this.f87714h = i6;
        this.f87715i = i7;
        this.f87716j = i8;
        this.f87717k = i9;
        this.f87718l = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this((i11 & 1) != 0 ? -1 : i2, (i11 & 2) != 0 ? -2 : i3, (i11 & 4) == 0 ? i4 : -2, (i11 & 32) != 0 ? 0 : i5, (i11 & 128) != 0 ? 0 : i6, (i11 & 256) != 0 ? 0 : i7, (i11 & 512) != 0 ? 0 : i8, (i11 & 1024) == 0 ? i9 : 0, (i11 & 2048) != 0 ? 17 : i10);
    }
}
