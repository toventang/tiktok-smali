package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicReference;

enum d implements b {
    DISPOSED;

    @Override // f.a.b.b
    public final void dispose() {
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return true;
    }

    static {
        Covode.recordClassIndex(13061);
    }

    static boolean a(AtomicReference<b> atomicReference) {
        b andSet;
        b bVar = atomicReference.get();
        d dVar = DISPOSED;
        if (bVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }
}
