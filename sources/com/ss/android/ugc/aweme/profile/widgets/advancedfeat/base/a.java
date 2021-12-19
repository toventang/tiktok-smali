package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.c;

public final class a<AREA> {

    /* renamed from: a  reason: collision with root package name */
    public final AREA f117596a;

    /* renamed from: b  reason: collision with root package name */
    public final c<? extends com.bytedance.assem.arch.d.a> f117597b;

    static {
        Covode.recordClassIndex(76027);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f117596a, aVar.f117596a) && l.a(this.f117597b, aVar.f117597b);
    }

    public final int hashCode() {
        AREA area = this.f117596a;
        int i2 = 0;
        int hashCode = (area != null ? area.hashCode() : 0) * 31;
        c<? extends com.bytedance.assem.arch.d.a> cVar = this.f117597b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileAdvancedFeature(entrance=" + ((Object) this.f117596a) + ", assemClass=" + this.f117597b + ")";
    }

    public a(AREA area, c<? extends com.bytedance.assem.arch.d.a> cVar) {
        l.d(area, "");
        l.d(cVar, "");
        this.f117596a = area;
        this.f117597b = cVar;
    }
}
