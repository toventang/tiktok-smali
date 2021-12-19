package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.c.c;
import f.a.n;
import f.a.p;
import f.a.x;
import f.a.z;

public final class t<T> extends n<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157724a;

    /* renamed from: b  reason: collision with root package name */
    final long f157725b = 0;

    static {
        Covode.recordClassIndex(104746);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157726a;

        /* renamed from: b  reason: collision with root package name */
        final long f157727b;

        /* renamed from: c  reason: collision with root package name */
        b f157728c;

        /* renamed from: d  reason: collision with root package name */
        long f157729d;

        /* renamed from: e  reason: collision with root package name */
        boolean f157730e;

        static {
            Covode.recordClassIndex(104747);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157728c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157728c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157730e) {
                this.f157730e = true;
                this.f157726a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157728c, bVar)) {
                this.f157728c = bVar;
                this.f157726a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157730e) {
                f.a.h.a.a(th);
                return;
            }
            this.f157730e = true;
            this.f157726a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157730e) {
                long j2 = this.f157729d;
                if (j2 == this.f157727b) {
                    this.f157730e = true;
                    this.f157728c.dispose();
                    this.f157726a.onSuccess(t);
                    return;
                }
                this.f157729d = j2 + 1;
            }
        }

        a(p<? super T> pVar, long j2) {
            this.f157726a = pVar;
            this.f157727b = j2;
        }
    }

    @Override // f.a.e.c.c
    public final f.a.t<T> a() {
        return f.a.h.a.a(new s(this.f157724a, this.f157725b, null, false));
    }

    public t(x<T> xVar) {
        this.f157724a = xVar;
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157724a.b(new a(pVar, this.f157725b));
    }
}
