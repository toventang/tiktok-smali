package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Set;

public abstract class v<E> extends t<E> implements Set<E> {
    static {
        Covode.recordClassIndex(33538);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Set<E> c();

    public int hashCode() {
        return c().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this || c().equals(obj)) {
            return true;
        }
        return false;
    }
}
