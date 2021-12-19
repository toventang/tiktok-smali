package com.ss.android.ugc.aweme.sticker.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135465a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f135466b;

    static {
        Covode.recordClassIndex(88508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return l.a(this.f135465a, acVar.f135465a) && this.f135466b == acVar.f135466b;
    }

    public final int hashCode() {
        Effect effect = this.f135465a;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        boolean z = this.f135466b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "StickerDownloadRequest(effect=" + this.f135465a + ", isAuto=" + this.f135466b + ")";
    }

    public /* synthetic */ ac(Effect effect) {
        this(effect, false);
    }

    public ac(Effect effect, boolean z) {
        l.d(effect, "");
        this.f135465a = effect;
        this.f135466b = z;
    }
}
