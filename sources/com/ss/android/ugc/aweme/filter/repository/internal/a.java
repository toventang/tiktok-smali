package com.ss.android.ugc.aweme.filter.repository.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f95560a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f95561b;

    static {
        Covode.recordClassIndex(60562);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f95560a, aVar.f95560a) && this.f95561b == aVar.f95561b;
    }

    public final int hashCode() {
        c cVar = this.f95560a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.f95561b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterDataResponse(data=" + this.f95560a + ", brokenData=" + this.f95561b + ")";
    }

    public /* synthetic */ a(c cVar) {
        this(cVar, false);
    }

    public a(c cVar, boolean z) {
        l.d(cVar, "");
        this.f95560a = cVar;
        this.f95561b = z;
    }
}
