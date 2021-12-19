package f.a.e.i;

import com.bytedance.covode.number.Covode;
import f.a.c.e;
import f.a.e.b.b;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public enum f implements d {
    CANCELLED;

    @Override // org.a.d
    public final void cancel() {
    }

    @Override // org.a.d
    public final void request(long j2) {
    }

    public static void reportSubscriptionSet() {
        a.a(new e("Subscription already set!"));
    }

    static {
        Covode.recordClassIndex(104858);
    }

    public static boolean cancel(AtomicReference<d> atomicReference) {
        d andSet;
        d dVar = atomicReference.get();
        f fVar = CANCELLED;
        if (dVar == fVar || (andSet = atomicReference.getAndSet(fVar)) == fVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void reportMoreProduced(long j2) {
        a.a(new e("More produced than requested: ".concat(String.valueOf(j2))));
    }

    public static boolean validate(long j2) {
        if (j2 > 0) {
            return true;
        }
        a.a(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j2))));
        return false;
    }

    public static boolean replace(AtomicReference<d> atomicReference, d dVar) {
        d dVar2;
        do {
            dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        return true;
    }

    public static boolean set(AtomicReference<d> atomicReference, d dVar) {
        d dVar2;
        do {
            dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        if (dVar2 == null) {
            return true;
        }
        dVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<d> atomicReference, d dVar) {
        b.a((Object) dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(d dVar, d dVar2) {
        if (dVar2 == null) {
            a.a(new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static boolean setOnce(AtomicReference<d> atomicReference, d dVar, long j2) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j2);
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<d> atomicReference, AtomicLong atomicLong, d dVar) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        dVar.request(andSet);
        return true;
    }

    public static void deferredRequest(AtomicReference<d> atomicReference, AtomicLong atomicLong, long j2) {
        d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j2);
        } else if (validate(j2)) {
            f.a.e.j.d.a(atomicLong, j2);
            d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }
}
