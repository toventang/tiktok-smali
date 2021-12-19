package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.h;
import f.a.j;
import f.a.k;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    final k<T> f157283b;

    /* renamed from: c  reason: collision with root package name */
    final f.a.a f157284c;

    static {
        Covode.recordClassIndex(104484);
    }

    /* access modifiers changed from: package-private */
    public static abstract class a<T> extends AtomicLong implements j<T>, org.a.d {
        private static final long serialVersionUID = 7326289992464377023L;
        final org.a.c<? super T> downstream;
        final f.a.e.a.f serial = new f.a.e.a.f();

        static {
            Covode.recordClassIndex(104486);
        }

        /* access modifiers changed from: package-private */
        public void c() {
        }

        /* access modifiers changed from: package-private */
        public void d() {
        }

        @Override // f.a.g
        public void a() {
            b();
        }

        @Override // org.a.d
        public final void cancel() {
            this.serial.dispose();
            c();
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (!this.serial.isDisposed()) {
                try {
                    this.downstream.onComplete();
                } finally {
                    this.serial.dispose();
                }
            }
        }

        public String toString() {
            return com.a.a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        public boolean b(Throwable th) {
            return c(th);
        }

        a(org.a.c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // f.a.g
        public final void a(Throwable th) {
            if (!b(th)) {
                f.a.h.a.a(th);
            }
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.a.e.i.f.validate(j2)) {
                f.a.e.j.d.a(this, j2);
                d();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.serial.isDisposed()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }
    }

    /* renamed from: f.a.e.e.b.b$b  reason: collision with other inner class name */
    static final class C4159b<T> extends a<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final f.a.e.f.c<T> queue;
        final AtomicInteger wip = new AtomicInteger();

        static {
            Covode.recordClassIndex(104487);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.b.a
        public final void d() {
            e();
        }

        @Override // f.a.g, f.a.e.e.b.b.a
        public final void a() {
            this.done = true;
            e();
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.b.a
        public final void c() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        private void e() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                org.a.c cVar = this.downstream;
                f.a.e.f.c<T> cVar2 = this.queue;
                int i2 = 1;
                do {
                    long j2 = get();
                    long j3 = 0;
                    while (j3 != j2) {
                        if (this.serial.isDisposed()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z2 = this.done;
                        T poll = cVar2.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (z) {
                                break;
                            }
                        } else if (z) {
                            Throwable th = this.error;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                        cVar.onNext(poll);
                        j3++;
                    }
                    if (j3 == j2) {
                        if (this.serial.isDisposed()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = cVar2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                c(th2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        f.a.e.j.d.b(this, j3);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // f.a.e.e.b.b.a
        public final boolean b(Throwable th) {
            if (this.done || this.serial.isDisposed()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            e();
            return true;
        }

        @Override // f.a.g
        public final void a(T t) {
            if (!this.done && !this.serial.isDisposed()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.offer(t);
                e();
            }
        }

        C4159b(org.a.c<? super T> cVar, int i2) {
            super(cVar);
            this.queue = new f.a.e.f.c<>(i2);
        }
    }

    static final class e<T> extends a<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        static {
            Covode.recordClassIndex(104490);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.b.a
        public final void d() {
            e();
        }

        @Override // f.a.g, f.a.e.e.b.b.a
        public final void a() {
            this.done = true;
            e();
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.b.a
        public final void c() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        private void e() {
            boolean z;
            boolean z2;
            if (this.wip.getAndIncrement() == 0) {
                org.a.c cVar = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int i2 = 1;
                do {
                    long j2 = get();
                    long j3 = 0;
                    while (true) {
                        z = false;
                        if (j3 == j2) {
                            break;
                        } else if (this.serial.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z3 = this.done;
                            T andSet = atomicReference.getAndSet(null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3) {
                                if (z2) {
                                    break;
                                }
                            } else if (z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    c(th);
                                    return;
                                } else {
                                    b();
                                    return;
                                }
                            }
                            cVar.onNext(andSet);
                            j3++;
                        }
                    }
                    if (j3 == j2) {
                        if (this.serial.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                c(th2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        f.a.e.j.d.b(this, j3);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        e(org.a.c<? super T> cVar) {
            super(cVar);
        }

        @Override // f.a.g
        public final void a(T t) {
            if (!this.done && !this.serial.isDisposed()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.set(t);
                e();
            }
        }

        @Override // f.a.e.e.b.b.a
        public final boolean b(Throwable th) {
            if (this.done || this.serial.isDisposed()) {
                return false;
            }
            if (th == null) {
                a((Throwable) new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            e();
            return true;
        }
    }

    static final class d<T> extends g<T> {
        private static final long serialVersionUID = 338953216916120960L;

        static {
            Covode.recordClassIndex(104489);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.b.g
        public final void e() {
            a((Throwable) new f.a.c.c("create: could not emit value due to lack of requests"));
        }

        d(org.a.c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: f.a.e.e.b.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f157285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 104485(0x19825, float:1.46415E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                f.a.a[] r0 = f.a.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                f.a.e.e.b.b.AnonymousClass1.f157285a = r2
                f.a.a r0 = f.a.a.MISSING     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = f.a.e.e.b.b.AnonymousClass1.f157285a     // Catch:{ NoSuchFieldError -> 0x0023 }
                f.a.a r0 = f.a.a.ERROR     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = f.a.e.e.b.b.AnonymousClass1.f157285a     // Catch:{ NoSuchFieldError -> 0x002e }
                f.a.a r0 = f.a.a.DROP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f.a.e.e.b.b.AnonymousClass1.f157285a     // Catch:{ NoSuchFieldError -> 0x0039 }
                f.a.a r0 = f.a.a.LATEST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.b.b.AnonymousClass1.<clinit>():void");
        }
    }

    static final class c<T> extends g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        static {
            Covode.recordClassIndex(104488);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.b.g
        public final void e() {
        }

        c(org.a.c<? super T> cVar) {
            super(cVar);
        }
    }

    static final class f<T> extends a<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        static {
            Covode.recordClassIndex(104491);
        }

        f(org.a.c<? super T> cVar) {
            super(cVar);
        }

        @Override // f.a.g
        public final void a(T t) {
            long j2;
            if (!this.serial.isDisposed()) {
                if (t != null) {
                    this.downstream.onNext(t);
                    do {
                        j2 = get();
                        if (j2 == 0) {
                            return;
                        }
                    } while (!compareAndSet(j2, j2 - 1));
                    return;
                }
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    static abstract class g<T> extends a<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        static {
            Covode.recordClassIndex(104492);
        }

        /* access modifiers changed from: package-private */
        public abstract void e();

        g(org.a.c<? super T> cVar) {
            super(cVar);
        }

        @Override // f.a.g
        public final void a(T t) {
            if (!this.serial.isDisposed()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.downstream.onNext(t);
                    f.a.e.j.d.b(this, 1);
                } else {
                    e();
                }
            }
        }
    }

    @Override // f.a.h
    public final void a(org.a.c<? super T> cVar) {
        a fVar;
        int i2 = AnonymousClass1.f157285a[this.f157284c.ordinal()];
        if (i2 == 1) {
            fVar = new f(cVar);
        } else if (i2 == 2) {
            fVar = new d(cVar);
        } else if (i2 == 3) {
            fVar = new c(cVar);
        } else if (i2 != 4) {
            fVar = new C4159b(cVar, h.f157961a);
        } else {
            fVar = new e(cVar);
        }
        cVar.onSubscribe(fVar);
        try {
            this.f157283b.a(fVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            fVar.a(th);
        }
    }

    public b(k<T> kVar, f.a.a aVar) {
        this.f157283b = kVar;
        this.f157284c = aVar;
    }
}
