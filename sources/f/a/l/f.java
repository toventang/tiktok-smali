package f.a.l;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class f<T> extends ab<T> implements ae<T> {

    /* renamed from: b  reason: collision with root package name */
    static final a[] f158050b = new a[0];

    /* renamed from: c  reason: collision with root package name */
    static final a[] f158051c = new a[0];

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<a<T>[]> f158052a = new AtomicReference<>(f158050b);

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f158053d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    T f158054e;

    /* renamed from: f  reason: collision with root package name */
    Throwable f158055f;

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicReference<f<T>> implements b {
        private static final long serialVersionUID = -7650903191002190468L;
        final ae<? super T> downstream;

        static {
            Covode.recordClassIndex(104929);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f fVar = (f) getAndSet(null);
            if (fVar != null) {
                fVar.a((a) this);
            }
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        a(ae<? super T> aeVar, f<T> fVar) {
            this.downstream = aeVar;
            lazySet(fVar);
        }
    }

    static {
        Covode.recordClassIndex(104928);
    }

    @Override // f.a.ae
    public final void onSubscribe(b bVar) {
        if (this.f158052a.get() == f158051c) {
            bVar.dispose();
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        a<T> aVar = new a<>(aeVar, this);
        aeVar.onSubscribe(aVar);
        do {
            aVarArr = this.f158052a.get();
            if (aVarArr == f158051c) {
                Throwable th = this.f158055f;
                if (th != null) {
                    aeVar.onError(th);
                    return;
                } else {
                    aeVar.onSuccess(this.f158054e);
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f158052a.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            a((a) aVar);
        }
    }

    @Override // f.a.ae
    public final void onError(Throwable th) {
        f.a.e.b.b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f158053d.compareAndSet(false, true)) {
            this.f158055f = th;
            for (a<T> aVar : this.f158052a.getAndSet(f158051c)) {
                aVar.downstream.onError(th);
            }
            return;
        }
        f.a.h.a.a(th);
    }

    @Override // f.a.ae
    public final void onSuccess(T t) {
        f.a.e.b.b.a((Object) t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f158053d.compareAndSet(false, true)) {
            this.f158054e = t;
            for (a<T> aVar : this.f158052a.getAndSet(f158051c)) {
                aVar.downstream.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.f158052a.get();
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
                        aVarArr2 = f158050b;
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
        } while (!this.f158052a.compareAndSet(aVarArr, aVarArr2));
    }
}
