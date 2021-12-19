package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;

public final class r {
    static {
        Covode.recordClassIndex(33260);
    }

    public static class a<T> implements q<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        static {
            Covode.recordClassIndex(33261);
        }

        @Override // com.google.c.a.q
        public final T b() {
            return this.instance;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.instance});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + ((Object) this.instance) + ")";
        }

        public a(T t) {
            this.instance = t;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return i.a(this.instance, ((a) obj).instance);
            }
            return false;
        }
    }
}
