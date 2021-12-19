package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import h.j.h;
import h.z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.internal.aa;
import kotlinx.coroutines.internal.ab;
import kotlinx.coroutines.internal.n;

public abstract class EventLoopImplBase extends bm implements ax {
    private static final AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    private static final AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;

    static {
        Covode.recordClassIndex(105459);
    }

    public static abstract class c implements Comparable<c>, Runnable, bh, ab {

        /* renamed from: a  reason: collision with root package name */
        private Object f158931a;

        /* renamed from: b  reason: collision with root package name */
        public long f158932b;

        /* renamed from: c  reason: collision with root package name */
        private int f158933c = -1;

        static {
            Covode.recordClassIndex(105462);
        }

        @Override // kotlinx.coroutines.internal.ab
        public final int c() {
            return this.f158933c;
        }

        @Override // kotlinx.coroutines.internal.ab
        public final aa<?> b() {
            Object obj = this.f158931a;
            if (!(obj instanceof aa)) {
                obj = null;
            }
            return (aa) obj;
        }

        @Override // kotlinx.coroutines.bh
        public final synchronized void cJ_() {
            Object obj = this.f158931a;
            if (obj != bo.f159048a) {
                if (!(obj instanceof d)) {
                    obj = null;
                }
                d dVar = (d) obj;
                if (dVar != null) {
                    dVar.a(this);
                }
                this.f158931a = bo.f159048a;
            }
        }

        public String toString() {
            return "Delayed[nanos=" + this.f158932b + ']';
        }

        @Override // kotlinx.coroutines.internal.ab
        public final void a(int i2) {
            this.f158933c = i2;
        }

        public c(long j2) {
            this.f158932b = j2;
        }

