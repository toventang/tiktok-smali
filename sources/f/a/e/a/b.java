package f.a.e.a;

import com.bytedance.covode.number.Covode;
import f.a.c.e;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicReference;

public enum b implements f.a.b.b {
    DISPOSED;

    @Override // f.a.b.b
    public final void dispose() {
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return true;
    }

    public static void reportDisposableSet() {
        a.a(new e("Disposable already set!"));
    }

    static {
        Covode.recordClassIndex(104401);
    }

    public static boolean isDisposed(f.a.b.b bVar) {
        if (bVar == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean dispose(AtomicReference<f.a.b.b> atomicReference) {
        f.a.b.b andSet;
        f.a.b.b bVar = atomicReference.get();
        b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean replace(AtomicReference<f.a.b.b> atomicReference, f.a.b.b bVar) {
        f.a.b.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static boolean set(AtomicReference<f.a.b.b> atomicReference, f.a.b.b bVar) {
        f.a.b.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<f.a.b.b> atomicReference, f.a.b.b bVar) {
        f.a.e.b.b.a((Object) bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<f.a.b.b> atomicReference, f.a.b.b bVar) {
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean validate(f.a.b.b bVar, f.a.b.b bVar2) {
        if (bVar2 == null) {
            a.a(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }
}
