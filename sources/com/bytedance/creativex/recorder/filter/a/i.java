package com.bytedance.creativex.recorder.filter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final FilterBean f28233a;

    /* renamed from: b  reason: collision with root package name */
    public final e f28234b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28235c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28236d;

    static {
        Covode.recordClassIndex(16553);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f28233a, iVar.f28233a) && l.a(this.f28234b, iVar.f28234b) && this.f28235c == iVar.f28235c && l.a(this.f28236d, iVar.f28236d);
    }

    public final int hashCode() {
        FilterBean filterBean = this.f28233a;
        int i2 = 0;
        int hashCode = (filterBean != null ? filterBean.hashCode() : 0) * 31;
        e eVar = this.f28234b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        boolean z = this.f28235c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str = this.f28236d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "FilterUpdateEvent(filter=" + this.f28233a + ", source=" + this.f28234b + ", fromUser=" + this.f28235c + ", enterFrom=" + this.f28236d + ")";
    }

    public i(FilterBean filterBean, e eVar, boolean z, String str) {
        l.d(filterBean, "");
        l.d(eVar, "");
        this.f28233a = filterBean;
        this.f28234b = eVar;
        this.f28235c = z;
        this.f28236d = str;
    }
}
