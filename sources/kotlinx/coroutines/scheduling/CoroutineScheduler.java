package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import h.j.h;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;

public final class CoroutineScheduler implements Closeable, Executor {
    public static final a Companion = new a((byte) 0);
    public static final v NOT_IN_STACK = new v("NOT_IN_STACK");
    private static final AtomicIntegerFieldUpdater _isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    static final AtomicLongFieldUpdater controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    private static final AtomicLongFieldUpdater parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    private volatile int _isTerminated;
    volatile long controlState;
    public final int corePoolSize;
    public final d globalBlockingQueue;
    public final d globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack;
    public final String schedulerName;
    public final AtomicReferenceArray<b> workers;

    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        static {
            Covode.recordClassIndex(105696);
        }
    }

    private final int blockingTasks(long j2) {
        return (int) ((j2 & 4398044413952L) >> 21);
    }

    public final int availableCpuPermits(long j2) {
        return (int) ((j2 & 9223367638808264704L) >> 42);
    }

    public final int createdWorkers(long j2) {
        return (int) (j2 & 2097151);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105694);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isTerminated() {
        /*
            r1 = this;
            int r0 = r1._isTerminated
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.isTerminated():boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown(10000);
    }

    public final int getCreatedWorkers() {
        return (int) (this.controlState & 2097151);
    }

    public final class b extends Thread {

        /* renamed from: c  reason: collision with root package name */
        static final AtomicIntegerFieldUpdater f159177c = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final m f159178a;

        /* renamed from: b  reason: collision with root package name */
        public c f159179b;

        /* renamed from: d  reason: collision with root package name */
        public boolean f159180d;

        /* renamed from: f  reason: collision with root package name */
        private long f159182f;

        /* renamed from: g  reason: collision with root package name */
        private long f159183g;

        /* renamed from: h  reason: collision with root package name */
        private int f159184h;
        public volatile int indexInArray;
        public volatile Object nextParkedWorker;
        volatile int workerCtl;

        static {
            Covode.recordClassIndex(105695);
        }

        private final boolean c() {
            if (this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK) {
                return true;
            }
            return false;
        }

        private final h d() {
            if (b(2) == 0) {
                h hVar = (h) CoroutineScheduler.this.globalCpuQueue.c();
                if (hVar != null) {
                    return hVar;
                }
                return (h) CoroutineScheduler.this.globalBlockingQueue.c();
            }
            h hVar2 = (h) CoroutineScheduler.this.globalBlockingQueue.c();
            if (hVar2 != null) {
                return hVar2;
            }
            return (h) CoroutineScheduler.this.globalCpuQueue.c();
        }

        private final boolean a() {
            long j2;
            if (this.f159179b == c.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            do {
                j2 = coroutineScheduler.controlState;
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L));
            this.f159179b = c.CPU_ACQUIRED;
            return true;
        }

        private final void b() {
            if (!c()) {
                CoroutineScheduler.this.parkedWorkersStackPush$kotlinx_coroutines_core(this);
            } else if (!ar.f159021a || this.f159178a.a() == 0) {
                this.workerCtl = -1;
                while (c() && !CoroutineScheduler.this.isTerminated() && this.f159179b != c.TERMINATED) {
                    a(c.PARKING);
                    Thread.interrupted();
                    if (this.f159182f == 0) {
                        this.f159182f = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
                    }
                    LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
                    if (System.nanoTime() - this.f159182f >= 0) {
                        this.f159182f = 0;
                        synchronized (CoroutineScheduler.this.workers) {
                            if (!CoroutineScheduler.this.isTerminated()) {
                                if (CoroutineScheduler.this.getCreatedWorkers() > CoroutineScheduler.this.corePoolSize) {
                                    if (f159177c.compareAndSet(this, -1, 1)) {
                                        int i2 = this.indexInArray;
                                        a(0);
                                        CoroutineScheduler.this.parkedWorkersStackTopUpdate$kotlinx_coroutines_core(this, i2, 0);
                                        int andDecrement = (int) (CoroutineScheduler.controlState$FU.getAndDecrement(CoroutineScheduler.this) & 2097151);
                                        if (andDecrement != i2) {
                                            b bVar = CoroutineScheduler.this.workers.get(andDecrement);
                                            if (bVar == null) {
                                                l.a();
                                            }
                                            b bVar2 = bVar;
                                            CoroutineScheduler.this.workers.set(i2, bVar2);
                                            bVar2.a(i2);
                                            CoroutineScheduler.this.parkedWorkersStackTopUpdate$kotlinx_coroutines_core(bVar2, andDecrement, i2);
                                        }
                                        CoroutineScheduler.this.workers.set(andDecrement, null);
                                        this.f159179b = c.TERMINATED;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        public final void run() {
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f159179b != c.TERMINATED) {
                    h a2 = a(this.f159180d);
                    if (a2 != null) {
                        this.f159183g = 0;
                        int c2 = a2.f159203h.c();
                        this.f159182f = 0;
                        if (this.f159179b == c.PARKING) {
                            if (!ar.f159021a || c2 == 1) {
                                this.f159179b = c.BLOCKING;
                            } else {
                                throw new AssertionError();
                            }
                        }
                        if (c2 != 0 && a(c.BLOCKING)) {
                            CoroutineScheduler.this.signalCpuWork$kotlinx_coroutines_core();
                        }
                        CoroutineScheduler.this.runSafely(a2);
                        if (c2 != 0) {
                            CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, -2097152);
                            c cVar = this.f159179b;
                            if (cVar == c.TERMINATED) {
                                continue;
                            } else if (!ar.f159021a || cVar == c.BLOCKING) {
                                this.f159179b = c.DORMANT;
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        this.f159180d = false;
                        if (this.f159183g == 0) {
                            b();
                        } else if (!z) {
                            z = true;
                        } else {
                            a(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f159183g);
                            this.f159183g = 0;
                        }
                    }
                }
            }
            a(c.TERMINATED);
        }

        private int b(int i2) {
            int i3 = this.f159184h;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f159184h = i6;
            int i7 = i2 - 1;
            if ((i7 & i2) == 0) {
                return i6 & i7;
            }
            return (i6 & Integer.MAX_VALUE) % i2;
        }

        public final boolean a(c cVar) {
            boolean z;
            c cVar2 = this.f159179b;
            if (cVar2 == c.CPU_ACQUIRED) {
                z = true;
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, 4398046511104L);
            } else {
                z = false;
            }
            if (cVar2 != cVar) {
                this.f159179b = cVar;
            }
            return z;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        private b() {
            setDaemon(true);
            this.f159178a = new m();
            this.f159179b = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            this.f159184h = h.i.c.Default.nextInt();
        }

        private void a(int i2) {
            String valueOf;
            StringBuilder append = new StringBuilder().append(CoroutineScheduler.this.schedulerName).append("-worker-");
            if (i2 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i2);
            }
            setName(append.append(valueOf).toString());
            this.indexInArray = i2;
        }

        private final h b(boolean z) {
            boolean z2;
            h d2;
            if (z) {
                if (b(CoroutineScheduler.this.corePoolSize * 2) == 0) {
                    z2 = true;
                    h d3 = d();
                    if (d3 != null) {
                        return d3;
                    }
                } else {
                    z2 = false;
                }
                h b2 = this.f159178a.b();
                if (b2 != null) {
                    return b2;
                }
                if (!z2 && (d2 = d()) != null) {
                    return d2;
                }
            } else {
                h d4 = d();
                if (d4 != null) {
                    return d4;
                }
            }
            return c(false);
        }

        private final h c(boolean z) {
            long a2;
            if (!ar.f159021a || this.f159178a.a() == 0) {
                int createdWorkers = CoroutineScheduler.this.getCreatedWorkers();
                if (createdWorkers < 2) {
                    return null;
                }
                int b2 = b(createdWorkers);
                long j2 = Long.MAX_VALUE;
                for (int i2 = 0; i2 < createdWorkers; i2++) {
                    b2++;
                    if (b2 > createdWorkers) {
                        b2 = 1;
                    }
                    b bVar = CoroutineScheduler.this.workers.get(b2);
                    if (!(bVar == null || bVar == this)) {
                        if (!ar.f159021a || this.f159178a.a() == 0) {
                            if (z) {
                                a2 = this.f159178a.b(bVar.f159178a);
                            } else {
                                a2 = this.f159178a.a(bVar.f159178a);
                            }
                            if (a2 == -1) {
                                return this.f159178a.b();
                            }
                            if (a2 > 0) {
                                j2 = Math.min(j2, a2);
                            }
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                if (j2 == Long.MAX_VALUE) {
                    j2 = 0;
                }
                this.f159183g = j2;
                return null;
            }
            throw new AssertionError();
        }

        public final h a(boolean z) {
            h b2;
            if (a()) {
                return b(z);
            }
            if (z && (b2 = this.f159178a.b()) != null) {
                return b2;
            }
            h hVar = (h) CoroutineScheduler.this.globalBlockingQueue.c();
            if (hVar == null) {
                return c(true);
            }
            return hVar;
        }

        public b(CoroutineScheduler coroutineScheduler, int i2) {
            this();
            a(i2);
        }
    }

    private final int getAvailableCpuPermits() {
        return (int) ((this.controlState & 9223367638808264704L) >> 42);
    }

    private final long incrementBlockingTasks() {
        return controlState$FU.addAndGet(this, 2097152);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    public final void decrementBlockingTasks() {
        controlState$FU.addAndGet(this, -2097152);
    }

    public final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    public final long releaseCpuPermit() {
        return controlState$FU.addAndGet(this, 4398046511104L);
    }

    private final b currentWorker() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof b)) {
            currentThread = null;
        }
        b bVar = (b) currentThread;
        if (bVar == null || !l.a(CoroutineScheduler.this, this)) {
            return null;
        }
        return bVar;
    }

    private final boolean tryUnpark() {
        b parkedWorkersStackPop;
        do {
            parkedWorkersStackPop = parkedWorkersStackPop();
            if (parkedWorkersStackPop == null) {
                return false;
            }
        } while (!b.f159177c.compareAndSet(parkedWorkersStackPop, -1, 0));
        LockSupport.unpark(parkedWorkersStackPop);
        return true;
    }

    public final void signalCpuWork$kotlinx_coroutines_core() {
        if (!tryUnpark() && !tryCreateWorker$default(this, 0, 1, null)) {
            tryUnpark();
        }
    }

    static {
        Covode.recordClassIndex(105693);
    }

    private final b parkedWorkersStackPop() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.workers.get((int) (2097151 & j2));
            if (bVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & -2097152;
            int parkedWorkersStackNextIndex = parkedWorkersStackNextIndex(bVar);
            if (parkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j2, ((long) parkedWorkersStackNextIndex) | j3)) {
                bVar.nextParkedWorker = NOT_IN_STACK;
                return bVar;
            }
        }
    }

    public final boolean tryAcquireCpuPermit() {
        long j2;
        do {
            j2 = this.controlState;
            if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                return false;
            }
        } while (!controlState$FU.compareAndSet(this, j2, j2 - 4398046511104L));
        return true;
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int b2 = h.b(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (b2 >= this.corePoolSize) {
                return 0;
            }
            if (i2 >= this.maxPoolSize) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.workers.get(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            b bVar = new b(this, i3);
            this.workers.set(i3, bVar);
            if (i3 == ((int) (2097151 & controlState$FU.incrementAndGet(this)))) {
                bVar.start();
                return b2 + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.workers.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            b bVar = this.workers.get(i7);
            if (bVar != null) {
                int a2 = bVar.f159178a.a();
                int i8 = a.f159186a[bVar.f159179b.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    arrayList.add(String.valueOf(a2) + "b");
                } else if (i8 == 3) {
                    i2++;
                    arrayList.add(String.valueOf(a2) + "c");
                } else if (i8 == 4) {
                    i5++;
                    if (a2 > 0) {
                        arrayList.add(String.valueOf(a2) + "d");
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        return this.schedulerName + '@' + Integer.toHexString(System.identityHashCode(this)) + '[' + "Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.a() + ", global blocking queue size = " + this.globalBlockingQueue.a() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final void execute(Runnable runnable) {
        dispatch$default(this, runnable, null, false, 6, null);
    }

    private final boolean addToGlobalQueue(h hVar) {
        if (hVar.f159203h.c() == 1) {
            return this.globalBlockingQueue.a(hVar);
        }
        return this.globalCpuQueue.a(hVar);
    }

    private final int parkedWorkersStackNextIndex(b bVar) {
        Object obj = bVar.nextParkedWorker;
        while (obj != NOT_IN_STACK) {
            if (obj == null) {
                return 0;
            }
            b bVar2 = (b) obj;
            int i2 = bVar2.indexInArray;
            if (i2 != 0) {
                return i2;
            }
            obj = bVar2.nextParkedWorker;
        }
        return -1;
    }

    private final void signalBlockingWork(boolean z) {
        long addAndGet = controlState$FU.addAndGet(this, 2097152);
        if (!z && !tryUnpark() && !tryCreateWorker(addAndGet)) {
            tryUnpark();
        }
    }

    public final void runSafely(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final boolean tryCreateWorker(long j2) {
        if (h.b(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int createNewWorker = createNewWorker();
            if (createNewWorker == 1) {
                if (this.corePoolSize > 1) {
                    createNewWorker();
                }
            } else if (createNewWorker > 0) {
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean parkedWorkersStackPush$kotlinx_coroutines_core(b bVar) {
        long j2;
        long j3;
        int i2;
        if (bVar.nextParkedWorker != NOT_IN_STACK) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & -2097152;
            i2 = bVar.indexInArray;
            if (!ar.f159021a || i2 != 0) {
                bVar.nextParkedWorker = this.workers.get(i3);
            } else {
                throw new AssertionError();
            }
        } while (!parkedWorkersStack$FU.compareAndSet(this, j2, ((long) i2) | j3));
        return true;
    }

    public final void shutdown(long j2) {
        int i2;
        h hVar;
        if (_isTerminated$FU.compareAndSet(this, 0, 1)) {
            b currentWorker = currentWorker();
            synchronized (this.workers) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (i2 > 0) {
                int i3 = 1;
                while (true) {
                    b bVar = this.workers.get(i3);
                    if (bVar == null) {
                        l.a();
                    }
                    b bVar2 = bVar;
                    if (bVar2 != currentWorker) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(j2);
                        }
                        c cVar = bVar2.f159179b;
                        if (!ar.f159021a || cVar == c.TERMINATED) {
                            bVar2.f159178a.a(this.globalBlockingQueue);
                        } else {
                            throw new AssertionError();
                        }
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (currentWorker != null) {
                    hVar = currentWorker.a(true);
                    if (hVar != null) {
                        continue;
                        runSafely(hVar);
                    }
                }
                hVar = (h) this.globalCpuQueue.c();
                if (hVar == null && (hVar = (h) this.globalBlockingQueue.c()) == null) {
                    break;
                }
                runSafely(hVar);
            }
            if (currentWorker != null) {
                currentWorker.a(c.TERMINATED);
            }
            if (!ar.f159021a || ((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.corePoolSize) {
                this.parkedWorkersStack = 0;
                this.controlState = 0;
                return;
            }
            throw new AssertionError();
        }
    }

    public final h createTask$kotlinx_coroutines_core(Runnable runnable, i iVar) {
        long a2 = k.f159210f.a();
        if (!(runnable instanceof h)) {
            return new j(runnable, a2, iVar);
        }
        h hVar = (h) runnable;
        hVar.f159202g = a2;
        hVar.f159203h = iVar;
        return hVar;
    }

    private final h submitToLocalQueue(b bVar, h hVar, boolean z) {
        if (bVar == null || bVar.f159179b == c.TERMINATED) {
            return hVar;
        }
        if (hVar.f159203h.c() == 0 && bVar.f159179b == c.BLOCKING) {
            return hVar;
        }
        bVar.f159180d = true;
        return bVar.f159178a.a(hVar, z);
    }

    public final void parkedWorkersStackTopUpdate$kotlinx_coroutines_core(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                if (i3 == 0) {
                    i4 = parkedWorkersStackNextIndex(bVar);
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0 && parkedWorkersStack$FU.compareAndSet(this, j2, j3 | ((long) i4))) {
                return;
            }
        }
    }

    public final void dispatch(Runnable runnable, i iVar, boolean z) {
        boolean z2;
        h createTask$kotlinx_coroutines_core = createTask$kotlinx_coroutines_core(runnable, iVar);
        b currentWorker = currentWorker();
        h submitToLocalQueue = submitToLocalQueue(currentWorker, createTask$kotlinx_coroutines_core, z);
        if (submitToLocalQueue == null || addToGlobalQueue(submitToLocalQueue)) {
            if (!z || currentWorker == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (createTask$kotlinx_coroutines_core.f159203h.c() != 0) {
                signalBlockingWork(z2);
            } else if (!z2) {
                signalCpuWork$kotlinx_coroutines_core();
            }
        } else {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
    }

    static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = coroutineScheduler.controlState;
        }
        return coroutineScheduler.tryCreateWorker(j2);
    }

    public CoroutineScheduler(int i2, int i3, long j2, String str) {
        boolean z;
        this.corePoolSize = i2;
        this.maxPoolSize = i3;
        this.idleWorkerKeepAliveNs = j2;
        this.schedulerName = str;
        if (i2 > 0) {
            if (i3 >= i2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
            } else if (i3 > 2097150) {
                throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
            } else if (j2 > 0) {
                this.globalCpuQueue = new d();
                this.globalBlockingQueue = new d();
                this.parkedWorkersStack = 0;
                this.workers = new AtomicReferenceArray<>(i3 + 1);
                this.controlState = ((long) i2) << 42;
                this._isTerminated = 0;
            } else {
                throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
            }
        } else {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, i iVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = g.f159200a;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        coroutineScheduler.dispatch(runnable, iVar, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutineScheduler(int i2, int i3, long j2, String str, int i4, g gVar) {
        this(i2, i3, (i4 & 4) != 0 ? k.f159209e : j2, (i4 & 8) != 0 ? "DefaultDispatcher" : str);
    }
}
