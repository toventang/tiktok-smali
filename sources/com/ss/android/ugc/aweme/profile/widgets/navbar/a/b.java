package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import com.bytedance.assem.arch.core.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.c;

public final class b<AREA> {

    /* renamed from: a  reason: collision with root package name */
    public final AREA f117960a;

    /* renamed from: b  reason: collision with root package name */
    public final c<? extends a> f117961b;

    static {
        Covode.recordClassIndex(76461);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f117960a, bVar.f117960a) && l.a(this.f117961b, bVar.f117961b);
    }

    public final int hashCode() {
        AREA area = this.f117960a;
        int i2 = 0;
        int hashCode = (area != null ? area.hashCode() : 0) * 31;
        c<? extends a> cVar = this.f117961b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileNavAction(entrance=" + ((Object) this.f117960a) + ", assemClass=" + this.f117961b + ")";
    }

    public b(AREA area, c<? extends a> cVar) {
        l.d(area, "");
        l.d(cVar, "");
        this.f117960a = area;
        this.f117961b = cVar;
    }
}
