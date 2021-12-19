package com.ss.android.ugc.aweme.sticker.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f135467a;

    /* renamed from: b  reason: collision with root package name */
    public final Effect f135468b;

    /* renamed from: c  reason: collision with root package name */
    public final c f135469c;

    static {
        Covode.recordClassIndex(88510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f135467a == bVar.f135467a && l.a(this.f135468b, bVar.f135468b) && l.a(this.f135469c, bVar.f135469c);
    }

    public final int hashCode() {
        boolean z = this.f135467a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Effect effect = this.f135468b;
        int i6 = 0;
        int hashCode = (i5 + (effect != null ? effect.hashCode() : 0)) * 31;
        c cVar = this.f135469c;
        if (cVar != null) {
            i6 = cVar.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "FavoriteModifyEvent(isFavorite=" + this.f135467a + ", effect=" + this.f135468b + ", from=" + this.f135469c + ")";
    }

    public b(boolean z, Effect effect, c cVar) {
        l.d(effect, "");
        l.d(cVar, "");
        this.f135467a = z;
        this.f135468b = effect;
        this.f135469c = cVar;
    }
}
