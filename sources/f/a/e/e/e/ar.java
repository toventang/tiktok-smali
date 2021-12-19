package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.e.j.h;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ar<T> extends f.a.f.a<T> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157473a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<b<T>> f157474b;

    /* renamed from: c  reason: collision with root package name */
    final x<T> f157475c;

    static {
        Covode.recordClassIndex(104629);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicReference<Object> implements f.a.b.b {
        private static final long serialVersionUID = -1100270633763673112L;
        final z<? super T> child;

        static {
            Covode.recordClassIndex(104630);
        }

        @Override // f.a.b.b
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b) andSet).a(this);
            }
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        a(z<? super T> zVar) {
            this.child = zVar;
        }
    }

    static final class b<T> implements f.a.b.b, z<T> {

        /* renamed from: b  reason: collision with root package name */
        static final a[] f157476b = new a[0];

        /* renamed from: c  reason: collision with root package name */
        static final a[] f157477c = new a[0];

        /* renamed from: a  reason: collision with root package name */
        final AtomicReference<b<T>> f157478a;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<a<T>[]> f157479d = new AtomicReference<>(f157476b);

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f157480e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<f.a.b.b> f157481f = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104631);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (this.f157479d.get() == f157477c) {
                return true;
            }
            return false;
        }

        @Override // f.a.b.b
        public final void dispose() {
            AtomicReference<a<T>[]> atomicReference = this.f157479d;
            a<T>[] aVarArr = f157477c;
            if (atomicReference.getAndSet(aVarArr) != aVarArr) {
                this.f157478a.compareAndSet(this, null);
                f.a.e.a.b.dispose(this.f157481f);
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157478a.compareAndSet(this, null);
            for (a<T> aVar : this.f157479d.getAndSet(f157477c)) {
                aVar.child.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.f157481f, bVar);
        }

        b(AtomicReference<b<T>> atomicReference) {
            this.f157478a = atomicReference;
            this.f157480e = new AtomicBoolean();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            for (a<T> aVar : this.f157479d.get()) {
                aVar.child.onNext(t);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(a<T> aVar) {
            a<T>[] aVarArr;
            a<T>[] aVarArr2;
            do {
                aVarArr = this.f157479d.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i2 = 0;
                    while (!aVarArr[i2].equals(aVar)) {
                        i2++;
                        if (i2 >= length) {
                            return;
                        }
                    }
                    if (i2 >= 0) {
                        if (length == 1) {
                            aVarArr2 = f157476b;
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
            } while (!this.f157479d.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157478a.compareAndSet(this, null);
            a<T>[] andSet = this.f157479d.getAndSet(f157477c);
            if (andSet.length != 0) {
                for (a<T> aVar : andSet) {
                    aVar.child.onError(th);
                }
                return;
            }
            f.a.h.a.a(th);
        }
    }

    public static final class c<T> implements x<T> {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReference<b<T>> f157482a;

        static {
            Covode.recordClassIndex(104632);
        }

        public c(AtomicReference<b<T>> atomicReference) {
            this.f157482a = atomicReference;
        }

        @Override // f.a.x
        public final void b(z<? super T> zVar) {
            b<T> bVar;
            a<T> aVar = new a<>(zVar);
            zVar.onSubscribe(aVar);
            loop0:
            while (true) {
                bVar = this.f157482a.get();
                if (bVar == null || bVar.isDisposed()) {
                    b<T> bVar2 = new b<>(this.f157482a);
                    if (this.f157482a.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    a<T>[] aVarArr = bVar.f157479d.get();
                    if (aVarArr != b.f157477c) {
                        int length = aVarArr.length;
                        a<T>[] aVarArr2 = new a[(length + 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        if (bVar.f157479d.compareAndSet(aVarArr, aVarArr2)) {
                            break loop0;
                        }
                    } else {
                        continue;
                        break;
                    }
                }
            }
            if (!aVar.compareAndSet(null, bVar)) {
                bVar.a(aVar);
            }
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157475c.b(zVar);
    }

    @Override // f.a.f.a
    public final void e(f<? super f.a.b.b> fVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f157474b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f157474b);
            if (this.f157474b.compareAndSet(bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z = true;
        if (bVar.f157480e.get() || !bVar.f157480e.compareAndSet(false, true)) {
            z = false;
        }
        try {
            fVar.accept(bVar);
            if (z) {
                this.f157473a.b(bVar);
            }
        } catch (Throwable th) {
            f.a.c.b.a(th);
            throw h.a(th);
        }
    }

    public ar(x<T> xVar, x<T> xVar2, AtomicReference<b<T>> atomicReference) {
        this.f157475c = xVar;
        this.f157473a = xVar2;
        this.f157474b = atomicReference;
    }
}
