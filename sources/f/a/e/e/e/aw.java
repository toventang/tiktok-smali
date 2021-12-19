package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.e.j.c;
import f.a.e.j.i;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class aw<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super t<Throwable>, ? extends x<?>> f157501b;

    static {
        Covode.recordClassIndex(104648);
    }

    static final class a<T> extends AtomicInteger implements b, z<T> {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final z<? super T> downstream;
        final c error = new c();
        final a<T>.C4164a inner = new C4164a();
        final f.a.l.g<Throwable> signaller;
        final x<T> source;
        final AtomicReference<b> upstream = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        static {
            Covode.recordClassIndex(104649);
        }

        /* renamed from: f.a.e.e.e.aw$a$a  reason: collision with other inner class name */
        final class C4164a extends AtomicReference<b> implements z<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            static {
                Covode.recordClassIndex(104650);
            }

            @Override // f.a.z
            public final void onComplete() {
                a aVar = a.this;
                f.a.e.a.b.dispose(aVar.upstream);
                i.a(aVar.downstream, aVar, aVar.error);
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
                f.a.e.a.b.setOnce(this, bVar);
            }

            C4164a() {
            }

            @Override // f.a.z
            public final void onNext(Object obj) {
                a.this.a();
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                a aVar = a.this;
                f.a.e.a.b.dispose(aVar.upstream);
                i.a((z<?>) aVar.downstream, th, (AtomicInteger) aVar, aVar.error);
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.upstream);
            f.a.e.a.b.dispose(this.inner);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed(this.upstream.get());
        }

        @Override // f.a.z
        public final void onComplete() {
            f.a.e.a.b.dispose(this.inner);
            i.a(this.downstream, this, this.error);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.wip.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.b(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            i.a((z) this.downstream, (Object) t, (AtomicInteger) this, this.error);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            f.a.e.a.b.replace(this.upstream, bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            f.a.e.a.b.replace(this.upstream, null);
            this.active = false;
            this.signaller.onNext(th);
        }

        a(z<? super T> zVar, f.a.l.g<Throwable> gVar, x<T> xVar) {
            this.downstream = zVar;
            this.signaller = gVar;
            this.source = xVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        f.a.l.g<T> j2 = new f.a.l.c().j();
        try {
            x xVar = (x) f.a.e.b.b.a(this.f157501b.apply(j2), "The handler returned a null ObservableSource");
            a aVar = new a(zVar, j2, this.f157412a);
            zVar.onSubscribe(aVar);
            xVar.b(aVar.inner);
            aVar.a();
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.e.a.c.error(th, zVar);
        }
    }

    public aw(x<T> xVar, g<? super t<Throwable>, ? extends x<?>> gVar) {
        super(xVar);
        this.f157501b = gVar;
    }
}
