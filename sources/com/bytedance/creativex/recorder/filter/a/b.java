package com.bytedance.creativex.recorder.filter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final FilterBean f28222a;

    /* renamed from: b  reason: collision with root package name */
    public final e f28223b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28224c;

    /* renamed from: d  reason: collision with root package name */
    public final Float f28225d;

    static {
        Covode.recordClassIndex(16546);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f28222a, bVar.f28222a) && l.a(this.f28223b, bVar.f28223b) && l.a(this.f28224c, bVar.f28224c) && l.a(this.f28225d, bVar.f28225d);
    }

    public final int hashCode() {
        FilterBean filterBean = this.f28222a;
        int i2 = 0;
        int hashCode = (filterBean != null ? filterBean.hashCode() : 0) * 31;
        e eVar = this.f28223b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.f28224c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Float f2 = this.f28225d;
        if (f2 != null) {
            i2 = f2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "FilterApplyData(filter=" + this.f28222a + ", source=" + this.f28223b + ", filePath=" + this.f28224c + ", intensity=" + this.f28225d + ")";
    }

    public b(FilterBean filterBean, e eVar, String str, Float f2) {
        l.d(filterBean, "");
        l.d(eVar, "");
        l.d(str, "");
        this.f28222a = filterBean;
        this.f28223b = eVar;
        this.f28224c = str;
        this.f28225d = f2;
    }
}
