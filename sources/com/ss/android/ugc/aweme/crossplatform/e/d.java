package com.ss.android.ugc.aweme.crossplatform.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f78840a;

    /* renamed from: b  reason: collision with root package name */
    public final a.d f78841b;

    static {
        Covode.recordClassIndex(48907);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f78840a, dVar.f78840a) && l.a(this.f78841b, dVar.f78841b);
    }

    public final int hashCode() {
        a.b bVar = this.f78840a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        a.d dVar = this.f78841b;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "JsRequestAndResponse(jsRequest=" + this.f78840a + ", jsResponse=" + this.f78841b + ")";
    }

    public d(a.b bVar, a.d dVar) {
        this.f78840a = bVar;
        this.f78841b = dVar;
    }
}
