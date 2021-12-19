package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ad;
import f.a.ae;
import f.a.af;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final af<T> f157754a;

    static {
        Covode.recordClassIndex(104759);
    }

    /* renamed from: f.a.e.e.f.a$a  reason: collision with other inner class name */
    static final class C4169a<T> extends AtomicReference<b> implements ad<T>, b {
        private static final long serialVersionUID = -2467358622224974244L;
        final ae<? super T> downstream;

        static {
            Covode.recordClassIndex(104760);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b, f.a.ad
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        public final String toString() {
            return com.a.a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C4169a(ae<? super T> aeVar) {
            this.downstream = aeVar;
        }

        @Override // f.a.ad
        public final void a(Throwable th) {
            if (!b(th)) {
                f.a.h.a.a(th);
            }
        }

        @Override // f.a.ad
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

        @Override // f.a.ad
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
    }

    public a(af<T> afVar) {
        this.f157754a = afVar;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        C4169a aVar = new C4169a(aeVar);
        aeVar.onSubscribe(aVar);
        try {
            this.f157754a.subscribe(aVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            aVar.a(th);
        }
    }
}
