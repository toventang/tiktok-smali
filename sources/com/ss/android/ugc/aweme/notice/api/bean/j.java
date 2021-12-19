package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public c f112691a;

    /* renamed from: b  reason: collision with root package name */
    public o f112692b;

    static {
        Covode.recordClassIndex(72425);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f112691a, jVar.f112691a) && l.a(this.f112692b, jVar.f112692b);
    }

    public final int hashCode() {
        c cVar = this.f112691a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        o oVar = this.f112692b;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NoticeGroupAttrs(clearOccasion=" + this.f112691a + ", showType=" + this.f112692b + ")";
    }

    private /* synthetic */ j() {
        this(c.Normal, o.ShowDefault);
    }

    public j(c cVar, o oVar) {
        l.d(cVar, "");
        l.d(oVar, "");
        this.f112691a = cVar;
        this.f112692b = oVar;
    }
}
