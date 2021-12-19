package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class p<A, B> implements Serializable {
    private final A first;
    public final B second;

    static {
        Covode.recordClassIndex(105382);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p copy$default(p pVar, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = pVar.first;
        }
        if ((i2 & 2) != 0) {
            obj2 = pVar.second;
        }
        return pVar.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final p<A, B> copy(A a2, B b2) {
        return new p<>(a2, b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.first, pVar.first) && l.a(this.second, pVar.second);
    }

    public final int hashCode() {
        A a2 = this.first;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.second;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final String toString() {
        return "(" + ((Object) this.first) + ", " + ((Object) this.second) + ')';
    }

    public p(A a2, B b2) {
        this.first = a2;
        this.second = b2;
    }
}
