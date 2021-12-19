package com.ss.android.ugc.aweme.be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.bytedance.tux.table.cell.b;

public final class c extends i {

    /* renamed from: c  reason: collision with root package name */
    public final String f68552c;

    /* renamed from: d  reason: collision with root package name */
    public final View.OnClickListener f68553d;

    /* renamed from: e  reason: collision with root package name */
    private final String f68554e;

    /* renamed from: f  reason: collision with root package name */
    private final b f68555f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f68556g;

    /* renamed from: h  reason: collision with root package name */
    private final a f68557h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f68558i;

    /* renamed from: j  reason: collision with root package name */
    private final String f68559j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f68560k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f68561l;

    static {
        Covode.recordClassIndex(42211);
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean a() {
        return this.f68558i;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean b() {
        return this.f68556g;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String d() {
        return this.f68554e;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final b e() {
        return this.f68555f;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final a f() {
        return this.f68557h;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String g() {
        return this.f68559j;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean h() {
        return this.f68560k;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean i() {
        return this.f68561l;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f68552c;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        String str2 = this.f68554e;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        b bVar = this.f68555f;
        if (bVar != null) {
            i4 = bVar.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        boolean z = this.f68556g;
        int i11 = 1;
        if (z) {
            z = true;
        }
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = (i10 + i12) * 31;
        View.OnClickListener onClickListener = this.f68553d;
        if (onClickListener != null) {
            i5 = onClickListener.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        a aVar = this.f68557h;
        if (aVar != null) {
            i6 = aVar.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        boolean z2 = this.f68558i;
        if (z2) {
            z2 = true;
        }
        int i18 = z2 ? 1 : 0;
        int i19 = z2 ? 1 : 0;
        int i20 = z2 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        String str3 = this.f68559j;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        int i22 = (i21 + i7) * 31;
        boolean z3 = this.f68560k;
        if (z3) {
            z3 = true;
        }
        int i23 = z3 ? 1 : 0;
        int i24 = z3 ? 1 : 0;
        int i25 = z3 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        if (!this.f68561l) {
            i11 = 0;
        }
        return i26 + i11;
    }

    public final String toString() {
        return "ButtonItem(text=" + this.f68552c + ", title=" + this.f68554e + ", cellVariant=" + this.f68555f + ", visibility=" + this.f68556g + ", onClickListener=" + this.f68553d + ", icon=" + this.f68557h + ", divider=" + this.f68558i + ", subTitle=" + this.f68559j + ", enable=" + this.f68560k + ", loading=" + this.f68561l + ")";
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
