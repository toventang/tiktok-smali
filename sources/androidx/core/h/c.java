package androidx.core.h;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2525a;

    static {
        Covode.recordClassIndex(849);
    }

    public final int hashCode() {
        Object obj = this.f2525a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2525a + "}";
    }

    c(Object obj) {
        this.f2525a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Object obj2 = this.f2525a;
        if (obj2 != null) {
            return obj2.equals(cVar.f2525a);
        }
        if (cVar.f2525a == null) {
            return true;
        }
        return false;
    }
}
