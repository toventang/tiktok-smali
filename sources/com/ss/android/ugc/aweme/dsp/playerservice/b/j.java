package com.ss.android.ugc.aweme.dsp.playerservice.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.c.h;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final h f83394a;

    /* renamed from: b  reason: collision with root package name */
    public final c f83395b;

    static {
        Covode.recordClassIndex(52042);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f83394a, jVar.f83394a) && l.a(this.f83395b, jVar.f83395b);
    }

    public final int hashCode() {
        h hVar = this.f83394a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        c cVar = this.f83395b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StartPlayResp(result=" + this.f83394a + ", playable=" + this.f83395b + ")";
    }

    public j(h hVar, c cVar) {
        l.d(hVar, "");
        this.f83394a = hVar;
        this.f83395b = cVar;
    }
}
