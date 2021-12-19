package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class n<T> extends j<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    static {
        Covode.recordClassIndex(33255);
    }

    @Override // com.google.c.a.j
    public final boolean isPresent() {
        return true;
    }

    @Override // com.google.c.a.j
    public final T get() {
        return this.reference;
    }

    @Override // com.google.c.a.j
    public final T orNull() {
        return this.reference;
    }

    @Override // com.google.c.a.j
    public final Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.google.c.a.j
    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.c.a.j
    public final String toString() {
        return "Optional.of(" + ((Object) this.reference) + ")";
    }

    @Override // com.google.c.a.j
    public final j<T> or(j<? extends T> jVar) {
        k.a(jVar);
        return this;
    }

    n(T t) {
        this.reference = t;
    }

    @Override // com.google.c.a.j
    public final T or(q<? extends T> qVar) {
        k.a(qVar);
        return this.reference;
    }

    @Override // com.google.c.a.j
    public final T or(T t) {
        k.a(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.c.a.j
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.reference.equals(((n) obj).reference);
        }
        return false;
    }

    @Override // com.google.c.a.j
    public final <V> j<V> transform(f<? super T, V> fVar) {
        return new n(k.a(fVar.a(this.reference), "the Function passed to Optional.transform() must not return null."));
    }
}
