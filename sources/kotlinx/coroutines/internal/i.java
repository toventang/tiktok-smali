package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.ar;

public final class i<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f159130a;

    static {
        Covode.recordClassIndex(105658);
    }

    public final int hashCode() {
        Object obj = this.f159130a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "InlineList(holder=" + this.f159130a + ")";
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f159130a;
        if (!(obj instanceof i) || !l.a(obj2, ((i) obj).f159130a)) {
            return false;
        }
        return true;
    }

    public static final Object a(Object obj, E e2) {
        if (ar.f159021a && !(!(e2 instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return e2;
        } else {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e2);
                return obj;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e2);
            return arrayList;
        }
    }
}
