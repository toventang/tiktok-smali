package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.d.g;
import f.a.e.e.f.p;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class z<T, R> extends ab<R> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T>[] f157819a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super Object[], ? extends R> f157820b;

    static {
        Covode.recordClassIndex(104805);
    }

    static final class b<T, R> extends AtomicInteger implements f.a.b.b {
        private static final long serialVersionUID = -5556924161382950569L;
        final ae<? super R> downstream;
        final c<T>[] observers;
        final Object[] values;
        final g<? super Object[], ? extends R> zipper;

        static {
            Covode.recordClassIndex(104807);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.observers) {
                    f.a.e.a.b.dispose(cVar);
                }
            }
        }

        private void a(int i2) {
            c<T>[] cVarArr = this.observers;
            int length = cVarArr.length;
            for (int i3 = 0; i3 < i2; i3++) {
                f.a.e.a.b.dispose(cVarArr[i3]);
            }
            while (true) {
                i2++;
                if (i2 < length) {
                    f.a.e.a.b.dispose(cVarArr[i2]);
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Throwable th, int i2) {
            if (getAndSet(0) > 0) {
                a(i2);
                this.downstream.onError(th);
                return;
            }
            f.a.h.a.a(th);
        }

        b(ae<? super R> aeVar, int i2, g<? super Object[], ? extends R> gVar) {
            super(i2);
            this.downstream = aeVar;
            this.zipper = gVar;
            c<T>[] cVarArr = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cVarArr[i3] = new c<>(this, i3);
            }
            this.observers = cVarArr;
            this.values = new Object[i2];
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> extends AtomicReference<f.a.b.b> implements ae<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final b<T, ?> parent;

        static {
            Covode.recordClassIndex(104808);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.parent.a(th, this.index);
        }

        /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: ? super java.lang.Object[] */
        @Override // f.a.ae
        public final void onSuccess(T t) {
            b<T, ?> bVar = this.parent;
            bVar.values[this.index] = t;
            if (bVar.decrementAndGet() == 0) {
                try {
                    bVar.downstream.onSuccess(f.a.e.b.b.a(bVar.zipper.apply(bVar.values), "The zipper returned a null value"));
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    bVar.downstream.onError(th);
                }
            }
        }

        c(b<T, ?> bVar, int i2) {
            this.parent = bVar;
            this.index = i2;
        }
    }

    final class a implements g<T, R> {
        static {
            Covode.recordClassIndex(104806);
        }

        a() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.d.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T r4) {
            /*
                r3 = this;
                f.a.e.e.f.z r0 = f.a.e.e.f.z.this
                f.a.d.g<? super java.lang.Object[], ? extends R> r2 = r0.f157820b
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r0 = 0
                r1[r0] = r4
                java.lang.Object r1 = r2.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                java.lang.Object r0 = f.a.e.b.b.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.f.z.a.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super R> aeVar) {
        ag<? extends T>[] agVarArr = this.f157819a;
        int length = agVarArr.length;
        if (length == 1) {
            agVarArr[0].a_(new p.a(aeVar, new a()));
            return;
        }
        b bVar = new b(aeVar, length, this.f157820b);
        aeVar.onSubscribe(bVar);
        for (int i2 = 0; i2 < length && !bVar.isDisposed(); i2++) {
            ag<? extends T> agVar = agVarArr[i2];
            if (agVar == null) {
                bVar.a(new NullPointerException("One of the sources is null"), i2);
                return;
            } else {
                agVar.a_(bVar.observers[i2]);
            }
        }
    }

    public z(ag<? extends T>[] agVarArr, g<? super Object[], ? extends R> gVar) {
        this.f157819a = agVarArr;
        this.f157820b = gVar;
    }
}
