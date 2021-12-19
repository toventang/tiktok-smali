package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135419b;

    static {
        Covode.recordClassIndex(88468);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f135418a, kVar.f135418a) && this.f135419b == kVar.f135419b;
    }

    public final int hashCode() {
        Effect effect = this.f135418a;
        return ((effect != null ? effect.hashCode() : 0) * 31) + this.f135419b;
    }

    public final String toString() {
        return "MultiSticker(effect=" + this.f135418a + ", position=" + this.f135419b + ")";
    }

    public /* synthetic */ k() {
        this(null, -1);
    }

    public k(Effect effect, int i2) {
        this.f135418a = effect;
        this.f135419b = i2;
    }
}
