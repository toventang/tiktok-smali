package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class eq extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f50824a;

    static {
        Covode.recordClassIndex(31765);
    }

    public final int hashCode() {
        return this.f50824a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            eq eqVar = (eq) obj;
            if (this.f50824a == eqVar.f50824a && get() == eqVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public eq(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f50824a = System.identityHashCode(th);
    }
}
