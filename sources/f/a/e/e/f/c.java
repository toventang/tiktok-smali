package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.f;

public final class c<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157756a;

    /* renamed from: b  reason: collision with root package name */
    final f<? super T> f157757b;

    static {
        Covode.recordClassIndex(104762);
    }

    static final class a<T> implements ae<T>, b {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157758a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super T> f157759b;

        /* renamed from: c  reason: collision with root package name */
        b f157760c;

        static {
            Covode.recordClassIndex(104763);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157760c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157760c.isDisposed();
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.f157758a.onError(th);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157760c, bVar)) {
                this.f157760c = bVar;
                this.f157758a.onSubscribe(this);
            }
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.f157758a.onSuccess(t);
            try {
                this.f157759b.accept(t);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
        }

        a(ae<? super T> aeVar, f<? super T> fVar) {
            this.f157758a = aeVar;
            this.f157759b = fVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157756a.a_(new a(aeVar, this.f157757b));
    }

    public c(ag<T> agVar, f<? super T> fVar) {
        this.f157756a = agVar;
        this.f157757b = fVar;
    }
}
