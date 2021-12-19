package com.ss.android.ugc.aweme.be;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.bytedance.tux.table.cell.b;
import h.f.b.l;

public final class g extends i {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f68588c;

    /* renamed from: d  reason: collision with root package name */
    public final CompoundButton.OnCheckedChangeListener f68589d;

    /* renamed from: e  reason: collision with root package name */
    public final String f68590e;

    /* renamed from: f  reason: collision with root package name */
    public final b f68591f;

    /* renamed from: g  reason: collision with root package name */
    public final a f68592g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f68593h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f68594i;

    /* renamed from: j  reason: collision with root package name */
    public final String f68595j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f68596k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f68597l;

    /* renamed from: m  reason: collision with root package name */
    public final View.OnClickListener f68598m;

    static {
        Covode.recordClassIndex(42215);
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean a() {
        return this.f68593h;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean b() {
        return this.f68594i;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String d() {
        return this.f68590e;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final b e() {
        return this.f68591f;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final a f() {
        return this.f68592g;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String g() {
        return this.f68595j;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean h() {
        return this.f68596k;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean i() {
        return this.f68597l;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = this.f68588c;
        int i7 = 1;
        if (z) {
            z = true;
        }
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = i8 * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f68589d;
        int i12 = 0;
        if (onCheckedChangeListener != null) {
            i2 = onCheckedChangeListener.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i11 + i2) * 31;
        String str = this.f68590e;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        b bVar = this.f68591f;
        if (bVar != null) {
            i4 = bVar.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        a aVar = this.f68592g;
        if (aVar != null) {
            i5 = aVar.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        boolean z2 = this.f68593h;
        if (z2) {
            z2 = true;
        }
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = z2 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        boolean z3 = this.f68594i;
        if (z3) {
            z3 = true;
        }
        int i21 = z3 ? 1 : 0;
        int i22 = z3 ? 1 : 0;
        int i23 = z3 ? 1 : 0;
        int i24 = (i20 + i21) * 31;
        String str2 = this.f68595j;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i25 = (i24 + i6) * 31;
        boolean z4 = this.f68596k;
        if (z4) {
            z4 = true;
        }
        int i26 = z4 ? 1 : 0;
        int i27 = z4 ? 1 : 0;
        int i28 = z4 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        if (!this.f68597l) {
            i7 = 0;
        }
        int i30 = (i29 + i7) * 31;
        View.OnClickListener onClickListener = this.f68598m;
        if (onClickListener != null) {
            i12 = onClickListener.hashCode();
        }
        return i30 + i12;
    }

    public final String toString() {
        return "RadioItem(isChecked=" + this.f68588c + ", onCheckedChangedListener=" + this.f68589d + ", title=" + this.f68590e + ", cellVariant=" + this.f68591f + ", icon=" + this.f68592g + ", divider=" + this.f68593h + ", visibility=" + this.f68594i + ", subTitle=" + this.f68595j + ", enable=" + this.f68596k + ", loading=" + this.f68597l + ", onClickListener=" + this.f68598m + ")";
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* synthetic */ g(boolean z, String str, a aVar, View.OnClickListener onClickListener) {
        this(z, null, str, b.NORMAL, aVar, false, true, null, true, false, onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, String str, b bVar, a aVar, boolean z2, boolean z3, String str2, boolean z4, boolean z5, View.OnClickListener onClickListener) {
        super(str, bVar, aVar, z3, z2, str2, z4, z5, onClickListener, null, 1536);
        l.d(str, "");
        l.d(bVar, "");
        this.f68588c = z;
        this.f68589d = onCheckedChangeListener;
        this.f68590e = str;
        this.f68591f = bVar;
        this.f68592g = aVar;
        this.f68593h = z2;
        this.f68594i = z3;
        this.f68595j = str2;
        this.f68596k = z4;
        this.f68597l = z5;
        this.f68598m = onClickListener;
    }
}
