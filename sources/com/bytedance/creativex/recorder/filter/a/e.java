package com.bytedance.creativex.recorder.filter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.m;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f28226a;

    /* renamed from: b  reason: collision with root package name */
    public final o f28227b;

    /* renamed from: c  reason: collision with root package name */
    public final m f28228c;

    /* renamed from: d  reason: collision with root package name */
    public final j f28229d;

    static {
        Covode.recordClassIndex(16549);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f28226a, eVar.f28226a) && l.a(this.f28227b, eVar.f28227b) && l.a(this.f28228c, eVar.f28228c) && l.a(this.f28229d, eVar.f28229d);
    }

    public final int hashCode() {
        String str = this.f28226a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        o oVar = this.f28227b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        m mVar = this.f28228c;
        int hashCode3 = (hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        j jVar = this.f28229d;
        if (jVar != null) {
            i2 = jVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "FilterSourceData(name=" + this.f28226a + ", repository=" + this.f28227b + ", intensitySource=" + this.f28228c + ", logicStore=" + this.f28229d + ")";
    }

    public e(String str, o oVar, m mVar, j jVar) {
        l.d(str, "");
        l.d(oVar, "");
        l.d(mVar, "");
        l.d(jVar, "");
        this.f28226a = str;
        this.f28227b = oVar;
        this.f28228c = mVar;
        this.f28229d = jVar;
    }
}
