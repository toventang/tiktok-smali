package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.c;
import f.a.d;
import f.a.e;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    final e f157234a;

    static {
        Covode.recordClassIndex(104457);
    }

    /* renamed from: f.a.e.e.a.a$a  reason: collision with other inner class name */
    static final class C4157a extends AtomicReference<f.a.b.b> implements f.a.b.b, c {
        private static final long serialVersionUID = -2467358622224974244L;
        final d downstream;

        static {
            Covode.recordClassIndex(104458);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        public final String toString() {
            return com.a.a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        @Override // f.a.c
        public final void a() {
            f.a.b.b bVar;
            if (get() != f.a.e.a.b.DISPOSED && (bVar = (f.a.b.b) getAndSet(f.a.e.a.b.DISPOSED)) != f.a.e.a.b.DISPOSED) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        C4157a(d dVar) {
            this.downstream = dVar;
        }

        @Override // f.a.c
        public final void a(Throwable th) {
            if (!b(th)) {
                f.a.h.a.a(th);
            }
        }

        private boolean b(Throwable th) {
            f.a.b.b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == f.a.e.a.b.DISPOSED || (bVar = (f.a.b.b) getAndSet(f.a.e.a.b.DISPOSED)) == f.a.e.a.b.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    public a(e eVar) {
        this.f157234a = eVar;
    }

    @Override // f.a.b
    public final void b(d dVar) {
        C4157a aVar = new C4157a(dVar);
        dVar.onSubscribe(aVar);
        try {
            this.f157234a.a(aVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            aVar.a(th);
        }
    }
}
