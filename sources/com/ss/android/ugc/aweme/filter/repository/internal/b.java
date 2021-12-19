package com.ss.android.ugc.aweme.filter.repository.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f95583a;

    /* renamed from: b  reason: collision with root package name */
    public final f f95584b;

    /* renamed from: c  reason: collision with root package name */
    public final d f95585c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f95586d;

    static {
        Covode.recordClassIndex(60571);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f95583a, bVar.f95583a) && l.a(this.f95584b, bVar.f95584b) && l.a(this.f95585c, bVar.f95585c) && l.a(this.f95586d, bVar.f95586d);
    }

    public final int hashCode() {
        c cVar = this.f95583a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        f fVar = this.f95584b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        d dVar = this.f95585c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Exception exc = this.f95586d;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "FilterDownloadEvent(state=" + this.f95583a + ", filterMeta=" + this.f95584b + ", downloadResult=" + this.f95585c + ", exception=" + this.f95586d + ")";
    }

    public b(c cVar, f fVar, d dVar, Exception exc) {
        l.d(cVar, "");
        l.d(fVar, "");
        this.f95583a = cVar;
        this.f95584b = fVar;
        this.f95585c = dVar;
        this.f95586d = exc;
    }
}
