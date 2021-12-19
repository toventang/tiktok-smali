package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.k;
import java.io.Serializable;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class j<F, T> extends az<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final f<F, ? extends T> function;
    final az<T> ordering;

    static {
        Covode.recordClassIndex(33514);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (!this.function.equals(jVar.function) || !this.ordering.equals(jVar.ordering)) {
                return false;
            }
            return true;
        }
        return false;
    }

    j(f<F, ? extends T> fVar, az<T> azVar) {
        this.function = (f) k.a(fVar);
        this.ordering = (az) k.a(azVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.az<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.c.c.az, java.util.Comparator
    public final int compare(F f2, F f3) {
        return this.ordering.compare(this.function.a(f2), this.function.a(f3));
    }
}
