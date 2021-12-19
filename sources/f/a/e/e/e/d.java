package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class d<T> extends a<T, T> implements z<T> {

    /* renamed from: e  reason: collision with root package name */
    static final a[] f157625e = new a[0];

    /* renamed from: f  reason: collision with root package name */
    static final a[] f157626f = new a[0];

    /* renamed from: b  reason: collision with root package name */
    final AtomicBoolean f157627b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    final int f157628c = 16;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<a<T>[]> f157629d;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f157630g;

    /* renamed from: h  reason: collision with root package name */
    final b<T> f157631h;

    /* renamed from: i  reason: collision with root package name */
    b<T> f157632i;

    /* renamed from: j  reason: collision with root package name */
    int f157633j;

    /* renamed from: k  reason: collision with root package name */
    Throwable f157634k;

    /* renamed from: l  reason: collision with root package name */
    volatile boolean f157635l;

    @Override // f.a.z
    public final void onSubscribe(f.a.b.b bVar) {
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicInteger implements f.a.b.b {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final z<? super T> downstream;
        long index;
        b<T> node;
        int offset;
        final d<T> parent;

        static {
            Covode.recordClassIndex(104709);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.disposed;
        }

        @Override // f.a.b.b
        public final void dispose() {
            a<T>[] aVarArr;
            a<T>[] aVarArr2;
            if (!this.disposed) {
                this.disposed = true;
                d<T> dVar = this.parent;
                do {
                    aVarArr = dVar.f157629d.get();
                    int length = aVarArr.length;
                    if (length != 0) {
                        int i2 = 0;
                        while (aVarArr[i2] != this) {
                            i2++;
                            if (i2 >= length) {
                                return;
                            }
                        }
                        if (i2 < 0) {
                            return;
                        }
                        if (length == 1) {
                            aVarArr2 = d.f157625e;
                        } else {
                            aVarArr2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                            System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                        }
                    } else {
                        return;
                    }
                } while (!dVar.f157629d.compareAndSet(aVarArr, aVarArr2));
            }
        }

        a(z<? super T> zVar, d<T> dVar) {
            this.downstream = zVar;
            this.parent = dVar;
            this.node = dVar.f157631h;
        }
    }

    static {
        Covode.recordClassIndex(104708);
    }

    @Override // f.a.z
    public final void onComplete() {
        this.f157635l = true;
        for (a<T> aVar : this.f157629d.getAndSet(f157626f)) {
            a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        final T[] f157636a;

        /* renamed from: b  reason: collision with root package name */
        volatile b<T> f157637b;

        static {
            Covode.recordClassIndex(104710);
        }

        b(int i2) {
            this.f157636a = (T[]) new Object[i2];
        }
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        this.f157634k = th;
        this.f157635l = true;
        for (a<T> aVar : this.f157629d.getAndSet(f157626f)) {
            a(aVar);
        }
    }

    public d(t<T> tVar) {
        super(tVar);
        b<T> bVar = new b<>(16);
        this.f157631h = bVar;
        this.f157632i = bVar;
        this.f157629d = new AtomicReference<>(f157625e);
    }

    @Override // f.a.z
    public final void onNext(T t) {
        int i2 = this.f157633j;
        if (i2 == this.f157628c) {
            b<T> bVar = new b<>(i2);
            bVar.f157636a[0] = t;
            this.f157633j = 1;
            this.f157632i.f157637b = bVar;
            this.f157632i = bVar;
        } else {
            this.f157632i.f157636a[i2] = t;
            this.f157633j = i2 + 1;
        }
        this.f157630g++;
        for (a<T> aVar : this.f157629d.get()) {
            a(aVar);
        }
    }

    private void a(a<T> aVar) {
        boolean z;
        if (aVar.getAndIncrement() == 0) {
            long j2 = aVar.index;
            int i2 = aVar.offset;
            b<T> bVar = aVar.node;
            z<? super T> zVar = aVar.downstream;
            int i3 = this.f157628c;
            int i4 = 1;
            while (!aVar.disposed) {
                boolean z2 = this.f157635l;
                if (this.f157630g == j2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (z) {
                        aVar.node = null;
                        Throwable th = this.f157634k;
                        if (th != null) {
                            zVar.onError(th);
                            return;
                        } else {
                            zVar.onComplete();
                            return;
                        }
                    }
                } else if (z) {
                    aVar.index = j2;
                    aVar.offset = i2;
                    aVar.node = bVar;
                    i4 = aVar.addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
                if (i2 == i3) {
                    bVar = bVar.f157637b;
                    i2 = 0;
                }
                zVar.onNext(bVar.f157636a[i2]);
                i2++;
                j2++;
            }
            aVar.node = null;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        a<T> aVar = new a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f157629d.get();
            if (aVarArr == f157626f) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f157629d.compareAndSet(aVarArr, aVarArr2));
        if (this.f157627b.get() || !this.f157627b.compareAndSet(false, true)) {
            a(aVar);
        } else {
            this.f157412a.b(this);
        }
    }
}
