package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class m extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f50614a;

    static {
        Covode.recordClassIndex(31589);
    }

    public final int hashCode() {
        return this.f50614a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            m mVar = (m) obj;
            if (this.f50614a == mVar.f50614a && get() == mVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public m(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f50614a = System.identityHashCode(th);
    }
}
