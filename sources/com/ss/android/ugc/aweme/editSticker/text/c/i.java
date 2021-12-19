package com.ss.android.ugc.aweme.editSticker.text.c;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f88459a;

    /* renamed from: b  reason: collision with root package name */
    public final int f88460b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f88461c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f88462d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f88463e;

    static {
        Covode.recordClassIndex(55685);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f88459a == iVar.f88459a && this.f88460b == iVar.f88460b && this.f88461c == iVar.f88461c && this.f88462d == iVar.f88462d && this.f88463e == iVar.f88463e;
    }

    public final int hashCode() {
        int i2 = ((this.f88459a * 31) + this.f88460b) * 31;
        boolean z = this.f88461c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f88462d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f88463e) {
            i3 = 0;
        }
        return i11 + i3;
    }

    public final String toString() {
        return "TextStickerTouchEvent(x=" + this.f88459a + ", y=" + this.f88460b + ", isUp=" + this.f88461c + ", isRotate=" + this.f88462d + ", isInTimeEditView=" + this.f88463e + ")";
    }

    private /* synthetic */ i() {
        this(0, 0, false, false, false);
    }

    public i(int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.f88459a = i2;
        this.f88460b = i3;
        this.f88461c = z;
        this.f88462d = z2;
        this.f88463e = z3;
    }
}
