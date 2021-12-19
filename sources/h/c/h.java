package h.c;

import com.bytedance.covode.number.Covode;
import h.c.b.a.e;
import h.f.b.l;
import h.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class h<T> implements e, d<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<h<?>, Object> f158674b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    /* renamed from: c  reason: collision with root package name */
    private static final a f158675c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f158676a;
    private volatile Object result;

    @Override // h.c.b.a.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    static final class a {
        static {
            Covode.recordClassIndex(105139);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // h.c.d
    public final f getContext() {
        return this.f158676a.getContext();
    }

    @Override // h.c.b.a.e
    public final e getCallerFrame() {
        d<T> dVar = this.f158676a;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    static {
        Covode.recordClassIndex(105138);
    }

    public final String toString() {
        return "SafeContinuation for " + this.f158676a;
    }

    public final Object a() {
        Object obj = this.result;
        if (obj == h.c.a.a.UNDECIDED) {
            if (f158674b.compareAndSet(this, h.c.a.a.UNDECIDED, h.c.a.a.COROUTINE_SUSPENDED)) {
                return h.c.a.a.COROUTINE_SUSPENDED;
            }
            obj = this.result;
        }
        if (obj == h.c.a.a.RESUMED) {
            return h.c.a.a.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof q.b)) {
            return obj;
        }
        throw ((q.b) obj).exception;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(d<? super T> dVar) {
        this(dVar, h.c.a.a.UNDECIDED);
        l.d(dVar, "");
    }

    @Override // h.c.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            if (obj2 == h.c.a.a.UNDECIDED) {
                if (f158674b.compareAndSet(this, h.c.a.a.UNDECIDED, obj)) {
                    return;
                }
            } else if (obj2 != h.c.a.a.COROUTINE_SUSPENDED) {
                throw new IllegalStateException("Already resumed");
            } else if (f158674b.compareAndSet(this, h.c.a.a.COROUTINE_SUSPENDED, h.c.a.a.RESUMED)) {
                this.f158676a.resumeWith(obj);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    private h(d<? super T> dVar, Object obj) {
        l.d(dVar, "");
        this.f158676a = dVar;
        this.result = obj;
    }
}
