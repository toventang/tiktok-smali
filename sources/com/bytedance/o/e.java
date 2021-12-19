package com.bytedance.o;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class e implements Type {

    /* renamed from: a  reason: collision with root package name */
    final Class<?> f41685a;

    /* renamed from: b  reason: collision with root package name */
    final Class<?> f41686b;

    static {
        Covode.recordClassIndex(25515);
    }

    public final int hashCode() {
        return Objects.hash(this.f41685a, this.f41686b);
    }

    public final String toString() {
        return "Map<" + this.f41685a.toString() + "," + this.f41686b.toString() + ">";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f41685a.equals(eVar.f41685a) || !this.f41686b.equals(eVar.f41686b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    e(Class<?> cls, Class<?> cls2) {
        this.f41685a = cls;
        this.f41686b = cls2;
    }
}
