package com.ss.android.ugc.aweme.discover.lynx.container;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import h.f.b.l;

public final class a {
    @c(a = "card_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f81453a;
    @c(a = "dynamic_data")

    /* renamed from: b  reason: collision with root package name */
    public final d f81454b;

    static {
        Covode.recordClassIndex(50615);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f81453a == aVar.f81453a && l.a(this.f81454b, aVar.f81454b);
    }

    public final int hashCode() {
        int i2 = this.f81453a * 31;
        d dVar = this.f81454b;
        return i2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicData(cardType=" + this.f81453a + ", dynamicPatch=" + this.f81454b + ")";
    }

    public /* synthetic */ a(d dVar) {
        this(b.f81455a, dVar);
    }

    private a(int i2, d dVar) {
        l.d(dVar, "");
        this.f81453a = i2;
        this.f81454b = dVar;
    }
}
