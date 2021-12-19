package com.ss.android.ugc.aweme.journey.ui;

import android.graphics.BlurMaskFilter;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f105193a;

    /* renamed from: b  reason: collision with root package name */
    public final BlurMaskFilter.Blur f105194b;

    /* renamed from: c  reason: collision with root package name */
    public final float f105195c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public final float f105196d;

    /* renamed from: e  reason: collision with root package name */
    public final int f105197e;

    /* renamed from: f  reason: collision with root package name */
    public final float f105198f;

    static {
        Covode.recordClassIndex(67437);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f105193a, aVar.f105193a) == 0 && l.a(this.f105194b, aVar.f105194b) && Float.compare(this.f105195c, aVar.f105195c) == 0 && Float.compare(this.f105196d, aVar.f105196d) == 0 && this.f105197e == aVar.f105197e && Float.compare(this.f105198f, aVar.f105198f) == 0;
    }

    public final String toString() {
        return "Shadow(blurRadius=" + this.f105193a + ", blur=" + this.f105194b + ", dx=" + this.f105195c + ", dy=" + this.f105196d + ", shadowColor=" + this.f105197e + ", radius=" + this.f105198f + ")";
    }

    public final int hashCode() {
        int i2;
        int floatToIntBits = Float.floatToIntBits(this.f105193a) * 31;
        BlurMaskFilter.Blur blur = this.f105194b;
        if (blur != null) {
            i2 = blur.hashCode();
        } else {
            i2 = 0;
        }
        return ((((((((floatToIntBits + i2) * 31) + Float.floatToIntBits(this.f105195c)) * 31) + Float.floatToIntBits(this.f105196d)) * 31) + this.f105197e) * 31) + Float.floatToIntBits(this.f105198f);
    }

    public a(float f2, BlurMaskFilter.Blur blur, float f3, int i2, float f4) {
        l.d(blur, "");
        this.f105193a = f2;
        this.f105194b = blur;
        this.f105196d = f3;
        this.f105197e = i2;
        this.f105198f = f4;
    }
}
