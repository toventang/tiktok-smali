package d.a.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f156625a;

    /* renamed from: b  reason: collision with root package name */
    public final h f156626b;

    /* renamed from: c  reason: collision with root package name */
    public final h f156627c;

    /* renamed from: d  reason: collision with root package name */
    public final Double f156628d;

    /* renamed from: e  reason: collision with root package name */
    public final Double f156629e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f156630f;

    /* renamed from: g  reason: collision with root package name */
    public final i f156631g;

    static {
        Covode.recordClassIndex(103993);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f156625a, fVar.f156625a) && l.a(this.f156626b, fVar.f156626b) && l.a(this.f156627c, fVar.f156627c) && l.a(this.f156628d, fVar.f156628d) && l.a(this.f156629e, fVar.f156629e) && l.a(this.f156630f, fVar.f156630f) && l.a(this.f156631g, fVar.f156631g);
    }

    public final int hashCode() {
        String str = this.f156625a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        h hVar = this.f156626b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        h hVar2 = this.f156627c;
        int hashCode3 = (hashCode2 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        Double d2 = this.f156628d;
        int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.f156629e;
        int hashCode5 = (hashCode4 + (d3 != null ? d3.hashCode() : 0)) * 31;
        Long l2 = this.f156630f;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        i iVar = this.f156631g;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "FileMeta(name=" + this.f156625a + ", absolutePath=" + this.f156626b + ", canonicalPath=" + this.f156627c + ", createdAt=" + this.f156628d + ", modifiedAt=" + this.f156629e + ", size=" + this.f156630f + ", type=" + this.f156631g + ")";
    }

    public f(String str, h hVar, h hVar2, Double d2, Double d3, Long l2, i iVar) {
        l.c(str, "");
        l.c(hVar, "");
        l.c(hVar2, "");
        l.c(iVar, "");
        this.f156625a = str;
        this.f156626b = hVar;
        this.f156627c = hVar2;
        this.f156628d = d2;
        this.f156629e = d3;
        this.f156630f = l2;
        this.f156631g = iVar;
    }
}
