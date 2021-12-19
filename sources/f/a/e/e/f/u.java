package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.e.a.f;
import java.util.concurrent.atomic.AtomicReference;

public final class u<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157807a;

    /* renamed from: b  reason: collision with root package name */
    final aa f157808b;

    static {
        Covode.recordClassIndex(104794);
    }

    static final class a<T> extends AtomicReference<b> implements ae<T>, b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final ae<? super T> downstream;
        final ag<? extends T> source;
        final f task = new f();

        static {
            Covode.recordClassIndex(104795);
        }

        public final void run() {
            this.source.a_(this);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
            this.task.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        a(ae<? super T> aeVar, ag<? extends T> agVar) {
            this.downstream = aeVar;
            this.source = agVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        a aVar = new a(aeVar, this.f157807a);
        aeVar.onSubscribe(aVar);
        aVar.task.replace(this.f157808b.a(aVar));
    }

    public u(ag<? extends T> agVar, aa aaVar) {
        this.f157807a = agVar;
        this.f157808b = aaVar;
    }
}
