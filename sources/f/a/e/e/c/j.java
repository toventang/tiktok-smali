package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicReference;

public final class j<T, R> extends a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends r<? extends R>> f157367b;

    static {
        Covode.recordClassIndex(104560);
    }

    static final class a<T, R> extends AtomicReference<b> implements b, p<T> {
        private static final long serialVersionUID = 4375739915521278546L;
        final p<? super R> downstream;
        final g<? super T, ? extends r<? extends R>> mapper;
        b upstream;

        static {
            Covode.recordClassIndex(104561);
        }

        /* renamed from: f.a.e.e.c.j$a$a  reason: collision with other inner class name */
        final class C4160a implements p<R> {
            static {
                Covode.recordClassIndex(104562);
            }

            @Override // f.a.p
            public final void onComplete() {
                a.this.downstream.onComplete();
            }

            C4160a() {
            }

            @Override // f.a.p
            public final void onError(Throwable th) {
                a.this.downstream.onError(th);
            }

            @Override // f.a.p
            public final void onSubscribe(b bVar) {
                f.a.e.a.b.setOnce(a.this, bVar);
            }

            @Override // f.a.p
            public final void onSuccess(R r) {
                a.this.downstream.onSuccess(r);
            }
        }

        @Override // f.a.p
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
            this.upstream.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            try {
                r rVar = (r) f.a.e.b.b.a(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    rVar.a(new C4160a());
                }
            } catch (Exception e2) {
                f.a.c.b.a(e2);
                this.downstream.onError(e2);
            }
        }

        a(p<? super R> pVar, g<? super T, ? extends r<? extends R>> gVar) {
            this.downstream = pVar;
            this.mapper = gVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super R> pVar) {
        this.f157348a.a(new a(pVar, this.f157367b));
    }

    public j(r<T> rVar, g<? super T, ? extends r<? extends R>> gVar) {
        super(rVar);
        this.f157367b = gVar;
    }
}
