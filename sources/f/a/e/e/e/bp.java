package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.f.c;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bp<T, R> extends t<R> {

    /* renamed from: a  reason: collision with root package name */
    final x<? extends T>[] f157583a;

    /* renamed from: b  reason: collision with root package name */
    final Iterable<? extends x<? extends T>> f157584b;

    /* renamed from: c  reason: collision with root package name */
    final g<? super Object[], ? extends R> f157585c;

    /* renamed from: d  reason: collision with root package name */
    final int f157586d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f157587e = false;

    static {
        Covode.recordClassIndex(104699);
    }

    static final class a<T, R> extends AtomicInteger implements f.a.b.b {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final z<? super R> downstream;
        final b<T, R>[] observers;
        final T[] row;
        final g<? super Object[], ? extends R> zipper;

        static {
            Covode.recordClassIndex(104700);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled;
        }

        private void b() {
            d();
            c();
        }

        private void c() {
            for (b<T, R> bVar : this.observers) {
                bVar.a();
            }
        }

        private void d() {
            for (b<T, R> bVar : this.observers) {
                bVar.f157589b.clear();
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                c();
                if (getAndIncrement() == 0) {
                    d();
                }
            }
        }

        public final void a() {
            Throwable th;
            boolean z;
            if (getAndIncrement() == 0) {
                b<T, R>[] bVarArr = this.observers;
                z<? super R> zVar = this.downstream;
                T[] tArr = this.row;
                boolean z2 = this.delayError;
                int i2 = 1;
                while (true) {
                    int i3 = 0;
                    int i4 = 0;
                    for (b<T, R> bVar : bVarArr) {
                        if (tArr[i4] == null) {
                            boolean z3 = bVar.f157590c;
                            T poll = bVar.f157589b.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.cancelled) {
                                b();
                                return;
                            }
                            if (z3) {
                                if (!z2) {
                                    Throwable th2 = bVar.f157591d;
                                    if (th2 != null) {
                                        b();
                                        zVar.onError(th2);
                                        return;
                                    } else if (z) {
                                        b();
                                        zVar.onComplete();
                                        return;
                                    }
                                } else if (z) {
                                    Throwable th3 = bVar.f157591d;
                                    b();
                                    if (th3 != null) {
                                        zVar.onError(th3);
                                        return;
                                    } else {
                                        zVar.onComplete();
                                        return;
                                    }
                                }
                            } else if (z) {
                                i3++;
                            }
                            tArr[i4] = poll;
                        } else if (bVar.f157590c && !z2 && (th = bVar.f157591d) != null) {
                            b();
                            zVar.onError(th);
                            return;
                        }
                        i4++;
                    }
                    if (i3 == 0) {
                        try {
                            zVar.onNext((Object) f.a.e.b.b.a(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th4) {
                            f.a.c.b.a(th4);
                            b();
                            zVar.onError(th4);
                            return;
                        }
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        a(z<? super R> zVar, g<? super Object[], ? extends R> gVar, int i2, boolean z) {
            this.downstream = zVar;
            this.zipper = gVar;
            this.observers = new b[i2];
            this.row = (T[]) new Object[i2];
            this.delayError = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements z<T> {

        /* renamed from: a  reason: collision with root package name */
        final a<T, R> f157588a;

        /* renamed from: b  reason: collision with root package name */
        final c<T> f157589b;

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f157590c;

        /* renamed from: d  reason: collision with root package name */
        Throwable f157591d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<f.a.b.b> f157592e = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104701);
        }

        public final void a() {
            f.a.e.a.b.dispose(this.f157592e);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157590c = true;
            this.f157588a.a();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.f157592e, bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157591d = th;
            this.f157590c = true;
            this.f157588a.a();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157589b.offer(t);
            this.f157588a.a();
        }

        b(a<T, R> aVar, int i2) {
            this.f157588a = aVar;
            this.f157589b = new c<>(i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: f.a.x<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.t
    public final void a(z<? super R> zVar) {
        int i2;
        x<? extends T>[] xVarArr = this.f157583a;
        if (xVarArr == null) {
            xVarArr = new t[8];
            i2 = 0;
            for (Object obj : this.f157584b) {
                if (i2 == xVarArr.length) {
                    x<? extends T>[] xVarArr2 = new x[((i2 >> 2) + i2)];
                    System.arraycopy(xVarArr, 0, xVarArr2, 0, i2);
                    xVarArr = xVarArr2;
                }
                xVarArr[i2] = obj;
                i2++;
            }
        } else {
            i2 = xVarArr.length;
        }
        if (i2 == 0) {
            f.a.e.a.c.complete(zVar);
            return;
        }
        a aVar = new a(zVar, this.f157585c, i2, this.f157587e);
        int i3 = this.f157586d;
        b<T, R>[] bVarArr = aVar.observers;
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            bVarArr[i4] = new b<>(aVar, i3);
        }
        aVar.lazySet(0);
        aVar.downstream.onSubscribe(aVar);
        for (int i5 = 0; i5 < length && !aVar.cancelled; i5++) {
            xVarArr[i5].b(bVarArr[i5]);
        }
    }

    public bp(x<? extends T>[] xVarArr, Iterable<? extends x<? extends T>> iterable, g<? super Object[], ? extends R> gVar, int i2) {
        this.f157583a = xVarArr;
        this.f157584b = iterable;
        this.f157585c = gVar;
        this.f157586d = i2;
    }
}
