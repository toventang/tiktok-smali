package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.e.g.p;
import f.a.t;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class aj extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    final aa f157444a;

    /* renamed from: b  reason: collision with root package name */
    final long f157445b;

    /* renamed from: c  reason: collision with root package name */
    final long f157446c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f157447d;

    static {
        Covode.recordClassIndex(104615);
    }

    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final z<? super Long> downstream;

        static {
            Covode.recordClassIndex(104616);
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
            if (get() != f.a.e.a.b.DISPOSED) {
                z<? super Long> zVar = this.downstream;
                long j2 = this.count;
                this.count = 1 + j2;
                zVar.onNext(Long.valueOf(j2));
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
        aa aaVar = this.f157444a;
        if (aaVar instanceof p) {
            aa.c a2 = aaVar.a();
            f.a.e.a.b.setOnce(aVar, a2);
            a2.a(aVar, this.f157445b, this.f157446c, this.f157447d);
            return;
        }
        f.a.e.a.b.setOnce(aVar, aaVar.a(aVar, this.f157445b, this.f157446c, this.f157447d));
    }

    public aj(long j2, long j3, TimeUnit timeUnit, aa aaVar) {
        this.f157445b = j2;
        this.f157446c = j3;
        this.f157447d = timeUnit;
        this.f157444a = aaVar;
    }
}
