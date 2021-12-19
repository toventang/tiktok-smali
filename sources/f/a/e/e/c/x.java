package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.e.i.b;
import f.a.h;
import f.a.p;
import f.a.r;
import org.a.c;

public final class x<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    final r<T> f157409b;

    static {
        Covode.recordClassIndex(104592);
    }

    static final class a<T> extends b<T> implements p<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104593);
        }

        @Override // f.a.p
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.a.d, f.a.e.i.b
        public final void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        a(c<? super T> cVar) {
            super(cVar);
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public x(r<T> rVar) {
        this.f157409b = rVar;
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157409b.a(new a(cVar));
    }
}
