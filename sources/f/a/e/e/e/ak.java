package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.e.g.p;
import f.a.t;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ak extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    final aa f157448a;

    /* renamed from: b  reason: collision with root package name */
    final long f157449b;

    /* renamed from: c  reason: collision with root package name */
    final long f157450c;

    /* renamed from: d  reason: collision with root package name */
    final long f157451d;

    /* renamed from: e  reason: collision with root package name */
    final long f157452e;

    /* renamed from: f  reason: collision with root package name */
    final TimeUnit f157453f;

    static {
        Covode.recordClassIndex(104617);
    }

    static final class a extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final z<? super Long> downstream;
        final long end;

        static {
            Covode.recordClassIndex(104618);
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
                long j2 = this.count;
                this.downstream.onNext(Long.valueOf(j2));
                if (j2 == this.end) {
                    f.a.e.a.b.dispose(this);
                    this.downstream.onComplete();
                    return;
                }
                this.count = j2 + 1;
            }
        }

        a(z<? super Long> zVar, long j2, long j3) {
            this.downstream = zVar;
            this.count = j2;
            this.end = j3;
        }
    }

    @Override // f.a.t
    public final void a(z<? super Long> zVar) {
        a aVar = new a(zVar, this.f157449b, this.f157450c);
        zVar.onSubscribe(aVar);
        aa aaVar = this.f157448a;
        if (aaVar instanceof p) {
            aa.c a2 = aaVar.a();
            f.a.e.a.b.setOnce(aVar, a2);
            a2.a(aVar, this.f157451d, this.f157452e, this.f157453f);
            return;
        }
        f.a.e.a.b.setOnce(aVar, aaVar.a(aVar, this.f157451d, this.f157452e, this.f157453f));
    }

    public ak(long j2, long j3, long j4, long j5, TimeUnit timeUnit, aa aaVar) {
        this.f157451d = j4;
        this.f157452e = j5;
        this.f157453f = timeUnit;
        this.f157448a = aaVar;
        this.f157449b = j2;
        this.f157450c = j3;
    }
}
