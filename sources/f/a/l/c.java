package f.a.l;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class c<T> extends g<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a[] f158036a = new a[0];

    /* renamed from: b  reason: collision with root package name */
    static final a[] f158037b = new a[0];

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<a<T>[]> f158038c = new AtomicReference<>(f158037b);

    /* renamed from: d  reason: collision with root package name */
    Throwable f158039d;

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;
        final z<? super T> downstream;
        final c<T> parent;

        static {
            Covode.recordClassIndex(104922);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return get();
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.a(this);
            }
        }

        a(z<? super T> zVar, c<T> cVar) {
            this.downstream = zVar;
            this.parent = cVar;
        }
    }

    static {
        Covode.recordClassIndex(104921);
    }

    @Override // f.a.z
    public final void onComplete() {
        a<T>[] aVarArr = this.f158038c.get();
        a<T>[] aVarArr2 = f158036a;
        if (aVarArr != aVarArr2) {
            a<T>[] andSet = this.f158038c.getAndSet(aVarArr2);
            for (a<T> aVar : andSet) {
                if (!aVar.get()) {
                    aVar.downstream.onComplete();
                }
            }
        }
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        if (this.f158038c.get() == f158036a) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.f158038c.get();
            if (!(aVarArr == f158036a || aVarArr == f158037b)) {
                int length = aVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        if (i2 < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                aVarArr2 = f158037b;
                            } else {
                                aVarArr2 = new a[(length - 1)];
                                System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                                System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f158038c.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        f.a.e.b.b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f158038c.get();
        a<T>[] aVarArr2 = f158036a;
        if (aVarArr == aVarArr2) {
            f.a.h.a.a(th);
            return;
        }
        this.f158039d = th;
        a<T>[] andSet = this.f158038c.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get()) {
                f.a.h.a.a(th);
            } else {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        f.a.e.b.b.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f158038c.get();
        for (a<T> aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.downstream.onNext(t);
            }
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        a<T> aVar = new a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f158038c.get();
            if (aVarArr == f158036a) {
                Throwable th = this.f158039d;
                if (th != null) {
                    zVar.onError(th);
                    return;
                } else {
                    zVar.onComplete();
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f158038c.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            a(aVar);
        }
    }
}
