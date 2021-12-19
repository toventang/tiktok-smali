package com.ss.android.ugc.aweme.sticker.repository.internals.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135559a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f135560b;

    static {
        Covode.recordClassIndex(88594);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f135559a, dVar.f135559a) && this.f135560b == dVar.f135560b;
    }

    public final int hashCode() {
        Effect effect = this.f135559a;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        boolean z = this.f135560b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "FavoriteModifyFetcherRequest(favorite=" + this.f135559a + ", isFavorite=" + this.f135560b + ")";
    }

    public d(Effect effect, boolean z) {
        l.d(effect, "");
        this.f135559a = effect;
        this.f135560b = z;
    }
}
