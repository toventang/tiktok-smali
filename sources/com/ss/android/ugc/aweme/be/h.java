package com.ss.android.ugc.aweme.be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.tux.c.a;
import com.bytedance.tux.table.cell.b;
import h.f.b.l;

public final class h extends i {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f68599c;

    /* renamed from: d  reason: collision with root package name */
    public final String f68600d;

    /* renamed from: e  reason: collision with root package name */
    public final View.OnClickListener f68601e;

    /* renamed from: f  reason: collision with root package name */
    public final DmtSettingSwitch.a f68602f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f68603g;

    /* renamed from: h  reason: collision with root package name */
    public final View.OnClickListener f68604h;

    /* renamed from: i  reason: collision with root package name */
    public final String f68605i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f68606j;

    /* renamed from: k  reason: collision with root package name */
    public final String f68607k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f68608l;

    /* renamed from: m  reason: collision with root package name */
    private final b f68609m;
    private final a n;
    private final boolean o;
    private final boolean p;

    static {
        Covode.recordClassIndex(42216);
    }

    public h(String str) {
        this(false, str, null, false, null, null, null, null, null, false, 16380);
    }

    public h(String str, View.OnClickListener onClickListener) {
        this(false, str, onClickListener, false, null, null, null, null, null, false, 16368);
    }

    public h(String str, View.OnClickListener onClickListener, byte b2) {
        this(false, str, onClickListener, false, null, null, null, null, null, false, 16376);
    }

    public h(String str, View.OnClickListener onClickListener, boolean z, DmtSettingSwitch.a aVar) {
        this(false, str, onClickListener, z, aVar, null, null, null, null, false, 16352);
    }

    public h(String str, Object obj) {
        this(false, str, null, true, null, obj, null, null, null, false, 16320);
    }

