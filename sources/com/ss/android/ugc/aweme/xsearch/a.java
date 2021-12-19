package com.ss.android.ugc.aweme.xsearch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.flowfeed.a.b;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final g f145135a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.a.a f145136b;

    /* renamed from: c  reason: collision with root package name */
    public final b f145137c;

    static {
        Covode.recordClassIndex(94913);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f145135a, aVar.f145135a) && l.a(this.f145136b, aVar.f145136b) && l.a(this.f145137c, aVar.f145137c);
    }

    public final int hashCode() {
        g gVar = this.f145135a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f145136b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.f145137c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AutoPlayBean(manager=" + this.f145135a + ", containerStatusProvider=" + this.f145136b + ", playVideoObserver=" + this.f145137c + ")";
    }

    public a(g gVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, b bVar) {
        l.d(gVar, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f145135a = gVar;
        this.f145136b = aVar;
        this.f145137c = bVar;
    }
}
