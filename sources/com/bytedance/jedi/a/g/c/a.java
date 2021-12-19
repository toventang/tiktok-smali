package com.bytedance.jedi.a.g.c;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class a<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f39251a;

    static {
        Covode.recordClassIndex(24053);
    }

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    public final boolean hasNext() {
        if (this.f39251a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            try {
                T t = this.f39251a;
                this.f39251a = a(t);
                return t;
            } catch (Throwable th) {
                this.f39251a = a(this.f39251a);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public a(T t) {
        this.f39251a = t;
    }
}
