package com.bytedance.o;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class d implements Type {

    /* renamed from: a  reason: collision with root package name */
    final Class<?> f41684a;

    static {
        Covode.recordClassIndex(25514);
    }

    public final int hashCode() {
        return Objects.hash(this.f41684a);
    }

    public final String toString() {
        return "List<" + this.f41684a.toString() + ">";
    }

    d(Class<?> cls) {
        this.f41684a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f41684a.equals(((d) obj).f41684a);
    }
}
