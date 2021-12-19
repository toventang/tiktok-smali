package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.e.g.p;
import f.a.e.i.f;
import f.a.h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class n extends h<Long> {

    /* renamed from: b  reason: collision with root package name */
    final aa f157324b;

    /* renamed from: c  reason: collision with root package name */
    final long f157325c;

    /* renamed from: d  reason: collision with root package name */
    final long f157326d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f157327e;

    static {
        Covode.recordClassIndex(104515);
    }

    static final class a extends AtomicLong implements Runnable, d {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final c<? super Long> downstream;
        final AtomicReference<b> resource = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104516);
        }

        @Override // org.a.d
        public final void cancel() {
            f.a.e.a.b.dispose(this.resource);
        }

        public final void run() {
            if (this.resource.get() == f.a.e.a.b.DISPOSED) {
                return;
            }
            if (get() != 0) {
                c<? super Long> cVar = this.downstream;
                long j2 = this.count;
                this.count = j2 + 1;
                cVar.onNext(Long.valueOf(j2));
                f.a.e.j.d.b(this, 1);
                return;
            }
            this.downstream.onError(new f.a.c.c("Can't deliver value " + this.count + " due to lack of requests"));
            f.a.e.a.b.dispose(this.resource);
        }

        public final void a(b bVar) {
            f.a.e.a.b.setOnce(this.resource, bVar);
        }

        a(c<? super Long> cVar) {
            this.downstream = cVar;
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                f.a.e.j.d.a(this, j2);
            }
        }
    }

    @Override // f.a.h
    public final void a(c<? super Long> cVar) {
        a aVar = new a(cVar);
        cVar.onSubscribe(aVar);
        aa aaVar = this.f157324b;
        if (aaVar instanceof p) {
            aa.c a2 = aaVar.a();
            aVar.a(a2);
            a2.a(aVar, this.f157325c, this.f157326d, this.f157327e);
            return;
        }
        aVar.a(aaVar.a(aVar, this.f157325c, this.f157326d, this.f157327e));
    }

    public n(long j2, long j3, TimeUnit timeUnit, aa aaVar) {
        this.f157325c = j2;
        this.f157326d = j3;
        this.f157327e = timeUnit;
        this.f157324b = aaVar;
    }
}
