package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class w extends ab<Long> {

    /* renamed from: a  reason: collision with root package name */
    final long f157814a = 8;

    /* renamed from: b  reason: collision with root package name */
    final TimeUnit f157815b;

    /* renamed from: c  reason: collision with root package name */
    final aa f157816c;

    static {
        Covode.recordClassIndex(104799);
    }

    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final ae<? super Long> downstream;

        static {
            Covode.recordClassIndex(104800);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        public final void run() {
            this.downstream.onSuccess(0L);
        }

        a(ae<? super Long> aeVar) {
            this.downstream = aeVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super Long> aeVar) {
        a aVar = new a(aeVar);
        aeVar.onSubscribe(aVar);
        f.a.e.a.b.replace(aVar, this.f157816c.a(aVar, this.f157814a, this.f157815b));
    }

    public w(TimeUnit timeUnit, aa aaVar) {
        this.f157815b = timeUnit;
        this.f157816c = aaVar;
    }
}
