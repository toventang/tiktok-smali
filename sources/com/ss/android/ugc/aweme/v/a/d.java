package com.ss.android.ugc.aweme.v.a;

import android.graphics.BlurMaskFilter;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f143209a;

    /* renamed from: b  reason: collision with root package name */
    public final BlurMaskFilter.Blur f143210b;

    /* renamed from: c  reason: collision with root package name */
    public final float f143211c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public final float f143212d;

    /* renamed from: e  reason: collision with root package name */
    public final int f143213e;

    static {
        Covode.recordClassIndex(93737);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f143209a, dVar.f143209a) == 0 && l.a(this.f143210b, dVar.f143210b) && Float.compare(this.f143211c, dVar.f143211c) == 0 && Float.compare(this.f143212d, dVar.f143212d) == 0 && this.f143213e == dVar.f143213e;
    }

    public final String toString() {
        return "Shadow(blurRadius=" + this.f143209a + ", blur=" + this.f143210b + ", dx=" + this.f143211c + ", dy=" + this.f143212d + ", shadowColor=" + this.f143213e + ")";
    }

    public final int hashCode() {
        int i2;
        int floatToIntBits = Float.floatToIntBits(this.f143209a) * 31;
        BlurMaskFilter.Blur blur = this.f143210b;
        if (blur != null) {
            i2 = blur.hashCode();
        } else {
            i2 = 0;
        }
        return ((((((floatToIntBits + i2) * 31) + Float.floatToIntBits(this.f143211c)) * 31) + Float.floatToIntBits(this.f143212d)) * 31) + this.f143213e;
    }

    public d(float f2, BlurMaskFilter.Blur blur, float f3, int i2) {
        l.d(blur, "");
        this.f143209a = f2;
        this.f143210b = blur;
        this.f143212d = f3;
        this.f143213e = i2;
    }
}
