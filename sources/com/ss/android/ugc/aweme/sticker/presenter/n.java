package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135422a;

    /* renamed from: b  reason: collision with root package name */
    public final Effect f135423b;

    static {
        Covode.recordClassIndex(88471);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f135422a, nVar.f135422a) && l.a(this.f135423b, nVar.f135423b);
    }

    public final int hashCode() {
        Effect effect = this.f135422a;
        int i2 = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        Effect effect2 = this.f135423b;
        if (effect2 != null) {
            i2 = effect2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StickerChangeEvent(from=" + this.f135422a + ", to=" + this.f135423b + ")";
    }

    private /* synthetic */ n() {
        this(null, null);
    }

    public n(Effect effect, Effect effect2) {
        this.f135422a = effect;
        this.f135423b = effect2;
    }
}
