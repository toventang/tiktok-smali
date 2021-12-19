package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b.a.e;
import h.c.d;
import h.c.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.z;

public final class az<T> extends bc<T> implements e, d<T> {

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f159028c = AtomicReferenceFieldUpdater.newUpdater(az.class, Object.class, "_reusableCancellableContinuation");
    volatile Object _reusableCancellableContinuation;

    /* renamed from: a  reason: collision with root package name */
    public Object f159029a = ba.f159035a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f159030b;

    /* renamed from: d  reason: collision with root package name */
    public final ah f159031d;

    /* renamed from: e  reason: collision with root package name */
    public final d<T> f159032e;

    /* renamed from: i  reason: collision with root package name */
    private final e f159033i;

    static {
        Covode.recordClassIndex(105550);
    }

    @Override // h.c.d
    public final f getContext() {
        return this.f159032e.getContext();
    }

    @Override // h.c.b.a.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h.c.b.a.e
    public final e getCallerFrame() {
        return this.f159033i;
    }

    @Override // kotlinx.coroutines.bc
    public final d<T> i() {
        return this;
    }

    @Override // kotlinx.coroutines.bc
    public final Object d() {
        Object obj = this.f159029a;
        if (!ar.f159021a || obj != ba.f159035a) {
            this.f159029a = ba.f159035a;
            return obj;
        }
        throw new AssertionError();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f159031d + ", " + as.a(this.f159032e) + ']';
    }

    @Override // h.c.d
    public final void resumeWith(Object obj) {
        f context = this.f159032e.getContext();
        Object a2 = aa.a(obj);
        if (this.f159031d.isDispatchNeeded(context)) {
            this.f159029a = a2;
            this.f159038f = 0;
            this.f159031d.dispatch(context, this);
            return;
        }
        bl a3 = cw.a();
        if (a3.isUnconfinedLoopActive()) {
            this.f159029a = a2;
            this.f159038f = 0;
            a3.dispatchUnconfined(this);
            return;
        }
        a3.incrementUseCount(true);
        try {
            f context2 = getContext();
            Object a4 = z.a(context2, this.f159030b);
            try {
                this.f159032e.resumeWith(obj);
                do {
                } while (a3.processUnconfinedEvent());
            } finally {
                z.b(context2, a4);
            }
        } catch (Throwable th) {
            a(th, (Throwable) null);
        } finally {
            a3.decrementUseCount(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public az(ah ahVar, d<? super T> dVar) {
        super(0);
        this.f159031d = ahVar;
        this.f159032e = dVar;
        this.f159033i = (e) (!(dVar instanceof e) ? null : dVar);
        this.f159030b = z.a(getContext());
        this._reusableCancellableContinuation = null;
    }
}
