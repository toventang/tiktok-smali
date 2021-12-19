package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final l f149380a;

    static {
        Covode.recordClassIndex(98369);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof q) && l.a(this.f149380a, ((q) obj).f149380a);
        }
        return true;
    }

    public final int hashCode() {
        l lVar = this.f149380a;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StickerInfo(state=" + this.f149380a + ")";
    }

    public q(l lVar) {
        l.d(lVar, "");
        this.f149380a = lVar;
    }
}
