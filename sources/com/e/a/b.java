package com.e.a;

import com.bytedance.covode.number.Covode;
import f.a.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a[] f46458a = new a[0];

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<a<T>[]> f46459b = new AtomicReference<>(f46458a);

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicBoolean implements f.a.b.b {
        private static final long serialVersionUID = 3562861878281475070L;
        final z<? super T> downstream;
        final b<T> parent;

        static {
            Covode.recordClassIndex(28356);
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

        a(z<? super T> zVar, b<T> bVar) {
            this.downstream = zVar;
            this.parent = bVar;
        }
    }

    static {
        Covode.recordClassIndex(28355);
    }

    /* access modifiers changed from: package-private */
    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.f46459b.get();
            if (aVarArr != f46458a) {
                int length = aVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        if (i2 < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                aVarArr2 = f46458a;
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
        } while (!this.f46459b.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // f.a.d.f, com.e.a.c
    public final void accept(T t) {
        Objects.requireNonNull(t, "value == null");
        a<T>[] aVarArr = this.f46459b.get();
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
            aVarArr = this.f46459b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f46459b.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            a(aVar);
        }
    }
}
