package com.ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f92443a;

    /* renamed from: b  reason: collision with root package name */
    public final float f92444b;

    static {
        Covode.recordClassIndex(58522);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f92443a, cVar.f92443a) == 0 && Float.compare(this.f92444b, cVar.f92444b) == 0;
    }

    public final String toString() {
        return "FlipScale(scaleMin=" + this.f92443a + ", scaleMax=" + this.f92444b + ")";
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f92443a) * 31) + Float.floatToIntBits(this.f92444b);
    }

    public c(float f2, float f3) {
        this.f92443a = f2;
        this.f92444b = f3;
    }
}
