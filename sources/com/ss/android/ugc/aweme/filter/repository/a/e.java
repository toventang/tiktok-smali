package com.ss.android.ugc.aweme.filter.repository.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f95548a;

    /* renamed from: b  reason: collision with root package name */
    public final d f95549b;

    static {
        Covode.recordClassIndex(60549);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f95548a, eVar.f95548a) && l.a(this.f95549b, eVar.f95549b);
    }

    public final int hashCode() {
        d dVar = this.f95548a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        d dVar2 = this.f95549b;
        if (dVar2 != null) {
            i2 = dVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterInfoEvent(from=" + this.f95548a + ", to=" + this.f95549b + ")";
    }

    public e(d dVar, d dVar2) {
        l.d(dVar, "");
        l.d(dVar2, "");
        this.f95548a = dVar;
        this.f95549b = dVar2;
    }
}
