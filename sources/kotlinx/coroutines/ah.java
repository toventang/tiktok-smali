package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b;
import h.c.d;
import h.c.e;
import h.c.f;
import h.c.g;
import h.f.b.l;
import h.w;

public abstract class ah extends h.c.a implements e {
    public static final a Key = new a((byte) 0);

    static {
        Covode.recordClassIndex(105518);
    }

    public abstract void dispatch(f fVar, Runnable runnable);

    public boolean isDispatchNeeded(f fVar) {
        return true;
    }

    public final ah plus(ah ahVar) {
        return ahVar;
    }

    public static final class a extends b<e, ah> {
        static {
            Covode.recordClassIndex(105519);
        }

        private a() {
            super(e.f158671b, AnonymousClass1.f159003a);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ah() {
        super(e.f158671b);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @Override // h.c.e
    public final <T> d<T> interceptContinuation(d<? super T> dVar) {
        return new az(this, dVar);
    }

    @Override // h.c.e
    public void releaseInterceptedContinuation(d<?> dVar) {
        if (dVar != null) {
            Object obj = ((az) dVar)._reusableCancellableContinuation;
            if (!(obj instanceof n)) {
                obj = null;
            }
            n nVar = (n) obj;
            if (nVar != null) {
                nVar.g();
                return;
            }
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // h.c.f.b, h.c.f, h.c.a
    public <E extends f.b> E get(f.c<E> cVar) {
        l.d(cVar, "");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (!bVar.a(getKey())) {
                return null;
            }
            E e2 = (E) bVar.a(this);
            if (!(e2 instanceof f.b)) {
                return null;
            }
            return e2;
        } else if (e.f158671b == cVar) {
            return this;
        } else {
            return null;
        }
    }

    @Override // h.c.f, h.c.a
    public f minusKey(f.c<?> cVar) {
        l.d(cVar, "");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (!bVar.a(getKey()) || bVar.a(this) == null) {
                return this;
            }
            return g.INSTANCE;
        } else if (e.f158671b == cVar) {
            return g.INSTANCE;
        } else {
            return this;
        }
    }

    public void dispatchYield(f fVar, Runnable runnable) {
        dispatch(fVar, runnable);
    }
}
