package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class ba extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f53125a;

    static {
        Covode.recordClassIndex(32809);
    }

    public ba(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f53125a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            ba baVar = (ba) obj;
            return this.f53125a == baVar.f53125a && get() == baVar.get();
        }
    }

    public final int hashCode() {
        return this.f53125a;
    }
}