    private static h a(boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.a aVar, Object obj, View.OnClickListener onClickListener2, b bVar, a aVar2, boolean z3, String str2, boolean z4, boolean z5, String str3) {
        l.d(str, "");
        l.d(bVar, "");
        return new h(z, str, onClickListener, z2, aVar, obj, onClickListener2, bVar, aVar2, z3, str2, z4, z5, str3);
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean a() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final boolean b() {
        return this.f68608l;
    }

    @Override // com.ss.android.ugc.aweme.be.a, com.ss.android.ugc.aweme.be.i
    public final Object c() {
        return this.f68603g;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String d() {
        return this.f68600d;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final b e() {
        return this.f68609m;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final a f() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final String g() {
        return this.f68605i;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean h() {
        return this.f68606j;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean i() {
        return this.p;
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final View.OnClickListener j() {
        return this.f68604h;
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
        boolean z = this.f68599c;
        int i10 = 1;
        if (z) {
            z = true;
        }
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = i11 * 31;
        String str = this.f68600d;
        int i15 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i14 + i2) * 31;
        View.OnClickListener onClickListener = this.f68601e;
        if (onClickListener != null) {
            i3 = onClickListener.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        boolean z2 = this.f68608l;
        if (z2) {
            z2 = true;
        }
        int i18 = z2 ? 1 : 0;
        int i19 = z2 ? 1 : 0;
        int i20 = z2 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        DmtSettingSwitch.a aVar = this.f68602f;
        if (aVar != null) {
            i4 = aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i22 = (i21 + i4) * 31;
        Object obj = this.f68603g;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 31;
        View.OnClickListener onClickListener2 = this.f68604h;
        if (onClickListener2 != null) {
            i6 = onClickListener2.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i23 + i6) * 31;
        b bVar = this.f68609m;
        if (bVar != null) {
            i7 = bVar.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 31;
        a aVar2 = this.n;
        if (aVar2 != null) {
            i8 = aVar2.hashCode();
        } else {
            i8 = 0;
        }
        int i26 = (i25 + i8) * 31;
        boolean z3 = this.o;
        if (z3) {
            z3 = true;
        }
        int i27 = z3 ? 1 : 0;
        int i28 = z3 ? 1 : 0;
        int i29 = z3 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        String str2 = this.f68605i;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i31 = (i30 + i9) * 31;
        boolean z4 = this.f68606j;
        if (z4) {
            z4 = true;
        }
        int i32 = z4 ? 1 : 0;
        int i33 = z4 ? 1 : 0;
        int i34 = z4 ? 1 : 0;
        int i35 = (i31 + i32) * 31;
        if (!this.p) {
            i10 = 0;
        }
        int i36 = (i35 + i10) * 31;
        String str3 = this.f68607k;
        if (str3 != null) {
            i15 = str3.hashCode();
        }
        return i36 + i15;
    }

    public final String toString() {
        return "SwitchItem(isChecked=" + this.f68599c + ", title=" + this.f68600d + ", onClickListener=" + this.f68601e + ", visibility=" + this.f68608l + ", onCheckedChangedListener=" + this.f68602f + ", tag=" + this.f68603g + ", disableClickListener=" + this.f68604h + ", cellVariant=" + this.f68609m + ", icon=" + this.n + ", divider=" + this.o + ", subTitle=" + this.f68605i + ", enable=" + this.f68606j + ", loading=" + this.p + ", right_title=" + this.f68607k + ")";
    }

    @Override // com.ss.android.ugc.aweme.be.i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.a aVar, Object obj, View.OnClickListener onClickListener2, b bVar, String str2, boolean z3, int i2) {
        this((i2 & 1) != 0 ? false : z, str, (i2 & 4) != 0 ? null : onClickListener, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? null : aVar, (i2 & 32) != 0 ? null : obj, (i2 & 64) != 0 ? null : onClickListener2, (i2 & 128) != 0 ? b.NORMAL : bVar, null, false, (i2 & 1024) == 0 ? str2 : null, (i2 & 2048) != 0 ? true : z3, false, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private h(boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.a aVar, Object obj, View.OnClickListener onClickListener2, b bVar, a aVar2, boolean z3, String str2, boolean z4, boolean z5, String str3) {
        super(str, bVar, aVar2, z2, z3, str2, z4, z5, onClickListener, onClickListener2, 1024);
        l.d(str, "");
        l.d(bVar, "");
        this.f68599c = z;
        this.f68600d = str;
        this.f68601e = onClickListener;
        this.f68608l = z2;
        this.f68602f = aVar;
        this.f68603g = obj;
        this.f68604h = onClickListener2;
        this.f68609m = bVar;
        this.n = aVar2;
        this.o = z3;
        this.f68605i = str2;
        this.f68606j = z4;
        this.p = z5;
        this.f68607k = str3;
    }

    public static /* synthetic */ h a(h hVar, boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.a aVar, Object obj, View.OnClickListener onClickListener2, b bVar, a aVar2, boolean z3, String str2, boolean z4, boolean z5, String str3, int i2) {
        String str4 = str3;
        boolean z6 = z5;
        boolean z7 = z4;
        String str5 = str2;
        boolean z8 = z2;
        View.OnClickListener onClickListener3 = onClickListener;
        String str6 = str;
        boolean z9 = z;
        DmtSettingSwitch.a aVar3 = aVar;
        Object obj2 = obj;
        View.OnClickListener onClickListener4 = onClickListener2;
        b bVar2 = bVar;
        a aVar4 = aVar2;
        boolean z10 = z3;
        if ((i2 & 1) != 0) {
            z9 = hVar.f68599c;
        }
        if ((i2 & 2) != 0) {
            str6 = hVar.f68600d;
        }
        if ((i2 & 4) != 0) {
            onClickListener3 = hVar.f68601e;
        }
        if ((i2 & 8) != 0) {
            z8 = hVar.f68608l;
        }
        if ((i2 & 16) != 0) {
            aVar3 = hVar.f68602f;
        }
        if ((i2 & 32) != 0) {
            obj2 = hVar.f68603g;
        }
        if ((i2 & 64) != 0) {
            onClickListener4 = hVar.f68604h;
        }
        if ((i2 & 128) != 0) {
            bVar2 = hVar.f68609m;
        }
        if ((i2 & 256) != 0) {
            aVar4 = hVar.n;
        }
        if ((i2 & 512) != 0) {
            z10 = hVar.o;
        }
        if ((i2 & 1024) != 0) {
            str5 = hVar.f68605i;
        }
        if ((i2 & 2048) != 0) {
            z7 = hVar.f68606j;
        }
        if ((i2 & 4096) != 0) {
            z6 = hVar.p;
        }
        if ((i2 & 8192) != 0) {
            str4 = hVar.f68607k;
        }
        return a(z9, str6, onClickListener3, z8, aVar3, obj2, onClickListener4, bVar2, aVar4, z10, str5, z7, z6, str4);
    }
}
