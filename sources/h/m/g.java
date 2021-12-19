package h.m;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f158825a;

    /* renamed from: b  reason: collision with root package name */
    public final h.j.g f158826b;

    static {
        Covode.recordClassIndex(105346);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f158825a, gVar.f158825a) && l.a(this.f158826b, gVar.f158826b);
    }

    public final int hashCode() {
        String str = this.f158825a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        h.j.g gVar = this.f158826b;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f158825a + ", range=" + this.f158826b + ")";
    }

    public g(String str, h.j.g gVar) {
        l.d(str, "");
        l.d(gVar, "");
        this.f158825a = str;
        this.f158826b = gVar;
    }
}
