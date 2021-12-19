package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.b.b;
import f.a.x;
import f.a.z;

public final class am<T, U> extends a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends U> f157455b;

    static {
        Covode.recordClassIndex(104620);
    }

    static final class a<T, U> extends f.a.e.d.a<T, U> {

        /* renamed from: f  reason: collision with root package name */
        final g<? super T, ? extends U> f157456f;

        static {
            Covode.recordClassIndex(104621);
        }

        @Override // f.a.e.c.i
        public final U poll() {
            Object poll = this.f157211c.poll();
            if (poll != null) {
                return (U) b.a(this.f157456f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: f.a.z */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157212d) {
                if (this.f157213e != 0) {
                    this.f157209a.onNext(null);
                    return;
                }
                try {
                    this.f157209a.onNext(b.a(this.f157456f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        a(z<? super U> zVar, g<? super T, ? extends U> gVar) {
            super(zVar);
            this.f157456f = gVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super U> zVar) {
        this.f157412a.b(new a(zVar, this.f157455b));
    }

    public am(x<T> xVar, g<? super T, ? extends U> gVar) {
        super(xVar);
        this.f157455b = gVar;
    }
}
