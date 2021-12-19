package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.a.f;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicReference;

public final class s<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final aa f157396b;

    static {
        Covode.recordClassIndex(104577);
    }

    static final class a<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, p<T> {
        private static final long serialVersionUID = 8571289934935992137L;
        final p<? super T> downstream;
        final f task = new f();

        static {
            Covode.recordClassIndex(104578);
        }

        @Override // f.a.p
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
            this.task.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        a(p<? super T> pVar) {
            this.downstream = pVar;
        }
    }

    static final class b<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157397a;

        /* renamed from: b  reason: collision with root package name */
        final r<T> f157398b;

        static {
            Covode.recordClassIndex(104579);
        }

        public final void run() {
            this.f157398b.a(this.f157397a);
        }

        b(p<? super T> pVar, r<T> rVar) {
            this.f157397a = pVar;
            this.f157398b = rVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        aVar.task.replace(this.f157396b.a(new b(aVar, this.f157348a)));
    }

    public s(r<T> rVar, aa aaVar) {
        super(rVar);
        this.f157396b = aaVar;
    }
}