        @Override // kotlinx.coroutines.internal.ab
        public final void a(aa<?> aaVar) {
            if (this.f158931a != bo.f159048a) {
                this.f158931a = aaVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(c cVar) {
            long j2 = this.f158932b - cVar.f158932b;
            if (j2 > 0) {
                return 1;
            }
            if (j2 < 0) {
                return -1;
            }
            return 0;
        }

        public final synchronized int a(long j2, d dVar, EventLoopImplBase eventLoopImplBase) {
            if (this.f158931a == bo.f159048a) {
                return 2;
            }
            synchronized (dVar) {
                c cVar = (c) dVar.d();
                if (eventLoopImplBase.isCompleted()) {
                    return 1;
                }
                if (cVar == null) {
                    dVar.f158934a = j2;
                } else {
                    long j3 = cVar.f158932b;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - dVar.f158934a > 0) {
                        dVar.f158934a = j2;
                    }
                }
                if (this.f158932b - dVar.f158934a < 0) {
                    this.f158932b = dVar.f158934a;
                }
                if (!ar.f159021a || b() == null) {
                    a(dVar);
                    T[] tArr = dVar.f159114b;
                    if (tArr == null) {
                        tArr = (T[]) new ab[4];
                        dVar.f159114b = tArr;
                    } else if (dVar._size >= tArr.length) {
                        Object[] copyOf = Arrays.copyOf(tArr, dVar._size * 2);
                        l.a((Object) copyOf, "");
                        dVar.f159114b = (T[]) ((ab[]) copyOf);
                        tArr = (T[]) ((ab[]) copyOf);
                    }
                    int i2 = dVar._size;
                    dVar._size = i2 + 1;
                    tArr[i2] = this;
                    a(i2);
                    dVar.b(i2);
                    return 0;
                }
                throw new AssertionError();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isCompleted() {
        /*
            r1 = this;
            int r0 = r1._isCompleted
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.isCompleted():boolean");
    }

    /* access modifiers changed from: package-private */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f158930a;

        static {
            Covode.recordClassIndex(105461);
        }

        public final void run() {
            this.f158930a.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.c
        public final String toString() {
            return super.toString() + this.f158930a.toString();
        }

        public b(long j2, Runnable runnable) {
            super(j2);
            this.f158930a = runnable;
        }
    }

    /* access modifiers changed from: protected */
    public final void resetAll() {
        this._queue = null;
        this._delayed = null;
    }

    final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private final m<z> f158929c;

        static {
            Covode.recordClassIndex(105460);
        }

        public final void run() {
            this.f158929c.a(EventLoopImplBase.this, z.f158842a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.c
        public final String toString() {
            return super.toString() + this.f158929c.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.m<? super h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, m<? super z> mVar) {
            super(j2);
            this.f158929c = mVar;
        }
    }

    private final void rescheduleAllDelayed() {
        long j2;
        c cVar;
        cx cxVar = cy.f159102a;
        if (cxVar != null) {
            j2 = cxVar.a();
        } else {
            j2 = System.nanoTime();
        }
        while (true) {
            aa aaVar = (aa) this._delayed;
            if (aaVar != null && (cVar = (c) aaVar.c()) != null) {
                reschedule(j2, cVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.bl
    public void shutdown() {
        cw.f159100a.set(null);
        setCompleted(true);
        closeQueue();
        do {
        } while (processNextEvent() <= 0);
        rescheduleAllDelayed();
    }

    private final Runnable dequeue() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                Object c2 = nVar.c();
                if (c2 != n.f159139a) {
                    return (Runnable) c2;
                }
                _queue$FU.compareAndSet(this, obj, nVar.d());
            } else if (obj == bo.f159049b) {
                return null;
            } else {
                if (_queue$FU.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.bl
    public boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        aa aaVar = (aa) this._delayed;
        if (aaVar != null && !aaVar.a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof n) {
            return ((n) obj).a();
        }
        if (obj == bo.f159049b) {
            return true;
        }
        return false;
    }

    private final void closeQueue() {
        if (!ar.f159021a || isCompleted()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (_queue$FU.compareAndSet(this, null, bo.f159049b)) {
                        return;
                    }
                } else if (obj instanceof n) {
                    ((n) obj).b();
                    return;
                } else if (obj != bo.f159049b) {
                    n nVar = new n(8, true);
                    nVar.a(obj);
                    if (_queue$FU.compareAndSet(this, obj, nVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.bl
    public long getNextTime() {
        c cVar;
        long nanoTime;
        if (super.getNextTime() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof n) {
                if (!((n) obj).a()) {
                    return 0;
                }
            } else if (obj == bo.f159049b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        aa aaVar = (aa) this._delayed;
        if (aaVar == null || (cVar = (c) aaVar.b()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = cVar.f158932b;
        cx cxVar = cy.f159102a;
        if (cxVar != null) {
            nanoTime = cxVar.a();
        } else {
            nanoTime = System.nanoTime();
        }
        return h.a(j2 - nanoTime, 0L);
    }

    @Override // kotlinx.coroutines.bl
    public long processNextEvent() {
        long j2;
        if (processUnconfinedEvent()) {
            return getNextTime();
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.a()) {
            cx cxVar = cy.f159102a;
            if (cxVar != null) {
                j2 = cxVar.a();
            } else {
                j2 = System.nanoTime();
            }
            while (true) {
                synchronized (dVar) {
                    ab d2 = dVar.d();
                    ab abVar = null;
                    if (d2 != null) {
                        c cVar = (c) d2;
                        if (j2 - cVar.f158932b >= 0 && enqueueImpl(cVar)) {
                            abVar = dVar.a(0);
                        }
                        if (abVar == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Runnable dequeue = dequeue();
        if (dequeue != null) {
            dequeue.run();
        }
        return getNextTime();
    }

    public final void setCompleted(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    public static final class d extends aa<c> {

        /* renamed from: a  reason: collision with root package name */
        public long f158934a;

        static {
            Covode.recordClassIndex(105463);
        }

        public d(long j2) {
            this.f158934a = j2;
        }
    }

    public final void enqueue(Runnable runnable) {
        EventLoopImplBase eventLoopImplBase = this;
        while (!eventLoopImplBase.enqueueImpl(runnable)) {
            eventLoopImplBase = at.f159025a;
        }
        eventLoopImplBase.unpark();
    }

    private final boolean shouldUnpark(c cVar) {
        ab abVar;
        aa aaVar = (aa) this._delayed;
        if (aaVar != null) {
            abVar = aaVar.b();
        } else {
            abVar = null;
        }
        if (abVar == cVar) {
            return true;
        }
        return false;
    }

    private final boolean enqueueImpl(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (_queue$FU.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof n) {
                n nVar = (n) obj;
                int a2 = nVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    _queue$FU.compareAndSet(this, obj, nVar.d());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == bo.f159049b) {
                return false;
            } else {
                n nVar2 = new n(8, true);
                nVar2.a(obj);
                nVar2.a(runnable);
                if (_queue$FU.compareAndSet(this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatch(f fVar, Runnable runnable) {
        enqueue(runnable);
    }

    @Override // kotlinx.coroutines.ax
    public bh invokeOnTimeout(long j2, Runnable runnable) {
        return ax.a.a(j2, runnable);
    }

    private final int scheduleImpl(long j2, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            _delayed$FU.compareAndSet(this, null, new d(j2));
            Object obj = this._delayed;
            if (obj == null) {
                l.a();
            }
            dVar = (d) obj;
        }
        return cVar.a(j2, dVar, this);
    }

    public Object delay(long j2, h.c.d<? super z> dVar) {
        if (j2 <= 0) {
            return z.f158842a;
        }
        n nVar = new n(h.c.a.b.a(dVar), 1);
        scheduleResumeAfterDelay(j2, nVar);
        Object e2 = nVar.e();
        if (e2 == h.c.a.a.COROUTINE_SUSPENDED) {
            l.d(dVar, "");
        }
        return e2;
    }

    public final void schedule(long j2, c cVar) {
        int scheduleImpl = scheduleImpl(j2, cVar);
        if (scheduleImpl != 0) {
            if (scheduleImpl == 1) {
                reschedule(j2, cVar);
            } else if (scheduleImpl != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (shouldUnpark(cVar)) {
            unpark();
        }
    }

    /* access modifiers changed from: protected */
    public final bh scheduleInvokeOnTimeout(long j2, Runnable runnable) {
        long nanoTime;
        long a2 = bo.a(j2);
        if (a2 >= 4611686018427387903L) {
            return ck.f159094a;
        }
        cx cxVar = cy.f159102a;
        if (cxVar != null) {
            nanoTime = cxVar.a();
        } else {
            nanoTime = System.nanoTime();
        }
        b bVar = new b(a2 + nanoTime, runnable);
        schedule(nanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.ax
    public void scheduleResumeAfterDelay(long j2, m<? super z> mVar) {
        long nanoTime;
        long a2 = bo.a(j2);
        if (a2 < 4611686018427387903L) {
            cx cxVar = cy.f159102a;
            if (cxVar != null) {
                nanoTime = cxVar.a();
            } else {
                nanoTime = System.nanoTime();
            }
            a aVar = new a(a2 + nanoTime, mVar);
            p.a(mVar, aVar);
            schedule(nanoTime, aVar);
        }
    }
}
