package com.bytedance.creativex.recorder.filter.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.e;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final FilterBean f28240a;

    /* renamed from: b  reason: collision with root package name */
    public final float f28241b;

    /* renamed from: c  reason: collision with root package name */
    public final e f28242c;

    static {
        Covode.recordClassIndex(16558);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f28240a, bVar.f28240a) && Float.compare(this.f28241b, bVar.f28241b) == 0 && l.a(this.f28242c, bVar.f28242c);
    }

    public final int hashCode() {
        FilterBean filterBean = this.f28240a;
        int i2 = 0;
        int hashCode = (((filterBean != null ? filterBean.hashCode() : 0) * 31) + Float.floatToIntBits(this.f28241b)) * 31;
        e eVar = this.f28242c;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterData(filterBean=" + this.f28240a + ", intensity=" + this.f28241b + ", source=" + this.f28242c + ")";
    }

    public b(FilterBean filterBean, float f2, e eVar) {
        l.d(filterBean, "");
        l.d(eVar, "");
        this.f28240a = filterBean;
        this.f28241b = f2;
        this.f28242c = eVar;
    }
}
