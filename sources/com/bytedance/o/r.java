package com.bytedance.o;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class r implements Type {

    /* renamed from: a  reason: collision with root package name */
    final Class<?> f41740a;

    static {
        Covode.recordClassIndex(25539);
    }

    public final int hashCode() {
        return Objects.hash(this.f41740a);
    }

    public final String toString() {
        return "Set<" + this.f41740a.toString() + ">";
    }

    r(Class<?> cls) {
        this.f41740a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f41740a.equals(((r) obj).f41740a);
    }
}
