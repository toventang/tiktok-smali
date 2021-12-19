package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.a.b;
import h.z;

public final class p {
    static {
        Covode.recordClassIndex(105689);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> n<T> a(d<? super T> dVar) {
        if (!(dVar instanceof az)) {
            return new n<>(dVar, 0);
        }
        az azVar = (az) dVar;
        while (true) {
            Object obj = azVar._reusableCancellableContinuation;
            if (obj == null) {
                azVar._reusableCancellableContinuation = ba.f159036b;
                break;
            } else if (!(obj instanceof n)) {
                throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
            } else if (az.f159028c.compareAndSet(azVar, obj, ba.f159036b)) {
                n<T> nVar = (n) obj;
                if (nVar != null) {
                    if (!ar.f159021a || nVar._parentHandle != ck.f159094a) {
                        Object obj2 = nVar._state;
                        if (ar.f159021a && !(!(obj2 instanceof cl))) {
                            throw new AssertionError();
                        } else if (obj2 instanceof ab) {
                            nVar.g();
                        } else {
                            nVar._decision = 0;
                            nVar._state = b.f159034a;
                            return nVar;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
        return new n<>(dVar, 0);
    }

    public static final void a(m<?> mVar, bh bhVar) {
        mVar.a((b<? super Throwable, z>) new bi(bhVar));
    }
}
