package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.h;
import f.a.t;
import f.a.z;
import org.a.c;
import org.a.d;

public final class k<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    private final t<T> f157319b;

    static {
        Covode.recordClassIndex(104510);
    }

    static final class a<T> implements z<T>, d {

        /* renamed from: a  reason: collision with root package name */
        final c<? super T> f157320a;

        /* renamed from: b  reason: collision with root package name */
        b f157321b;

        static {
            Covode.recordClassIndex(104511);
        }

        @Override // org.a.d
        public final void request(long j2) {
        }

        @Override // org.a.d
        public final void cancel() {
            this.f157321b.dispose();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157320a.onComplete();
        }

        a(c<? super T> cVar) {
            this.f157320a = cVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157320a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157320a.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.f157321b = bVar;
            this.f157320a.onSubscribe(this);
        }
    }

    public k(t<T> tVar) {
        this.f157319b = tVar;
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157319b.b((z) new a(cVar));
    }
}
