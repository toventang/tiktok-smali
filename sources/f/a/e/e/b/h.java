package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.k;
import f.a.l;
import org.a.c;

public final class h<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final k<? super T> f157309c;

    static {
        Covode.recordClassIndex(104503);
    }

    static final class a<T> extends f.a.e.h.a<T, T> {

        /* renamed from: a  reason: collision with root package name */
        final k<? super T> f157310a;

        static {
            Covode.recordClassIndex(104504);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.e.c.i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T poll() {
            /*
                r4 = this;
                f.a.e.c.f r3 = r4.f157928g
                f.a.d.k<? super T> r2 = r4.f157310a
            L_0x0004:
                java.lang.Object r1 = r3.poll()
                if (r1 != 0) goto L_0x000c
                r0 = 0
                return r0
            L_0x000c:
                boolean r0 = r2.a(r1)
                if (r0 == 0) goto L_0x0013
                return r1
            L_0x0013:
                int r1 = r4.f157930i
                r0 = 2
                if (r1 != r0) goto L_0x0004
                r0 = 1
                r3.request(r0)
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.b.h.a.poll():java.lang.Object");
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!a((Object) t)) {
                this.f157927f.request(1);
            }
        }

        @Override // f.a.e.c.a
        public final boolean a(T t) {
            if (this.f157929h) {
                return false;
            }
            if (this.f157930i != 0) {
                return this.f157926e.a(null);
            }
            try {
                if (!this.f157310a.a(t) || !this.f157926e.a(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        a(f.a.e.c.a<? super T> aVar, k<? super T> kVar) {
            super(aVar);
            this.f157310a = kVar;
        }
    }

    static final class b<T> extends f.a.e.h.b<T, T> implements f.a.e.c.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final k<? super T> f157311a;

        static {
            Covode.recordClassIndex(104505);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.e.c.i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T poll() {
            /*
                r4 = this;
                f.a.e.c.f r3 = r4.f157933g
                f.a.d.k<? super T> r2 = r4.f157311a
            L_0x0004:
                java.lang.Object r1 = r3.poll()
                if (r1 != 0) goto L_0x000c
                r0 = 0
                return r0
            L_0x000c:
                boolean r0 = r2.a(r1)
                if (r0 == 0) goto L_0x0013
                return r1
            L_0x0013:
                int r1 = r4.f157935i
                r0 = 2
                if (r1 != r0) goto L_0x0004
                r0 = 1
                r3.request(r0)
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.b.h.b.poll():java.lang.Object");
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!a((Object) t)) {
                this.f157932f.request(1);
            }
        }

        @Override // f.a.e.c.a
        public final boolean a(T t) {
            if (this.f157934h) {
                return false;
            }
            if (this.f157935i != 0) {
                this.f157931e.onNext(null);
                return true;
            }
            try {
                boolean a2 = this.f157311a.a(t);
                if (a2) {
                    this.f157931e.onNext(t);
                }
                return a2;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        b(c<? super T> cVar, k<? super T> kVar) {
            super(cVar);
            this.f157311a = kVar;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        if (cVar instanceof f.a.e.c.a) {
            this.f157263b.a((l) new a((f.a.e.c.a) cVar, this.f157309c));
        } else {
            this.f157263b.a((l) new b(cVar, this.f157309c));
        }
    }

    public h(f.a.h<T> hVar, k<? super T> kVar) {
        super(hVar);
        this.f157309c = kVar;
    }
}
