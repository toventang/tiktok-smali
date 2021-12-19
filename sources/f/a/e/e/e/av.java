package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.k;
import f.a.e.a.f;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class av<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final k<? super Throwable> f157499b;

    /* renamed from: c  reason: collision with root package name */
    final long f157500c;

    static {
        Covode.recordClassIndex(104646);
    }

    static final class a<T> extends AtomicInteger implements z<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final z<? super T> downstream;
        final k<? super Throwable> predicate;
        long remaining;
        final x<? extends T> source;
        final f upstream;

        static {
            Covode.recordClassIndex(104647);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.b(this);
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.upstream.replace(bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            long j2 = this.remaining;
            if (j2 != Long.MAX_VALUE) {
                this.remaining = j2 - 1;
            }
            if (j2 == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.a(th)) {
                    this.downstream.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.downstream.onError(new f.a.c.a(th, th2));
            }
        }

        a(z<? super T> zVar, long j2, k<? super Throwable> kVar, f fVar, x<? extends T> xVar) {
            this.downstream = zVar;
            this.upstream = fVar;
            this.source = xVar;
            this.predicate = kVar;
            this.remaining = j2;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        f fVar = new f();
        zVar.onSubscribe(fVar);
        new a(zVar, this.f157500c, this.f157499b, fVar, this.f157412a).a();
    }

    public av(t<T> tVar, long j2, k<? super Throwable> kVar) {
        super(tVar);
        this.f157499b = kVar;
        this.f157500c = j2;
    }
}
