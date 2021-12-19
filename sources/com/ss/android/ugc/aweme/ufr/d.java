package com.ss.android.ugc.aweme.ufr;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final g f141689a;

    /* renamed from: b  reason: collision with root package name */
    public final e f141690b;

    static {
        Covode.recordClassIndex(92607);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f141689a, dVar.f141689a) && l.a(this.f141690b, dVar.f141690b);
    }

    public final int hashCode() {
        g gVar = this.f141689a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        e eVar = this.f141690b;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UFRResponse(curStep=" + this.f141689a + ", result=" + this.f141690b + ")";
    }

    public d(g gVar, e eVar) {
        l.c(eVar, "");
        this.f141689a = gVar;
        this.f141690b = eVar;
    }
}
