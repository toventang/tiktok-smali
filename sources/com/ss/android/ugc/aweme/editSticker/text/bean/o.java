package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f88436a;

    /* renamed from: b  reason: collision with root package name */
    public final float f88437b;

    /* renamed from: c  reason: collision with root package name */
    public final int f88438c;

    static {
        Covode.recordClassIndex(55666);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f88436a == oVar.f88436a && Float.compare(this.f88437b, oVar.f88437b) == 0 && this.f88438c == oVar.f88438c;
    }

    public final String toString() {
        return "EffectTextScaleInfo(isPortrait=" + this.f88436a + ", scaleFactor=" + this.f88437b + ", maxTextWidth=" + this.f88438c + ")";
    }

    public /* synthetic */ o() {
        this(true, 1.0f, -1);
    }

    public final float a() {
        float f2 = this.f88437b;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return 1.0f / f2;
    }

    public final int hashCode() {
        boolean z = this.f88436a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (((i2 * 31) + Float.floatToIntBits(this.f88437b)) * 31) + this.f88438c;
    }

    public o(boolean z, float f2, int i2) {
        this.f88436a = z;
        this.f88437b = f2;
        this.f88438c = i2;
    }
}
