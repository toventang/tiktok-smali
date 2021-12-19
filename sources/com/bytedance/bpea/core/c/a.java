package com.bytedance.bpea.core.c;

import com.bytedance.bpea.basics.d;
import com.bytedance.bpea.basics.f;
import com.bytedance.bpea.basics.l;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public l f26631a = new l();

    /* renamed from: b  reason: collision with root package name */
    public d f26632b = d.INFO;

    /* renamed from: c  reason: collision with root package name */
    public final d f26633c;

    /* renamed from: d  reason: collision with root package name */
    public final f f26634d;

    /* renamed from: e  reason: collision with root package name */
    public final f f26635e;

    /* renamed from: f  reason: collision with root package name */
    public final int f26636f;

    /* renamed from: g  reason: collision with root package name */
    public final String f26637g;

    static {
        Covode.recordClassIndex(15681);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.f.b.l.a(this.f26633c, aVar.f26633c) && h.f.b.l.a(this.f26634d, aVar.f26634d) && h.f.b.l.a(this.f26635e, aVar.f26635e) && this.f26636f == aVar.f26636f && h.f.b.l.a(this.f26637g, aVar.f26637g);
    }

    public final int hashCode() {
        d dVar = this.f26633c;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        f fVar = this.f26634d;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        f fVar2 = this.f26635e;
        int hashCode3 = (((hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31) + this.f26636f) * 31;
        String str = this.f26637g;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "Event(cert=" + this.f26633c + ", context=" + this.f26634d + ", eventType=" + this.f26635e + ", status=" + this.f26636f + ", msg=" + this.f26637g + ")";
    }

    public final void a(l lVar) {
        h.f.b.l.c(lVar, "");
        this.f26631a = lVar;
    }

    public final void a(d dVar) {
        h.f.b.l.c(dVar, "");
        this.f26632b = dVar;
    }

    public a(d dVar, f fVar, f fVar2, int i2, String str) {
        h.f.b.l.c(fVar2, "");
        this.f26633c = dVar;
        this.f26634d = fVar;
        this.f26635e = fVar2;
        this.f26636f = i2;
        this.f26637g = str;
    }
}
