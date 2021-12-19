package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

/* access modifiers changed from: package-private */
public enum w implements d {
    CANCELLED;

    @Override // org.a.d
    public final void cancel() {
    }

    @Override // org.a.d
    public final void request(long j2) {
    }

    static {
        Covode.recordClassIndex(13087);
    }

    static boolean a(AtomicReference<d> atomicReference) {
        d andSet;
        d dVar = atomicReference.get();
        w wVar = CANCELLED;
        if (dVar == wVar || (andSet = atomicReference.getAndSet(wVar)) == wVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }
}
