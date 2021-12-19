package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.io.Serializable;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final class p<T> extends az<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    static {
        Covode.recordClassIndex(33531);
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }

    p(Comparator<T> comparator2) {
        this.comparator = (Comparator) k.a(comparator2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.comparator.equals(((p) obj).comparator);
        }
        return false;
    }

    @Override // com.google.c.c.az, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }
}
