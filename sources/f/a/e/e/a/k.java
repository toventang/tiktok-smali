package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b;
import f.a.d;
import f.a.f;
import java.util.concurrent.atomic.AtomicReference;

public final class k extends b {

    /* renamed from: a  reason: collision with root package name */
    final f f157261a;

    /* renamed from: b  reason: collision with root package name */
    final aa f157262b;

    static {
        Covode.recordClassIndex(104472);
    }

    static final class a extends AtomicReference<f.a.b.b> implements f.a.b.b, d, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final d downstream;
        final f source;
        final f.a.e.a.f task = new f.a.e.a.f();

        static {
            Covode.recordClassIndex(104473);
        }

        @Override // f.a.d
        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void run() {
            this.source.a(this);
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

        @Override // f.a.d
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        @Override // f.a.d
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        a(d dVar, f fVar) {
            this.downstream = dVar;
            this.source = fVar;
        }
    }

    @Override // f.a.b
    public final void b(d dVar) {
        a aVar = new a(dVar, this.f157261a);
        dVar.onSubscribe(aVar);
        aVar.task.replace(this.f157262b.a(aVar));
    }

    public k(f fVar, aa aaVar) {
        this.f157261a = fVar;
        this.f157262b = aaVar;
    }
}
