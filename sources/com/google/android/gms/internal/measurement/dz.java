package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

final class dz extends el<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f50796a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Object f50797b;

    static {
        Covode.recordClassIndex(31746);
    }

    public final boolean hasNext() {
        if (!this.f50796a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f50796a) {
            this.f50796a = true;
            return (T) this.f50797b;
        }
        throw new NoSuchElementException();
    }

    dz(Object obj) {
        this.f50797b = obj;
    }
}
