package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.e.a.c;
import f.a.t;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bl extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    final aa f157567a;

    /* renamed from: b  reason: collision with root package name */
    final long f157568b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157569c;

    static {
        Covode.recordClassIndex(104690);
    }

    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final z<? super Long> downstream;

        static {
            Covode.recordClassIndex(104691);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == f.a.e.a.b.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (!isDisposed()) {
                this.downstream.onNext(0L);
                lazySet(c.INSTANCE);
                this.downstream.onComplete();
            }
        }

        a(z<? super Long> zVar) {
            this.downstream = zVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super Long> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        f.a.e.a.b.trySet(aVar, this.f157567a.a(aVar, this.f157568b, this.f157569c));
    }

    public bl(long j2, TimeUnit timeUnit, aa aaVar) {
        this.f157568b = j2;
        this.f157569c = timeUnit;
        this.f157567a = aaVar;
    }
}
