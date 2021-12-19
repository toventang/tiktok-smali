package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.j.h;
import f.a.e.j.j;
import f.a.x;
import f.a.z;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class au<T> extends f.a.f.a<T> implements f.a.e.a.e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f157490e = new f();

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157491a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<d<T>> f157492b;

    /* renamed from: c  reason: collision with root package name */
    final a<T> f157493c;

    /* renamed from: d  reason: collision with root package name */
    final x<T> f157494d;

    /* access modifiers changed from: package-private */
    public interface a<T> {
        static {
            Covode.recordClassIndex(104639);
        }

        c<T> a();
    }

    /* access modifiers changed from: package-private */
    public interface c<T> {
        static {
            Covode.recordClassIndex(104641);
        }

        void a();

        void a(b<T> bVar);

        void a(T t);

        void a(Throwable th);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> extends AtomicInteger implements f.a.b.b {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final z<? super T> child;
        public Object index;
        final d<T> parent;

        static {
            Covode.recordClassIndex(104640);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.a(this);
                this.index = null;
            }
        }

        b(d<T> dVar, z<? super T> zVar) {
            this.parent = dVar;
            this.child = zVar;
        }
    }

    static final class f implements a<Object> {
        static {
            Covode.recordClassIndex(104644);
        }

        f() {
        }

        @Override // f.a.e.e.e.au.a
        public final c<Object> a() {
            return new g();
        }
    }

    static final class g<T> extends ArrayList<Object> implements c<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        static {
            Covode.recordClassIndex(104645);
        }

        g() {
            super(16);
        }

        @Override // f.a.e.e.e.au.c
        public final void a() {
            add(j.complete());
            this.size++;
        }

        @Override // f.a.e.e.e.au.c
        public final void a(T t) {
            add(j.next(t));
            this.size++;
        }

        @Override // f.a.e.e.e.au.c
        public final void a(Throwable th) {
            add(j.error(th));
            this.size++;
        }

        @Override // f.a.e.e.e.au.c
        public final void a(b<T> bVar) {
            int i2;
            if (bVar.getAndIncrement() == 0) {
                z<? super T> zVar = bVar.child;
                int i3 = 1;
                while (!bVar.isDisposed()) {
                    int i4 = this.size;
                    Integer num = (Integer) bVar.index;
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    while (i2 < i4) {
                        if (!j.accept(get(i2), zVar) && !bVar.isDisposed()) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    bVar.index = Integer.valueOf(i2);
                    i3 = bVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
        }
    }

    static final class d<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        static final b[] f157495a = new b[0];

        /* renamed from: b  reason: collision with root package name */
        static final b[] f157496b = new b[0];
        private static final long serialVersionUID = -533785617179540163L;
        final c<T> buffer;
        boolean done;
        final AtomicReference<b[]> observers = new AtomicReference<>(f157495a);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        static {
            Covode.recordClassIndex(104642);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.observers.set(f157496b);
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (this.observers.get() == f157496b) {
                return true;
            }
            return false;
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.a();
                b();
            }
        }

        private void a() {
            for (b<T> bVar : this.observers.get()) {
                this.buffer.a((b) bVar);
            }
        }

        private void b() {
            for (b<T> bVar : this.observers.getAndSet(f157496b)) {
                this.buffer.a((b) bVar);
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.done) {
                this.buffer.a((Object) t);
                a();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                a();
            }
        }

        d(c<T> cVar) {
            this.buffer = cVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.a(th);
                b();
                return;
            }
            f.a.h.a.a(th);
        }

        /* access modifiers changed from: package-private */
        public final void a(b<T> bVar) {
            b[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.observers.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i2 = 0;
                    while (!bVarArr[i2].equals(bVar)) {
                        i2++;
                        if (i2 >= length) {
                            return;
                        }
                    }
                    if (i2 >= 0) {
                        if (length == 1) {
                            bVarArr2 = f157495a;
                        } else {
                            bVarArr2 = new b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr2, 0, i2);
                            System.arraycopy(bVarArr, i2 + 1, bVarArr2, i2, (length - i2) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(bVarArr, bVarArr2));
        }
    }

    static {
        Covode.recordClassIndex(104638);
    }

    @Override // f.a.e.a.e
    public final void a(f.a.b.b bVar) {
        this.f157492b.compareAndSet(bVar, null);
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157494d.b(zVar);
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements x<T> {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReference<d<T>> f157497a;

        /* renamed from: b  reason: collision with root package name */
        private final a<T> f157498b;

        static {
            Covode.recordClassIndex(104643);
        }

        @Override // f.a.x
        public final void b(z<? super T> zVar) {
            d<T> dVar;
            b[] bVarArr;
            b[] bVarArr2;
            do {
                dVar = this.f157497a.get();
                if (dVar != null) {
                    break;
                }
                dVar = new d<>(this.f157498b.a());
            } while (!this.f157497a.compareAndSet(null, dVar));
            b<T> bVar = new b<>(dVar, zVar);
            zVar.onSubscribe(bVar);
            do {
                bVarArr = dVar.observers.get();
                if (bVarArr == d.f157496b) {
                    break;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!dVar.observers.compareAndSet(bVarArr, bVarArr2));
            if (bVar.isDisposed()) {
                dVar.a(bVar);
            } else {
                dVar.buffer.a((b) bVar);
            }
        }

        e(AtomicReference<d<T>> atomicReference, a<T> aVar) {
            this.f157497a = atomicReference;
            this.f157498b = aVar;
        }
    }

    @Override // f.a.f.a
    public final void e(f.a.d.f<? super f.a.b.b> fVar) {
        d<T> dVar;
        boolean z;
        while (true) {
            dVar = this.f157492b.get();
            if (dVar != null && !dVar.isDisposed()) {
                break;
            }
            d<T> dVar2 = new d<>(this.f157493c.a());
            if (this.f157492b.compareAndSet(dVar, dVar2)) {
                dVar = dVar2;
                break;
            }
        }
        if (dVar.shouldConnect.get() || !dVar.shouldConnect.compareAndSet(false, true)) {
            z = false;
        } else {
            z = true;
        }
        try {
            fVar.accept(dVar);
            if (z) {
                this.f157491a.b(dVar);
            }
        } catch (Throwable th) {
            if (z) {
                dVar.shouldConnect.compareAndSet(true, false);
            }
            f.a.c.b.a(th);
            throw h.a(th);
        }
    }

    public static <T> f.a.f.a<T> a(x<T> xVar, a<T> aVar) {
        AtomicReference atomicReference = new AtomicReference();
        return f.a.h.a.a((f.a.f.a) new au(new e(atomicReference, aVar), xVar, atomicReference, aVar));
    }

    private au(x<T> xVar, x<T> xVar2, AtomicReference<d<T>> atomicReference, a<T> aVar) {
        this.f157494d = xVar;
        this.f157491a = xVar2;
        this.f157492b = atomicReference;
        this.f157493c = aVar;
    }
}
