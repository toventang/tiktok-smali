package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.ag;
import f.a.e.i.b;
import f.a.h;
import org.a.c;

public final class x<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    final ag<? extends T> f157817b;

    static {
        Covode.recordClassIndex(104801);
    }

    static final class a<T> extends b<T> implements ae<T> {
        private static final long serialVersionUID = 187782011903685568L;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104802);
        }

        @Override // org.a.d, f.a.e.i.b
        public final void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        a(c<? super T> cVar) {
            super(cVar);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public x(ag<? extends T> agVar) {
        this.f157817b = agVar;
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157817b.a_(new a(cVar));
    }
}
