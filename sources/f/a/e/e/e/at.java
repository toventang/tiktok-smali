package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.c.b;
import f.a.d.e;
import f.a.e.a.f;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class at<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final e f157489b;

    static {
        Covode.recordClassIndex(104636);
    }

    static final class a<T> extends AtomicInteger implements z<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final z<? super T> downstream;
        final x<? extends T> source;
        final e stop;
        final f upstream;

        static {
            Covode.recordClassIndex(104637);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                do {
                    this.source.b(this);
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            try {
                if (this.stop.a()) {
                    this.downstream.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th) {
                b.a(th);
                this.downstream.onError(th);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            this.upstream.replace(bVar);
        }

        a(z<? super T> zVar, e eVar, f fVar, x<? extends T> xVar) {
            this.downstream = zVar;
            this.upstream = fVar;
            this.source = xVar;
            this.stop = eVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        f fVar = new f();
        zVar.onSubscribe(fVar);
        new a(zVar, this.f157489b, fVar, this.f157412a).a();
    }

    public at(t<T> tVar, e eVar) {
        super(tVar);
        this.f157489b = eVar;
    }
}
