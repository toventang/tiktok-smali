package com.bytedance.ies.im.core.api.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f33990a;

    /* renamed from: b  reason: collision with root package name */
    public final e f33991b;

    static {
        Covode.recordClassIndex(20228);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f33990a, dVar.f33990a) && l.a(this.f33991b, dVar.f33991b);
    }

    public final int hashCode() {
        c cVar = this.f33990a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        e eVar = this.f33991b;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NetworkStateInfo(state=" + this.f33990a + ", type=" + this.f33991b + ")";
    }

    public d(c cVar, e eVar) {
        l.d(cVar, "");
        l.d(eVar, "");
        this.f33990a = cVar;
        this.f33991b = eVar;
    }
}
