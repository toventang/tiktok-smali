package androidx.work.impl.utils.a;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import java.util.Locale;
import java.util.Objects;
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

public abstract class a<V> implements q<V> {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f4744a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b  reason: collision with root package name */
    static final AbstractC0067a f4745b;

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f4746f = Logger.getLogger(a.class.getName());

    /* renamed from: g  reason: collision with root package name */
    private static final Object f4747g = new Object();

    /* renamed from: c  reason: collision with root package name */
    volatile Object f4748c;

    /* renamed from: d  reason: collision with root package name */
    volatile d f4749d;

    /* renamed from: e  reason: collision with root package name */
    volatile h f4750e;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0067a {
        static {
            Covode.recordClassIndex(1862);
        }

        /* access modifiers changed from: package-private */
        public abstract void a(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(h hVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, Object obj, Object obj2);

        private AbstractC0067a() {
        }

        /* synthetic */ AbstractC0067a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        static final h f4768a = new h();

        /* renamed from: b  reason: collision with root package name */
        volatile Thread f4769b;

        /* renamed from: c  reason: collision with root package name */
        volatile h f4770c;

        h() {
        }

        static {
            Covode.recordClassIndex(1870);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            Thread thread = this.f4769b;
            if (thread != null) {
                this.f4769b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(h hVar) {
            a.f4745b.a(this, hVar);
        }

        h(byte b2) {
            a.f4745b.a(this, Thread.currentThread());
        }
    }

    protected a() {
    }

    /* access modifiers changed from: protected */
    public boolean a(V v) {
        if (v == null) {
            v = (V) f4747g;
        }
        if (!f4745b.a((a<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        a((a<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        if (!f4745b.a((a<?>) this, (Object) null, (Object) new c((Throwable) b(th)))) {
            return false;
        }
        a((a<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(q<? extends V> qVar) {
        f fVar;
        c cVar;
        b((Object) qVar);
        Object obj = this.f4748c;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f4745b.a((a<?>) this, (Object) null, b((q<?>) qVar))) {
                    return false;
                }
                a((a<?>) this);
                return true;
            }
            fVar = new f(this, qVar);
            if (f4745b.a((a<?>) this, (Object) null, (Object) fVar)) {
                try {
                    qVar.a(fVar, b.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.f4755a;
                }
                return true;
            }
            obj = this.f4748c;
        }
        if (obj instanceof b) {
            qVar.cancel(((b) obj).f4753c);
        }
        return false;
        f4745b.a((a<?>) this, (Object) fVar, (Object) cVar);
        return true;
    }

    static final class g extends AbstractC0067a {
        static {
            Covode.recordClassIndex(1869);
        }

        g() {
            super((byte) 0);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final void a(h hVar, h hVar2) {
            hVar.f4770c = hVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final void a(h hVar, Thread thread) {
            hVar.f4769b = thread;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f4749d != dVar) {
                    return false;
                }
                aVar.f4749d = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final boolean a(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f4750e != hVar) {
                    return false;
                }
                aVar.f4750e = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final boolean a(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4748c != obj) {
                    return false;
                }
                aVar.f4748c = obj2;
                return true;
            }
        }
    }

    public final boolean isCancelled() {
        return this.f4748c instanceof b;
    }

    /* access modifiers changed from: package-private */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final d f4757a = new d(null, null);

        /* renamed from: b  reason: collision with root package name */
        final Runnable f4758b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f4759c;

        /* renamed from: d  reason: collision with root package name */
        d f4760d;

        static {
            Covode.recordClassIndex(1866);
        }

        d(Runnable runnable, Executor executor) {
            this.f4758b = runnable;
            this.f4759c = executor;
        }
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f4748c;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof f)) & z;
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final b f4751a;

        /* renamed from: b  reason: collision with root package name */
        static final b f4752b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f4753c;

        /* renamed from: d  reason: collision with root package name */
        final Throwable f4754d;

        static {
            Covode.recordClassIndex(1863);
            if (a.f4744a) {
                f4752b = null;
                f4751a = null;
                return;
            }
            f4752b = new b(false, null);
            f4751a = new b(true, null);
        }

        b(boolean z, Throwable th) {
            this.f4753c = z;
            this.f4754d = th;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final c f4755a = new c(new Throwable("Failure occurred while trying to finish a future.") {
            /* class androidx.work.impl.utils.a.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1865);
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b  reason: collision with root package name */
        final Throwable f4756b;

        static {
            Covode.recordClassIndex(1864);
        }

        c(Throwable th) {
            this.f4756b = (Throwable) a.b(th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f4766a;

        /* renamed from: b  reason: collision with root package name */
        final q<? extends V> f4767b;

        static {
            Covode.recordClassIndex(1868);
        }

        public final void run() {
            if (this.f4766a.f4748c == this) {
                if (a.f4745b.a((a<?>) this.f4766a, (Object) this, a.b((q<?>) this.f4767b))) {
                    a.a((a<?>) this.f4766a);
                }
            }
        }

        f(a<V> aVar, q<? extends V> qVar) {
            this.f4766a = aVar;
            this.f4767b = qVar;
        }
    }

    static {
        AbstractC0067a aVar;
        Throwable th;
        Covode.recordClassIndex(1861);
        try {
            aVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "e"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "c"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            aVar = new g();
        }
        f4745b = aVar;
        if (th != null) {
            f4746f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    private void a() {
        h hVar;
        do {
            hVar = this.f4750e;
        } while (!f4745b.a((a<?>) this, hVar, h.f4768a));
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f4770c;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        boolean z;
        Object obj;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4748c;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj2 instanceof f))) {
                return (V) c(obj2);
            }
            h hVar = this.f4750e;
            if (hVar != h.f4768a) {
                h hVar2 = new h((byte) 0);
                do {
                    hVar2.a(hVar);
                    if (f4745b.a((a<?>) this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4748c;
                                if (obj != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof f))));
                        return (V) c(obj);
                    }
                    hVar = this.f4750e;
                } while (hVar != h.f4768a);
            }
            return (V) c(this.f4748c);
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
                Object obj = this.f4748c;
                if (obj instanceof f) {
                    str = "setFuture=[" + d(((f) obj).f4767b) + "]";
                } else if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                append.append("PENDING, info=[").append(str).append("]");
            } else if (isDone()) {
                a(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    static <T> T b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    private String d(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f4749d;
        } while (!f4745b.a((a<?>) this, dVar2, d.f4757a));
        while (dVar2 != null) {
            d dVar3 = dVar2.f4760d;
            dVar2.f4760d = dVar;
            dVar = dVar2;
            dVar2 = dVar3;
        }
        return dVar;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    private static <V> V a(Future<V> future) {
        boolean z = false;
        V v = future;
        while (true) {
            try {
                v = (V) v.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                v = v;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static V c(Object obj) {
        if (obj instanceof b) {
            throw a("Task was cancelled.", ((b) obj).f4754d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f4756b);
        } else if (obj == f4747g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object b(q<?> qVar) {
        if (qVar instanceof a) {
            Object obj = ((a) qVar).f4748c;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.f4753c) {
                return obj;
            }
            if (bVar.f4754d != null) {
                return new b(false, bVar.f4754d);
            }
            return b.f4752b;
        }
        boolean isCancelled = qVar.isCancelled();
        if ((!f4744a) && isCancelled) {
            return b.f4752b;
        }
        try {
            Object a2 = a((Future) qVar);
            if (a2 == null) {
                return f4747g;
            }
            return a2;
        } catch (ExecutionException e2) {
            return new c(e2.getCause());
        } catch (CancellationException e3) {
            if (!isCancelled) {
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(qVar)), e3));
            }
            return new b(false, e3);
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        b bVar;
        boolean z3;
        Object obj = this.f4748c;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof f)) {
            return false;
        }
        if (f4744a) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = b.f4751a;
        } else {
            bVar = b.f4752b;
        }
        boolean z4 = false;
        a<V> aVar = this;
        while (true) {
            if (f4745b.a((a<?>) aVar, obj, (Object) bVar)) {
                a((a<?>) aVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                q<? extends V> qVar = ((f) obj).f4767b;
                if (qVar instanceof a) {
                    aVar = (a) qVar;
                    obj = aVar.f4748c;
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
                obj = aVar.f4748c;
                if (!(obj instanceof f)) {
                    return z4;
                }
            }
        }
    }

    private void a(h hVar) {
        hVar.f4769b = null;
        while (true) {
            h hVar2 = this.f4750e;
            if (hVar2 != h.f4768a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f4770c;
                    if (hVar2.f4769b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f4770c = hVar4;
                        if (hVar3.f4769b == null) {
                        }
                    } else if (f4745b.a((a<?>) this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.a.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.a.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.impl.utils.a.a, androidx.work.impl.utils.a.a<V>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.work.impl.utils.a.a$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(androidx.work.impl.utils.a.a<?> r4) {
        /*
            r3 = 0
        L_0x0001:
            r4.a()
            androidx.work.impl.utils.a.a$d r1 = r4.a(r3)
        L_0x0008:
            if (r1 == 0) goto L_0x0030
            androidx.work.impl.utils.a.a$d r3 = r1.f4760d
            java.lang.Runnable r2 = r1.f4758b
            boolean r0 = r2 instanceof androidx.work.impl.utils.a.a.f
            if (r0 == 0) goto L_0x002a
            androidx.work.impl.utils.a.a$f r2 = (androidx.work.impl.utils.a.a.f) r2
            androidx.work.impl.utils.a.a<V> r4 = r2.f4766a
            java.lang.Object r0 = r4.f4748c
            if (r0 != r2) goto L_0x0028
            com.google.c.h.a.q<? extends V> r0 = r2.f4767b
            java.lang.Object r1 = b(r0)
            androidx.work.impl.utils.a.a$a r0 = androidx.work.impl.utils.a.a.f4745b
            boolean r0 = r0.a(r4, r2, r1)
            if (r0 != 0) goto L_0x0001
        L_0x0028:
            r1 = r3
            goto L_0x0008
        L_0x002a:
            java.util.concurrent.Executor r0 = r1.f4759c
            b(r2, r0)
            goto L_0x0028
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.a.a.a(androidx.work.impl.utils.a.a):void");
    }

    private void a(StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(d(a((Future) this))).append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[").append(e2.getCause()).append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[").append(e3.getClass()).append(" thrown from get()]");
        }
    }

    static final class e extends AbstractC0067a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f4761a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f4762b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, h> f4763c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, d> f4764d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f4765e;

        static {
            Covode.recordClassIndex(1867);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final void a(h hVar, h hVar2) {
            this.f4762b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final void a(h hVar, Thread thread) {
            this.f4761a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            return this.f4764d.compareAndSet(aVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final boolean a(a<?> aVar, h hVar, h hVar2) {
            return this.f4763c.compareAndSet(aVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a.a.AbstractC0067a
        public final boolean a(a<?> aVar, Object obj, Object obj2) {
            return this.f4765e.compareAndSet(aVar, obj, obj2);
        }

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.f4761a = atomicReferenceFieldUpdater;
            this.f4762b = atomicReferenceFieldUpdater2;
            this.f4763c = atomicReferenceFieldUpdater3;
            this.f4764d = atomicReferenceFieldUpdater4;
            this.f4765e = atomicReferenceFieldUpdater5;
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
            f4746f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        boolean z;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f4748c;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj instanceof f))) {
                return (V) c(obj);
            }
            if (nanos > 0) {
                j3 = System.nanoTime() + nanos;
            } else {
                j3 = 0;
            }
            if (nanos >= 1000) {
                h hVar = this.f4750e;
                if (hVar != h.f4768a) {
                    h hVar2 = new h((byte) 0);
                    do {
                        hVar2.a(hVar);
                        if (f4745b.a((a<?>) this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4748c;
                                    if (obj2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (!(obj2 instanceof f))) {
                                        return (V) c(obj2);
                                    }
                                    nanos = j3 - System.nanoTime();
                                } else {
                                    a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(hVar2);
                        } else {
                            hVar = this.f4750e;
                        }
                    } while (hVar != h.f4768a);
                }
                return (V) c(this.f4748c);
            }
            while (nanos > 0) {
                Object obj3 = this.f4748c;
                if (obj3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && (!(obj3 instanceof f))) {
                    return (V) c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j3 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                if (convert == 0 || nanos2 > 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z2) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z2) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // com.google.c.h.a.q
    public final void a(Runnable runnable, Executor executor) {
        b(runnable);
        b(executor);
        d dVar = this.f4749d;
        if (dVar != d.f4757a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f4760d = dVar;
                if (!f4745b.a((a<?>) this, dVar, dVar2)) {
                    dVar = this.f4749d;
                } else {
                    return;
                }
            } while (dVar != d.f4757a);
        }
        b(runnable, executor);
    }
}
