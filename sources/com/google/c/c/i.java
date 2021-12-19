package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

public abstract class i<T> extends br<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f54056a;

    static {
        Covode.recordClassIndex(33513);
    }

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    public final boolean hasNext() {
        if (this.f54056a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            try {
                T t = this.f54056a;
                this.f54056a = a(t);
                return t;
            } catch (Throwable th) {
                this.f54056a = a(this.f54056a);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public i(T t) {
        this.f54056a = t;
    }
}
