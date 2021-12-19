package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;

public final class m {
    static {
        Covode.recordClassIndex(33251);
    }

    public static class b<T> implements l<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T target;

        static {
            Covode.recordClassIndex(33253);
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final String toString() {
            return "Predicates.equalTo(" + ((Object) this.target) + ")";
        }

        private b(T t) {
            this.target = t;
        }

        @Override // com.google.c.a.l
        public final boolean a(T t) {
            return this.target.equals(t);
        }

        @Override // com.google.c.a.l
        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.target.equals(((b) obj).target);
            }
            return false;
        }

        public /* synthetic */ b(Object obj, byte b2) {
            this(obj);
        }
    }

    public static class a<T> implements l<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends l<? super T>> components;

        static {
            Covode.recordClassIndex(33252);
        }

        public final int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends l<? super T>> list = this.components;
            StringBuilder append = new StringBuilder("Predicates.").append("and").append('(');
            boolean z = true;
            for (T t : list) {
                if (!z) {
                    append.append(',');
                }
                append.append((Object) t);
                z = false;
            }
            return append.append(')').toString();
        }

        private a(List<? extends l<? super T>> list) {
            this.components = list;
        }

        @Override // com.google.c.a.l
        public final boolean a(T t) {
            for (int i2 = 0; i2 < this.components.size(); i2++) {
                if (!((l) this.components.get(i2)).a(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.c.a.l
        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.components.equals(((a) obj).components);
            }
            return false;
        }

        public /* synthetic */ a(List list, byte b2) {
            this(list);
        }
    }

    public static class c<T> implements l<T>, Serializable {
        private static final long serialVersionUID = 0;
        final l<T> predicate;

        static {
            Covode.recordClassIndex(33254);
        }

        public final int hashCode() {
            return this.predicate.hashCode() ^ -1;
        }

        public final String toString() {
            return "Predicates.not(" + this.predicate + ")";
        }

        public c(l<T> lVar) {
            this.predicate = (l) k.a(lVar);
        }

        @Override // com.google.c.a.l
        public final boolean a(T t) {
            if (!this.predicate.a(t)) {
                return true;
            }
            return false;
        }

        @Override // com.google.c.a.l
        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.predicate.equals(((c) obj).predicate);
            }
            return false;
        }
    }
}
