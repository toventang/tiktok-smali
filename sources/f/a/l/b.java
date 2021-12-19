package f.a.l;

import com.bytedance.covode.number.Covode;
import f.a.e.j.a;
import f.a.e.j.h;
import f.a.e.j.j;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class b<T> extends g<T> {

    /* renamed from: c  reason: collision with root package name */
    static final a[] f158018c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    static final a[] f158019d = new a[0];

    /* renamed from: j  reason: collision with root package name */
    private static final Object[] f158020j = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<Object> f158021a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<a<T>[]> f158022b;

    /* renamed from: e  reason: collision with root package name */
    final ReadWriteLock f158023e;

    /* renamed from: f  reason: collision with root package name */
    final Lock f158024f;

    /* renamed from: g  reason: collision with root package name */
    final Lock f158025g;

    /* renamed from: h  reason: collision with root package name */
    final AtomicReference<Throwable> f158026h;

    /* renamed from: i  reason: collision with root package name */
    long f158027i;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.b.b, a.AbstractC4175a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f158028a;

        /* renamed from: b  reason: collision with root package name */
        final b<T> f158029b;

        /* renamed from: c  reason: collision with root package name */
        boolean f158030c;

        /* renamed from: d  reason: collision with root package name */
        boolean f158031d;

        /* renamed from: e  reason: collision with root package name */
        f.a.e.j.a<Object> f158032e;

        /* renamed from: f  reason: collision with root package name */
        boolean f158033f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f158034g;

        /* renamed from: h  reason: collision with root package name */
        long f158035h;

        static {
            Covode.recordClassIndex(104920);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f158034g;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f158034g) {
                this.f158034g = true;
                this.f158029b.a((a) this);
            }
        }

        @Override // f.a.e.j.a.AbstractC4175a, f.a.d.k
        public final boolean a(Object obj) {
            if (this.f158034g || j.accept(obj, this.f158028a)) {
                return true;
            }
            return false;
        }

        a(z<? super T> zVar, b<T> bVar) {
            this.f158028a = zVar;
            this.f158029b = bVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
            r4.f158033f = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r5, long r6) {
            /*
                r4 = this;
                r3 = 9789(0x263d, float:1.3717E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                boolean r0 = r4.f158034g
                if (r0 == 0) goto L_0x000d
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            L_0x000d:
                boolean r0 = r4.f158033f
                if (r0 != 0) goto L_0x004a
                monitor-enter(r4)
                boolean r0 = r4.f158034g     // Catch:{ all -> 0x0042 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r4)     // Catch:{ all -> 0x0042 }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            L_0x001b:
                long r1 = r4.f158035h
                int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x0026
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            L_0x0026:
                boolean r0 = r4.f158031d
                if (r0 == 0) goto L_0x003d
                f.a.e.j.a<java.lang.Object> r0 = r4.f158032e
                if (r0 != 0) goto L_0x0035
                f.a.e.j.a r0 = new f.a.e.j.a
                r0.<init>()
                r4.f158032e = r0
            L_0x0035:
                r0.a(r5)
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            L_0x003d:
                r0 = 1
                r4.f158030c = r0
                monitor-exit(r4)
                goto L_0x0048
            L_0x0042:
                r0 = move-exception
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0048:
                r4.f158033f = r0
            L_0x004a:
                r4.a(r5)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.l.b.a.a(java.lang.Object, long):void");
        }
    }

    static {
        Covode.recordClassIndex(104919);
    }

    public final T i() {
        Object obj = this.f158021a.get();
        if (j.isComplete(obj) || j.isError(obj)) {
            return null;
        }
        return (T) j.getValue(obj);
    }

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f158023e = reentrantReadWriteLock;
        this.f158024f = reentrantReadWriteLock.readLock();
        this.f158025g = reentrantReadWriteLock.writeLock();
        this.f158022b = new AtomicReference<>(f158018c);
        this.f158021a = new AtomicReference<>();
        this.f158026h = new AtomicReference<>();
    }

    @Override // f.a.z
    public final void onComplete() {
        if (this.f158026h.compareAndSet(null, h.f157944a)) {
            Object complete = j.complete();
            for (a<T> aVar : c(complete)) {
                aVar.a(complete, this.f158027i);
            }
        }
    }

    public static <T> b<T> a(T t) {
        return new b<>(t);
    }

    private b(T t) {
        this();
        this.f158021a.lazySet(f.a.e.b.b.a((Object) t, "defaultValue is null"));
    }

    private a<T>[] c(Object obj) {
        AtomicReference<a<T>[]> atomicReference = this.f158022b;
        a<T>[] aVarArr = f158019d;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            d(obj);
        }
        return andSet;
    }

    @Override // f.a.z
    public final void onSubscribe(f.a.b.b bVar) {
        if (this.f158026h.get() != null) {
            bVar.dispose();
        }
    }

    private void d(Object obj) {
        this.f158025g.lock();
        this.f158027i++;
        this.f158021a.lazySet(obj);
        this.f158025g.unlock();
    }

    /* access modifiers changed from: package-private */
    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.f158022b.get();
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
                        aVarArr2 = f158018c;
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
        } while (!this.f158022b.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        f.a.e.b.b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f158026h.compareAndSet(null, th)) {
            f.a.h.a.a(th);
            return;
        }
        Object error = j.error(th);
        for (a<T> aVar : c(error)) {
            aVar.a(error, this.f158027i);
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        f.a.e.b.b.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f158026h.get() == null) {
            Object next = j.next(t);
            d(next);
            for (a<T> aVar : this.f158022b.get()) {
                aVar.a(next, this.f158027i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r1 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r4.a(r1) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r4.f158034g != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1 = r4.f158032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r1 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r4.f158031d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r4.f158032e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        r1.a((f.a.e.j.a.AbstractC4175a<? super java.lang.Object>) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00aa, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10904);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ad, code lost:
        throw r0;
     */
    @Override // f.a.t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(f.a.z<? super T> r9) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.l.b.a(f.a.z):void");
    }
}
