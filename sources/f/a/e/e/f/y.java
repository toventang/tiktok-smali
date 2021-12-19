package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.e.d.j;
import f.a.t;
import f.a.z;

public final class y<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157818a;

    static {
        Covode.recordClassIndex(104803);
    }

    static final class a<T> extends j<T> implements ae<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        b upstream;

        static {
            Covode.recordClassIndex(104804);
        }

        @Override // f.a.b.b, f.a.e.d.j
        public final void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        a(z<? super T> zVar) {
            super(zVar);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            error(th);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public y(ag<? extends T> agVar) {
        this.f157818a = agVar;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157818a.a_(new a(zVar));
    }
}
