package com.ss.android.ugc.aweme.be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import h.f.b.l;

public final class b extends i {

    /* renamed from: c  reason: collision with root package name */
    public final String f68543c;

    /* renamed from: d  reason: collision with root package name */
    public final String f68544d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f68545e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnClickListener f68546f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.tux.table.cell.b f68547g;

    /* renamed from: h  reason: collision with root package name */
    private final a f68548h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f68549i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f68550j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f68551k;

    static {
        Covode.recordClassIndex(42210);
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean a() {
        return this.f68549i;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean b() {
        return this.f68550j;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String d() {
        return this.f68543c;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final com.bytedance.tux.table.cell.b e() {
        return this.f68547g;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final a f() {
        return this.f68548h;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String g() {
        return this.f68544d;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean h() {
        return this.f68545e;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean i() {
        return this.f68551k;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f68543c;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        com.bytedance.tux.table.cell.b bVar = this.f68547g;
        if (bVar != null) {
            i3 = bVar.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        a aVar = this.f68548h;
        if (aVar != null) {
            i4 = aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        boolean z = this.f68549i;
        int i10 = 1;
        if (z) {
            z = true;
        }
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = (i9 + i11) * 31;
        boolean z2 = this.f68550j;
        if (z2) {
            z2 = true;
        }
        int i15 = z2 ? 1 : 0;
        int i16 = z2 ? 1 : 0;
        int i17 = z2 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        String str2 = this.f68544d;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        boolean z3 = this.f68545e;
        if (z3) {
            z3 = true;
        }
        int i20 = z3 ? 1 : 0;
        int i21 = z3 ? 1 : 0;
        int i22 = z3 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        if (!this.f68551k) {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        View.OnClickListener onClickListener = this.f68546f;
        if (onClickListener != null) {
            i6 = onClickListener.hashCode();
        }
        return i24 + i6;
    }

    public final String toString() {
        return "BasicTuxItem(title=" + this.f68543c + ", cellVariant=" + this.f68547g + ", icon=" + this.f68548h + ", divider=" + this.f68549i + ", visibility=" + this.f68550j + ", subTitle=" + this.f68544d + ", enable=" + this.f68545e + ", loading=" + this.f68551k + ", onClickListener=" + this.f68546f + ")";
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!l.a((Object) this.f68543c, (Object) bVar.f68543c) || !l.a(this.f68547g, bVar.f68547g) || !l.a(this.f68548h, bVar.f68548h) || this.f68549i != bVar.f68549i || this.f68550j != bVar.f68550j || !l.a((Object) this.f68544d, (Object) bVar.f68544d) || this.f68545e != bVar.f68545e || this.f68551k != bVar.f68551k || !l.a(this.f68546f, bVar.f68546f)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ b(String str, View.OnClickListener onClickListener) {
        this(str, com.bytedance.tux.table.cell.b.NORMAL, onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(String str, com.bytedance.tux.table.cell.b bVar, View.OnClickListener onClickListener) {
        super(str, bVar, null, true, false, null, true, false, onClickListener, null, 1536);
        l.d(str, "");
        l.d(bVar, "");
        this.f68543c = str;
        this.f68547g = bVar;
        this.f68548h = null;
        this.f68549i = false;
        this.f68550j = true;
        this.f68544d = null;
        this.f68545e = true;
        this.f68551k = false;
        this.f68546f = onClickListener;
    }
}
