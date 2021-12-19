package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.d;
import f.a.d.g;
import f.a.x;
import f.a.z;

public final class n<T, K> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, K> f157692b;

    /* renamed from: c  reason: collision with root package name */
    final d<? super K, ? super K> f157693c;

    static {
        Covode.recordClassIndex(104735);
    }

    static final class a<T, K> extends f.a.e.d.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final g<? super T, K> f157694f;

        /* renamed from: g  reason: collision with root package name */
        final d<? super K, ? super K> f157695g;

        /* renamed from: h  reason: collision with root package name */
        K f157696h;

        /* renamed from: i  reason: collision with root package name */
        boolean f157697i;

        static {
            Covode.recordClassIndex(104736);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.e.c.i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T poll() {
            /*
                r4 = this;
            L_0x0000:
                f.a.e.c.d r0 = r4.f157211c
                java.lang.Object r3 = r0.poll()
                if (r3 != 0) goto L_0x000a
                r0 = 0
                return r0
            L_0x000a:
                f.a.d.g<? super T, K> r0 = r4.f157694f
                java.lang.Object r2 = r0.apply(r3)
                boolean r0 = r4.f157697i
                if (r0 != 0) goto L_0x001a
                r0 = 1
                r4.f157697i = r0
                r4.f157696h = r2
                return r3
            L_0x001a:
                f.a.d.d<? super K, ? super K> r1 = r4.f157695g
                K r0 = r4.f157696h
                boolean r0 = r1.a(r0, r2)
                if (r0 != 0) goto L_0x0027
                r4.f157696h = r2
                return r3
            L_0x0027:
                r4.f157696h = r2
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.n.a.poll():java.lang.Object");
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157212d) {
                if (this.f157213e != 0) {
                    this.f157209a.onNext(t);
                    return;
                }
                try {
                    K apply = this.f157694f.apply(t);
                    if (this.f157697i) {
                        boolean a2 = this.f157695g.a(this.f157696h, apply);
                        this.f157696h = apply;
                        if (a2) {
                            return;
                        }
                    } else {
                        this.f157697i = true;
                        this.f157696h = apply;
                    }
                    this.f157209a.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        a(z<? super T> zVar, g<? super T, K> gVar, d<? super K, ? super K> dVar) {
            super(zVar);
            this.f157694f = gVar;
            this.f157695g = dVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157692b, this.f157693c));
    }

    public n(x<T> xVar, g<? super T, K> gVar, d<? super K, ? super K> dVar) {
        super(xVar);
        this.f157692b = gVar;
        this.f157693c = dVar;
    }
}
