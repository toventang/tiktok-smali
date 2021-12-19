package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.c.d;
import f.a.e.c.i;
import f.a.e.j.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bf<T, R> extends a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends x<? extends R>> f157541b;

    /* renamed from: c  reason: collision with root package name */
    final int f157542c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157543d = false;

    static {
        Covode.recordClassIndex(104672);
    }

    static final class b<T, R> extends AtomicInteger implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        static final a<Object, Object> f157544a;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<a<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final z<? super R> downstream;
        final c errors;
        final g<? super T, ? extends x<? extends R>> mapper;
        volatile long unique;
        f.a.b.b upstream;

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                b();
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        static {
            Covode.recordClassIndex(104674);
            a<Object, Object> aVar = new a<>(null, -1, 1);
            f157544a = aVar;
            f.a.e.a.b.dispose(aVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.concurrent.atomic.AtomicReference<f.a.e.e.e.bf$a<T, R>> */
        /* JADX WARN: Multi-variable type inference failed */
        private void b() {
            AtomicReference atomicReference;
            a<T, R> aVar = this.active.get();
            a<Object, Object> aVar2 = f157544a;
            if (aVar != aVar2 && (atomicReference = (AtomicReference) this.active.getAndSet(aVar2)) != aVar2 && atomicReference != null) {
                f.a.e.a.b.dispose(atomicReference);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.bf.b.a():void");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.done || !this.errors.addThrowable(th)) {
                f.a.h.a.a(th);
                return;
            }
            if (!this.delayErrors) {
                b();
            }
            this.done = true;
            a();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            a<T, R> aVar;
            long j2 = this.unique + 1;
            this.unique = j2;
            a<T, R> aVar2 = this.active.get();
            if (aVar2 != null) {
                f.a.e.a.b.dispose(aVar2);
            }
            try {
                x xVar = (x) f.a.e.b.b.a(this.mapper.apply(t), "The ObservableSource returned is null");
                a<T, R> aVar3 = new a<>(this, j2, this.bufferSize);
                do {
                    aVar = this.active.get();
                    if (aVar == f157544a) {
                        return;
                    }
                } while (!this.active.compareAndSet(aVar, aVar3));
                xVar.b(aVar3);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        b(z<? super R> zVar, g<? super T, ? extends x<? extends R>> gVar, int i2, boolean z) {
            this.downstream = zVar;
            this.mapper = gVar;
            this.bufferSize = i2;
            this.delayErrors = z;
            this.errors = new c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> extends AtomicReference<f.a.b.b> implements z<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final b<T, R> parent;
        volatile i<R> queue;

        static {
            Covode.recordClassIndex(104673);
        }

        @Override // f.a.z
        public final void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.a();
            }
        }

        @Override // f.a.z
        public final void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.a();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            b<T, R> bVar = this.parent;
            if (this.index != bVar.unique || !bVar.errors.addThrowable(th)) {
                f.a.h.a.a(th);
                return;
            }
            if (!bVar.delayErrors) {
                bVar.upstream.dispose();
            }
            this.done = true;
            bVar.a();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.queue = dVar;
                        this.done = true;
                        this.parent.a();
                        return;
                    } else if (requestFusion == 2) {
                        this.queue = dVar;
                        return;
                    }
                }
                this.queue = new f.a.e.f.c(this.bufferSize);
            }
        }

        a(b<T, R> bVar, long j2, int i2) {
            this.parent = bVar;
            this.index = j2;
            this.bufferSize = i2;
        }
    }

    @Override // f.a.t
    public final void a(z<? super R> zVar) {
        if (!ay.a(this.f157412a, zVar, this.f157541b)) {
            this.f157412a.b(new b(zVar, this.f157541b, this.f157542c, this.f157543d));
        }
    }

    public bf(x<T> xVar, g<? super T, ? extends x<? extends R>> gVar, int i2) {
        super(xVar);
        this.f157541b = gVar;
        this.f157542c = i2;
    }
}
