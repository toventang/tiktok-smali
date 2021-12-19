package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.n;
import f.a.o;
import f.a.p;
import f.a.q;
import java.util.concurrent.atomic.AtomicReference;

public final class c<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f157349a;

    static {
        Covode.recordClassIndex(104547);
    }

    static final class a<T> extends AtomicReference<b> implements b, o<T> {
        private static final long serialVersionUID = -2467358622224974244L;
        final p<? super T> downstream;

        static {
            Covode.recordClassIndex(104548);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        public final String toString() {
            return com.a.a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        @Override // f.a.o
        public final void a() {
            b bVar;
            if (get() != f.a.e.a.b.DISPOSED && (bVar = (b) getAndSet(f.a.e.a.b.DISPOSED)) != f.a.e.a.b.DISPOSED) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        a(p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // f.a.o
        public final void a(Throwable th) {
            if (!b(th)) {
                f.a.h.a.a(th);
            }
        }

        @Override // f.a.o
        public final boolean b(Throwable th) {
            b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == f.a.e.a.b.DISPOSED || (bVar = (b) getAndSet(f.a.e.a.b.DISPOSED)) == f.a.e.a.b.DISPOSED) {
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

        @Override // f.a.o
        public final void a(T t) {
            b bVar;
            if (get() != f.a.e.a.b.DISPOSED && (bVar = (b) getAndSet(f.a.e.a.b.DISPOSED)) != f.a.e.a.b.DISPOSED) {
                if (t == null) {
                    try {
                        this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.downstream.onSuccess(t);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    public c(q<T> qVar) {
        this.f157349a = qVar;
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        try {
            this.f157349a.a(aVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            aVar.a(th);
        }
    }
}
