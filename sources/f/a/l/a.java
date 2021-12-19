package f.a.l;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.d.j;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> extends g<T> {

    /* renamed from: a  reason: collision with root package name */
    static final C4177a[] f158013a = new C4177a[0];

    /* renamed from: b  reason: collision with root package name */
    static final C4177a[] f158014b = new C4177a[0];

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<C4177a<T>[]> f158015c = new AtomicReference<>(f158013a);

    /* renamed from: d  reason: collision with root package name */
    Throwable f158016d;

    /* renamed from: e  reason: collision with root package name */
    T f158017e;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.a$a  reason: collision with other inner class name */
    public static final class C4177a<T> extends j<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final a<T> parent;

        static {
            Covode.recordClassIndex(104918);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }

        @Override // f.a.b.b, f.a.e.d.j
        public final void dispose() {
            if (super.tryDispose()) {
                this.parent.a(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Throwable th) {
            if (isDisposed()) {
                f.a.h.a.a(th);
            } else {
                this.downstream.onError(th);
            }
        }

        C4177a(z<? super T> zVar, a<T> aVar) {
            super(zVar);
            this.parent = aVar;
        }
    }

    static {
        Covode.recordClassIndex(104917);
    }

    @Override // f.a.z
    public final void onComplete() {
        C4177a<T>[] aVarArr = this.f158015c.get();
        C4177a<T>[] aVarArr2 = f158014b;
        if (aVarArr != aVarArr2) {
            T t = this.f158017e;
            C4177a<T>[] andSet = this.f158015c.getAndSet(aVarArr2);
            int i2 = 0;
            if (t == null) {
                int length = andSet.length;
                while (i2 < length) {
                    andSet[i2].a();
                    i2++;
                }
                return;
            }
            int length2 = andSet.length;
            while (i2 < length2) {
                andSet[i2].complete(t);
                i2++;
            }
        }
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        if (this.f158015c.get() == f158014b) {
            bVar.dispose();
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        f.a.e.b.b.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f158015c.get() != f158014b) {
            this.f158017e = t;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C4177a<T> aVar) {
        C4177a<T>[] aVarArr;
        C4177a<T>[] aVarArr2;
        do {
            aVarArr = this.f158015c.get();
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
                        aVarArr2 = f158013a;
                    } else {
                        aVarArr2 = new C4177a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                        System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f158015c.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        f.a.e.b.b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C4177a<T>[] aVarArr = this.f158015c.get();
        C4177a<T>[] aVarArr2 = f158014b;
        if (aVarArr == aVarArr2) {
            f.a.h.a.a(th);
            return;
        }
        this.f158017e = null;
        this.f158016d = th;
        C4177a<T>[] andSet = this.f158015c.getAndSet(aVarArr2);
        for (C4177a<T> aVar : andSet) {
            aVar.a(th);
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        C4177a<T>[] aVarArr;
        C4177a<T>[] aVarArr2;
        C4177a<T> aVar = new C4177a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f158015c.get();
            if (aVarArr == f158014b) {
                Throwable th = this.f158016d;
                if (th != null) {
                    zVar.onError(th);
                    return;
                }
                T t = this.f158017e;
                if (t != null) {
                    aVar.complete(t);
                    return;
                } else {
                    aVar.a();
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new C4177a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f158015c.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            a(aVar);
        }
    }
}
