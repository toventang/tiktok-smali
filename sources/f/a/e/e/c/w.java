package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.n;
import f.a.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class w extends n<Long> {

    /* renamed from: a  reason: collision with root package name */
    final long f157406a;

    /* renamed from: b  reason: collision with root package name */
    final TimeUnit f157407b;

    /* renamed from: c  reason: collision with root package name */
    final aa f157408c;

    static {
        Covode.recordClassIndex(104590);
    }

    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final p<? super Long> downstream;

        static {
            Covode.recordClassIndex(104591);
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

        a(p<? super Long> pVar) {
            this.downstream = pVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super Long> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        f.a.e.a.b.replace(aVar, this.f157408c.a(aVar, this.f157406a, this.f157407b));
    }

    public w(long j2, TimeUnit timeUnit, aa aaVar) {
        this.f157406a = j2;
        this.f157407b = timeUnit;
        this.f157408c = aaVar;
    }
}
