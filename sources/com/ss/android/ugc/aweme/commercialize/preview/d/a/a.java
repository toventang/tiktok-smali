package com.ss.android.ugc.aweme.commercialize.preview.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f75016a;

    /* renamed from: b  reason: collision with root package name */
    public final int f75017b;

    /* renamed from: c  reason: collision with root package name */
    public final float f75018c;

    /* renamed from: d  reason: collision with root package name */
    public final float f75019d = -15.0f;

    /* renamed from: e  reason: collision with root package name */
    public final int f75020e = 3;

    /* renamed from: f  reason: collision with root package name */
    public final int f75021f = 10;

    static {
        Covode.recordClassIndex(46252);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f75016a, aVar.f75016a) && this.f75017b == aVar.f75017b && Float.compare(this.f75018c, aVar.f75018c) == 0 && Float.compare(this.f75019d, aVar.f75019d) == 0 && this.f75020e == aVar.f75020e && this.f75021f == aVar.f75021f;
    }

    public final String toString() {
        return "AdsPreviewWaterMarkConfig(text=" + this.f75016a + ", textColor=" + this.f75017b + ", textSize=" + this.f75018c + ", rotation=" + this.f75019d + ", marksInRow=" + this.f75020e + ", marksInColumn=" + this.f75021f + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f75016a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return (((((((((i2 * 31) + this.f75017b) * 31) + Float.floatToIntBits(this.f75018c)) * 31) + Float.floatToIntBits(this.f75019d)) * 31) + this.f75020e) * 31) + this.f75021f;
    }

    public a(String str, int i2, float f2) {
        l.d(str, "");
        this.f75016a = str;
        this.f75017b = i2;
        this.f75018c = f2;
    }
}
