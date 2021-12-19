package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class bh<T> extends az<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final az<? super T> forwardOrder;

    static {
        Covode.recordClassIndex(33471);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.google.c.c.az<? super T>, com.google.c.c.az<S extends T> */
    @Override // com.google.c.c.az
    public final <S extends T> az<S> a() {
        return (az<? super T>) this.forwardOrder;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }

    bh(az<? super T> azVar) {
        this.forwardOrder = (az) k.a(azVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bh) {
            return this.forwardOrder.equals(((bh) obj).forwardOrder);
        }
        return false;
    }

    @Override // com.google.c.c.az, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }
}
