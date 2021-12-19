package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.j.c;
import f.a.e.j.i;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bh<T, U> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final x<? extends U> f157550b;

    static {
        Covode.recordClassIndex(104677);
    }

    static final class a<T, U> extends AtomicInteger implements b, z<T> {
        private static final long serialVersionUID = 1418547743690811973L;
        final z<? super T> downstream;
        final c error = new c();
        final a<T, U>.C4165a otherObserver = new C4165a();
        final AtomicReference<b> upstream = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104678);
        }

        /* renamed from: f.a.e.e.e.bh$a$a  reason: collision with other inner class name */
        final class C4165a extends AtomicReference<b> implements z<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            static {
                Covode.recordClassIndex(104679);
            }

            @Override // f.a.z
            public final void onComplete() {
                a.this.a();
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
                f.a.e.a.b.setOnce(this, bVar);
            }

            C4165a() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                a aVar = a.this;
                f.a.e.a.b.dispose(aVar.upstream);
                i.a((z<?>) aVar.downstream, th, (AtomicInteger) aVar, aVar.error);
            }

            @Override // f.a.z
            public final void onNext(U u) {
                f.a.e.a.b.dispose(this);
                a.this.a();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            f.a.e.a.b.dispose(this.upstream);
            i.a(this.downstream, this, this.error);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.upstream);
            f.a.e.a.b.dispose(this.otherObserver);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed(this.upstream.get());
        }

        @Override // f.a.z
        public final void onComplete() {
            f.a.e.a.b.dispose(this.otherObserver);
            i.a(this.downstream, this, this.error);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            i.a((z) this.downstream, (Object) t, (AtomicInteger) this, this.error);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            f.a.e.a.b.setOnce(this.upstream, bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            f.a.e.a.b.dispose(this.otherObserver);
            i.a((z<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        a(z<? super T> zVar) {
            this.downstream = zVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        this.f157550b.b(aVar.otherObserver);
        this.f157412a.b(aVar);
    }

    public bh(x<T> xVar, x<? extends U> xVar2) {
        super(xVar);
        this.f157550b = xVar2;
    }
}
