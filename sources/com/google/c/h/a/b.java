package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.k;
import com.google.c.a.p;
import com.google.c.h.a.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class b<V> extends h<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f54190a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Object f54191b = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f54192d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final a f54193e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f54194f;

    /* renamed from: g  reason: collision with root package name */
    public volatile d f54195g;

    /* renamed from: h  reason: collision with root package name */
    public volatile j f54196h;

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: package-private */
    public static abstract class a {
        static {
            Covode.recordClassIndex(33625);
        }

        /* access modifiers changed from: package-private */
        public abstract void a(j jVar, j jVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(j jVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, j jVar, j jVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, Object obj, Object obj2);

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static abstract class h<V> extends b<V> {
        static {
            Covode.recordClassIndex(33633);
        }

        h() {
        }

        @Override // java.util.concurrent.Future, com.google.c.h.a.b
        public final V get() {
            return (V) b.super.get();
        }

        @Override // com.google.c.h.a.b
        public final boolean isCancelled() {
            return b.super.isCancelled();
        }

        @Override // com.google.c.h.a.b
        public final boolean isDone() {
            return b.super.isDone();
        }

        @Override // com.google.c.h.a.b
        public final boolean cancel(boolean z) {
            return b.super.cancel(z);
        }

        @Override // com.google.c.h.a.q, com.google.c.h.a.b
        public final void a(Runnable runnable, Executor executor) {
            b.super.a(runnable, executor);
        }

        @Override // java.util.concurrent.Future, com.google.c.h.a.b
        public final V get(long j2, TimeUnit timeUnit) {
            return (V) b.super.get(j2, timeUnit);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        static final j f54220a = new j();

        /* renamed from: b  reason: collision with root package name */
        volatile Thread f54221b;

        /* renamed from: c  reason: collision with root package name */
        volatile j f54222c;

        j() {
        }

        static {
            Covode.recordClassIndex(33636);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            Thread thread = this.f54221b;
            if (thread != null) {
                this.f54221b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar) {
            b.f54193e.a(this, jVar);
        }

        j(byte b2) {
            b.f54193e.a(this, Thread.currentThread());
        }
    }

    public boolean a(Throwable th) {
        if (!f54193e.a((b<?>) this, (Object) null, (Object) new c((Throwable) k.a(th)))) {
            return false;
        }
        a((b<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(q<? extends V> qVar) {
        f fVar;
        c cVar;
        k.a(qVar);
        Object obj = this.f54194f;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f54193e.a((b<?>) this, (Object) null, b((q<?>) qVar))) {
                    return false;
                }
                a((b<?>) this);
                return true;
            }
            fVar = new f(this, qVar);
            if (f54193e.a((b<?>) this, (Object) null, (Object) fVar)) {
                try {
                    qVar.a(fVar, u.a.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.f54201a;
                }
                return true;
            }
            obj = this.f54194f;
        }
        if (obj instanceof C1239b) {
            qVar.cancel(((C1239b) obj).f54199c);
        }
        return false;
        f54193e.a((b<?>) this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && isCancelled()) {
            future.cancel(d());
        }
    }

    static final class g extends a {
        static {
            Covode.recordClassIndex(33632);
        }

        private g() {
            super((byte) 0);
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final void a(j jVar, j jVar2) {
            jVar.f54222c = jVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final void a(j jVar, Thread thread) {
            jVar.f54221b = thread;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            MethodCollector.i(2570);
            synchronized (bVar) {
                try {
                    if (bVar.f54195g == dVar) {
                        bVar.f54195g = dVar2;
                        return true;
                    }
                    MethodCollector.o(2570);
                    return false;
                } finally {
                    MethodCollector.o(2570);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, j jVar, j jVar2) {
            MethodCollector.i(2569);
            synchronized (bVar) {
                try {
                    if (bVar.f54196h == jVar) {
                        bVar.f54196h = jVar2;
                        return true;
                    }
                    MethodCollector.o(2569);
                    return false;
                } finally {
                    MethodCollector.o(2569);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, Object obj, Object obj2) {
            MethodCollector.i(2571);
            synchronized (bVar) {
                try {
                    if (bVar.f54194f == obj) {
                        bVar.f54194f = obj2;
                        return true;
                    }
                    MethodCollector.o(2571);
                    return false;
                } finally {
                    MethodCollector.o(2571);
                }
            }
        }
    }

    static final class i extends a {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f54214a;

        /* renamed from: b  reason: collision with root package name */
        static final long f54215b;

        /* renamed from: c  reason: collision with root package name */
        static final long f54216c;

        /* renamed from: d  reason: collision with root package name */
        static final long f54217d;

        /* renamed from: e  reason: collision with root package name */
        static final long f54218e;

        /* renamed from: f  reason: collision with root package name */
        static final long f54219f;

        private i() {
            super((byte) 0);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.h.a.b.i.<clinit>():void");
        }

        /* synthetic */ i(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final void a(j jVar, j jVar2) {
            f54214a.putObject(jVar, f54219f, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final void a(j jVar, Thread thread) {
            f54214a.putObject(jVar, f54218e, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            return f54214a.compareAndSwapObject(bVar, f54215b, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, j jVar, j jVar2) {
            return f54214a.compareAndSwapObject(bVar, f54216c, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, Object obj, Object obj2) {
            return f54214a.compareAndSwapObject(bVar, f54217d, obj, obj2);
        }
    }

    public boolean isCancelled() {
        return this.f54194f instanceof C1239b;
    }

    /* access modifiers changed from: package-private */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final d f54203a = new d(null, null);

        /* renamed from: b  reason: collision with root package name */
        final Runnable f54204b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f54205c;

        /* renamed from: d  reason: collision with root package name */
        d f54206d;

        static {
            Covode.recordClassIndex(33629);
        }

        d(Runnable runnable, Executor executor) {
            this.f54204b = runnable;
            this.f54205c = executor;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        Object obj = this.f54194f;
        if (!(obj instanceof C1239b) || !((C1239b) obj).f54199c) {
            return false;
        }
        return true;
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f54194f;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof f)) & z;
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final c f54201a = new c(new Throwable("Failure occurred while trying to finish a future.") {
            /* class com.google.c.h.a.b.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33628);
            }

            public final synchronized Throwable fillInStackTrace() {
                MethodCollector.i(1204);
                MethodCollector.o(1204);
                return this;
            }
        });

        /* renamed from: b  reason: collision with root package name */
        final Throwable f54202b;

        static {
            Covode.recordClassIndex(33627);
        }

        c(Throwable th) {
            this.f54202b = (Throwable) k.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b<V> f54212a;

        /* renamed from: b  reason: collision with root package name */
        final q<? extends V> f54213b;

        static {
            Covode.recordClassIndex(33631);
        }

        public final void run() {
            if (this.f54212a.f54194f == this) {
                if (b.f54193e.a((b<?>) this.f54212a, (Object) this, b.b((q<?>) this.f54213b))) {
                    b.a((b<?>) this.f54212a);
                }
            }
        }

        f(b<V> bVar, q<? extends V> qVar) {
            this.f54212a = bVar;
            this.f54213b = qVar;
        }
    }

    private void e() {
        j jVar;
        do {
            jVar = this.f54196h;
        } while (!f54193e.a((b<?>) this, jVar, j.f54220a));
        while (jVar != null) {
            jVar.a();
            jVar = jVar.f54222c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$b  reason: collision with other inner class name */
    public static final class C1239b {

        /* renamed from: a  reason: collision with root package name */
        static final C1239b f54197a;

        /* renamed from: b  reason: collision with root package name */
        static final C1239b f54198b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f54199c;

        /* renamed from: d  reason: collision with root package name */
        final Throwable f54200d;

        static {
            Covode.recordClassIndex(33626);
            if (b.f54192d) {
                f54198b = null;
                f54197a = null;
                return;
            }
            f54198b = new C1239b(false, null);
            f54197a = new C1239b(true, null);
        }

        C1239b(boolean z, Throwable th) {
            this.f54199c = z;
            this.f54200d = th;
        }
    }

    static {
        a aVar;
        Throwable th;
        Covode.recordClassIndex(33624);
        Throwable th2 = null;
        try {
            aVar = new i((byte) 0);
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            aVar = new g((byte) 0);
        }
        f54193e = aVar;
        if (th2 != null) {
            Logger logger = f54190a;
            logger.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            logger.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        boolean z;
        Object obj;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj2 = this.f54194f;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj2 instanceof f))) {
                return (V) a(obj2);
            }
            j jVar = this.f54196h;
            if (jVar != j.f54220a) {
                j jVar2 = new j((byte) 0);
                do {
                    jVar2.a(jVar);
                    if (f54193e.a((b<?>) this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f54194f;
                                if (obj != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                a(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof f))));
                        return (V) a(obj);
                    }
                    jVar = this.f54196h;
                } while (jVar != j.f54220a);
            }
            return (V) a(this.f54194f);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            a(append);
        } else {
            try {
                str = a();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (!p.a(str)) {
                append.append("PENDING, info=[").append(str).append("]");
            } else if (isDone()) {
                a(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    /* access modifiers changed from: protected */
    public String a() {
        Object obj = this.f54194f;
        if (obj instanceof f) {
            return "setFuture=[" + c(((f) obj).f54213b) + "]";
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    private String c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f54195g;
        } while (!f54193e.a((b<?>) this, dVar2, d.f54203a));
        while (dVar2 != null) {
            d dVar3 = dVar2.f54206d;
            dVar2.f54206d = dVar;
            dVar = dVar2;
            dVar2 = dVar3;
        }
        return dVar;
    }

    public boolean b(V v) {
        if (v == null) {
            v = (V) f54191b;
        }
        if (!f54193e.a((b<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        a((b<?>) this);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static V a(Object obj) {
        if (obj instanceof C1239b) {
            throw a("Task was cancelled.", ((C1239b) obj).f54200d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f54202b);
        } else if (obj == f54191b) {
            return null;
        } else {
            return obj;
        }
    }

    private void a(j jVar) {
        jVar.f54221b = null;
        while (true) {
            j jVar2 = this.f54196h;
            if (jVar2 != j.f54220a) {
                j jVar3 = null;
                while (jVar2 != null) {
                    j jVar4 = jVar2.f54222c;
                    if (jVar2.f54221b != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f54222c = jVar4;
                        if (jVar3.f54221b == null) {
                        }
                    } else if (f54193e.a((b<?>) this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    public static Object b(q<?> qVar) {
        if (qVar instanceof h) {
            Object obj = ((b) qVar).f54194f;
            if (!(obj instanceof C1239b)) {
                return obj;
            }
            C1239b bVar = (C1239b) obj;
            if (!bVar.f54199c) {
                return obj;
            }
            if (bVar.f54200d != null) {
                return new C1239b(false, bVar.f54200d);
            }
            return C1239b.f54198b;
        }
        try {
            Object a2 = l.a((Future) qVar);
            if (a2 == null) {
                return f54191b;
            }
            return a2;
        } catch (ExecutionException e2) {
            return new c(e2.getCause());
        } catch (CancellationException e3) {
            return new C1239b(false, e3);
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public boolean cancel(boolean z) {
        boolean z2;
        C1239b bVar;
        boolean z3;
        Object obj = this.f54194f;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof f)) {
            return false;
        }
        if (f54192d) {
            bVar = new C1239b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C1239b.f54197a;
        } else {
            bVar = C1239b.f54198b;
        }
        boolean z4 = false;
        b<V> bVar2 = this;
        while (true) {
            if (f54193e.a((b<?>) bVar2, obj, (Object) bVar)) {
                if (z) {
                    bVar2.c();
                }
                a((b<?>) bVar2);
                if (!(obj instanceof f)) {
                    return true;
                }
                q<? extends V> qVar = ((f) obj).f54213b;
                if (qVar instanceof h) {
                    bVar2 = (b) qVar;
                    obj = bVar2.f54194f;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    qVar.cancel(z);
                    return true;
                }
            } else {
                obj = bVar2.f54194f;
                if (!(obj instanceof f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.c.h.a.b<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.c.h.a.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.c.h.a.b, com.google.c.h.a.b<V>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.c.h.a.b$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.google.c.h.a.b<?> r4) {
        /*
            r3 = 0
        L_0x0001:
            r4.e()
            r4.b()
            com.google.c.h.a.b$d r1 = r4.a(r3)
        L_0x000b:
            if (r1 == 0) goto L_0x0033
            com.google.c.h.a.b$d r3 = r1.f54206d
            java.lang.Runnable r2 = r1.f54204b
            boolean r0 = r2 instanceof com.google.c.h.a.b.f
            if (r0 == 0) goto L_0x002d
            com.google.c.h.a.b$f r2 = (com.google.c.h.a.b.f) r2
            com.google.c.h.a.b<V> r4 = r2.f54212a
            java.lang.Object r0 = r4.f54194f
            if (r0 != r2) goto L_0x002b
            com.google.c.h.a.q<? extends V> r0 = r2.f54213b
            java.lang.Object r1 = b(r0)
            com.google.c.h.a.b$a r0 = com.google.c.h.a.b.f54193e
            boolean r0 = r0.a(r4, r2, r1)
            if (r0 != 0) goto L_0x0001
        L_0x002b:
            r1 = r3
            goto L_0x000b
        L_0x002d:
            java.util.concurrent.Executor r0 = r1.f54205c
            b(r2, r0)
            goto L_0x002b
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.h.a.b.a(com.google.c.h.a.b):void");
    }

    private void a(StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(c(l.a((Future) this))).append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[").append(e2.getCause()).append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[").append(e3.getClass()).append(" thrown from get()]");
        }
    }

    static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<j, Thread> f54207a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<j, j> f54208b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, j> f54209c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, d> f54210d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, Object> f54211e;

        static {
            Covode.recordClassIndex(33630);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final void a(j jVar, j jVar2) {
            this.f54208b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final void a(j jVar, Thread thread) {
            this.f54207a.lazySet(jVar, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            return this.f54210d.compareAndSet(bVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, j jVar, j jVar2) {
            return this.f54209c.compareAndSet(bVar, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.b.a
        public final boolean a(b<?> bVar, Object obj, Object obj2) {
            return this.f54211e.compareAndSet(bVar, obj, obj2);
        }

        e(AtomicReferenceFieldUpdater<j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<j, j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.f54207a = atomicReferenceFieldUpdater;
            this.f54208b = atomicReferenceFieldUpdater2;
            this.f54209c = atomicReferenceFieldUpdater3;
            this.f54210d = atomicReferenceFieldUpdater4;
            this.f54211e = atomicReferenceFieldUpdater5;
        }
    }

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f54190a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        boolean z;
        long j3;
        boolean z2;
        boolean z3;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f54194f;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj instanceof f))) {
                return (V) a(obj);
            }
            if (nanos > 0) {
                j3 = System.nanoTime() + nanos;
            } else {
                j3 = 0;
            }
            if (nanos >= 1000) {
                j jVar = this.f54196h;
                if (jVar != j.f54220a) {
                    j jVar2 = new j((byte) 0);
                    do {
                        jVar2.a(jVar);
                        if (f54193e.a((b<?>) this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f54194f;
                                    if (obj2 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3 && (!(obj2 instanceof f))) {
                                        return (V) a(obj2);
                                    }
                                    nanos = j3 - System.nanoTime();
                                } else {
                                    a(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(jVar2);
                        } else {
                            jVar = this.f54196h;
                        }
                    } while (jVar != j.f54220a);
                }
                return (V) a(this.f54194f);
            }
            while (nanos > 0) {
                Object obj3 = this.f54194f;
                if (obj3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (!(obj3 instanceof f))) {
                    return (V) a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j3 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar = toString();
            if (isDone()) {
                throw new TimeoutException("Waited " + j2 + " " + com.google.c.a.c.a(timeUnit.toString()) + " but future completed as timeout expired");
            }
            throw new TimeoutException("Waited " + j2 + " " + com.google.c.a.c.a(timeUnit.toString()) + " for " + bVar);
        }
        throw new InterruptedException();
    }

    @Override // com.google.c.h.a.q
    public void a(Runnable runnable, Executor executor) {
        k.a(runnable, "Runnable was null.");
        k.a(executor, "Executor was null.");
        d dVar = this.f54195g;
        if (dVar != d.f54203a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f54206d = dVar;
                if (!f54193e.a((b<?>) this, dVar, dVar2)) {
                    dVar = this.f54195g;
                } else {
                    return;
                }
            } while (dVar != d.f54203a);
        }
        b(runnable, executor);
    }
}
