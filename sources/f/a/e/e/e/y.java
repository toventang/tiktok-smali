package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.g;
import f.a.e.c.d;
import f.a.e.c.h;
import f.a.e.c.i;
import f.a.e.j.c;
import f.a.x;
import f.a.z;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class y<T, U> extends a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends x<? extends U>> f157744b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f157745c;

    /* renamed from: d  reason: collision with root package name */
    final int f157746d;

    /* renamed from: e  reason: collision with root package name */
    final int f157747e;

    static {
        Covode.recordClassIndex(104754);
    }

    static final class b<T, U> extends AtomicInteger implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        static final a<?, ?>[] f157748a = new a[0];

        /* renamed from: b  reason: collision with root package name */
        static final a<?, ?>[] f157749b = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final z<? super U> downstream;
        final c errors = new c();
        long lastId;
        int lastIndex;
        final g<? super T, ? extends x<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<a<?, ?>[]> observers;
        volatile h<U> queue;
        Queue<x<? extends U>> sources;
        long uniqueId;
        f.a.b.b upstream;
        int wip;

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled;
        }

        static {
            Covode.recordClassIndex(104756);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            Throwable terminate;
            if (!this.cancelled) {
                this.cancelled = true;
                if (c() && (terminate = this.errors.terminate()) != null && terminate != f.a.e.j.h.f157944a) {
                    f.a.h.a.a(terminate);
                }
            }
        }

        private boolean d() {
            if (this.cancelled) {
                return true;
            }
            Object obj = this.errors.get();
            if (this.delayErrors || obj == null) {
                return false;
            }
            c();
            Throwable terminate = this.errors.terminate();
            if (terminate != f.a.e.j.h.f157944a) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            a<?, ?>[] andSet;
            this.upstream.dispose();
            a<?, ?>[] aVarArr = this.observers.get();
            a<?, ?>[] aVarArr2 = f157749b;
            if (aVarArr == aVarArr2 || (andSet = this.observers.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                f.a.e.a.b.dispose(aVar);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x012d, code lost:
            r10 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0147, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0149, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(11951);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x014c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
            if (r8 != 0) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00db, code lost:
            if (r7 == r8) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fd, code lost:
            if (r7 == r8) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x00ff, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0100, code lost:
            r4 = r4 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0102, code lost:
            if (r4 >= r8) goto L_0x0105;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0105, code lost:
            r14.lastIndex = r7;
            r14.lastId = r9[r7].id;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x010d, code lost:
            if (r10 == 0) goto L_0x012f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0111, code lost:
            if (r14.maxConcurrency == Integer.MAX_VALUE) goto L_0x0009;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0113, code lost:
            r1 = r10 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0115, code lost:
            if (r10 == 0) goto L_0x0009;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0117, code lost:
            monitor-enter(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            r0 = r14.sources.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0120, code lost:
            if (r0 != null) goto L_0x0129;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0122, code lost:
            r14.wip--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0127, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0129, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x012a, code lost:
            a(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
            // Method dump skipped, instructions count: 333
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.y.b.b():void");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
            } else if (this.errors.addThrowable(th)) {
                this.done = true;
                a();
            } else {
                f.a.h.a.a(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<f.a.e.e.e.y$a<?, ?>[]> */
        /* JADX WARN: Multi-variable type inference failed */
        private boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.observers.get();
                if (aVarArr == f157749b) {
                    f.a.e.a.b.dispose(aVar);
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.observers.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        private void b(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.observers.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i2 = 0;
                    while (aVarArr[i2] != aVar) {
                        i2++;
                        if (i2 >= length) {
                            return;
                        }
                    }
                    if (i2 >= 0) {
                        if (length == 1) {
                            aVarArr2 = f157748a;
                        } else {
                            aVarArr2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                            System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(aVarArr, aVarArr2));
        }

        private void a(x<? extends U> xVar) {
            boolean z;
            MethodCollector.i(11949);
            do {
                if (!(xVar instanceof Callable)) {
                    long j2 = this.uniqueId;
                    this.uniqueId = 1 + j2;
                    a<T, U> aVar = new a<>(this, j2);
                    if (a(aVar)) {
                        xVar.b(aVar);
                    }
                } else if (a((Callable) xVar) && this.maxConcurrency != Integer.MAX_VALUE) {
                    z = false;
                    synchronized (this) {
                        try {
                            xVar = this.sources.poll();
                            if (xVar == null) {
                                this.wip--;
                                z = true;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(11949);
                            throw th;
                        }
                    }
                }
                MethodCollector.o(11949);
                return;
            } while (!z);
            a();
            MethodCollector.o(11949);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            MethodCollector.i(11947);
            if (this.done) {
                MethodCollector.o(11947);
                return;
            }
            try {
                x<? extends U> xVar = (x) f.a.e.b.b.a(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i2 = this.wip;
                            if (i2 == this.maxConcurrency) {
                                this.sources.offer(xVar);
                                return;
                            }
                            this.wip = i2 + 1;
                        } finally {
                            MethodCollector.o(11947);
                        }
                    }
                }
                a(xVar);
                MethodCollector.o(11947);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.upstream.dispose();
                onError(th);
                MethodCollector.o(11947);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [f.a.e.c.h] */
        private boolean a(Callable<? extends U> callable) {
            h<U> hVar;
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    h<U> hVar2 = this.queue;
                    h<U> hVar3 = hVar2;
                    if (hVar2 == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            hVar = new f.a.e.f.c(this.bufferSize);
                        } else {
                            hVar = new f.a.e.f.b(this.maxConcurrency);
                        }
                        this.queue = hVar;
                        hVar3 = hVar;
                    }
                    if (!hVar3.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                b();
                return true;
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.errors.addThrowable(th);
                a();
                return true;
            }
        }

        b(z<? super U> zVar, g<? super T, ? extends x<? extends U>> gVar, boolean z, int i2, int i3) {
            this.downstream = zVar;
            this.mapper = gVar;
            this.delayErrors = z;
            this.maxConcurrency = i2;
            this.bufferSize = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i2);
            }
            this.observers = new AtomicReference<>(f157748a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, U> extends AtomicReference<f.a.b.b> implements z<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final b<T, U> parent;
        volatile i<U> queue;

        static {
            Covode.recordClassIndex(104755);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.done = true;
            this.parent.a();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.parent.errors.addThrowable(th)) {
                if (!this.parent.delayErrors) {
                    this.parent.c();
                }
                this.done = true;
                this.parent.a();
                return;
            }
            f.a.h.a.a(th);
        }

        @Override // f.a.z
        public final void onNext(U u) {
            if (this.fusionMode == 0) {
                b<T, U> bVar = this.parent;
                if (bVar.get() != 0 || !bVar.compareAndSet(0, 1)) {
                    i iVar = this.queue;
                    if (iVar == null) {
                        iVar = new f.a.e.f.c(bVar.bufferSize);
                        this.queue = iVar;
                    }
                    iVar.offer(u);
                    if (bVar.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    bVar.downstream.onNext(u);
                    if (bVar.decrementAndGet() == 0) {
                        return;
                    }
                }
                bVar.b();
                return;
            }
            this.parent.a();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar) && (bVar instanceof d)) {
                d dVar = (d) bVar;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.a();
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                }
            }
        }

        a(b<T, U> bVar, long j2) {
            this.id = j2;
            this.parent = bVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super U> zVar) {
        if (!ay.a(this.f157412a, zVar, this.f157744b)) {
            this.f157412a.b(new b(zVar, this.f157744b, this.f157745c, this.f157746d, this.f157747e));
        }
    }

    public y(x<T> xVar, g<? super T, ? extends x<? extends U>> gVar, boolean z, int i2, int i3) {
        super(xVar);
        this.f157744b = gVar;
        this.f157745c = z;
        this.f157746d = i2;
        this.f157747e = i3;
    }
}
