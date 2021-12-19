package com.bytedance.creativex.recorder.filter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;
import h.p;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final p<FilterBean, e> f28230a;

    /* renamed from: b  reason: collision with root package name */
    public final p<FilterBean, e> f28231b;

    /* renamed from: c  reason: collision with root package name */
    public final l f28232c;

    static {
        Covode.recordClassIndex(16552);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f28230a, hVar.f28230a) && l.a(this.f28231b, hVar.f28231b) && l.a(this.f28232c, hVar.f28232c);
    }

    public final int hashCode() {
        p<FilterBean, e> pVar = this.f28230a;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p<FilterBean, e> pVar2 = this.f28231b;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        l lVar = this.f28232c;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "FilterSwitchEvent(prev=" + this.f28230a + ", cur=" + this.f28231b + ", direction=" + this.f28232c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.p<? extends com.ss.android.ugc.aweme.filter.FilterBean, com.bytedance.creativex.recorder.filter.a.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.p<? extends com.ss.android.ugc.aweme.filter.FilterBean, com.bytedance.creativex.recorder.filter.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p<? extends FilterBean, e> pVar, p<? extends FilterBean, e> pVar2, l lVar) {
        l.d(lVar, "");
        this.f28230a = pVar;
        this.f28231b = pVar2;
        this.f28232c = lVar;
    }
}
