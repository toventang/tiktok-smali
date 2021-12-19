package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class i<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final w<T> f157660a;

    static {
        Covode.recordClassIndex(104722);
    }

    static final class a<T> extends AtomicReference<b> implements b, v<T> {
        private static final long serialVersionUID = -3434801548987643227L;
        final z<? super T> observer;

        static {
            Covode.recordClassIndex(104723);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.v, f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.g
        public final void a() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public final String toString() {
            return com.a.a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        a(z<? super T> zVar) {
            this.observer = zVar;
        }

        @Override // f.a.g
        public final void a(Throwable th) {
            if (!b(th)) {
                f.a.h.a.a(th);
            }
        }

        /* JADX INFO: finally extract failed */
        @Override // f.a.v
        public final boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // f.a.g
        public final void a(T t) {
            if (t == null) {
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.observer.onNext(t);
            }
        }
    }

    public i(w<T> wVar) {
        this.f157660a = wVar;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        try {
            this.f157660a.subscribe(aVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            aVar.a(th);
        }
    }
}
