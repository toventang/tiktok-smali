package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class u<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    static {
        Covode.recordClassIndex(105390);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.u */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u copy$default(u uVar, Object obj, Object obj2, Object obj3, int i2, Object obj4) {
        if ((i2 & 1) != 0) {
            obj = uVar.first;
        }
        if ((i2 & 2) != 0) {
            obj2 = uVar.second;
        }
        if ((i2 & 4) != 0) {
            obj3 = uVar.third;
        }
        return uVar.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public final u<A, B, C> copy(A a2, B b2, C c2) {
        return new u<>(a2, b2, c2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.first, uVar.first) && l.a(this.second, uVar.second) && l.a(this.third, uVar.third);
    }

    public final int hashCode() {
        A a2 = this.first;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.second;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.third;
        if (c2 != null) {
            i2 = c2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public final String toString() {
        return "(" + ((Object) this.first) + ", " + ((Object) this.second) + ", " + ((Object) this.third) + ')';
    }

    public u(A a2, B b2, C c2) {
        this.first = a2;
        this.second = b2;
        this.third = c2;
    }
}
