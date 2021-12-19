package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.livesdk.container.k.c f18791a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18792b;

    static {
        Covode.recordClassIndex(11126);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f18791a, cVar.f18791a) && this.f18792b == cVar.f18792b;
    }

    public final int hashCode() {
        com.bytedance.android.livesdk.container.k.c cVar = this.f18791a;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f18792b;
    }

    public final String toString() {
        return "LoadData(lynxCardView=" + this.f18791a + ", priority=" + this.f18792b + ")";
    }

    public c(com.bytedance.android.livesdk.container.k.c cVar, int i2) {
        l.d(cVar, "");
        this.f18791a = cVar;
        this.f18792b = i2;
    }
}
