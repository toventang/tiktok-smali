package com.ss.android.ugc.aweme.cn;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.aweme.tools.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f71219a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f71220b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f71221c;

    /* renamed from: d  reason: collision with root package name */
    public final g f71222d;

    /* renamed from: e  reason: collision with root package name */
    public final String f71223e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f71224f;

    /* renamed from: g  reason: collision with root package name */
    public final l.a f71225g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f71226h;

    static {
        Covode.recordClassIndex(43840);
    }

    public e() {
        this(false, false, false, null, null, false, null, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f71219a == eVar.f71219a && this.f71220b == eVar.f71220b && this.f71221c == eVar.f71221c && h.f.b.l.a(this.f71222d, eVar.f71222d) && h.f.b.l.a(this.f71223e, eVar.f71223e) && this.f71224f == eVar.f71224f && h.f.b.l.a(this.f71225g, eVar.f71225g) && this.f71226h == eVar.f71226h;
    }

    public final int hashCode() {
        boolean z = this.f71219a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f71220b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f71221c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        g gVar = this.f71222d;
        int i15 = 0;
        int hashCode = (i14 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f71223e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z4 = this.f71224f;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (hashCode2 + i16) * 31;
        l.a aVar = this.f71225g;
        if (aVar != null) {
            i15 = aVar.hashCode();
        }
        int i20 = (i19 + i15) * 31;
        if (!this.f71226h) {
            i2 = 0;
        }
        return i20 + i2;
    }

    public final String toString() {
        return "SensitiveApiActionParams(fromLifecycle=" + this.f71219a + ", closeCameraByAsync=" + this.f71220b + ", ignoreIsAppBackground=" + this.f71221c + ", frontRearChangeEvent=" + this.f71222d + ", switchCameraEnterMethod=" + this.f71223e + ", toShakeFreeState=" + this.f71224f + ", arConfig=" + this.f71225g + ", enableAR=" + this.f71226h + ")";
    }

    private e(boolean z, boolean z2, boolean z3, g gVar, String str, boolean z4, l.a aVar, boolean z5) {
        this.f71219a = z;
        this.f71220b = z2;
        this.f71221c = z3;
        this.f71222d = gVar;
        this.f71223e = str;
        this.f71224f = z4;
        this.f71225g = aVar;
        this.f71226h = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, boolean z2, boolean z3, g gVar, String str, boolean z4, l.a aVar, boolean z5, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? null : gVar, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? false : z4, (i2 & 64) == 0 ? aVar : null, (i2 & 128) == 0 ? z5 : false);
    }
}
