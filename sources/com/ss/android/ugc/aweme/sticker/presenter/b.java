package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135273a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135274b;

    /* renamed from: c  reason: collision with root package name */
    public final int f135275c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f135276d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f135277e;

    static {
        Covode.recordClassIndex(88399);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f135273a, bVar.f135273a) && this.f135274b == bVar.f135274b && this.f135275c == bVar.f135275c && this.f135276d == bVar.f135276d && this.f135277e == bVar.f135277e;
    }

    public final int hashCode() {
        Effect effect = this.f135273a;
        int hashCode = (((((effect != null ? effect.hashCode() : 0) * 31) + this.f135274b) * 31) + this.f135275c) * 31;
        boolean z = this.f135276d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f135277e) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "ClickStickerEvent(effect=" + this.f135273a + ", tabIndex=" + this.f135274b + ", myPosition=" + this.f135275c + ", isCancelSelect=" + this.f135276d + ", isChildSticker=" + this.f135277e + ")";
    }

    private /* synthetic */ b() {
        this(null, -1, -1, true, false);
    }

    public b(Effect effect, int i2, int i3, boolean z, boolean z2) {
        this.f135273a = effect;
        this.f135274b = i2;
        this.f135275c = i3;
        this.f135276d = z;
        this.f135277e = z2;
    }
}
