package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.x;
import f.a.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class af<T, K, V> extends a<T, f.a.f.b<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends K> f157431b;

    /* renamed from: c  reason: collision with root package name */
    final g<? super T, ? extends V> f157432c;

    /* renamed from: d  reason: collision with root package name */
    final int f157433d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f157434e = false;

    static {
        Covode.recordClassIndex(104605);
    }

    public static final class a<T, K, V> extends AtomicInteger implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        static final Object f157435a = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        final z<? super f.a.f.b<K, V>> downstream;
        final Map<Object, b<K, V>> groups;
        final g<? super T, ? extends K> keySelector;
        f.a.b.b upstream;
        final g<? super T, ? extends V> valueSelector;

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        static {
            Covode.recordClassIndex(104606);
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            ArrayList<b> arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            for (b bVar : arrayList) {
                c<T, K> cVar = bVar.f157436a;
                cVar.done = true;
                cVar.a();
            }
            this.downstream.onComplete();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void cancel(K k2) {
            if (k2 == null) {
                k2 = (K) f157435a;
            }
            this.groups.remove(k2);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            ArrayList<b> arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            for (b bVar : arrayList) {
                c<T, K> cVar = bVar.f157436a;
                cVar.error = th;
                cVar.done = true;
                cVar.a();
            }
            this.downstream.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: f.a.e.f.c<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.z
        public final void onNext(T t) {
            Object obj;
            try {
                Object apply = this.keySelector.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f157435a;
                }
                b<K, V> bVar = this.groups.get(obj);
                if (bVar == null) {
                    if (!this.cancelled.get()) {
                        bVar = new b<>(apply, new c(this.bufferSize, this, apply, this.delayError));
                        this.groups.put(obj, bVar);
                        getAndIncrement();
                        this.downstream.onNext(bVar);
                    } else {
                        return;
                    }
                }
                try {
                    Object a2 = f.a.e.b.b.a(this.valueSelector.apply(t), "The value supplied is null");
                    c<T, K> cVar = bVar.f157436a;
                    cVar.queue.offer(a2);
                    cVar.a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    this.upstream.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        public a(z<? super f.a.f.b<K, V>> zVar, g<? super T, ? extends K> gVar, g<? super T, ? extends V> gVar2, int i2, boolean z) {
            this.downstream = zVar;
            this.keySelector = gVar;
            this.valueSelector = gVar2;
            this.bufferSize = i2;
            this.delayError = z;
            this.groups = new ConcurrentHashMap();
            lazySet(1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, K> extends AtomicInteger implements f.a.b.b, x<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final AtomicReference<z<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final AtomicBoolean once = new AtomicBoolean();
        final a<?, K, T> parent;
        final f.a.e.f.c<T> queue;

        static {
            Covode.recordClassIndex(104608);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                this.parent.cancel(this.key);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (r1 != false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r4.onNext(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
            r3 = addAndGet(-r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            if (r3 == 0) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
            if (r4 != null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            if (r4 != null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
            r0 = r7.done;
            r2 = r6.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r2 != null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            if (a(r0, r1, r4, r5) == false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                f.a.e.f.c<T> r6 = r7.queue
                boolean r5 = r7.delayError
                java.util.concurrent.atomic.AtomicReference<f.a.z<? super T>> r0 = r7.actual
                java.lang.Object r4 = r0.get()
                f.a.z r4 = (f.a.z) r4
                r0 = 1
                r3 = 1
            L_0x0015:
                if (r4 == 0) goto L_0x002f
            L_0x0017:
                boolean r0 = r7.done
                java.lang.Object r2 = r6.poll()
                if (r2 != 0) goto L_0x002d
                r1 = 1
            L_0x0020:
                boolean r0 = r7.a(r0, r1, r4, r5)
                if (r0 == 0) goto L_0x0027
                return
            L_0x0027:
                if (r1 != 0) goto L_0x002f
                r4.onNext(r2)
                goto L_0x0017
            L_0x002d:
                r1 = 0
                goto L_0x0020
            L_0x002f:
                int r0 = -r3
                int r3 = r7.addAndGet(r0)
                if (r3 == 0) goto L_0x0041
                if (r4 != 0) goto L_0x0017
                java.util.concurrent.atomic.AtomicReference<f.a.z<? super T>> r0 = r7.actual
                java.lang.Object r4 = r0.get()
                f.a.z r4 = (f.a.z) r4
                goto L_0x0015
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.af.c.a():void");
        }

        @Override // f.a.x
        public final void b(z<? super T> zVar) {
            if (this.once.compareAndSet(false, true)) {
                zVar.onSubscribe(this);
                this.actual.lazySet(zVar);
                if (this.cancelled.get()) {
                    this.actual.lazySet(null);
                } else {
                    a();
                }
            } else {
                f.a.e.a.c.error(new IllegalStateException("Only one Observer allowed!"), zVar);
            }
        }

        c(int i2, a<?, K, T> aVar, K k2, boolean z) {
            this.queue = new f.a.e.f.c<>(i2);
            this.parent = aVar;
            this.key = k2;
            this.delayError = z;
        }

        private boolean a(boolean z, boolean z2, z<? super T> zVar, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                this.actual.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        this.actual.lazySet(null);
                        zVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.actual.lazySet(null);
                        zVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    this.actual.lazySet(null);
                    if (th2 != null) {
                        zVar.onError(th2);
                    } else {
                        zVar.onComplete();
                    }
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<K, T> extends f.a.f.b<K, T> {

        /* renamed from: a  reason: collision with root package name */
        final c<T, K> f157436a;

        static {
            Covode.recordClassIndex(104607);
        }

        @Override // f.a.t
        public final void a(z<? super T> zVar) {
            this.f157436a.b(zVar);
        }

        b(K k2, c<T, K> cVar) {
            super(k2);
            this.f157436a = cVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super f.a.f.b<K, V>> zVar) {
        this.f157412a.b(new a(zVar, this.f157431b, this.f157432c, this.f157433d, this.f157434e));
    }

    public af(x<T> xVar, g<? super T, ? extends K> gVar, g<? super T, ? extends V> gVar2, int i2) {
        super(xVar);
        this.f157431b = gVar;
        this.f157432c = gVar2;
        this.f157433d = i2;
    }
}
