package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ac<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f158622a;

    /* renamed from: b  reason: collision with root package name */
    public final T f158623b;

    static {
        Covode.recordClassIndex(105040);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f158622a == acVar.f158622a && l.a(this.f158623b, acVar.f158623b);
    }

    public final int hashCode() {
        int i2 = this.f158622a * 31;
        T t = this.f158623b;
        return i2 + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f158622a + ", value=" + ((Object) this.f158623b) + ")";
    }

    public ac(int i2, T t) {
        this.f158622a = i2;
        this.f158623b = t;
    }
}
