package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.a.c;
import f.a.x;
import f.a.z;

public final class bg<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157545b;

    static {
        Covode.recordClassIndex(104675);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157546a;

        /* renamed from: b  reason: collision with root package name */
        boolean f157547b;

        /* renamed from: c  reason: collision with root package name */
        b f157548c;

        /* renamed from: d  reason: collision with root package name */
        long f157549d;

        static {
            Covode.recordClassIndex(104676);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157548c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157548c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157547b) {
                this.f157547b = true;
                this.f157548c.dispose();
                this.f157546a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157547b) {
                f.a.h.a.a(th);
                return;
            }
            this.f157547b = true;
            this.f157548c.dispose();
            this.f157546a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            boolean z;
            if (!this.f157547b) {
                long j2 = this.f157549d;
                long j3 = j2 - 1;
                this.f157549d = j3;
                if (j2 > 0) {
                    if (j3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f157546a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157548c, bVar)) {
                this.f157548c = bVar;
                if (this.f157549d == 0) {
                    this.f157547b = true;
                    bVar.dispose();
                    c.complete(this.f157546a);
                    return;
                }
                this.f157546a.onSubscribe(this);
            }
        }

        a(z<? super T> zVar, long j2) {
            this.f157546a = zVar;
            this.f157549d = j2;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157545b));
    }

    public bg(x<T> xVar, long j2) {
        super(xVar);
        this.f157545b = j2;
    }
}
