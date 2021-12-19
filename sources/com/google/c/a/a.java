package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class a<T> extends j<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a<Object> f53675a = new a<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.c.a.j
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.c.a.j
    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.c.a.j
    public final boolean isPresent() {
        return false;
    }

    @Override // com.google.c.a.j
    public final T orNull() {
        return null;
    }

    @Override // com.google.c.a.j
    public final String toString() {
        return "Optional.absent()";
    }

    private a() {
    }

    private Object readResolve() {
        return f53675a;
    }

    @Override // com.google.c.a.j
    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.google.c.a.j
    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    static {
        Covode.recordClassIndex(33230);
    }

    @Override // com.google.c.a.j
    public final j<T> or(j<? extends T> jVar) {
        return (j) k.a(jVar);
    }

    @Override // com.google.c.a.j
    public final <V> j<V> transform(f<? super T, V> fVar) {
        k.a(fVar);
        return j.absent();
    }

    @Override // com.google.c.a.j
    public final T or(q<? extends T> qVar) {
        return (T) k.a(qVar.b(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.c.a.j
    public final T or(T t) {
        return (T) k.a(t, "use Optional.orNull() instead of Optional.or(null)");
    }
}
