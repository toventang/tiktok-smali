package com.ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f88146a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f88147b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f88148c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f88149d;

    static {
        Covode.recordClassIndex(55407);
    }

    public f() {
        this(false, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f88146a == fVar.f88146a && this.f88147b == fVar.f88147b && this.f88148c == fVar.f88148c && this.f88149d == fVar.f88149d;
    }

    public final int hashCode() {
        boolean z = this.f88146a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f88147b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f88148c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.f88149d) {
            i2 = 0;
        }
        return i14 + i2;
    }

    public final String toString() {
        return "EditTextStickerEnableConfig(strokeEnable=" + this.f88146a + ", enableReadText=" + this.f88147b + ", enableReadTextV2=" + this.f88148c + ", enableReadTextButton=" + this.f88149d + ")";
    }

    private f(boolean z, boolean z2) {
        this.f88146a = z;
        this.f88147b = z2;
        this.f88148c = false;
        this.f88149d = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z, boolean z2, int i2) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2);
    }
}
