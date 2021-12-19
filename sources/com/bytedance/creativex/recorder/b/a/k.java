package com.bytedance.creativex.recorder.b.a;

import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f28194a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28195b;

    static {
        Covode.recordClassIndex(16525);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f28194a, kVar.f28194a) && this.f28195b == kVar.f28195b;
    }

    public final int hashCode() {
        Animation animation = this.f28194a;
        int hashCode = (animation != null ? animation.hashCode() : 0) * 31;
        boolean z = this.f28195b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "OnAnimVisibilityChanged(anim=" + this.f28194a + ", toVisible=" + this.f28195b + ")";
    }

    public k(Animation animation, boolean z) {
        l.d(animation, "");
        this.f28194a = animation;
        this.f28195b = z;
    }
}
